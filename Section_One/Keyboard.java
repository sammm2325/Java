package Section_One;

import java.util.*;

class Keyboard {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter 2 numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("sum is "+c);
        s.close();

    }
    
}
