package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {
    
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public Users getUsers(@PathVariable("userId") int userId) {
		Users user1 = new Users(userId,"ABC"); // JSON
		
		// posts
		try {
		Posts posts = restTemplate.getForObject("http://localhost:8081/posts/1",Posts.class);
		//Posts posts = restTemplate.getForObject("http://PostApiService/posts/1",Posts.class);
		user1.setPosts(posts);
		
		// notifications
		Notifications notifications = restTemplate.getForObject("http://localhost:8082/notifications/1", Notifications.class);
		//Notifications notifications = restTemplate.getForObject("http://NotifyApiService/notifications/1", Notifications.class);
		user1.setNotifications(notifications);
		} catch(Exception e) 
		{System.out.println(e);}
		
		
		return user1;
	}
	
}
