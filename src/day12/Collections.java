package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Student1");
        list.add("Student2");
        list.add("Student3");
        list.add("Student4");
        list.add("Student5");
        list.remove("Student5");
        for (String s : list) {
            System.out.println(s);

        }



        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Student1", 1);
        map.put("Student2", 2);
        map.put("Student3", 3);
        map.put("Student4", 4);
        map.put("Student5", 5);
        map.remove("Student1");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
