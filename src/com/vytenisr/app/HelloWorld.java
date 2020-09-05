package com.vytenisr.app;

public class HelloWorld {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
       // Namų darbai: Primityvūs duomenų tipai
        System.out.println("\n1. Išsiaiškinkite kokia yra maximali reikšmė teigiamam ir neigiamam int tipo kintamąjam. Iš programoje ją išspausdinkite. Atsakykite į šiuos klausimus:");
        System.out.println("-Teigiamas: " + maxInt + " Neigiamas: " + Integer.toString(++maxInt) + "\n");

        System.out.println("a. Ar galėtume sutalpinti visų žemėje gyvenančių žmonių skaičių į int?");
        System.out.println("-Ne\n");

        System.out.println("b. Ar galėtume saugoti lietuvišką asmens kodą int tipo kintamąjame? Jei ne, kokį reiktų pasirinkti?");
        System.out.println("-Ne, nebent nepriklausomai zinotume asmens lyti ir atmestume pirma skaiciu. Galetume naudoti String arba Long.\n");

        System.out.println("2. Parašykite programą kuri prie maximalios int reikšmės pridėkime 1. Kas nutiks?");
        System.out.printf("-Gausime %d, Ivyksta \"Overflow\", pasikeicia pirmas bitas ir skaicius tampa neigiamu.\n\n", ++maxInt);

       // Namų darbai: Operatoriai
        System.out.println("1. Parašykite programą, kuri išspausdina liekaną kai daliname 5 iš dviejų. Panaudokite liekanos operatorių (%).");
        int x = 5 % 2;
        System.out.println("-Gausime " + x + "\n");

        System.out.println("2. Parašykite programą, kuri išspausdina rezultatą dalybos veiksmo 2 / 0. Kas nutinka?");
        try
        {
            int i = 2 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("-Gausime ArithmeticException klaida: " + e + "\n");
        }

        System.out.println("3. Parašykite programą, kuri naudoją šį kodą. Prieš paleisdami šią programą, komentare šone parašykite savo spėjamą atsakymą. Paleidę programą, pasitikrinkite ar teisingai galvojote:");
        System.out.println("x = 10;\nint y = 5;\nSystem.out.println(x == 10 && y <= 5); // kas bus išspausdinta?");
        x = 10;
        int y = 5;
        System.out.print("-");
        System.out.println(x == 10 && y <= 5); // true
        System.out.println(" //true\n");

        System.out.println("System.out.println(x <= y && y > 5); // kas bus išspausdinta?");
        System.out.print("-");
        System.out.println(x <= y && y > 5); // false
        System.out.println(" //false\n");

        System.out.println("System.out.println(„abc” instanceof String); // kas bus išspausdinta?");
        System.out.print("-");
        System.out.println("abc" instanceof String); // true
        System.out.println("// true, (jei su tinkamom kabutem)\n");

       // Namų darbai: Stringai
        System.out.println("1. Išspausdinti tekstą “Sveiki, Jonai, kaip sekasi?” į konsolę, taip, kad “Sveiki, Jonai” būtų vienoje eilutėje, o “kaip sekasi” kitoje. Galima naudoti tik vieną System.out.println().");
        System.out.println("-Sveiki, Jonai,\nkaip sekasi?\n");

        System.out.println("2. Inicializuokite stringą į: „Lorem ipsum dolor sit amet, consectetur adipiscing elit”.");
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println("-" + lorem + "\n");

        System.out.println("a. Konvertuokite visą stringą į mažąsias raides.");
        System.out.println("-" + lorem.toLowerCase() + "\n");

        System.out.println("b. Konvertuokite visą stringą į didžiąsias raides.");
        System.out.println("-" + lorem.toUpperCase() + "\n");

        System.out.println("c. Pakeiskite raides “o” su “z”.");
        System.out.println("-" + lorem.replace("o", "z")  + "\n");

        System.out.println("d. Parašykite kodą, kuris patikrina ar stringas baigiasi žodžiu “elit”. Pagalvokite ką reiškia, kai stringas pasibaigia žodžiu.");
        System.out.println("-" + lorem.endsWith("elit"));
    }
}