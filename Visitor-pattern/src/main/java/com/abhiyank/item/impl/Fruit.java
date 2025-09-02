package com.abhiyank.item.impl;

import com.abhiyank.item.Item;
import com.abhiyank.visitor.Visitor;

public class Fruit implements Item {

  public double price = 5;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
