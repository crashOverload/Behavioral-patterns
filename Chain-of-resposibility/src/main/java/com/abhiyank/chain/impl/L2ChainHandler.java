package com.abhiyank.chain.impl;

import com.abhiyank.chain.EscalationChain;
import com.abhiyank.model.Ticket;

public class L2ChainHandler implements EscalationChain {

  @Override
  public void handle(Ticket ticket){
    if(ticket.getPriority().equals("P1")){
      //escalate and notify the manager for support.
      System.out.println("P1 ticket handled by L2 agent.");
      return;
    }
    //When priority doesn't match anyone in the list
    //implement a custom handler or may be return an error
    System.out.println("Ticket not handled");
  }

}
