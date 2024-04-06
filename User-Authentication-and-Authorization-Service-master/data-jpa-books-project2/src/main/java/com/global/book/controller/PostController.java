//package com.global.book.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.global.book.entity.PostDTO;
//import com.global.book.service.PostService;
//
//@RestController
//@RequestMapping("/post/1")
//public class PostController {
//
//	@Autowired
//	private PostService postservice;
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<PostDTO>  getPostById(@PathVariable Long id) {
//		
//		return ResponseEntity.ok(postservice.getPostById(id));
//
//	}
//	
//	@GetMapping("/")
//	public ResponseEntity<?>  getPostAll() {
//		
//		return ResponseEntity.ok(postservice.getPostAll());
//
//	}
//	
//	
//	
//	@GetMapping("/")
//	public ResponseEntity<?>  addPost(PostDTO dto ) {
//		
//		return ResponseEntity.ok(postservice.addPost(dto));
//
//	}
//	
//}
