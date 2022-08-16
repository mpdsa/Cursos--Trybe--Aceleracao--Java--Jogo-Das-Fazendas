package com.trybe.acc.java.jogodasfazendas;

/** Classe Triângulo. */
public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    
    return (base * height) / 2;
  }
  
 
}
