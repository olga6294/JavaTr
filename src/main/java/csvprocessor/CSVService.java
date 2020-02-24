package csvprocessor;

import java.util.HashSet;

public class CSVService {

    private HashSet<CSVLine> hashSet;

    public CSVService(){
        hashSet = new HashSet<CSVLine>();
    }

    public void add(CSVLine csvLine){
        hashSet.add(csvLine);
    }
}
