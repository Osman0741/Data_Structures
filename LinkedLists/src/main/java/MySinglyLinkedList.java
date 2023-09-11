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

    int indexOf(int id){

        if(isEmpty())return -1;
        int pos=0;
        Node current=head;
        while(current!=null) {
            if(current.id==id)return pos;
            pos++;
            current=current.next;
        }
         return -1;
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


      int getKthFromLast(int k){

        Node fast = head;
        Node slow = head;

          for (int i = 0; i <k ; i++) {
              if(fast==null) return -1;
              fast = fast.next;
          }

         while(fast != null){
             fast = fast.next;
             slow = slow.next;
         }
         return slow.id;
    }

    void removeKthFromLast(int k){
        Node fast = head;
        Node slow = head;

        for (int i = 0; i <k ; i++) {
            if(fast==null) System.out.println("List is empty!!!");;
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

         slow.next = slow.next.next;

    }
    void addFirst(int data){
        //create a new node object from data
        Node node = new Node(data);
                if(isEmpty()){
                    head=tail=node;
                }else{
                    node.next=head;
                    head=node;
                }
                //increase size
                size++;
    }
    public int getKthItemFromLast(int k){
        //create two pointers
        Node ptr1=head;
        Node ptr2=head;
        //move ptr2 k-1 times
        for (int i = 0; i <k-1 ; i++) {
            ptr2=ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;
    }
    public void removeKthItemFromLast(int k){
        //create two pointers
        Node ptr1=head;
        Node ptr2=head;
        Node prev=null;
        //move ptr2 k-1 times
        for (int i = 0; i <k-1 ; i++) {
            ptr2=ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next != null){
            prev=ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
        //do delete operation
        if(ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else if (ptr1==tail){
          tail=prev;
          prev.next=null;
          size--;
        }else {
            prev.next=ptr1.next;
            ptr1.next=null;
            size--;
        }
    }


}
