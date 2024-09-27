package Vecka4;

public class LinkedListDemo {
    public static void main(String[] args) {
        Linkylisty  linky = new Linkylisty();
        linky.add("Isabella");
        linky.add("Alexander");
        linky.add("Mikael");
        linky.display();
        linky.remove("Alexander");
        linky.display();

    }
}

class Node{
    final String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }
}

class Linkylisty {
    private Node head;

    public void add(String data) {
        if (head == null) {
            System.out.println("Adding " + data + " to head");
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("Adding " + data + " behind " +  current.data);
        current.next = new Node(data);

    }

    public void remove(String data) {
        Node current = head;
        Node previous = null;
        while (!current.data.equals(data)) {
            previous = current;
            current = current.next;
        }
        System.out.println("Removing " + current.data);
        previous.next = current.next;
        current = null;

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }



}