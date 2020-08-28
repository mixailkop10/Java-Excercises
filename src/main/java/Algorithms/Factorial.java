package Algorithms;

import java.util.Scanner;

public class Factorial {

    int num = 0;
    int factorial = 1;
    double sum = 0;

    public int CalculateFactorial(int num){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a natural number: ");
        num = Integer.parseInt(scanner.nextLine());

        if(num == 0)
            return 1;
        else{
            for(int i=1; i<=num; i++)
                factorial *= i;
            return factorial;
        }
    }

    public int FindMaxFactorial(){

        while (true)
        {
            if (factorial < 0)
                break;
            num++;
            factorial *= num;
        }
        int max = num-1;
        return max;

    }

    public double CalculateSum(){
        //υπαρχει υπολογιστικο θεμα
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++)
            sum +=  ((1.0/CalculateFactorial(i))/2);

        System.out.println("The sum of the series 1 + ½ + ⅓+ ... + 1/n for number " +num + " is :" +sum);
        return sum;
    }
}
