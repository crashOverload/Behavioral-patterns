package com.abhiyank.template;

// Abstract class defining the template method
public abstract class BeverageMaker {

  // Template method defining the overall process
  public final void makeBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // Abstract methods to be implemented by subclasses
  public abstract void brew();

  public abstract void addCondiments();

  // Common methods
  public void boilWater() {
    System.out.println("Boiling water");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }
}
