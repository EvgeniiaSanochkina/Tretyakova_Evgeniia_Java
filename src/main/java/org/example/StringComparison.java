package org.example;

import java.util.Scanner;

public class StringComparison {
    public void comprasion(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringComparison comp = new StringComparison();
        System.out.print("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = in.nextLine();
        comp.comprasion(str1, str2);

}}
