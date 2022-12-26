package Write_Files____File_Writer_Class;

import java.io.FileWriter;

public class writeFile1 {
    public static void main(String[] args) {
        String txt1 = "hello";
        String txt2 = "\nwelcome";
        try {
            FileWriter writer = new FileWriter("file1.txt",true);
            writer.append(txt1);
            writer.append(txt2);
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
