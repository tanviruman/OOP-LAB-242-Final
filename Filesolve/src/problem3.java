import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem3 {

    // Method to check if a string is a number
    public static boolean is_num(String a) {
        try {
            Double.parseDouble(a);  // Try parsing the string to a Double
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        // Ensure that the file paths are correct on your system
        try {
            // Input file
            File read = new File("C:\\Users\\User\\IdeaProjects\\OOP-LAB-242-Final\\Filesolve\\src\\input1.txt");
            // Output file
            File mywrite = new File("C:\\Users\\User\\IdeaProjects\\OOP-LAB-242-Final\\Filesolve\\src\\p2Output.txt");

            // Create a PrintWriter for writing to the output file
            PrintWriter newwrite = new PrintWriter(new FileWriter(mywrite, false));
            Scanner sc = new Scanner(read);  // Scanner to read from input file

            // Loop through each line of the input file
            while (sc.hasNextLine()) {
                String s = sc.nextLine();  // Read the current line

                // Split the line by any number of spaces
                String[] parts = s.split("\\s+");

                // Loop through each part of the line
                for (String part : parts) {
                    if (is_num(part)) {
                        newwrite.print(part + " ");  // Write numbers to the output file
                    }
                }
                newwrite.println();  // New line after each line from the input file
            }

            // Close the resources
            sc.close();
            newwrite.close();

        } catch (IOException e) {
            e.printStackTrace();  // Print the stack trace if an IOException occurs
        }

    }
}
