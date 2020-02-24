package csvprocessor;

import java.util.*;

public class CSVLine{

    private List<String> csvLine = new ArrayList<String>();

    public CSVLine(String line){
        String[] values = line.split(",");
        List<String> csvLine = new ArrayList<String>();
        for(String value: values){
            csvLine.add(value);
        }
    }

    public boolean equals(CSVLine line){
        int index = 0;
        while(index<csvLine.size()){
            if(csvLine.get(index)!=csvLine.get(index))
                continue;
            return true;
        }
        return false;
    }
}
