package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@RestController


public class PlayerController {
	@Autowired
	 private PlayerService service;
	
	@GetMapping("/player")
	public List<Player> findAllPlayer(){
		return service.getPlayer();
	}

	@GetMapping("/players/{PlayerId}")
	public Player findPlayerById(@PathVariable int  PlayerId) {
		return service.getPlayerById(PlayerId);
		
	}
		

}
