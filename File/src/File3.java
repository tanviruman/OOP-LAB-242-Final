import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File3 {


    public static void main(String[] args) {

        try{


            File myobj = new File("newFile.txt");
            Scanner myRead = new Scanner(myobj);

            while (myRead.hasNext()){
                String data = myRead.nextLine();
                System.out.println(data);
            }
            myRead.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
