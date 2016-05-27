package nekio.library.common.json;

/**
 *
 * @author Nekio
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// </editor-fold>

public class JsonConverter {
    // <editor-fold defaultstate="collapsed" desc="Global Methods">
    public static String fileToText(String path) throws Exception{
        StringBuilder text = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String currentLine = null;

        while ((currentLine = br.readLine()) != null) {
            text.append(currentLine);
        }

        return text.toString();
    }
    // </editor-fold>
}
