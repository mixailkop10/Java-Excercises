package Algorithms;

import java.util.Scanner;

public class NumberTests {

    int num = 0;
    double sum = 0;
    int counter = 0;

    public boolean checkPrime(int num)
    {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Give a natural number: ");
        //num = Integer.parseInt(scanner.nextLine());

        if (num <= 1){
            System.out.println("This number isnt prime");
            return false;
        }
        else{
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    System.out.println("This number isnt prime");
                    return false;
                }
            }
        }
        System.out.println("This number is prime");
        return true;
    }

    /*public void isPrime(){
        if(checkPrime() == true)
            System.out.println("This number is prime");
        else
            System.out.println("This number isn't prime");
    }*/

    public double calculateSum(int num){
        //υπαρχει υπολογιστικο θεμα
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Give a number: ");
        //num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++)
            sum += (1/i);

        System.out.println("The sum of the series 1 + ½ + ⅓+ ... + 1/n for number " +num + " is :" +sum);
        return sum;
    }

    public double countDigits(long number){

        //long number = 0l;

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Give a number: ");
        //number = Long.parseLong(scanner.nextLine());

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
        //double number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        number = Double.parseDouble(scanner.nextLine());

        int intPart = (int)number;
        double decimalPart = number - intPart;

        System.out.println("the decimal part of number " +number +" is: " +decimalPart);
    }
}
