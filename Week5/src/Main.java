import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int number = 20;
        binary(50);
    }
    public static void binary(int decimal){
        int test = decimal / 2;
        String output = "";
        while (test != 0){
            int temp = decimal;
            int remainder = temp % 2;
            output += remainder;
            test = test / 2;
            decimal = temp / 2;
            test = decimal;

        }
        reverse(output);
    }
    public static void reverse(String sentence){
        String new_name = "";
        for(int i = sentence.length() - 1; i >= 0; i--){
            new_name += sentence.charAt(i);
        }
        System.out.println(new_name);
    }


}