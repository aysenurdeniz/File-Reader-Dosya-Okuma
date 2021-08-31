package filereader;

import java.util.Timer;

/**
 *
 * @author aysenurdeniz
 */
public class FileReader {

    public static void main(String[] args) {
       
        Timer timer= new Timer();
        FileReaderMethod method= new FileReaderMethod();
        
        timer.schedule(method, 0, 1000);
        
    }
    
}
