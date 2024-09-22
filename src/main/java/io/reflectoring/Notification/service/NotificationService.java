package io.reflectoring.Notification.service;

import io.reflectoring.Notification.entity.Notification;
import io.reflectoring.Notification.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification sendPaymentNotification(String sender, String receiver, String message, String subject) {
        Notification notification = new Notification();
        notification.setSender(sender);
        notification.setReceiver(receiver);
        notification.setMessage(message);
        notification.setSubject(subject);
        notification.setType("PAYMENT");
        notification.setStatus("SENT");
        notification.setCreatedAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }

    public Notification sendBroadcastNotification(String message, String subject) {
        Notification notification = new Notification();
        notification.setSender("System");
        notification.setReceiver("All Users");
        notification.setMessage(message);
        notification.setSubject(subject);
        notification.setType("BROADCAST");
        notification.setStatus("SENT");
        notification.setCreatedAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll(); // Make sure no invalid fields like 'locale' are used here
    }

}

