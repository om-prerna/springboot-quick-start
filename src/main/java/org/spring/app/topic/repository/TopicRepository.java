package org.spring.app.topic.repository;

import org.spring.app.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends  CrudRepository<Topic, String>{


}
