import java.io.*;
import java.util.Scanner;
public class problem1 {

    public static boolean is_num(String a){

        try{
            Double.parseDouble(a);
            return true;
        }

        catch (NumberFormatException e ){
            return false;
        }
    }


    public static void main(String[] args) {

        try{
            File file = new File("C:\\Users\\User\\IdeaProjects\\OOP-LAB-242-Final\\Filesolve\\src\\Output.txt");
            File read_file = new File("C:\\Users\\User\\IdeaProjects\\OOP-LAB-242-Final\\Filesolve\\src\\Sample.txt");
            //file.createNewFile();\
            PrintWriter write = new PrintWriter(new FileWriter(file, false));
          Scanner sc = new Scanner(read_file);

          while (sc.hasNextLine()){
              String s= sc.nextLine();
              String[] parts =s.split("  ");
              for(int i=0;i< parts.length;i++){
                  if(is_num(parts[i])==true){
                      write.print(parts[i]+" ");
                  }

              }
write.println();
          }
            sc.close();
            write.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
