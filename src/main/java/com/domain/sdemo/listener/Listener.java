package com.domain.sdemo.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;


public class Listener {

	
	@KafkaListener(topics = "demo", group = "demo")
    public void listen(ConsumerRecord<?, ?> record) {
		org.apache.log4j.Logger.getLogger(this.getClass()).info("消息文本："+record.value());
		org.apache.log4j.Logger.getLogger(this.getClass()).info("消息对象："+record);
	}
 
}
