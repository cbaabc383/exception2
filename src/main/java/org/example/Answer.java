package org.example;

import java.util.Arrays;

public class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] c = {0};

        if (a.length == b.length) {
            c =new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0){
                    throw new  RuntimeException("!!!");
                }else {

                c[i] = a[i] / b[i];}
            }
        }
        return c;
    }
}
