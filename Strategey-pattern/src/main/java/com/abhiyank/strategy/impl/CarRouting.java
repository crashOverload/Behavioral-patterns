package com.abhiyank.strategy.impl;

import com.abhiyank.model.Location;
import com.abhiyank.model.Route;
import com.abhiyank.strategy.RoutingStrategy;

public class CarRouting implements RoutingStrategy {

  @Override
  public Route createRoute(Location startLocation, Location endLocation) {
    //implement Car related routing algorithm and return the Route
    System.out.println("Car route created");
    return new Route();
  }
}
