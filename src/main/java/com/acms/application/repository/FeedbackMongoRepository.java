package com.acms.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.acms.application.model.Feedback;

public interface FeedbackMongoRepository extends CrudRepository<Feedback, String>{}