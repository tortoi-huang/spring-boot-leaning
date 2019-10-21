package org.huang.leaning.element.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private SimpleDateFormat sdf;

	@GetMapping("/hello")
	public String hello() {
		return "helle element:" + sdf.format(new Date());
	}
	@GetMapping("/hi")
	public String hi() {
		return "hi consul";
	}
}
