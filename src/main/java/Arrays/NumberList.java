package Arrays;

import Algorithms.NumberTests;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumberList {

    ArrayList<Integer> nums = new ArrayList<>();
    int num = 0;

    public void onlyPrime(ArrayList<Integer> nums)
    {
        nums.removeIf(n -> (n%2 !=0));
        System.out.print("Prime numbers of the List: " + nums.toString());
    }

    public void noDuplicate(ArrayList<Integer> nums)
    {
        ArrayList<Integer> noDuplNumbers = new ArrayList<>(new LinkedHashSet<>(nums));
        System.out.println("The list without duplicates: " +noDuplNumbers.toString());
    }

    public void digitsDescended()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        int len = Integer.toString(n).length();
        int a[] = new int[len];

        int num = n;
        int i = 0;

        while(num != 0){
            a[i] = num % 10;
            num /= 10;
            i++;
        }
        for(i = 0; i < len; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(a[j] < a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        String result = "";
        for(i = 0; i < len; i++)
            result += a[i];
        int desc = Integer.parseInt(result);
        System.out.println(desc);
    }
}
