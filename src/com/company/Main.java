package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //declaring an instance of the Scanner class
        Scanner myScanner = new Scanner(System.in);

        //declaring variables
        String itemName01, itemName02, header1, header2;
        Double itemPrice01, itemPrice02, answer;
        int itemQuantity01, itemQuantity02;
        int totalQuantity1;
        double cost1, cost2, totalCost1;

        // initialzing your variables => assigning values

        System.out.print("Greetings. What is your first food item 1? ");
        itemName01 = myScanner.nextLine();

        // Require the scanner to accept "int" or numerical values
        System.out.print("How much is item 1?");
        itemPrice01 = myScanner.nextDouble();

        System.out.print("How many of item 1?");
        itemQuantity01 = myScanner.nextInt();

        cost1 = (itemPrice01 * itemQuantity01);
        System.out.println("Cost1 : " + (itemPrice01 * itemQuantity01));

        System.out.println("What is item 2?");
        itemName02 = myScanner.next();

        System.out.print("How much is item 2?");
        itemPrice02 = myScanner.nextDouble();

        System.out.print("How many of item 2?");
        itemQuantity02 = myScanner.nextInt();

        cost2 = (itemPrice02 * itemQuantity02);
        System.out.println("Cost2 : " + (itemPrice02 * itemQuantity02));

        totalQuantity1 = (itemQuantity01 + itemQuantity02);
        System.out.println("Total Quantity : " + (itemQuantity01 + itemQuantity02));

        totalCost1 = (itemPrice01 * itemQuantity01) + (itemPrice02 * itemQuantity02);
        System.out.println("Total Cost : " + (totalCost1));


        System.out.println("Item Name   Price   Quantity    Cost");
        System.out.println(itemName01 + "\t" + itemPrice01 + "\t" + itemQuantity01 + "\t" + cost1);
        System.out.println(itemName02 + "\t" + itemPrice02 + "\t" + itemQuantity02 + "\t" + cost2);
        System.out.println("_____________________________________");
        System.out.println("" + "\t" + totalQuantity1 + "\t" + totalCost1 + "\t");

        System.out.println("Thank you for shopping at my market!");


    }
}


//Create a Simple Grocery Invoice Application:
//
//Requirements:
//
//Prompt the user for input of 2 grocery item with the following criterias:
//itemName01, itemName02 (is a text value)
//itemPrice01, itemPrice02 (is a decimal number value)
//itemQuantity01, itemQuantity02 (is a whole number value)
//Calculate the total cost of each grocery item (cost=price*quantity)
//Calculate the total amount of items in the purchase
//Your final display should be similar to:
//Item Name       Price      Quantity     Cost
//Apple           $2.25      3            $6.75
//Banana          $1.50      5            $7.50
//
//Total Purchase Amount = $14.25
//
//
//Hint: Use escape sequences to help format the tab spaces between your columns!
//
//BONUS:
//
//Generate a random number from 1-10 for each item's quantity amount
//If you spend more than $20, print "You spent too much today..." to the console
//Otherwise, print "Thank you for shopping at my market!"
//
//
//If you finish early, go home!
//*
