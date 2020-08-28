package Strings;

public class Symmetric {

    public boolean check(String str1, String str2)
    {
        int i = 0;

        // length of first string
        int len1 = str1.length();

        // length of second string
        int len2 = str2.length();

        // if length is not same
        // simply return false since both string
        // can not be same if length is not equal
        if (len1 != len2)
            return false;

        // loop to match one by one
        // all characters of both string
        while (i < len1)
        {

            // if current characters of both string are same,
            // increase value of i to compare next character
            if (str1.charAt(i) == str2.charAt(i))
            {
                i++;
            }

            // if any character of first string
            // is some special character
            // or numeric character and
            // not same as corresponding character
            // of second string then return false
            else if (!((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
                    || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')))
            {
                return false;
            }

            // do the same for second string
            else if (!((str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
                    || (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')))
            {
                return false;
            }

            // this block of code will be executed
            // if characters of both strings
            // are of different cases
            else
            {
                // compare characters by ASCII value
                if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
                {
                    if (str1.charAt(i) - 32 != str2.charAt(i))
                        return false;
                }

                else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
                {
                    if (str1.charAt(i) + 32 != str2.charAt(i))
                        return false;
                }

                // if characters matched,
                // increase the value of i to compare next char
                i++;

            } // end of outer else block

        } // end of while loop

        // if all characters of the first string
        // are matched with corresponding
        // characters of the second string,
        // then return true
        return true;

    }


    public void equalIgnoreCase(String str1, String str2)
    {
        boolean res = check(str1, str2);

        if (res == true)
            System.out.println( "Same" );
        else
            System.out.println( "Not Same" );
    }
}
