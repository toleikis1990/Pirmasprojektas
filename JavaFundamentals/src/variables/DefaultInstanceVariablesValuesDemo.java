package variables;

public class DefaultInstanceVariablesValuesDemo {

    // Sveiki skaičiai (Integral/Integers numbers):
    static byte varByte;
    static short varShort;
    static int varInt;
    static long varLong;

    // Slankiojo kablelio skaičiai (Floating point numbers):
    static float varFloat;
    static double varDouble;

    // Simboliai (Characters):
    static char varChar;

    // Bulio (Boolean)
    static boolean varBoolean;

    public static void main(String[] args) {
        System.out.println("byte default value: " + varByte);
        System.out.println("short default value: " + varShort);
        System.out.println("int default value: " + varInt);
        System.out.println("long default value: " + varLong);
        System.out.println("float default value: " + varFloat);
        System.out.println("double default value: " + varDouble);
        System.out.println("char default value: " + varChar); // Atspausdina: \u0000
        System.out.println("boolean default value: " + varBoolean);
    }
}
