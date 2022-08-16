package com.trybe.acc.java.jogodasfazendas;

/** Classe abstrata Polígono. */
public abstract class Polygon implements Farm {
  protected double base;
  protected double height;
  
  /** Método construtor. */
  public Polygon(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }
}
