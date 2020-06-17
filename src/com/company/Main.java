package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int a = (year / 1000) % 10;
        int b = (year / 100) % 10;
        int c = (year / 10) % 10;
        int d = year % 10;

        if (a == d && b == c) {
            System.out.print(year + " is symmetrical.");
        } else {
            System.out.print(year + " is not symmetrical");
        }
    }
}