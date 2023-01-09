package com.masai.app;

public class Test {
	  public static void main(String[] args) {
	    JumpBehavior shortJump = new ShortJump();
	    JumpBehavior longJump = new LongJump();
	    KickBehavior tornadoKick = new TornadoKick();

	    // Make a fighter with desired behaviors
	    Fighter player1 = new Player1(tornadoKick, shortJump);
	    player1.play();

	    // Test behaviors
	    player1.punch();
	    player1.kick();
	    player1.jump();
	  }
	}
