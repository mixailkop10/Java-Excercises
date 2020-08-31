package Algorithms;

import java.util.Scanner;

public class NumberTests {

    int num = 0;
    double sum = 0;
    int counter = 0;

    public void checkPrime(int num)
    {
        if (num <= 1){
            System.out.println("This number isnt prime");
        }
        else{
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    System.out.println("This number isnt prime");
                }
            }
        }
        System.out.println("This number is prime");
    }

    public double countDigits(long number){

        //αν δεν κανω αυτην την αναθεση στο sout θα βγαλει "the number 0"
        long number2 = number;

        while(number != 0)
        {
            // num = num/10
            number /= 10;
            ++counter;
        }

        System.out.println("The number " +number2 +" has " +counter +" digits ");
        return counter;
    }

    public void printDecimalPart(double number){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        number = Double.parseDouble(scanner.nextLine());

        int intPart = (int)number;
        double decimalPart = number - intPart;

        System.out.println("the decimal part of number " +number +" is: " +decimalPart);
    }
}
