package com.abhiyank.item;

import com.abhiyank.visitor.Visitor;

public interface Item {
  void accept(Visitor visitor);
}
