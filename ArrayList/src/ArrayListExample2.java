import java.util.*;
public class ArrayListExample2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tanvir");
        list.add("Ahmed");
        list.add("Ruman");
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
