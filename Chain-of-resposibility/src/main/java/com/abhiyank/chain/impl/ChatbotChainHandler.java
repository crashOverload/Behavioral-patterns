package com.abhiyank.chain.impl;

import com.abhiyank.chain.EscalationChain;
import com.abhiyank.model.Ticket;

public class ChatbotChainHandler implements EscalationChain {
  private EscalationChain delegate;

  public ChatbotChainHandler(){
    this.delegate = new L1ChainHandler();
  }

  public void handle(Ticket ticket){
    if(ticket.getPriority().equals("P3")){
      //actually handle it with chatbot.
      System.out.println("P3 ticker handled by chatbot");
      return;
    }
    //otherwise pass on to the next step in the chain.
    delegate.handle(ticket);
  }

}
