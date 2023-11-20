package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    HashMap<Integer,DNode> cacheMap = new HashMap<>();
    int size;
    int capacity;
    DNode head;
    DNode tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.head = new DNode();
        this.tail = new DNode();
        this.head.next=tail;
        this.tail.prev= head;
    }
    public int get(int key){

        DNode node = cacheMap.get(key);
        if(node==null) return -1;
        else {
            moveToFirst(node);
            return node.value;
        }
    }

    private void moveToFirst(DNode node) {
        removeNode(node);
        addNode(node);
    }
    private void removeNode(DNode node){
        DNode prevNode =node.prev;
        DNode nextNode = node.next;
        prevNode.next =nextNode;
        nextNode.prev=prevNode;
    }
    private void addNode(DNode node){

        node.prev = head;
        node.next = head.next;
        head.next.prev=node;
        head.next=node;
    }
    public void put(int key , int value){
        DNode node = cacheMap.get(key);
        if(node==null){
            DNode newNode = new DNode(key,value);
            cacheMap.put(key,newNode);
            addNode(newNode);
            size++;
            if(size>capacity){
                DNode last = popLast();
                size--;
                cacheMap.remove(last.key);
            }
        }else {
            node.value=value;
            moveToFirst(node);
        }
    }
    private DNode popLast() {
        DNode popped = tail.prev;
        removeNode(popped);
        return popped;
    }
    public void printLRUCache(){
        for (Map.Entry<Integer, DNode> entry : cacheMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue().value);
        }
    }

}
