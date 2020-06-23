package com.games.boggle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.games.boggle.domain.Game;

@SpringBootApplication
public class BoggleGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(Game.class, args);
	}

}
