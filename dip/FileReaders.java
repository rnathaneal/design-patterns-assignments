package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders implements Reader {

    @Override
    public String read(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null)
                content.append(line);
            reader.close();

            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}