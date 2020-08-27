package Algorithms;

import java.util.Scanner;

public class Factorial {

    int num = 0;
    int factorial = 1;

    public int CalculateFactorial(){

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
}
