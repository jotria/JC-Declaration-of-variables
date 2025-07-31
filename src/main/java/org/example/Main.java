package org.example;

public class Main {
    int instanceBinary = 0b10_1101;
    int instanceOctal = 072;
    double instanceDouble = 1_234.95;

    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    public static void printLocalVariables(){
        System.out.println("Local Variables: ");
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10_000_000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println(" localDecimal = " + localDecimal);
        System.out.println(" localHex = " + localHex);
        System.out.println(" localBinary = " + localBinary);
        System.out.println(" localOctal = " + localOctal);
        System.out.println(" localLong = " + localLong);
        System.out.println(" localString = " + localString);
    }

    public void printInstanceVariables(){
        System.out.println("\nInstance Variables: ");
        System.out.println(" instanceBinary = " + instanceBinary);
        System.out.println(" instanceOctal = " + instanceOctal);
        System.out.println(" instanceDouble = " + instanceDouble);
    }

    public static void main(String[] args) {
        printLocalVariables();

        Main main = new Main();
        main.printInstanceVariables();

        System.out.println("\nStatic Variable: ");
        System.out.println(" staticHex = " + staticHex);
        System.out.println(" staticByte = " + staticByte);
        System.out.println(" staticString = " + staticString);
    }
}