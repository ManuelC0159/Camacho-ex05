/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;
public class Solution05 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("What is the first number? ");
    String numb1 = input.nextLine();
    System.out.print("What is the second number? ");
    String numb2 = input.nextLine();
    
    int n1 = Integer.valueOf(numb1);
    int n2 = Integer.valueOf(numb2);

    int add,sub,mul,div;

    add = n1+n2;
    sub = n1-n2;
    mul = n1*n2;
    div = n1/n2;

    System.out.print(n1 + " + "+n2+" = "+add+"\n"+n1+" - "+n2+" = " +sub+"\n"+n1+" * "+n2+" = "+ mul+"\n"+n1+" / "+n2+" = "+div);
    }

}

/*
    PseudoCode
    Ask user for number 1
    get number 1 from user using standard input
    ask user for number 2
    get number 2 from user using standard input
    make number 1 and number 2 into integers
    add number 1 and number 2, store new value
    subtract number 1 and number 2, store new value
    multiply number 1 and number 2, store new value
    divide number 1 and number 2, store new value
    display all math functions along with the solutions (10 + 5 = 15) on standard output 
 */
