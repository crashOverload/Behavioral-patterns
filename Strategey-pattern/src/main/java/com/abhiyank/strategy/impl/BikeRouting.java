package com.abhiyank.strategy.impl;

import com.abhiyank.model.Location;
import com.abhiyank.model.Route;
import com.abhiyank.strategy.RoutingStrategy;

public class BikeRouting implements RoutingStrategy {

  @Override
  public Route createRoute(Location startLocation, Location endLocation) {
    //implement Bike related routing algorithm and return the Route
    System.out.println("Bike route created");
    return new Route();
  }
}
