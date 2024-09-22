package io.reflectoring.Notification.controller;

import io.reflectoring.Notification.dto.BroadcastNotificationRequest;
import io.reflectoring.Notification.dto.PaymentNotificationRequest;
import io.reflectoring.Notification.entity.Notification;
import io.reflectoring.Notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send-payment")
    public ResponseEntity<Notification> sendPaymentNotification(@RequestBody PaymentNotificationRequest request) {
        Notification notification = notificationService.sendPaymentNotification(request.getSender(), request.getReceiver(), request.getMessage(), request.getSubject());
        return ResponseEntity.ok(notification);
    }

    @PostMapping("/broadcast")
    public ResponseEntity<Notification> broadcastNotification(@RequestBody BroadcastNotificationRequest request) {
        Notification notification = notificationService.sendBroadcastNotification(request.getMessage(), request.getSubject());
        return ResponseEntity.ok(notification);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Notification>> getAllNotifications() {
        List<Notification> notifications = notificationService.getAllNotifications();
        return ResponseEntity.ok(notifications);
    }

}

