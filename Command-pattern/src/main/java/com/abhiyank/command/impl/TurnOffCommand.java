package com.abhiyank.command.impl;

import com.abhiyank.command.Command;
import com.abhiyank.model.TV;

public class TurnOffCommand implements Command {

  private TV tv;

  public TurnOffCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.turnOff();
  }
}
