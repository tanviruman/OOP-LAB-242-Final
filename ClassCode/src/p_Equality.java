import java.util.Scanner;
public class p_Equality {
    public static void main(String[] args) {
        String S1="Tanvir Ahmed";
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<12;i++){

            String data = sc.next();

            int res = S1.compareTo(data);
            if(res>0){
                System.out.println(res);
                System.out.println("S1<data");
            }
            if(res<0){
                System.out.println(res);
                System.out.println("S1>data");

            }
            else{
                System.out.println("equal");
            }
        }
    }
}
