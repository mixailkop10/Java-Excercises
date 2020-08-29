package Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    //Scanner scanner = new Scanner(System.in);
    String password;

    public boolean valLength(String password)
    {
        if(password.length() > 7)
        {
            return true;
        }
        else
        {
            System.out.println("Password must have 8 characters at least.");
            return false;
        }
    }

    public boolean hasNumber(String password)
    {
        char c;
        for(int i=0; i<password.length(); i++)
        {
            c = password.charAt(i);
            if(Character.isDigit(c))
                return true;
        }
        return false;
    }

    public boolean hasUpper(String password)
    {
        char c;
        for(int i=0; i<password.length(); i++)
        {
            c = password.charAt(i);
            if(Character.isUpperCase(c))
                return true;
        }
        return false;
    }

    public boolean hasLower(String password)
    {
        char c;
        for(int i=0; i<password.length(); i++)
        {
            c = password.charAt(i);
            if(Character.isLowerCase(c))
                return true;
        }
        return false;
    }

    public boolean hasSpecialChar(String password)
    {
        char c;
        for(int i=0; i<password.length(); i++)
        {
            c = password.charAt(i);
            if(!Character.isLetter(c) && !Character.isDigit(c))
                return true;
        }
        return false;
    }

    public boolean noThreeSame(String password)
    {
        ArrayList<Character> characters = new ArrayList<>();
        char c;
        for(int i=0; i<password.length(); i++)
        {
            c = password.charAt(i);
            characters.add(c);
        }
        for(int i=0; i<password.length()-2; i++)
        {
            if(characters.get(i).equals(characters.get(i + 1)) && characters.get(i+1).equals(characters.get(i+2)))
                return false;
        }
        return true;
    }
    //κατι παει λαθος εδω !!
    public boolean noThreeConsecutive(String password)
    {
        char[] passwordCharArray = password.toCharArray();
        int asciiCode = 0;
        boolean isConSeq = true;
        int previousAsciiCode = 0;
        int count = 0;

        for (int i = 0; i < passwordCharArray.length; i++) {
            asciiCode = passwordCharArray[i];
            if ((previousAsciiCode + 1) == asciiCode) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
            else
                count = 0;

            previousAsciiCode = asciiCode;
        }
        return true;
    }

    public void passwordAccepted(String password)
    {
        boolean hasUp = false, hasLow = false , hasNum = false , hasChar = false , hasLen = false, notHasSame = false ;
        ArrayList<Boolean> checkCriteria = new ArrayList<Boolean>();

        if(valLength(password))
            hasLen = true;
        if(hasUpper(password))
            hasUp = true;
        if(hasLower(password))
            hasLow = true;
        if(hasNumber(password))
            hasNum = true;
        if(hasSpecialChar(password))
            hasChar = true;
        if(noThreeSame(password) && noThreeConsecutive(password))
            notHasSame = true;

        checkCriteria.add(hasUp);
        checkCriteria.add(hasLow);
        checkCriteria.add(hasNum);
        checkCriteria.add(hasChar);
        checkCriteria.add(notHasSame);

        int count = 0;
        for(Boolean b: checkCriteria){
            if(b == true)
                count++;
        }

        if(hasLen == true){
            if(count == 5)
                System.out.println("Very Strong Password");
            else if(count == 4)
                System.out.println("Strong Password");
            else if(count == 3 || count == 2)
                System.out.println("Password OK");
            else{
                System.out.println("Invalid Password");
                System.out.println("Your Password must match these criterias");
                System.out.println("1. Password contains at least one uppercase character " +
                        "2. Password contains at least one lowercase character " +
                        "3. Contains at least one number " +
                        "4. Contains at least one special character (e.g., !, _ etc) " +
                        "5. Password length must be at least 8 characters long " +
                        "6. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");
            }
        }


    }
}
