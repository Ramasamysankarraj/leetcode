class Solution {
    public int[] findOrder(int V, int[][] edges) {
    List<List<Integer>> adj = new ArrayList<>();
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
    for(int[] edge:edges){
        adj.get(edge[1]).add(edge[0]);
    }
    int[] indegree = new int[V];
    for(int i=0;i<V;i++){
        for(int n: adj.get(i)){
            indegree[n]++;
        }
    }
    Queue<Integer> q = new LinkedList<>();
    for(int i=0;i<V;i++){
        if(indegree[i]==0){
            q.add(i);
        }
    }
    int[] res =  new int[V];
    int index=0;
    while(!q.isEmpty()){
        int vertex = q.poll();
        res[index++] = vertex;
        for(int nei:adj.get(vertex)){
            indegree[nei]--;
            if(indegree[nei]==0){
                q.add(nei);
            }
        }
    }
    if(index != V) return new int[0];
    return res;
    }
}

