package h2;

public class H2_main {

    // Main-Methode:
    public static void main(String[] args) {
        // Erstellen einer Liste (nur der head/Kopfknoten)
        SimpleList myList = new SimpleList();

        // Node-Objekte (Knoten) mit bestimmten Werten (values) hinten an die Liste anfügen:
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);
        System.out.println( myList );   // funktioniert nur, wenn ich die toString()-Methode überschreibe

        // Node-Objekt (Knoten) nach Knoten mit bestimmtem Wert in der Liste anfügen:
        myList.insertAfter(45,4);
        System.out.println( myList );

        // Node-Objekt (Knoten) finden, der einen bestimmten Wert (value) besitzt:
        System.out.println( myList.findFirst(45).value );
        System.out.println( myList.findFirst(45).next.value );

        // Node-Objekt (Knoten) mit bestimmtem Wert (value) löschen:
        System.out.println( myList.delete(45) );
        System.out.println( myList );


    }

}
