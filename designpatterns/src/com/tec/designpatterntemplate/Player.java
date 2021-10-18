package com.tec.designpatterntemplate;

public class Player extends Game {

	@Override
	void gameLoad() {
		System.out.println("Player Loading game to play..!");
	}

	@Override
	void gameStart() {
		System.out.println("Player Started playing..!");
	}

	@Override
	void gameEnd() {
		System.out.println("Player Ended playing..!");
	}
}
