
package ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;


public class Ejercicio4 {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String name = "C:\\Users\\usuario\\Documents";
        File file = new File (name);
        
        String [] filesarray = file.list();
        
        //for (Object files : filesarray) {
         //   System.out.println(files);
        //}
        
       // print (file.listFiles(), "");
        
        String from = "C:\\Users\\usuario\\Desktop\\Chrysanthemum.jpg";
        String to = "C:\\Users\\usuario\\Desktop\\Chrysanthemum(1).jpg";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File (from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File (to)));
        Date date = new Date();
        while(true){
            int read = input.read();
            if (read < 0) break;
            output.write(read);
        }
        System.out.println(new Date().getTime()-date.getTime()+" msg");
        input.close();
        output.flush();
        output.close();
        
    }
    
    private static void print(File[] listFiles, String ident){
        if (listFiles == null) return;
        for (File listFile : listFiles) {
            System.out.println(ident+(listFile.isDirectory()? "+": "  ")+listFile.getName());
            if (listFile.isFile() || listFile.isHidden()) continue;
            print (listFile.listFiles(), ident + " ");
        }
    }
}
