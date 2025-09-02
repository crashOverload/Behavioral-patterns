package com.abhiyank.model;

public class Ticket {
  String ticketId;
  String description;
  String priority;

  public Ticket(String ticketId, String description, String priority) {
    this.ticketId = ticketId;
    this.description = description;
    this.priority = priority;
  }

  public String getPriority() {
    return priority;
  }
}
