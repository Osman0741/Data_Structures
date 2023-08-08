import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        //1. create a set
        Set<Student> set = new LinkedHashSet<>();

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));

        System.out.println(set);

        String str="Java Developer";
        System.out.println(firstRepeatingChar(str));



    }
    public static Character firstRepeatingChar(String str){
        //create a hashset
        Set<Character> chars= new HashSet<>();
        //iterate over the char array and chars into hashset
        for (Character ch : str.toCharArray()){
            //if add method is false return that char
            if(!chars.add(ch))
                return ch;
        }
        return null;
    }
}
