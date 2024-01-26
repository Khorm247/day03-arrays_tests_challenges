package neuefische.de;

import java.io.IOException;

import static com.github.lalyos.jfiglet.FigletFont.convertOneLine;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String test = "Hello World!";
        System.out.print(convertOneLine(test));

    }

    public static int add(int addend1, int addend2){
        return addend1 + addend2;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int calcProduct(int a, int b){
        return a * b;
    }

    public static String string_toUppercase(String str){
        return str.toUpperCase();
    }

    public static boolean isPositive(int num){
        return num >= 0;
    }


}