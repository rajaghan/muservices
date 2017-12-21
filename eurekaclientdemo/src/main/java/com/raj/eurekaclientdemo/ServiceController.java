package com.raj.eurekaclientdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

	@Autowired
	DiscoveryClient client;
	
	@Autowired
	RestTemplate restTemplate;
	
	//TODO - Check this on the lines of rest template
	//@Autowired
	//JDBCTemplate jdbcTemplate;
	
	@Autowired
	Team team;

	@GetMapping("/getService")
	public String storeServiceUrl() {
		List<ServiceInstance> list = client.getInstances("CLIENT1");
		if (list != null && list.size() > 0) {
			
			//Team team=template.getForObject(list.get(0).getUri()+"/getTeam", Team.class);
			
			//return team.toString();
			return list.get(0).getUri().toString();
		}
		return null;
	}

}
