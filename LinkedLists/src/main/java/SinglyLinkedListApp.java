public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList =new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i <10 ; i++) {
            myList.add(i);
        }
        myList.printNodes();
        myList.deleteById(9);
        myList.printNodes();
        System.out.println("Index of 8: "+myList.indexOf(8));

        System.out.println(myList.getKthFromLast(3));
        System.out.println("*****************************");

        myList.removeKthFromLast(3);
        myList.printNodes();

    }
}
