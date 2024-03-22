package MyFirstProgram;

import java.util.*;

public class KeybRead {
    public static void main(String args[]){
        String binary1 = "1010"; // Binary string representing 10 in decimal
        String binary2 = "1101"; // Binary string representing 13 in decimal

        // Convert binary strings to decimal integers
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        System.out.println(decimal1);
        System.out.println(decimal2);


        // Add the decimal integers
        int sum = decimal1 + decimal2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Output the result
        System.out.println("Binary sum: " + binarySum);
    }
    
}
