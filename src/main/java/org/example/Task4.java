package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        if (str.equals(""))
            throw new RuntimeException("Пустые строки вводить нельзя");
        System.out.println(str);
        reader.close();


    }
}

