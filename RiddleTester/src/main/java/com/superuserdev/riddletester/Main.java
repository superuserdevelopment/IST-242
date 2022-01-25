
package com.superuserdev.riddletester;
import java.util.Scanner;
/**
 *
 * @author Arya
 */
public class Main {
    public static void main(String args[]){
        Riddle riddle = new Riddle();
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the question to be set");
        s = sc.nextLine();
        riddle.setQuestion(s);
        System.out.println("Enter the answer to be set");
        s = sc.nextLine();
        riddle.setAnswer(s);        
        System.out.println("Riddle is set");
        showRiddle(riddle);
        Riddle riddle2 = new Riddle("Hello", "World");
        showRiddle(riddle2);
    }
    
    private static void showRiddle(Riddle riddle){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println(riddle.getQuestion());
        System.out.println("Enter your answer");
        s = sc.nextLine();
        System.out.println(riddle.checkAnswer(s)? "Right Answer!" : "Wrong Answer!");
    }
}
