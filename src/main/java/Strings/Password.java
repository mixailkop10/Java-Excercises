package Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    Scanner scanner = new Scanner(System.in);
    String password = scanner.nextLine();

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
            if(characters.get(i).equals(characters.get(i + 1)) && characters.get(i+1).equals(characters.get(i+3)))
                return false;
        }
        return true;
    }

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
                    isConSeq = false;
                    break;
                }
            }
            else
                count = 0;

            previousAsciiCode = asciiCode;
        }
        return isConSeq;
    }
}
