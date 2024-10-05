import java.io.*;
import java.io.IOException;

public class File2 {

    public static void main(String[] args) {

       try {
           FileWriter myWrite = new FileWriter("newFile.txt");
           myWrite.write("Tanvir Ahmed Ruman,");
           myWrite.close();
           System.out.println("Done");
       }
       catch(IOException e){
           System.out.println("Erroe");
           e.printStackTrace();
       }
    }
}
