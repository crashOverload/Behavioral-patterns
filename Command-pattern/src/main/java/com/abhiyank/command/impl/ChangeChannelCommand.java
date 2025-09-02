package com.abhiyank.command.impl;

import com.abhiyank.command.Command;
import com.abhiyank.model.TV;

public class ChangeChannelCommand implements Command {

  private TV tv;

  public ChangeChannelCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.changeChannel();
  }
}
