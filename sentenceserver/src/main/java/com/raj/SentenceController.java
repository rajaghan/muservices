package com.raj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

	/*@Autowired
	DiscoveryClient discoveryClient;*/
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {

		return getWord("SUBJECT") + " "+ getWord("VERB") + " "+ getWord("ARTICLE") + " "+ getWord("ADJECTIVE") + " "+ getWord("NOUN")+ " .";

	}

	private String getWord(String serviceId) {
		String word = null;
		/*List<ServiceInstance> serviceInstance = discoveryClient.getInstances(serviceId);
		if (serviceInstance != null && !serviceInstance.isEmpty()) {
			if (serviceInstance.get(0).getUri() != null) {
				word = new RestTemplate().getForObject(serviceInstance.get(0).getUri(), String.class);
			}
		}*/
		
		word=restTemplate.getForObject("http://"+serviceId, String.class);
		return word;
	}

}
