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
        int dividend = Math.max( Math.abs(x), Math.abs(y) );    // betragsmäßig größere Zahl von x und y
        int divisor = Math.min( Math.abs(x), Math.abs(y) );     // betragsmäßig kleinere Zahl von x und y

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
        return (long)this.zaehler * b.nenner == (long)this.nenner * b.zaehler;  // zu long casten -> potenziellen overflow vermeiden
    }

}
