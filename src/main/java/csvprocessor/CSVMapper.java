package csvprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVMapper<T> {

    public <T> List<T> cvsMap(List<T> values){

        List<T> csvLines =  new ArrayList<T>();

        for(T value: values){
            csvLines.add(new CSVLine(value));
        }

        return csvLines;
    }
}
