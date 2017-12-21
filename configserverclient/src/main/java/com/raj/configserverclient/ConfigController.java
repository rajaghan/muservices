package com.raj.configserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${lucky-word}") String luckyWord;
	
	@GetMapping("/luckyWord")
	public String getLuckyWord(){
		return "Lucky word is:"+luckyWord;
	}

}
