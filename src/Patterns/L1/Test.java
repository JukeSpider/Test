package Patterns.L1;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - одна цифра;
        + - один или более;
        * - ноль или более;
        ? - ноль или один символ до...;
        . - любой символ;

        \\w - одна любая латинская буква;
        (x|y|z) - одно из множества;
        [A-za-z] - все латинские буквы;
        [^abc] - все символы, кроме a,b,c;

        {2} - точное количество до;
        {2,} - от двух или более до;
        {2,10} от двух до десяти цифр до;

         */
        String a = "+13210";
        String b = "-13210";
        String c = "13210";

        System.out.println(a.matches("-?\\d*"));
        System.out.println(b.matches("-?\\d*"));
        System.out.println(c.matches("-?\\d*"));
        System.out.println();
        System.out.println(a.matches("(\\+|-)?\\d*"));
        System.out.println(b.matches("(\\+|-)?\\d*"));
        System.out.println(c.matches("(\\+|-)?\\d*"));
    }
}
