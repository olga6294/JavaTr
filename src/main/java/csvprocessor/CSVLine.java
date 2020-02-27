package csvprocessor;

public class CSVLine{

    private final String[] values;

    public CSVLine(String line){
        values = line.split(",");
    }

    public String[] getValues(){
        return values;
    }

    @Override
    public boolean equals(Object object){
        if(this == object)
            return true;
        if(object == null || getClass() !=  object.getClass())
            return false;

        int elementIndex = 0;

        while(elementIndex<values.length){
            if(values[elementIndex] == ((CSVLine) object).values[elementIndex]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(){
        return -1;
    }
}
