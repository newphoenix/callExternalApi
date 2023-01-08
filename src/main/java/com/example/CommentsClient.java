package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("comments")
public interface CommentsClient {
	@GetExchange
	List<Comment> getComments();

	@GetExchange("{id}")
	Comment getComment(@PathVariable Integer id);

}
