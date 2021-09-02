package Uke34;
class Oppgave112 {

 static int maks(int[] a)  // a er en heltallstabell
        {
        if (a.length < 1)
        throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
        if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

        } // maks

       /* Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
        posisjonen til den minste verdien i en tabell.
        3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den
        første av dem. Hva må endres for at den skal returnere posisjonen til den siste? */

    static int min(int[] a)  // a er en heltallstabell
       {
           if (a.length < 1)
               throw new java.util.NoSuchElementException("Tabellen a er tom!");

           int m = 0;  // indeks til foreløpig største verdi (m for maks)

           for (int i = 1; i < a.length; i++) // obs: starter med i = 1
           {
               if (a[i] < a[m]) m = i;  // indeksen oppdateres
           }

           return m;  // returnerer indeksen/posisjonen til største verdi

       } // min


}