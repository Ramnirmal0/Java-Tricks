/*
 Double Ended Queue
      ______________________________________
front ___|___|____|____|___|___|____|____|__ rear
dequeue                                     enqueue

dequeue  inbuilt operations

Deque<Character> dq = new LinkedList<Character>();

insertion 

dq.add()
dq.addFirst()
dq.addLast()

deletion

dq.remove()
dq.removeFirst()
dq.removeLast()

traversal

dq.peek()
dq.peekFirst()
dq.peekLast()

dq.isEmpty()

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                    Scanner sc =new Scanner(System.in);
					int n = sc.nextInt();
					Deque<Character> dq = new LinkedList<Character>();
					
					
					
					for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
						
						dq.addFirst(alphabet);
						alphabet++;
						dq.addLast(alphabet);
					}
					System.out.print(dq);         // [ ....., c, a, b, d, ............ ]
	}
}
