package Chapter1;

import java.util.Scanner;

public class VariableTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数> ");   int a = stdIn.nextInt();
        System.out.print("整数> ");   int b = stdIn.nextInt();

        System.out.println("合計: " + (a+b));
    }
}
