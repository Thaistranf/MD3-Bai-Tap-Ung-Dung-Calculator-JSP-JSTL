package com.example.baitapungdungcalculatorjspjstl;

public class Calculator {
    public static double calculator(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0){
                    return number1 / number2;
                } else {
                    throw new RuntimeException("Khong chia duoc cho 0");
                } default:
                    throw new RuntimeException("Khong hop le");
        }
    }
}
