package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Topic;
import com.training.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	/* CRUD operation starts....
	 * Retrieve all topics --> HTTP GET
	 */
	@RequestMapping("/topics")
	List<Topic> getTopics(){		
		return topicService.getTopics();
	}
	
	//retrieve a particular topic --> HTTP GET
	@RequestMapping("/topics/{topicId}")
	Topic getTopic(@PathVariable String topicId){		
		return topicService.getTopic(topicId);
	}
	
	// create a topic  --> HTTP POST
	@RequestMapping(value="/topics" , method=RequestMethod.POST)
	void createTopic(@RequestBody Topic topic){
		topicService.createTopic(topic);
	}
	
	// update a topic  --> HTTP PUT
	@RequestMapping(value="/topics/{topicId}" , method=RequestMethod.PUT)
	void updateTopic(@PathVariable String topicId , @RequestBody Topic topic){
		topicService.updateTopic(topicId , topic);
	}
	
	//delete a topic  --> HTTP DELETE
	@RequestMapping(value = "/topics/{topicId}", method=RequestMethod.DELETE)
	void deleteTopic(@PathVariable String topicId){
		topicService.deleteTopic(topicId);			
	}
	
	
}
