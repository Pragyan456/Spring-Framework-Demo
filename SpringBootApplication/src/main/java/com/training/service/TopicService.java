package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Topic;
import com.training.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*
	 * List<Topic> topicList = new ArrayList(Arrays.asList(new Topic("JV",
	 * "Java", "Complete Java Tutorial"), new Topic("JS", "Javascript",
	 * "Javascript tutorial"), new Topic("Hadoop", "Big data technologie",
	 * "Hadoop Framework")));
	 */
	public List<Topic> getTopics() {
		List<Topic> topicList = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList::add); // findAll() returns
															// an Iterable which
															// has to be
															// converted to a
															// list
		return topicList;
	}

	public Topic getTopic(String topicId) {
		Optional<Topic> optionalTopic = topicRepository.findById(topicId);
		return optionalTopic.get();
	}

	public void createTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String topicId, Topic updatedTopic) {

		/*
		 * ListIterator<Topic> iterator = topicList.listIterator(); while
		 * (iterator.hasNext()) { Topic topic = iterator.next(); if
		 * (topic.getId().equals(topicId)) { iterator.set(updatedTopic); } }
		 */
		topicRepository.save(updatedTopic); // this suffice for update operation
											// as long as topic instance
											// consists of id

	}

	public void deleteTopic(String topicId) {
		/*
		 * ListIterator<Topic> iterator = topicList.listIterator(); while
		 * (iterator.hasNext()) { Topic topic = iterator.next(); if
		 * (topic.getId().equals(topicId)) { iterator.remove(); } }
		 */

		topicRepository.deleteById(topicId);
	}

}
