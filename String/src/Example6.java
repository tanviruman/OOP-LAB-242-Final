public class Example6 {
    public static void main(String[] args) {
        String S1 = "Tanvir";
        String S2 = "Tanvir";
        String S3 = "Ahmed";
        System.out.println(S1.compareTo(S2));
        System.out.println(S1.compareTo(S3));
        System.out.println(S3.compareTo(S1));
        String s1="Sachin";
        String s2="Sachin";
        String s3="Tanvir";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
