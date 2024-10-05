import java.util.Scanner;

public class p_Class {

    String name;
    int id;

    float cgpa;

    public p_Class(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println("Name"+name);
        System.out.println("ID: " + id);
        System.out.println("cgpa: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split(",");
        p_Class   st = new p_Class (parts[0],Integer.parseInt(parts[1]),Float.parseFloat(parts[2]));
        st.display();
    }
}
