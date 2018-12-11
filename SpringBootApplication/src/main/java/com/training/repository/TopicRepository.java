package com.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	/*
	 * this repository is just sufficient for CRUD operation which takes two parameters type of Entity and type of Id 
	 */

}
