package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int MyMinIntvalue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + MyMinIntvalue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue+1));
        System.out.println("Bused MIN value = " + (MyMinIntvalue - 1));

        int myMaxIntTest = 2147483647; // can't overflow or underflow
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;;
        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Maximum Value = "+ myMaxByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;;
        System.out.println("short Minimum Value = "+ myMinshortValue);
        System.out.println("short Maximum Value = "+ myMaxshortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;;
        System.out.println("long Minimum Value = "+ myMinlongValue);
        System.out.println("long Maximum Value = "+ myMaxlongValue);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinByteValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue /2);

        short myNewShortValue = (short) (myMinshortValue /2);

    }
}
