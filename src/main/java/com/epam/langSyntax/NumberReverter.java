package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int first = number % 10;
        number /= 10;
        int second = number % 10;
        number /= 10;
        number += (first * 100) + (second * 10);
        System.out.println(number);
    }

}
