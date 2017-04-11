
package example;

import org.apache.commons.lang.WordUtils;
import com.opencsv.CSVReader;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Hello {
    public static void main(String[] args) {
    	int monmax = 0 ;

    	try {
    		CSVReader reader = new CSVReader(new FileReader("data.csv")) ;
    		try{
    			List<String[]> myEntries = reader.readAll() ;
    		for(String[] line: myEntries){
    			for (String val : line){
    				if (Integer.parseInt(val) > monmax)
    					monmax = Integer.parseInt(val);
    			}
    		}}
    		catch (IOException e){
    			System.out.println("Erreur all");
    		}
    	}
    	catch (FileNotFoundException e){
    		System.out.println("Erreur");
    	}
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        System.out.println("Nombre max : " + monmax) ;
    }
}