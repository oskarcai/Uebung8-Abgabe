package h2;

public class Node {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    public int value;
    public Node next;

    // Konstruktor: übergebenen Wert "value" an "value" zuweisen & Node-Objekt "next" "null-Wert" zuweisen
    public Node(int value) {
        this.value = value;
        next = null;
    }

}

// [head] -> [first] -> [second] -> [third] -> third.next == null
