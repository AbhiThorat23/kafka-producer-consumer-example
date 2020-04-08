package com.codelabs.springkafkaconsumerexample.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
	
	private static final long serialVersionUID = -2961930639097001050L;
	private Long id;
	private String username;
	private String password;
}
