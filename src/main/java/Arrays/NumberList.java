package Arrays;

import Algorithms.NumberTests;

import java.util.ArrayList;

public class NumberList {

    ArrayList<NumberTests> numbers = new ArrayList<>();
    ArrayList<NumberTests> primeNumbers = new ArrayList<>();

    public void onlyPrimeNum()
    {
        for(NumberTests n: numbers){
            if(n.checkPrime() == true)
                primeNumbers.add(n);
        }
    }



}
