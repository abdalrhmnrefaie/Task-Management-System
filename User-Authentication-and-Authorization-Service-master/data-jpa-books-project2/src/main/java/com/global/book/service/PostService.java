//package com.global.book.service;
//
//import java.util.List;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.global.book.entity.PostDTO;
//
//@Service
//public class PostService {
//
//	public static String POST_ULR = "https://jsonplaceholder.typicode.com/posts";
//
//	public PostDTO getPostById(Long id) {
//
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<PostDTO> result = restTemplate.getForEntity(POST_ULR + "/" + id, PostDTO.class);
//
//		return result.getBody();
//	}
//
//	
//	
//	public List<PostDTO> getPostAll() {
//
//		RestTemplate restTemplate = new RestTemplate();
//		
//		ResponseEntity<List> result = restTemplate.getForEntity(POST_ULR, List.class);
//
//		return result.getBody();
//	}
//	
//	
//
//	public PostDTO addPost(PostDTO dto) {
//
//		RestTemplate restTemplate = new RestTemplate();
//		
//		HttpEntity<PostDTO> request = new HttpEntity<>(dto);
//		
//		ResponseEntity<PostDTO> result = restTemplate.postForEntity(POST_ULR, request, PostDTO.class);
//
//		return result.getBody();
//	}
//	
//	
//	public void updatePost(PostDTO dto) {
//
//		RestTemplate restTemplate = new RestTemplate();
//		
//		HttpEntity<PostDTO> request = new HttpEntity<>(dto);
//		
//		 restTemplate.put(POST_ULR, request);
//
//	}
//	
//	
//	
//	
//	public void deletePostById (Long id) {
//
//		RestTemplate restTemplate = new RestTemplate();
//	
//		 restTemplate.delete(POST_ULR +"/"+id);
//
//	}
//	
//	
//	
//}
