package com.abhiyank.template.impl;

import com.abhiyank.template.BeverageMaker;

// Concrete subclass for making te
public class TeaMaker extends BeverageMaker {

  // Implementing abstract methods
  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }
}
