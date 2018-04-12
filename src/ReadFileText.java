import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.io.*;

public class ReadFileText {
    public void readFileText(String filePath) throws Exception {
        BufferedReader br = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }finally {
            br.close();
        }
    }

    public static void main(String[] args) {
        ReadFileText read = new ReadFileText();
        try {
            read.readFileText("text.txt");
        } catch (Exception e) {

        }
    }
}
