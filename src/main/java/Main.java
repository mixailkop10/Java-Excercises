import Algorithms.Factorial;
import Algorithms.NumberTests;
import Service.Ui;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int factorial = 1;
        int num = 0;
        int i = 1;


        //System.out.println(Integer.MAX_VALUE);

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Give a natural number: ");
        num = Integer.parseInt(scanner.nextLine());
        if (num == 0)
            System.out.println(1);
        else {
            for (i = 1; i <= num; i++)
                factorial *= i;
            System.out.println(+factorial);
        }


        while (true) {
            if (factorial < 0)
                break;
            num++;
            factorial *= num;
        }
        int max = num - 1;
        System.out.println("Max Factorial Number is: " + max);*/

        NumberTests numberTests = new NumberTests();
        //numberTests.checkPrime();
        //numberTests.isPrime();
        //numberTests.calculateSum();
        //numberTests.countDigits();
        //numberTests.printDecimalPart();
    }
}
