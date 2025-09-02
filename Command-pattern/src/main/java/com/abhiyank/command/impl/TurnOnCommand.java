package com.abhiyank.command.impl;

import com.abhiyank.command.Command;
import com.abhiyank.model.TV;

public class TurnOnCommand implements Command {
  private TV tv;

  public TurnOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.turnOn();
  }
}
