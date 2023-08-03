package solid.live.dip;

import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    // public EncodingModule() {
    // }

    public void encodeAndWrite(String filePath, Reader reader, Writer writer) {
        String data = reader.read(filePath);
        String encodedLine = Base64.encodeBytes(data.getBytes());
        writer.write(encodedLine, filePath);
    }

    // public void encodeWithFiles(BufferedReader fileReader, BufferedWriter
    // fileWriter) {
    // try {
    // String aLine;
    // while ((aLine = fileReader.readLine()) != null) {
    // String encodedLine = Base64.encodeBytes(aLine.getBytes());
    // fileWriter.write(encodedLine);
    // }
    // fileWriter.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    // public void encodeBasedOnNetworkAndDatabase() {
    // URL url = null;
    // try {
    // url = new URL("http", "myfirstappwith.appspot.com", "index.html");
    // } catch (MalformedURLException e) {
    // e.printStackTrace();
    // }
    // InputStream in = null;
    // try {
    // in = url.openStream();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // InputStreamReader reader = new InputStreamReader(in);
    // StringBuilder inputString1 = new StringBuilder();
    // try {
    // int c;
    // c = reader.read();
    // while (c != -1) {
    // inputString1.append((char) c);
    // c = reader.read();
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // String inputString = inputString1.toString();
    // String encodedString = Base64.encodeBytes(inputString.getBytes());
    // MyDatabase database = new MyDatabase();
    // database.write(encodedString);
    // }
}
