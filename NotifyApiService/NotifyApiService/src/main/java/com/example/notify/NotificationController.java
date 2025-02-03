package com.example.notify;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

	@GetMapping("/{notificationId}")
	Notifications getNotifications(@PathVariable("notificationId") int notificationId) {
		
		Notifications notification1 = new Notifications(notificationId," Its notification about the notification: "+notificationId);
		return notification1;
	}
}
