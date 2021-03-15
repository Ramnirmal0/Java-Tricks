import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
             Scanner sc = new Scanner(System.in);
					   int n = sc.nextInt();
					   int k = sc.nextInt();
             // insert into array
					   int [] a = new int[n];
					   for(int i =0; i<n ; i++)
					   		a[i]=sc.nextInt();
             // add to maxheap
					   PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
					   for(int i=0;i<n;i++)
					   		maxHeap.add(a[i]);
            //sort in array
					    int index=0;
						Iterator<Integer> itr = maxHeap.iterator();
						while(itr.hasNext()){
							a[index++]= maxHeap.peek();
							maxHeap.poll();
						}
            // display array
						for(int i =0; i<n ; i++)
					   		System.out.print(a[i]+ " ");
						
	}
}
