package Uke34;
//1.	Et eksempel på en oppgave som kan løses på mange forskjellige måter er det å sortere verdiene i en tabell.
// Hvor mange sorteringsalgoritmer kjenner du til? På Wikipedia finner du en oversikt over sorteringsalgoritmer.

public class Oppgave113 {
    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
            else if (verdi < minverdi) {minverdi = verdi; mi = i;}
        }

        return new int[]{mi,ma};
    }

    //Testen verdi > maksverdi utføres n − 1 ganger. Hver gang den ikke er sann blir også testen verdi < minverdi utført.
    // Det viser seg (se Avsnitt 1.1.6) at sammenligningen verdi > maksverdi er sann gjennomsnittlig få ganger og dermed usann
    // de fleste gangene. Dermed får vi et gjennomsnittlig antall sammenligninger i metoden over som bare er marginalt mindre enn 2n − 2.
    //
    //Det verste tilfellet får vi når den største ligger først. Fortsatt vil verdi > maksverdi bli utført hver gang, og den er usann hver gang.
    // Dermed blir også verdi < minverdi utført hver gang. Tilsammen 2n - 2 sammenligninger i det verste tilfellet.
    //
    //Det er mulig å lage en en algoritme som bruker ca. 1.5n sammenligninger. Men da må det isteden foretas en del ombyttinger i tabellen og kostnadene ved det er nok større enn det en tjener på å ha færre sammenligninger. Se Oppgave 1 i Avsnitt 1.2.14 i Delkapittel 1.2.


    //6.	Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
    //long fak(int n) som regner ut n! . Hvor mange multiplikasjoner utføres i metoden?

    public static long fak(int n)
    {
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long fak = 1;

        for (int i = 2; i <= n; i++) fak *= i;

        return fak;
    }
    //Hvis n = 0 eller 1 utføres ingen multiplikasjoner. Hvis n > 1 utføres det n − 1 multiplikasjoner.
}
