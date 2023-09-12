import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String[] myInfo = {"Vishal Bramhankar", "Nagpur", "8978675678", "23"};
        String filePath = "D:"+File.separator+"Learning"+ File.separator +"pipe-delimited-text-file-in-Java"
                +File.separator+"my-info.txt";
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            String line = String.join("|", myInfo);
            System.out.println(line.toString());

            bufferedWriter.write(line);
            bufferedWriter.close();
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}