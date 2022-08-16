package com.trybe.acc.java.jogodasfazendas;

import java.util.ArrayList;

/** Classe PlayerResult. */
public class PlayerResult {
  ArrayList<Double> al = new ArrayList<Double>();
  
  /** Método construtor. */
  public PlayerResult(String name, Farm[] farms) {
    for (int i = 0; i < farms.length; i++) {
      al.add(farms[i].area());
    }
    
  }
 
  /** Método Score. */
  public double score() {
    double result = 0.0;
    
    for (int i = 0; i < al.size(); i++) {
      result += al.get(i);
    }
    
    return result;
    
  }
}
