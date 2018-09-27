//public class DisjointUnionSets {
//
//    int[] rnak, parent;
//    int n;
//
//    // Constructor
//    public DisjointUnionSets(int n){
//        rnak = new int[n+1];
//        parent = new int[n+1];
//        this.n = n;
//        makeSet();
//    }
//
//    // Creats n ste with single item in each
//    void makeSet(){
//        for(int i = 1; i <= n; i++ ){
//            // Initially all elements are in there own sets
//            parent[i] = i;
//        }
//    }
//
//    // Return representativ of x set
//    int find(int x){
//
//        // Find representative of set that contains that x is the element of
//        if(parent[x] != x) {
//            // if x is not the parent of itself,
//            // then x is not representative of
//            // his set.
//            parent[x] = find(parent[x]);
//
//            // so we recursively call find on its parent
//            // move i'th node directly under the
//            // representative of its set.
//        }
//        return parent[x];
//
//    }
//
//    // Union the set that's include x and the set that includes y.
//    void union(int x, int y){
//        // Find the representative of tow sets.
//        int xRoot = find(x);
//        int yRoot = find(y);
//
//        if(xRoot < yRoot) {
//            parent[xRoot] = yRoot;
//        } else if(rnak[yRoot] < rnak[xRoot]){
//            parent[xRoot] = xRoot;
//        } else {
//            parent[yRoot] = xRoot;
//            rnak[xRoot] = rnak[xRoot] + 1;
//        }
//
//    }
//
//}
//public class DisjointUnionSets {
//
//    int[] rnak, parent;
//    int n;
//
//    // Constructor
//    public DisjointUnionSets(int n){
//        rnak = new int[n+1];
//        parent = new int[n+1];
//        this.n = n;
//        makeSet();
//    }
//
//    // Creats n ste with single item in each
//    void makeSet(){
//        for(int i = 1; i <= n; i++ ){
//            // Initially all elements are in there own sets
//            parent[i] = i;
//        }
//    }
//
//    // Return representativ of x set
//    int find(int x){
//
//        // Find representative of set that contains that x is the element of
//        if(parent[x] != x) {
//            // if x is not the parent of itself,
//            // then x is not representative of
//            // his set.
//            parent[x] = find(parent[x]);
//
//            // so we recursively call find on its parent
//            // move i'th node directly under the
//            // representative of its set.
//        }
//        return parent[x];
//
//    }
//
//    // Union the set that's include x and the set that includes y.
//    void union(int x, int y){
//        // Find the representative of tow sets.
//        int xRoot = find(x);
//        int yRoot = find(y);
//
//        if(xRoot < yRoot) {
//            parent[xRoot] = yRoot;
//        } else if(rnak[yRoot] < rnak[xRoot]){
//            parent[xRoot] = xRoot;
//        } else {
//            parent[yRoot] = xRoot;
//            rnak[xRoot] = rnak[xRoot] + 1;
//        }
//
//    }
//
//}
