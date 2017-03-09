package com.domain.sdemo.service;

import java.util.Map;

public interface KafkaConsumerService {
	public void processMessage(Map<String, Map<Integer, String>> msgs);
}
