package com.tec.designpatterntemplate;

public class Player1 extends Game {

	@Override
	void gameLoad() {
		System.out.println("Player1 Loading game to play..!");
	}

	@Override
	void gameStart() {
		System.out.println("Player1 Started playing..!");
	}

	@Override
	void gameEnd() {
		System.out.println("Player1 Ended playing..!");
	}
}
