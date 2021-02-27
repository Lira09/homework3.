package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {2.1, -7.3, 3.4, -2.0, 5.6, -1.3, 5.0, 4.3, 2.0, -3.7, 4.3, -2.7, 6.2, -5.2, 4.0};

        Arrays.sort(numbers);

        double plus = 0.0;
        int positive = 0;
        boolean isNegative = false;

        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (isNegative) {
                plus += num;
                positive++;
            }
        }
double avarageSum = plus/positive;
        System.out.println("Среднее арифметическое значение положительных чисел" + avarageSum);
        System.out.println(Arrays.toString(numbers));

    }
}
