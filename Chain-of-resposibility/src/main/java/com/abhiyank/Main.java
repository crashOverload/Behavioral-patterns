package com.abhiyank;

import com.abhiyank.chain.EscalationChain;
import com.abhiyank.chain.impl.ChatbotChainHandler;
import com.abhiyank.model.Ticket;

public class Main {

  public static void main(String[] args) {
    System.out.println("initiating ticket handler");
    Ticket ticket = new Ticket("123","UI not responding after login","P1");

    EscalationChain escalationChain = new ChatbotChainHandler();
    escalationChain.handle(ticket);

    System.out.println("\nCreating new ticket");
    ticket = new Ticket("1234","Table is not displaying properly in IE","P4");
    escalationChain.handle(ticket);
  }
}