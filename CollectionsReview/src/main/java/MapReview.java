import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {
        // create Hash Map
        Map<Integer,String> students = new HashMap<>();

        students.put(1,"Jack");
        students.put(2,"Julia");

        String str="JavaJDeveloper";
        System.out.println(findFirstNonRepeating(str));

    }
    public static Character findFirstNonRepeating(String str){
        // create a map : this will cost me space complexity
        Map<Character,Integer> map= new TreeMap<>();
        int count=0;
        //count the frequency of char
        for(Character ch : str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            }
            else map.put(ch,1);
        }
        //start from the beginning and check if there is a char with frequency 1
        for(Character ch: str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }

        return null;
    }

}
