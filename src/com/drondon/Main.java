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

            System.out.println("Введи пароль!!!!:");
            String resultPassword = scanner.nextLine();

            int indexOfAt = result.indexOf("@");
            boolean isEmail = indexOfAt >= 0;

            if (!isEmail && indexOfAt > 0) {
                System.out.println("IS TEXT");
            } else if (resultPassword.length() < 6) {
                System.out.println("PASSWORD MUST BE 6 OR MORE LETTERS!");
            } else {
                System.out.println("IS EMAIL");
            }

        }

    }

}
