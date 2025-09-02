package com.abhiyank.template.impl;

import com.abhiyank.template.BeverageMaker;

// Concrete subclass for making coffee
public class CoffeeMaker extends BeverageMaker {
  // Implementing abstract methods
  @Override
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
}