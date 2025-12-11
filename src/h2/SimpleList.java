package h2;

public class SimpleList {
    // Objektattribut/Instanzvariable (Eigenschaft):
    public Node head;   // Kopfknoten

    // Konstruktor: erstellt ein Node-Objekt und weist es an head zu
    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);    // -> Einstiegspunkt zur Liste
    }

    // Methoden (Fähigkeiten):
    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        if(head.next == null) {     // wenn Liste leer (nur head/Kopfknoten)
            return null;
        }

        Node current = head.next;
        while(current.next != null) {
            current = current.next; // while-Schleife läuft bis zum letzten Node/Knoten
        } return current;           // und gibt ihn zurück
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);  // neues Node-Objekt (Knoten) mit newValue erstellen

        if(head.next == null) {
            head.next = newNode;
        } else {
            Node current = head.next;
            while(current.next != null) {   // while-Schleife läuft bis zum letzten Node/Knoten
                current = current.next;
            }
            current.next = newNode;         // newNode-Knoten an letzten Node anfügen
        }
    }

    public Node findFirst(int value)  {
        Node current = head.next;

        while(current != null) {            // while-Schleife läuft bis zum Knoten,
            if(current.value == value) {    // wo current.value == value ist
                return current;
            }
            current = current.next;
        }

        return null;                        // return null, wenn value nicht gefunden
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = findFirst(preValue);     // direkt den Knoten mit dem Wert preValue finden

        if(current == null) {
            return false;
        } else {
            Node newNode = new Node(newValue);  // neues Node-Objekt (Knoten) mit newValue erstellen
            newNode.next = current.next;    // alle Knoten nach current an newNode anfügen
            current.next = newNode;         // newNode-Knoten (inkl. alle darauffolgenden Knoten) an current anfügen
            return true;
        }
    }

    public boolean delete(int value) {
        Node pre_Node = head;           // neues Node-Objekt (eins vor current, dem aktuellen Knoten)
        Node current = head.next;

        while(current != null) {
            if(current.value == value) {
                pre_Node.next = current.next;   // normalerweise pre_Node.next == current
                                                // pre_Node.next = current.next
                                                // -> current.next-Knoten an pre_Node-Knoten anfügen -> current wird übersprungen/gelöscht
                return true;
            }
            pre_Node = current;
            current = current.next;
        }

        return false;
    }

}