package com.domain.sdemo.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.domain.sdemo.service.KafkaConsumerService;

@Service("KafkaConsumerService")
public class KafkaConsumerServiceImpl implements KafkaConsumerService{

    static final Logger logger = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);
    @Override
    public void processMessage(Map<String, Map<Integer, String>> msgs) {
        for (Map.Entry<String, Map<Integer, String>> entry : msgs.entrySet()) {
        	logger.info("============Topic:" + entry.getKey()+"\t"+entry.getValue());
        }
    }

}
