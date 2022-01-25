
package com.superuserdev.currencyarbitrage;

import java.util.*;
/**
 *
 * @author Arya
 */
public class Main {
    
  static ArrayList<CurrencyEdge> currencyData;
  
  public static void main(String[] args){
    String line1 = "USD,CAD,1.3;USD,GBP,0.71;USD,JPY,109;GBP,JPY,155";
    String line2 = "CAD";
    String line3 = "JPY";
    String src = "";
    String dest = "";
    currencyData = new ArrayList<CurrencyEdge>();
    parseCurrencyData(line1);
    src = line2.trim();    
    dest = line3.trim();    
    deDirectionizeGraph(src);
    System.out.println(getMaxTargetValue(src,dest));
  }
  
  //Convertes input to the data type we can use
  private static void parseCurrencyData(String data){    
    String acc = "";
    data = data + ";";
    for(int i = 0 ; i < data.length() ; i++ ){
      char ch = data.charAt(i);
      if(ch == ';'){
        ArrayList<String> temp = new ArrayList<String>(Arrays.asList(acc.split(",")));
        currencyData.add(new CurrencyEdge(temp.get(0), temp.get(1), -Math.log(Double.parseDouble(temp.get(2)))));
        acc = "";
      }
      else{
        acc = acc + ch;
      }
    }
  }
  
  //This returns the maximum Taret value or -1.0 if no path is possible
  private static Object getMaxTargetValue(String src, String dest){
    List<String> currencies = new ArrayList<String>();
    for(CurrencyEdge currencyEdge : currencyData){
      if(!currencies.contains(currencyEdge.srcCurrency))
        currencies.add(currencyEdge.srcCurrency);
      if(!currencies.contains(currencyEdge.destCurrency))
        currencies.add(currencyEdge.destCurrency);
    }
    
    int V = currencies.size();
    int E = currencyData.size();
    int i, j;
    
    if(!currencies.contains(src) || !currencies.contains(dest)) return -1.0;
    
    int srcIndex = currencies.indexOf(src);
    
    ArrayList<Double> total = new ArrayList<Double>();
    
    for(i = 0 ; i < V ; i++){
      total.add(Double.MAX_VALUE);
      
    }
    
    total.set(srcIndex,0.0);     
    
    for(i = 1 ; i < V ; i++){
      for(j = 0 ; j < E ; j++){
       
        int u = currencies.indexOf(currencyData.get(j).srcCurrency);  
        int v = currencies.indexOf(currencyData.get(j).destCurrency); 
        double rate = currencyData.get(j).exchgRate;
        
        if(total.get(u) != Double.MAX_VALUE && total.get(u) + rate < total.get(v))
          total.set(v, total.get(u) + rate);
        if(currencyData.get(j).destCurrency == dest) break;
      }
    }    
    
    return (total.get(currencies.indexOf(dest)) == Double.MAX_VALUE)? -1.0 : String.format("%.2f", Math.exp(-total.get(currencies.indexOf(dest))));
  }
  
  //This makes the direction of the edges favourable to the given source
  private static void deDirectionizeGraph(String src){
    List<CurrencyEdge> temp= new ArrayList<CurrencyEdge>();   
    
    for(CurrencyEdge currencyEdge : currencyData)
    {
      if(currencyEdge.destCurrency.equals(src)){   
        temp.add(new CurrencyEdge(currencyEdge.destCurrency, currencyEdge.srcCurrency, -currencyEdge.exchgRate));
      }
    }      
    currencyData.addAll(temp);    
  }
  
}

