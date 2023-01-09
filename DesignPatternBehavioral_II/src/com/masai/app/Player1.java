package com.masai.app;

public class Player1 extends Fighter {
	  public Player1(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
	    super(kickBehavior, jumpBehavior);
	  }

	  public void play() {
	    System.out.println("Player1");
	  }
	}