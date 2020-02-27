package csvprocessor;

import java.util.HashSet;

public class CSVService<T> {

    private HashSet<T> hashSet;

    public CSVService(){
        hashSet = new HashSet<T>();
    }

    public void add(T element){
        hashSet.add(element);
    }

    public HashSet<T> getHashSet(){
        return hashSet;
    }
}
