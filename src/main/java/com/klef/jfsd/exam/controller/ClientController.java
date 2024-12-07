package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.APIService;

@RestController
public class ClientController 
{
	@Autowired
	private APIService service;
	
	@GetMapping("/")
	public String home()
	{
		return "<h3>RestTemplate on JSON Placeholder API</h3>";
	}
	
	@GetMapping("viewallcomments")
	public List<Object> viewallcomments()
	{
		return service.displayAllComments();
	}
}
