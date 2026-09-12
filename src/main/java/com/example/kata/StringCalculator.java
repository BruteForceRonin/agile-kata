package com.example.kata;

import java.util.Objects;

public class StringCalculator {
    public int add(String numbers) {
        if (Objects.equals(numbers, "")) {
            return 0;
        }
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}