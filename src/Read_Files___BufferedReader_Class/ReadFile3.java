package Read_Files___BufferedReader_Class;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Java Tutorial\\src\\Read_Files___BufferedReader_Class\\file3.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
