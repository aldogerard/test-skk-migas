package com.enigmacamp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        questionNo1(15);
        questionNo2_A(5);
        questionNo2_B(5);
        questionNo2_C(5);
        questionNo2_D(5);
        questionNo3(List.of(12, 9, 13, 6, 10, 4, 7, 2));
    }

    public static void questionNo1(Integer number) {
        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.print("OKYES");
            } else if (i % 3 == 0) {
                System.out.print("OK");
            } else if (i % 4 == 0) {
                System.out.print("YES");
            }else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    public static void questionNo2_A(Integer number) {
        for (int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void questionNo2_B(Integer number) {
        for (int i = 1; i <= number; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void questionNo2_C(Integer number) {
        int x = 0;
        String opt = "up";
        for (int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                if (x == 1) opt = "up";
                if (x == number) opt = "down";

                if (opt.equals("up")) System.out.print(++x + "");
                if (opt.equals("down")) System.out.print(--x + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void questionNo2_D(Integer number) {
        int marginDown = number * 2 - 1;
        int marginUp = 1;

        for (int i = 1; i <= number; i++) {
            int x = i - 1;
            for(int j = 1; j <= number; j++) {
                if (j % 2 == 1){
                    x += (j == 1) ? 1 : marginUp;
                    System.out.print(x + "\t");
                }
                if (j % 2 == 0){
                    x+=marginDown;
                    System.out.print(x + "\t");
                }
            }
            System.out.println();
            marginDown -= 2;
            marginUp += 2;
        }
        System.out.println();
    }

    public static void questionNo3(List<Integer> numbers) {
        List<Integer> newNumber = numbers.stream()
                .filter(n -> n % 3 != 0)
                .sorted()
                .toList();
        System.out.println(newNumber);
        System.out.println();
    }

}