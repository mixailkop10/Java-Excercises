package Stacks;

public class Reverse {

    int size;
    int top;
    char[] a;


    public Reverse(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    public boolean isEmpty()
    {
        return (top < 0);
    }

    public boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }

    public void reverse(StringBuffer str) {

        int n = str.length();
        Reverse obj = new Reverse(n);

        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
        System.out.println(str);
    }
}
