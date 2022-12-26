package Write_Files___BufferedWriter_Class;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class writeFile2 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
            writer.write("hello");
            writer.newLine();
            writer.write("welcome");
            writer.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
