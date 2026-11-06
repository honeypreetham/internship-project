import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        System.out.println("--- Task 4: File Handling Demonstration ---");
        
        String fileName = "students.txt";

        // Writing to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Student ID: 201\n");
            writer.write("Student Name: Alice Smith\n");
            writer.write("Course: Advanced Java\n");
            writer.write("Marks: 95\n");
            writer.write("-------------------------\n");
            writer.close();
            System.out.println("Successfully wrote student information to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println("\nReading contents from " + fileName + ":\n");

        // Reading from the file
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}