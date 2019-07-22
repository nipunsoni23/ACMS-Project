package com.acms.application.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.acms.application.model.Feedback;

@Repository
public class FeedbackSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Feedback> searchFeedback(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(
									Criteria.where("storeid").regex(text, "i"))
						), Feedback.class);
	}
	
	
} 