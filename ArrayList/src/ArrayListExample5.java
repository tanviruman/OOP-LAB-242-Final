import java.util.*;
public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Tanvir");
        list1.add("Ahmed");
        list1.add("Ruman");
        list1.add("ahmed");
        Collections.sort(list1);
        for(String Name:list1)
        {
            System.out.println(Name);
        }

        System.out.println("Sort Numbers");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(80);
        list2.add(2);
        list2.add(5);
        Collections.sort(list2);
        for(Integer Number: list2)
        {
            System.out.println(Number);
        }


    }
}
