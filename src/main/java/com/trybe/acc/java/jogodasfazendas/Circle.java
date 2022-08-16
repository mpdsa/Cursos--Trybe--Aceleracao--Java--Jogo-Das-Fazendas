package com.trybe.acc.java.jogodasfazendas;

/** Classe círculo. */
public class Circle implements Farm {
  static double PI = Math.PI;
  public final double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.floor(PI * Math.pow(this.radius, 2));
  }

}
