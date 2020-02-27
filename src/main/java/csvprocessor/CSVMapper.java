package csvprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVMapper{

    public List<CSVLine> cvsMap(List<String> lines){
        List<CSVLine> csvLines = new ArrayList<>();
        for(String line : lines){
            csvLines.add(new CSVLine(line));
        }
        return csvLines;
    }
}
