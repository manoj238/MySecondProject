package com.tec.designpatterntemplate;

public abstract class Game {
	
	abstract void gameLoad();
	abstract void gameStart();
	abstract void gameEnd();
	
	public void play() {
		gameStart();
		gameLoad();
		gameEnd();
	}
}
