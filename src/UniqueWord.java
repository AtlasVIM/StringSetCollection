import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWord implements Iterable<String> {

TreeSet<String> set = new TreeSet();


    public UniqueWord(String s) {
        for (String str: s.split(" ")) {
            set.add(str);
        }


    }

    @Override
    public Iterator<String> iterator() {
        return set.iterator();
    }


}
