package com.domain.sdemo.controler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.sdemo.service.KafkaService;

@RequestMapping("/")
@RestController
public class MessageControler {
	@Autowired
	private KafkaService kafkaService;
    private static final Log logger = LogFactory.getLog(MessageControler.class);
 
    @RequestMapping(value = "/bid")
    @ResponseBody
    public boolean bid(String userId,Double amount) {
    	userId = userId==null?"demo1@test.com":userId;
    	amount = 23.52;
        logger.warn("userId: " + userId+"\tbid:"+amount);
        kafkaService.sendUserInfo("demo", userId);
        return true;
    }
}
