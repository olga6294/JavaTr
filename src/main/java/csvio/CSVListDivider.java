package csvio;

import java.util.List;

public class CSVListDivider<T> {
    public List<T> getSubset(List<T> sublist, int index){
        int chunk = 10;
        int start = index*chunk;
        int end = Math.min(sublist.size(), start+chunk);

        if(start>end)
            return null;

        return sublist.subList(start, end);
    }
}
