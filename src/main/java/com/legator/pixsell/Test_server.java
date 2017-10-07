package com.legator.pixsell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_server {

	@RequestMapping("/Test")
	public String test() {
		return "Welcome to PIXSELL ..";
	}
}
