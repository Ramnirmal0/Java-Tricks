class Main {
	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
			int n = scn.nextInt();
			int k = scn.nextInt();
      
			PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); //max heap
      PriorityQueue<Integer> min = new PriorityQueue<>(); //min  heap (default)
      
			for(int i=0; i<n; i++){
				int x = scn.nextInt();
				max.add(x);     
        min.add(x);
			}
    }
  }
}


max.poll()  // take the top value or topmost value  = 5
min.poll()  //  = 1
  
            max heap                       min heap 
            
               5                             1
           4       3                     2       3
       2       1                      4      5
