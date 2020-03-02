package csvprocessor;

import csvio.CSVListDivider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter<T> {

    public <T> void write(List<T> list) throws IOException{

        CSVListDivider<T> csvListDivider = new CSVListDivider<>();

        int index = 0;
        while(csvListDivider.getSubset(list, index) != null){
            File file = new File("src/output/file"+index+".txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for(T value: csvListDivider.getSubset(list, index))
                fileWriter.write(value.toString()+"\n");
            fileWriter.close();
            index++;
        }
    }
}