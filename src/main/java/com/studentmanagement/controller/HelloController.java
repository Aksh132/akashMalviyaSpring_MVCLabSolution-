package com.studentmanagement.controller;

import org.springframework.stereotype.Controller;


@Controller
public class HelloController {




@RequestMapping("/")


public String showMainPage() {

		return "Demo";
	}
}
