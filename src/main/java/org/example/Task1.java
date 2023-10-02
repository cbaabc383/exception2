package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        boolean sign = true;
        while (sign) {
            try {
                Scanner sc = new Scanner(System.in);
                Float num = sc.nextFloat();
                System.out.println(num);
                sign = false;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("not number");
            }
        }
    }
}
