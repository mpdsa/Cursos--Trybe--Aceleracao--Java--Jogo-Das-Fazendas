package com.trybe.acc.java.jogodasfazendas;

/** li0001. */
public class Square implements Farm {
  private final double side;

  /** Método construtor. */
  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return this.side * this.side;
  }

}
