class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
         int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
          for(int[] edge:prerequisites){
        adj.get(edge[0]).add(edge[1]);
    }
    for(int i=0;i<numCourses;i++){
        for(int n: adj.get(i)){
            inDegree[n]++;
        }
    }
           Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int visited = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited++;
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }

        return visited == numCourses;
    }
}