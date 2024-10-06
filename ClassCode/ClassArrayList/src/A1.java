import java.util.ArrayList;

public class A1 {


        public static void main(String[] args) {

            //int float double : primitive data type
            //String Integer : class reference data type
            ArrayList<Integer> list = new ArrayList<>();
            list.add(12); //12
            System.out.println(list.size());
            list.add(10); // 12 10
            list.add(20);
            list.add(15);
            System.out.println(list.size());
for(Integer number:list){
    System.out.println(number);
}
           /* for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }*/

           /* list.add(2,100); //insert 100 in index 2 and update the array size
            System.out.println(list.get(2));

            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

            list.remove(3); //delete the element in index 3

            list.set(1,23); // update the element in index 1



        }*/
    }
}
