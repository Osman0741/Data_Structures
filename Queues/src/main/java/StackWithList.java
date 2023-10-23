import java.util.ArrayList;
import java.util.List;

public class StackWithList<E> {
    List<E> list;

    public StackWithList() {
        this.list = new ArrayList<>();
    }
    public void push(E e){
        list.add(0,e);
    }
    public E pop(){
        if(list.isEmpty()) return null;
        else return list.remove(0);
    }
}
