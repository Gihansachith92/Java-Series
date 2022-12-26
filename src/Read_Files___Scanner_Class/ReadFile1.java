package Read_Files___Scanner_Class;

import java.io.File;
import java.util.Scanner;

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Java Tutorial\\src\\Read_Files___Scanner_Class\\file.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
