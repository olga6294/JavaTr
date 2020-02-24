package csvprocessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVLine{

    private List<String> line = new ArrayList<String>();

    @Override
    public boolean equals(Object object){
        if(this.hashCode()==object.hashCode())
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return -1;
    }

    public void add(String line){
        String[] values = line.split(",");
        for(String value : values){
            this.line.add(value);
        }
    }
}
