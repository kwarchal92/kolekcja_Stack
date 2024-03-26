package kolekcja_Stack_metoda_peek;
import java.util.*;

public class Main {
    public static void main(String[] agrs)
    {
        Stack stos = new Stack();

        //Wstawia litery alfabetu A do Z
        for (char znak = 'A'; znak <= 'Z'; znak++)
        {
            stos.push(znak); //dodaje do stosu kolejne litery
        }

        System.out.println("Wyswietla zawartosc stosu: " + stos);

        //Wyswietla zawartosc stosu
        System.out.println("Litera A zanjduje się na pozycji " + stos.search('A') + ".");
        System.out.println("Elementy znajdujące się na wierzchu stosu to  " + stos.peek() + ".");
    }
}
