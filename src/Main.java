public class Main {

    public static void main(String[] args) {
        int n = 5;
        DisjointUnionSets dus = new DisjointUnionSets(n);

        // 0 is friend of 2
        dus.union(0, 2);

        // 4 is friend of 2
        dus.union(4, 2);

        // 3 is a friend of 1
        dus.union(3, 1);

        // Check if 1 is friend of 0
        if(dus.find(0) == dus.find(4)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
