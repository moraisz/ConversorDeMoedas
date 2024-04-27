package com.conversordemoedas.menu;

import java.util.Scanner;

public class MenuValor {
    public static double escolheValor(double value) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor você deseja? ");

        double input = scanner.nextDouble();
        value = value * input;

        scanner.close();
        return value;

    }
}
