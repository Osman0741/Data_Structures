public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        //create a new object from data
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else { //if there are elements in List
            tail.next = node;
            tail = node;
            size++;
        }
    }
    void deleteById(int id ) {

        //check if empty
        if (isEmpty()) System.out.println("List is empty!!!");

        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;//ex-tail will be eligible for Garbage Collection
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            //move forward
             prev=current;
            current=current.next;

        }
    }
    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.print(current.id + "=>");
            }
            current = current.next;
        }
    }
}