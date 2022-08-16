package com.trybe.acc.java.jogodasfazendas;

/** Classe Retângulo. */
public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return super.base * super.height;
  }

}
