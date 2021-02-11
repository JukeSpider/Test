package Patterns.L2;

public class Test {
    public static void main(String[] args) {
        /*
        split - разделяет строку на слова (в массив), разделяя их по спецсимволу;
        replace - заменяет в строке символ или последовательность символов на другие символы;
        replaceAll - то же самое, но может искать последовательность с паттерном;
        replaceFirst - то же самое, но заменят только первое совпадение;
         */

        String a = "What651651a321wonderful1495life!";
        String b = "hello mr bitch";

        String[] words = a.split("\\d+");
        for(String string : words){
            System.out.println(string);
        }

        System.out.println(b.replace(" ","*"));
    }
}
