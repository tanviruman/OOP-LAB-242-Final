public class P_Split {


    public static void main(String[] args) {
        String S1 = " Tanvir,Ahmed,Ruman,009,0112320065,10,15,20";

        String[] parts = S1.split(",");
        for(String sc:parts){
            System.out.println(sc);
        }
    }
}
