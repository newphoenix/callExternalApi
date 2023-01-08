package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
	 private Integer postId;
	 private Integer id;
	 private String name;
	 private String email;
	 private String body;

}
