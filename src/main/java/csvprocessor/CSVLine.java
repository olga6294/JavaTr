package csvprocessor;

import java.util.Objects;

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

        try {

            while (elementIndex < values.length) {
                if (values[elementIndex].equals(((CSVLine) object).values[elementIndex]))
                    return true;
                elementIndex++;
            }
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            return false; //jak dwie linie są różnej długości i nie mają ani jednego takiego samego pola to nie mogą być takie same
        }
        return false;
    }

    @Override
    public int hashCode(){
        return 832927;
    }
}
