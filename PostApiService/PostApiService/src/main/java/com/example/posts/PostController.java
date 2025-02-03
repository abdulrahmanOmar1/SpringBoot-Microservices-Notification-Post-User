package com.example.posts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@GetMapping("/{postId}")
	public Posts getPosts(@PathVariable("postId") int postId) {
		
		Posts post1 = new Posts(postId, "its the description of post: "+postId);
		return post1;
	}
	
}
