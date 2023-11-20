package LRUCache;

public class DNode {

    int key;
    int value;
    DNode prev;
    DNode next;

    public DNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public DNode() {
    }
}
