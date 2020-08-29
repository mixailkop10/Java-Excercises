import Algorithms.Factorial;
import Algorithms.NumberTests;
import Arrays.NumberList;
import Service.Ui;
import Stacks.Reverse;
import Strings.Password;
import Strings.Symmetric;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ui ui = new Ui();
        do{
            ui.menu();
        }while(ui.keepRolling());

        /*int factorial = 1;
        int num = 0;
        int i = 1;


        System.out.println(Integer.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);
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

        //NumberTests numberTests = new NumberTests();
        //numberTests.checkPrime();
        //numberTests.isPrime();
        //numberTests.calculateSum();
        //numberTests.countDigits();
        //numberTests.printDecimalPart();
        //NumberList numberList = new NumberList();
        //numberList.onlyPrimeNum();
        //Factorial f = new Factorial();
        //f.CalculateSum();

        /*ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);
        ArrayList<Integer> noDuplNumbers =
                new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(noDuplNumbers);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        System.out.println(nums);
        nums.removeIf(n -> (n%2 !=0));
        System.out.println(nums);

        StringBuffer s= new StringBuffer("Liverpool");
        Reverse r = new Reverse(10);
        r.reverse(s);
        System.out.println("Reversed string is " + s);

        String s1 = "liverpool";
        String s2 = "Liverpool";
        Symmetric sym = new Symmetric();
        sym.equalIgnoreCase(s1,s2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a password: ");
        String test = scanner.nextLine();
        Password pass = new Password(test);

        System.out.println(pass.hasLower(test));
        System.out.println(pass.hasUpper(test));
        System.out.println(pass.hasNumber(test));
        System.out.println(pass.hasSpecialChar(test));
        System.out.println(pass.valLength(test));
        System.out.println(pass.noThreeSame(test));
        System.out.println(pass.noThreeConsecutive(test));

        pass.passwordAccepted(test);*/
    }
}
