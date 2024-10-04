import java.util.*;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tanvir");
        list.add("Ahmed");
        list.add("Tanvir");
        System.out.println("error="+list.get(2));
        list.set(2,"Ruman");
        for(String Name:list){

            System.out.println(Name);
        }
    }
}
