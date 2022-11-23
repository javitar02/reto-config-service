package com.nttdata.bootcamp.noviembre.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

	@Value("${reto-config-service.sports}")
	private String sportName;

	@GetMapping("/getSportName")
	public String mySport() {
		return this.sportName;
	}
}
