package Strings;

public class Symmetric {

    public void checkIfSymmetric(String s) {
        String string = s.replaceAll("\\s+", "").toLowerCase();
        int length = string.length();
        int forward = 0;
        int backward = length - 1;
        char forwChar = 0;
        char backChar = 0;

        while (backward > forward) {
            forwChar = string.charAt(forward++);
            backChar = string.charAt(backward--);
        }

        if (forwChar != backChar)
            System.out.println(s + " is not symmetric");
        else
            System.out.println(s + " is symmetric");

    }
}
