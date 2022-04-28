package edu.kis.vh.nursery.list;

/**
 * Klasa Node odzwierciedla węzeł w liście,który przechowuje wartość.
 * Klasa zawiera wartość typu całkowitego,wskaźniki typu node do poprzedniego i następnego węzła w liście.
 * Klasa zawiera 6 metod publicznych w tym jeden konstruktor,3 gettery i 2 settery.
 * konstruktor Node przypisuje wartość do  value.
 * metoda getValue() zwraca zmienną value
 * metoda getPrev() zwraca wskaźnik do poprzedniego węzła (Node prev)
 * metoda getNext() zwraca wskaźnik do następnego węzła (Noden ext)
 * metoda setPrev() ustawia wskaźnik do poprzedniego węzła (Node prev)
 * metoda setNext() ustawia wskaźnik do następnego węzła (Node next)
 */
public class Node {

    private int value;
    private Node prev;
    private Node next;

    public Node(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
