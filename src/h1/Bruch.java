package h1;

public class Bruch {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    public int zaehler;
    public int nenner;

    // Konstruktor: übergebene Werte "zaehler" und "nenner" an Objektattribute "zaehler" und "nenner" zuweisen
    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;

    }

    // Methoden (Fähigkeiten):
    private int ggT(int x, int y) {
        // Kritische Fälle: x == 0 || y == 0
        if(x == 0 && y == 0) {
            return 0;
        } else if(x == 0) {
            return Math.abs(y);
        } else if(y == 0) {
            return Math.abs(x);
        }
        // Euklidischer Algorithmus:
        // 96:27 = 3 Rest15
        // Dividend = 96; Divisor = 27; Rest = 15;
        int rest;
        int betrag_x = x >= 0 ? x : -x;
        int betrag_y = y >= 0 ? y : -y;
        int dividend = betrag_x > betrag_y ? betrag_x : betrag_y;
        int divisor = betrag_x > betrag_y ? betrag_y : betrag_x;

        while (true) {
            rest = dividend % divisor;

            if (rest == 0) {    // Abbruchbedingung
                break;
            }

            dividend = divisor;
            divisor = rest;
        }
        return divisor;
    }

    public void shorten() {
        int ggT = ggT(zaehler, nenner);

        if(ggT == 0) {
            return;
        }
        zaehler = zaehler / ggT;
        nenner = nenner / ggT;
    }

    public boolean hasSameValueAs(Bruch b) {
        return this.zaehler * b.nenner == this.nenner * b.zaehler;
    }

}
