package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.fegin.EuerkaServiceFegin;

@RestController
public class HelloController {
	@Autowired
	private EuerkaServiceFegin euerkaServiceFegin;
    
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		
		return euerkaServiceFegin.hello(name);
	}
}
