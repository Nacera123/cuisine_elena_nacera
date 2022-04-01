package LaVraieRecette;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CSVReader_Ustensil {
    public static Map<String, String[]> reader() {
        String path1 = "src/csvFiles/Ustensil.csv";
        String line = "";
        Map<String, String[]> ustensil = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path1));
            while((line = br.readLine()) !=null){

                // store value
                String [] values = line.split(",");
                ustensil.put(values[0], Arrays.copyOfRange(values,1 , values.length));

            }
            /* for (Map.Entry<String, String[]> el: ustensil.entrySet()){
                    System.out.println(el.getKey() );
                    for ( String x: el.getValue()){
                         System.out.println(x);
              }

            } */
            ustensil.get("Tiramisu");
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        return ustensil;
    }
}



