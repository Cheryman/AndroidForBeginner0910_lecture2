package com.drondon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введи почту!!!!:");
            String result = scanner.nextLine();
            if ("exit".equals(result)) {
                System.out.println("Пока!");
                return;
            }

            int indexOfAt = result.indexOf("@");
            boolean isEmail = indexOfAt >= 0;

            System.out.println("Is email: " + isEmail);

        }

    }

}
