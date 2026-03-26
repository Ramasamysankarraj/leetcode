class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j)
                {
                    continue;
                }
                long dx = bombs[i][0] - bombs[j][0];
                long dy = bombs[i][1] - bombs[j][1];
                long r = bombs[i][2];
                if(dx*dx + dy*dy <= r*r){
                    adj.get(i).add(j);
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            boolean[] vis = new boolean[n];
            int count = dfs(adj , vis ,i);
            max = Math.max(max,count);
        }
        return max;
    }
    int dfs(List<List<Integer>> adj,boolean[] vis,int node){
        vis[node] = true;
        int count = 1;
        for(int nei : adj.get(node)){
            if(!vis[nei]){
                count += dfs(adj,vis,nei);
            }
        }
        return count;
    }
}