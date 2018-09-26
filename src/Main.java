import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        DisjointUnionSets dus = new DisjointUnionSets(n);

        // 0 is friend of 2
        dus.union(1, 6);

        // 4 is friend of 2
        dus.union(2, 7);

        // 3 is a friend of 1
        dus.union(3, 8);

        dus.union(4, 9);

        dus.union(2, 6);

        HashMap<Integer,Integer> counter = new HashMap<Integer, Integer>();
        for(int i = 0; i <= 9; i++ ){
            Integer root = dus.find(i);
            if(counter.containsKey(root)){
                Integer val = (Integer) counter.get(root);
                counter.replace(root, val + 1);
            } else {
                counter.put(root, 1);
            }
        }
        while (counter.values().remove(1));

        int maxValueInMap=(Collections.max(counter.values()));
        int minValueInMap=(Collections.min(counter.values()));

        System.out.println("Max node "+ maxValueInMap+ " And Min value is "+ minValueInMap);

    }

}
