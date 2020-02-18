package com.spring.notify.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotifyController {
	private  Logger logger = LoggerFactory.getLogger(NotifyController.class);
     
	@RequestMapping(value="/notify", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public String notifyPeople() {
		logger.info("notifying the customer through the mail service later");
		test();
		return "tested";
	}
	public void test() {}
	
	List<String> messages = new ArrayList<>();

	

	@GetMapping("/consumeStringMessage")
	public List<String> consumeMsg() {
		return messages;
	}

	

	@KafkaListener(groupId = "javatechie-1", topics = "test", containerFactory = "kafkaListenerContainerFactory")
	public List<String> getMsgFromTopic(String data) {
		messages.add(data);
		return messages;
	}

	
}
