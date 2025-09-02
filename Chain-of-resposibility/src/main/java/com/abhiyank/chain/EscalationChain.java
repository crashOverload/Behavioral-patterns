package com.abhiyank.chain;

import com.abhiyank.model.Ticket;

public interface EscalationChain {
  void handle(Ticket ticket);
}
