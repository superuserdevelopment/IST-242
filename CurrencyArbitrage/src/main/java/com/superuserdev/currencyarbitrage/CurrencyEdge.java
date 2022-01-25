/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superuserdev.currencyarbitrage;

/**
 *
 * @author Arya
 */
class CurrencyEdge{
    public final String srcCurrency, destCurrency;
    public final double exchgRate;
    
    public CurrencyEdge(String srcCurrency, String destCurrency, double exchgRate){
      this.srcCurrency = srcCurrency;
      this.destCurrency = destCurrency;
      this.exchgRate = exchgRate;
    }
    
    public CurrencyEdge connectCurrencies(String a, String b, double c){
      return new CurrencyEdge(a, b, c);
    }
  }
