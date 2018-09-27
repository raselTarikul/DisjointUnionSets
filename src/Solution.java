import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DisjointUnionSets {

    int[] rnak, parent;
    int n;

    // Constructor
    public DisjointUnionSets(int n){
        rnak = new int[n+1];
        parent = new int[n+1];
        this.n = n;
        makeSet();
    }

    // Creats n ste with single item in each
    void makeSet(){
        for(int i = 1; i <= n; i++ ){
            // Initially all elements are in there own sets
            parent[i] = i;
        }
    }

    // Return representativ of x set
    int find(int x){

        // Find representative of set that contains that x is the element of
        if(parent[x] != x) {
            // if x is not the parent of itself,
            // then x is not representative of
            // his set.
            parent[x] = find(parent[x]);

            // so we recursively call find on its parent
            // move i'th node directly under the
            // representative of its set.
        }
        return parent[x];

    }

    // Union the set that's include x and the set that includes y.
    void union(int x, int y){
        // Find the representative of tow sets.
        int xRoot = find(x);
        int yRoot = find(y);

        if(xRoot < yRoot) {
            parent[xRoot] = yRoot;
        } else if(rnak[yRoot] < rnak[xRoot]){
            parent[xRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rnak[xRoot] = rnak[xRoot] + 1;
        }

    }

}


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static int[] componentsInGraph(int[][] gb) {
        /*
         * Write your code here.
         */
        int n = 2 * gb.length;
        DisjointUnionSets dus = new DisjointUnionSets(n);

        for (int i =0; i < gb.length; i++){
          dus.union(gb[i][0], gb[i][1]);
        }

        HashMap<Integer,Integer> counter = new HashMap<Integer, Integer>();

        for(int i = 1; i <= n; i++ ){
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

        int[] result = new int[2];
        result[0] = minValueInMap;
        result[1] = maxValueInMap;
        return result;

    }

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] gb = new int[n][2];

        for (int gbRowItr = 0; gbRowItr < n; gbRowItr++) {
            String[] gbRowItems = scanner.nextLine().split(" ");

            for (int gbColumnItr = 0; gbColumnItr < 2; gbColumnItr++) {
                int gbItem = Integer.parseInt(gbRowItems[gbColumnItr].trim());
                gb[gbRowItr][gbColumnItr] = gbItem;
            }
        }

        int[] result = componentsInGraph(gb);
        System.out.println(result[0]+ " " +result[1]);

//

    }

}
