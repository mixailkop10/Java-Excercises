package Service;

import Algorithms.Factorial;
import Algorithms.NumberTests;
import Arrays.NumberList;
import Stacks.Reverse;
import Strings.Password;
import Strings.Symmetric;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {

    public void printText(){
        System.out.println("LIVERPOOL");
    }

    public void menu()
    {
        System.out.println(" ===================== ");
        System.out.println("What do you Wanna Do ??");
        System.out.println("1.Factorial nums");
        System.out.println("2.Prime nums");
        System.out.println("3.Calculate the following Sum : 1 + ½ + ⅓+ ... + 1/n");
        System.out.println("4.Counts the digits of a long number");
        System.out.println("5.Prints the decimal part of a number");
        System.out.println("6.Finds the prime numbers / Removes duplicates");
        System.out.println("7.Returns the digits of number in descending order");
        System.out.println("8.Reverses a string using only a stack");
        System.out.println("9.Checks if a word is symmetric");
        System.out.println("10.Check your Password");
        System.out.println("0.Exit\n");
    }

    public boolean keepRolling() {

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        boolean continues = true;
        int number = 0;
        double doubleNum = 0;
        long longNum = 0;

        switch (answer) {
            case 1:
                Factorial factorial = new Factorial();

                System.out.println("Enter a number:\n");
                number = Integer.parseInt(scanner.nextLine());
                System.out.println("This number's factorial: " + factorial.CalculateFactorial(number));
                System.out.println("The maximum value as an Integer so that the factorial result is valid is: " +factorial.FindMaxFactorial());
                break;
            case 2:
                NumberTests numberTests = new NumberTests();

                System.out.println("Enter a number:\n");
                number = Integer.parseInt(scanner.nextLine());
                numberTests.checkPrime(number);
                break;
            case 3:
                Factorial factorial1 = new Factorial();
                System.out.println("The sum of that series is: " + factorial1.CalculateSum(doubleNum));
                break;
            case 4:
                NumberTests numberTests2 = new NumberTests();
                System.out.println("Enter a long number: \n");
                longNum = Long.parseLong(scanner.nextLine());
                numberTests2.countDigits(longNum);

                break;
            case 5:
                NumberTests numberTests3 = new NumberTests();
                numberTests3.printDecimalPart(doubleNum);
                break;
            case 6:
                System.out.println("How many numbers you want the List to have ??");
                int listsize = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter numbers : \n");
                ArrayList<Integer> numbersGiven = new ArrayList<>(listsize);
                ArrayList<Integer> numbersGiven2 = new ArrayList<>(listsize);

                while (numbersGiven.size() < listsize) {
                    number = Integer.parseInt(scanner.nextLine());
                    numbersGiven.add(number);
                    numbersGiven2.add(number);
                    System.out.println("next number: ");
                }

                System.out.println("The list before any check: " +numbersGiven.toString());
                System.out.println("------------");
                NumberList numberList = new NumberList();
                numberList.onlyPrime(numbersGiven);
                System.out.println("------------");
                numberList.noDuplicate(numbersGiven2);
                // αν δεν εφτιαχνα την numbersGiven2 και στην γραμμη 97 περνουσα ως παραμετρο το numbersGiven θα εκανε τον duplicate ελεγχο
                // πανω στην λιστα αφοτου περασε τον ελεγχο ως onlyPrime
                // δοκιμασα πολλους τροπους ακομα και να κανω τις συναρτησεις public ArrayList στην αντιστοιχη κλασση αλλα δεν μπορεσα
                // οποτε το εκανα ετσι λαικα !!
                break;
            case 7:
                NumberList numberList1 = new NumberList();
                numberList1.digitsDescended();
                break;
            case 8:
                System.out.println("Write a word: ");
                String string = scanner.nextLine();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(string);
                Reverse reverse = new Reverse(string.length());
                reverse.reverse(stringBuffer);
                break;
            case 9:
                System.out.println("Write a word: ");
                String s = scanner.nextLine();
                Symmetric symmetric = new Symmetric();
                symmetric.checkIfSymmetric(s);
                break;
            case 10:
                System.out.println("Enter your password");
                String password = scanner.nextLine();
                Password pass = new Password();
                pass.passwordAccepted(password);
                break;
            case 0:
                continues = false;
                break;
            default:
                System.out.println();
                continues = false;
                break;

        }
        return continues;
    }
}
