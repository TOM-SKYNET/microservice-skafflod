package org.tom.skaffoldspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorld {

	@GetMapping()
	public String getHello() {
		return "Hello Skaffold ";
	}

}
