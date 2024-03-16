package org.example;

import java.util.Scanner;

public class Calculations {

    public void comparison(double a, double b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
    public double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }
    public double subtraction(double a, double b) {
        double sub = a - b;
        return sub;
    }
    public double division(double a, double b) {
        double div = a / b;
        return div;
    }

    public double multiplication(double a, double b) {
        double mult = a * b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculations calc = new Calculations();
        System.out.print("Введите а: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        double sum = calc.sum(a, b);
        double sub = calc.subtraction(a, b);
        double div = calc.division(a, b);
        double mult = calc.multiplication(a, b);
        calc.comparison(a, b);

        System.out.println("Сумма a и b: " + sum);
        System.out.println("Разница между a и b: " + sub);
        System.out.println("Деление a на b: " + div);
        System.out.println("Умножение a на b: " + mult);
}}
