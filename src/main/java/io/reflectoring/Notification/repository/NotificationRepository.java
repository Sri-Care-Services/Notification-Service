package io.reflectoring.Notification.repository;

import io.reflectoring.Notification.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {

}
