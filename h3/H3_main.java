package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 12;
        boolean istVoll;

        // so viele wie möglich von Warteliste auf Fixplätze verschieben
        int freiePlaetze = max - fix;

        if (freiePlaetze > 0 && wartend > 0) {
            int zuweisungen = Math.min(freiePlaetze, wartend);
            fix += zuweisungen;
            wartend -= zuweisungen;
        }

        istVoll = (fix == max);

        System.out.println("Max: " + max);
        System.out.println("Fix: " + fix);
        System.out.println("Wartend: " + wartend);
        System.out.println("Ist voll: " + istVoll);
    }
}
