package com.abhiyank.chain.impl;

import com.abhiyank.chain.EscalationChain;
import com.abhiyank.model.Ticket;

public class L1ChainHandler implements EscalationChain {
  private EscalationChain delegate;

  public L1ChainHandler(){
    this.delegate = new L2ChainHandler();
  }

  @Override
  public void handle(Ticket ticket){
    if(ticket.getPriority().equals("P2")){
      //escalate and notify the L1 support agent.
      System.out.println("P2 ticket handled by L1 agent.");
      return;
    }
    //otherwise pass on to the next step in the chain.
    delegate.handle(ticket);
  }
}
