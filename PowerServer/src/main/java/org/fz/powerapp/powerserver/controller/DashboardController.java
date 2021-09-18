package org.fz.powerapp.powerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/dashboard/api")
@RestController
public class DashboardController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "this is my dashboard";
	}

}
