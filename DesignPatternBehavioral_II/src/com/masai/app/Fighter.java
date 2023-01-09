package com.masai.app;

public abstract class Fighter {
  protected KickBehavior kickBehavior;
  protected JumpBehavior jumpBehavior;

  public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
    this.kickBehavior = kickBehavior;
    this.jumpBehavior = jumpBehavior;
  }

  public void setKickBehavior(KickBehavior kickBehavior) {
    this.kickBehavior = kickBehavior;
  }

  public void setJumpBehavior(JumpBehavior jumpBehavior) {
    this.jumpBehavior = jumpBehavior;
  }

  public void punch() {
    System.out.println("Default punch");
  }

  public void roll() {
    System.out.println("Default roll...");
  }

  public void jump() {
    jumpBehavior.jump();
  }

  public void kick() {
    kickBehavior.kick();
  }

  public abstract void play();
}