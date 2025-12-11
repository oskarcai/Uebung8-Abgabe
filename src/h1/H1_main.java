package h1;

public class H1_main {

    // Main-Methode:
    public static void main(String[] args) {

        // Aufgabenteil a) -> ggT zweier Zahlen finden:
        System.out.println( Bruch.ggT(96,27) );
        System.out.println( Bruch.ggT(27,96) );
        System.out.println( Bruch.ggT(-27,96) );
        System.out.println( Bruch.ggT(27,-96) );

        System.out.println();

        // Aufgabenteil b) -> Bruch kürzen:
        Bruch bruch1 = new Bruch(25,5);
        Bruch bruch2 = new Bruch(8,12);
        Bruch bruch3 = new Bruch(4,3);

        bruch1.shorten();
        bruch2.shorten();
        bruch3.shorten();

        System.out.println();

        // Aufgabenteil c) -> Brüche auf Identität überprüfen:
        Bruch bruch4 = new Bruch(5,3);
        Bruch bruch5 = new Bruch(15,9);
        System.out.println( "Brüche identisch? \n" + bruch4.hasSameValueAs(bruch5) );
    }

}
