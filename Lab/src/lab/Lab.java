/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author A
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        int x = 30;
        int y = 25;
        int z;
       /* if(x<y)
            z = x;
        else z = y;
        System.out.printf("Minium : %d\n", z);
     if (x>y)
         z = x;
     else z = y;
     System.out.printf("Maximum : %d\n", z);*/
      /*
       Look up the documentation to see how you can compute 
       a. exponentiation
       b. square root 
       Calculate and print the value of 
       */
       z = Math.min(x, y);
       System.out.printf("Minium : %d\n", z);
       z = Math.max(x, y);
       System.out.printf("Maximum : %d\n", z);
       double power = Math.pow(2, 10);
       double squareRoot = Math.sqrt(450);
       System.out.printf("Power : %f\n", power);
       System.out.printf("Square Root : %f\n", squareRoot);
       int data [] = {55,60,56,54,78,};

       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE; 
       for(int number : data){
           if(number>largest){
               largest = number;
           }else if(number<smallest){
               smallest = number;
           }
       }
       System.out.println("Largest number in an array: " + largest);
       System.out.println("Smallest number in an array: " + smallest);
       /*int index = 0;
       while(index <data.length){
           System.out.println(data[index]);
           index++;*/
       //for(int i = 0; i <data.length; i++){
         //  System.out.printf("Array List: %d\n",data[i]);
       }
    
    }

