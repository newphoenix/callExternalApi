package com.example;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("comments")
@AllArgsConstructor
public class CommentController {
	
	private CommentsClient commentClient;

	@GetMapping
	public ResponseEntity<List<Comment>> getComments(){
		
		List<Comment> comments = commentClient.getComments();
		return ResponseEntity.ok(comments);
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Comment> getComment(@PathVariable Integer id){
		
		Comment comment = commentClient.getComment(id);
		return ResponseEntity.ok(comment);
		
	}
}
