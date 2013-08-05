package com.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/testMethod")
	public void testMethod(HttpServletResponse response) throws IOException{
		response.getOutputStream().print("hello word!~~~");
	}
}
