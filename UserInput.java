/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

import java.util.Scanner;
public class UserInput {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("You Currently Have 30$, And 1 Apple Costs 5$");
System.out.println("How Many Apples Do You Want?");
double a = input.nextDouble();
int c = 5;
int d = 30;
double b = a*c ;
double e = d-b ;
if (b > 30){
System.out.println("Sorry, That won't be enough money");
        }else{
    System.out.println("That Will Be, "+e+"$!");
}
    }
}