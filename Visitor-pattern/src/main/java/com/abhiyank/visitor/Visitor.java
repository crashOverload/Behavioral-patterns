package com.abhiyank.visitor;

import com.abhiyank.item.impl.Book;
import com.abhiyank.item.impl.Fruit;

public interface Visitor {
  public void visit(Book book);
  public void visit(Fruit fruit);

}
