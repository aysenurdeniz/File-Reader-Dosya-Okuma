/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author aysenurdeniz
 */
public class FileReaderMethod extends TimerTask {
    
    FileInfo fileInfo = new FileInfo();

    @Override
    public void run() {
        ArrayList list = new ArrayList<>();
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileInfo.getFilePath()));
            while(true){
                String lines = bufferedReader.readLine();
                if(lines == null){
                    break;
                }
                list.add(lines);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(list);
    
    } 
    
}
