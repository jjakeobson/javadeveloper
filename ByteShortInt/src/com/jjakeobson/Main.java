package com.jjakeobson;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int minVal = -2_147_483_648;
        int maxVal = 2_147_483_647;
        int myTotal = (minVal / 2);
        System.out.println("total = " + myTotal);

        // byte has a width of 8
        byte myByte = -128;
        byte newByte = (byte) (myByte / 2);

        //short has a width of 16
        short myShort = 32767;

        //long has a width of 64
        long myLong = 9_223_372_036_854_775_807L; //also has 'L' at the end of it

        //challenge
        byte bytevar = 4;
        short shortval = 10;
        int intval = 350;

        //no need to cast long or int
        long longval = 50000L + 10L * (bytevar + shortval + intval);
        System.out.println(longval);

    }
}
