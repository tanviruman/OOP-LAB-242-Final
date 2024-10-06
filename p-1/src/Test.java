import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
       try {
           BufferedReader myreader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\OOP-LAB-242-Final\\p-1\\src\\input.txt"));
           ArrayList<Student> St = new ArrayList();

           while (true){

               String line = myreader.readLine();
               if (line==null) break;
               String[] parts = line.split(",");

                       St.add(new Student(parts[0],Integer.parseInt(parts[1])));

                       St.sort(new Comparator<Student>() {
                           @Override
                           public int compare(Student o1, Student o2) {
                               if(o1.id < o2.id) return -1;

                               return 0;
                           }
                       });
                       for(Student stu:St){
                           System.out.println(stu.name+" "+stu.id);
                       }

           }


       }
       catch (IOException e){
           e.printStackTrace();
       }
    }
}
