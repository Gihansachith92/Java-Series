package Read_Files___FileReader_Class;

import java.io.FileReader;

public class ReadFile2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\Java Tutorial\\src\\Read_Files___FileReader_Class\\file2.txt");

            int i;
            while ((i = reader.read()) != -1){
                System.out.print((char) i);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
