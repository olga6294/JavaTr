package csvfile;

import csvprocessor.Book;

import java.util.List;

public class FileDivider {

    public static List getSubset(int index, int chunk, List<Book> subSet){

        int start = index*chunk;
        int end = Math.min(subSet.size(), start+chunk);

        if(start>end)
            return null;

        return subSet.subList(start, end);
    }
}
