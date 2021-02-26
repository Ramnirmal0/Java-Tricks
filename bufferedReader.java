class Main {
	public static void main (String[] args) throws IOException{
                      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");      // 6 2
		String[] input = br.readLine().split(" ");   // 1 2 3 4 5 6


		int n = Integer.parseInt(str[0]);  // 6
		int k = Integer.parseInt(str[1]);  // 2

		
      	int [] arr = new int [n];
		
      	for(int i=0; i<n; i++) 
		{
         arr[i] = Integer.parseInt(input[i]);  // 1 2 3 4 5 6
        }
	  
	  
	}
}

		
