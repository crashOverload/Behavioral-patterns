package com.abhiyank;

import com.abhiyank.item.Item;
import com.abhiyank.item.impl.Book;
import com.abhiyank.item.impl.Fruit;
import com.abhiyank.visitor.Visitor;
import com.abhiyank.visitor.impl.TaxVisitor;

public class Main {

  public static void main(String[] args) {
    System.out.println("Initiating Visitor Demo!");

    Item[] cart = { new Book(), new Fruit() };
    Visitor taxVisitor = new TaxVisitor();

    for (Item item : cart) {
      item.accept(taxVisitor); // double dispatch
    }
  }
}