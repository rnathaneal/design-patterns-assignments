package solid.live.dip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
// public class EncodingModuleClient {
// public static void main(String[] args) throws IOException {
// EncodingModule encodingModule = new EncodingModule();
// encodingModule.encodeWithFiles();
// encodingModule.encodeBasedOnNetworkAndDatabase();
// }
// }

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        encodingModule.encodeAndWrite("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt",
                new FileReaders(), new FileWriters());
    }
}