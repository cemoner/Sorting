package com.company;

import java.util.Arrays;


public class CorrectPlacement {

    public void placer(int... numbers) {
        System.out.println("Before : " + Arrays.toString(numbers) + " ");
        for (int i = -1; i <= numbers.length - 2; i++) {
            int min = numbers[i + 1];
            for (int number : numbers) {

                if (number <= min && indexofTheRight(number, numbers, i) > i) {
                    min = number;
                }
            }
            numbers[indexofTheRight(min, numbers, i)] = numbers[i + 1];
            numbers[i + 1] = min;
        }
        System.out.println("After : " + Arrays.toString(numbers));
    }

    public int indexofTheRight(int element, int[] array, int range) {

        for (int i = array.length - 1; i > range; i--) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
