package com.abhiyank.visitor.impl;

import com.abhiyank.item.impl.Book;
import com.abhiyank.item.impl.Fruit;
import com.abhiyank.visitor.Visitor;

// Concrete Visitor
public class TaxVisitor implements Visitor {

  @Override
  public void visit(Book book) {
    System.out.println("Book Tax: " + book.price * 0.1);
  }
  public void visit(Fruit fruit) {
    System.out.println("Fruit Tax: " + fruit.price * 0.05);
  }
}