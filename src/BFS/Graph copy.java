import java.util.*; 

class Graph{

   int v;
   LinkedList<Integer> adj[];
   
   Graph(int v){
     
     this.v = v;
     adj = new LinkedList[v];
     
     for(int i=0; i<v; i++){
        adj[i] = new LinkedList<Integer>();
     }
   }
   
   void addEdge(int v, int w){
      adj[v].add(w);  
   }
   
   
   void DFS(int s){
       
       Vector<Boolean> visited = new Vector<Boolean>(v);
       for(int j=0; j<v; j++){
           visited.add(false);    
       }
       
       Stack<Integer> stack = new Stack<Integer>();
       stack.push(s);
       
       while(stack.empty()== false){
          
          s = stack.peek();
          stack.pop();
          
          //if s has not visited
          if(visited.get(s)==false){
              System.out.println(s+"   ");
              visited.set(s,true);    
          }
          
          Iterator<Integer> itr = adj[s].iterator();
          
          while(itr.hasNext()){
             int v = itr.next();
             
             //if v has not visited
             if(visited.get(v)==false){
                stack.push(v);
             }
          }
       }
   }
   
   void BFS(int s){
      
      boolean[] visited = new boolean[v]; //deafult  makes not visited 
      
      LinkedList<Integer> q = new LinkedList<Integer>();
     
      q.add(s);
      
      
      while(q.size()>0){
      
         
         
         s = q.poll();
         
         //make s visited
         visited[s]=true;
         System.out.println(s+"");
         
         Iterator<Integer> itr = adj[s].iterator();
         while(itr.hasNext()){
            
            int n = itr.next(); 
            
            //if n is not visited 
            if(!visited[n]){
               q.add(n);
               
               //make n visited
               visited[n] = true;
            }      
         }
      } 
    
   }
   
   public static void main(String[] args){
      
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
   }
}