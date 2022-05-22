package org.example.practice1;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class LargeNumbers {

    public static void main(String[] args) {
        outputOfAllSequences();
        System.out.println("Enter number of bits ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        BigInteger randomNum = BigInteger.probablePrime(num, new Random());

        System.out.println(numberOfKeyOptions(num));

        System.out.println(randomNum);

        float time = System.nanoTime();

        System.out.println(iterateOverValues(randomNum));

        time = (((float) System.nanoTime() - time)) / 1000000;

        System.out.println("Lead time : " + time);
    }

    private static void outputOfAllSequences() {
        System.out.println("Number of sequences :");
        for (int i = 4; i <= 4096; i *= 2) {
            System.out.println("for " + i + " - bits : " + numberOfKeyOptions(i));
        }
    }

    private static BigInteger numberOfKeyOptions(int powValue) {
        BigInteger bigInteger = new BigInteger("2");
        return bigInteger.pow(powValue);
    }

    private static BigInteger iterateOverValues(BigInteger randomNum) {
        BigInteger bI = new BigInteger("0");
        while (true) {
            if (bI.equals(randomNum)) {
                return bI;
            }
            bI = bI.add(BigInteger.ONE);
        }
    }
}

