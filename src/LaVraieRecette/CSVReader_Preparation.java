package LaVraieRecette;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CSVReader_Preparation {
    public static Map<String, String[]> reader() {
        String path = "C:\\Users\\elena\\Documents\\POEI\\cuisine_elena_nacera\\cuisine_elena_nacera\\src\\csvFiles\\PreparationDescription.csv";
        String line = "";
        Map<String, String[]> preparations = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) !=null){

                // store value
                String [] values = line.split(";");
                preparations.put(values[0], Arrays.copyOfRange(values,1 , values.length));

            }
            /*  for (Map.Entry<String, String[]> el: preparations.entrySet()){
                    System.out.println(el.getKey() );
                    for ( String x: el.getValue()){
                         System.out.println(x);
              }

            } */
            preparations.get("Tiramisu");
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        return preparations;
    }

}
