package com.raj.bootdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@GetMapping("/teams")
	public List<Team> getTeams(){
		List<Team> teams=new ArrayList<Team>(2);
		
		Team team = new Team();
		
		team.setId(1L);
		team.setName("CSK");
		team.setLocation("Chennai");
		
		teams.add(team);
		
		team = new Team();
		
		team.setId(2L);
		team.setName("DC");
		team.setLocation("Hyderabad");
		
		teams.add(team);
		
		return teams;
	}

}
