import java.util.TreeSet;

public class Main {

    public static final String STRING = "sabes sabes falar falar as lingua dos pes pes as pas ";
    public static void main(String[] args) {
        //System.out.println(substring[4]);
       UniqueWord word = new UniqueWord(STRING);
        for (String s:word) {
            System.out.println(s);
        }

    }
}
