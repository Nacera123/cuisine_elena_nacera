package LaVraieRecette;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CSVReader_Ingredients {

    public static Map<String, String[]> reader() {
        String path2 = "src/csvFiles/Ingredients.csv";
        String line = "";
        Map<String, String[]> ingredients = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path2));
            while((line = br.readLine()) !=null){

                // store value
                String [] values = line.split(",");
                ingredients.put(values[0], Arrays.copyOfRange(values,1 , values.length));

            }
            ingredients.get("Tiramisu");
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        return ingredients;
    }

}
