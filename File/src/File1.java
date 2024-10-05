import java.io.File;
import java.io.IOException;

public class File1 {

    public static void main(String[] args) {
        try{
            File myobj = new File("newFile.txt");

            if(myobj.createNewFile()){
                System.out.println("File is created");

            }
            else{

                System.out.println("File is not created");
            }


        }

        catch( IOException e){

            e.printStackTrace();
        }

    }

}
