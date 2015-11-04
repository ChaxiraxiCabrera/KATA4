
package ejercicio4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;




public class Ejercicio4 {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Ejercicio4\\DATA\\emails.txt";
       ArrayList<String> listMail = MailList.read(name);
       Histogram<String> histogram = MailHistogramBuilder.build(listMail);
       HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
       histogramDisplay.execute();
    }
    
    
}
