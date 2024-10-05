public class P_Container {
    public static void main(String[] args) {

        String S1 ="Abdcbbfjgvhegfkjbnabsyfwf";
        String S2 = "bna";
        boolean b = S1.contains(S2);
        System.out.println(b);

        String S3 =S1.substring(3);
        System.out.println(S3);
        String S4 = S1.substring(3,8);
        System.out.println(S4);

        System.out.println(S1.substring(3,8));
        char[] s = S1.toCharArray();
        System.out.println(s);
    }
}
