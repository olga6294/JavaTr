package csvio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter<T> {

    public <T> void write(List<T> list) throws IOException{

        int index = 0;
        while(getSubset(list, index) != null){
            File file = new File("src/output/file"+index+".txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for(Object value: getSubset(list, index))
                fileWriter.write(value.toString()+"\n");
            fileWriter.close();
            index++;
        }

    }

    private List<T> getSubset(List<T> sublist, int index){
        int chunk = 10;
        int start = index*chunk;
        int end = Math.min(sublist.size(), start+chunk);

        if(start>end)
            return null;

        return list.subList(start, end);
    }
}