package com.chandra.hello.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
	public String helloWorld() {
		return "hellooo";
	}
    
}
