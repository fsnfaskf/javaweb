import java.io.*;
import java.io.IOException;

public class file1 {
    String fileName;

    public String getInputStream(String fileName) throws IOException {

        this.fileName = fileName;
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        BufferedReader br = new BufferedReader(isr);
        if ((br.readLine()) != null) {
            return br.readLine();
        }


        return fileName;
    }
}
