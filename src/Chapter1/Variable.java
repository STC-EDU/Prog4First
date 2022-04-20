package Chapter1;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a;

        System.out.print("整数> ");
        a = stdIn.nextInt();
        a = a * 2;
        System.out.println("2倍すると、" + a + "です");
    }
}
