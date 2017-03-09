package com.domain.sdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.domain.sdemo.service.KafkaService;

@Service("kafkaService")
public class KafkaServiceImpl implements KafkaService {

	// 默认4个分区
	private static final int numPartitions = 4;
	@Autowired
	@Qualifier("kafkaTopicTest")
	MessageChannel channel;

	public void sendUserInfo(String topic, Object obj) {
		// get messageKey
		String messageKey = String.valueOf(obj.hashCode());
		// Partitions NO
		int partitionId = partition(messageKey, numPartitions);
		/*
		 * channel.send(MessageBuilder.withPayload(obj).setHeader(KafkaHeaders.
		 * TOPIC, topic) .setHeader(KafkaHeaders.MESSAGE_KEY,
		 * messageKey).setHeader(KafkaHeaders.PARTITION_ID, partitionId)
		 * .build());
		 */
		channel.send(MessageBuilder.withPayload(obj).setHeader(KafkaHeaders.TOPIC, topic).build());
	}

	private int partition(Object key, int numPartitions) {
		try {
			long partitionNum = Long.parseLong((String) key);
			return (int) Math.abs(partitionNum % numPartitions);
		} catch (Exception e) {
			return Math.abs(key.hashCode() % numPartitions);
		}
	}

}
