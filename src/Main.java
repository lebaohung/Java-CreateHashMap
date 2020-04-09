import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        lhm.put("DJohn", 33);
        lhm.put("AThomas", 44);
        lhm.put("BNike", 32);
        lhm.put("CHung", 12);
        lhm.put("EThai", 15);

        System.out.println(lhm);
    }
}
