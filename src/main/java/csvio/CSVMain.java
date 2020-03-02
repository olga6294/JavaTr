package csvio;

import csvprocessor.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CSVMain {

    public static void main(String[] args){

        try {
            List<String> lines = CSVReader.read("src/resources/TestFile.csv");
            List<CSVLine> csvLines = CSVReader.read(lines, new CSVMapper());

            CSVService<CSVLine> csvServiceLine = new CSVService<>();

            for(CSVLine line : csvLines){
                //for(int i=0; i<line.getValues().length; i++)
                    //System.out.print(line.getValues()[i]+" ");
                //System.out.println();
                csvServiceLine.add(line);
            }
            //System.out.println(csvServiceLine.getHashSet().size());

            List<String> csvServiceLines = new ArrayList<>();

            for(CSVLine csvHashSetElement : csvServiceLine.getHashSet()){
                csvServiceLines.add(Arrays.toString(csvHashSetElement.getValues()));
            }

            CSVWriter<CSVLine> csvLineCSVWriter = new CSVWriter<>();

            csvLineCSVWriter.write(csvServiceLines);

        }catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
