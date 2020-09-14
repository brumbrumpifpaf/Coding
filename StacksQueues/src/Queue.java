class Queueue {
	Stacky s1 = new Stacky();  
    Stacky s2 = new Stacky();
	Node head; //remove here
	Node tail; //add here
	
	public boolean isEmpty() {
		return head == null;
	}
	public int peek() {
		return head.data;
	}
	public void add(int data) {
		Node new_node = new Node(data);
		if (tail != null) {
			tail.next = new_node;
		}
		tail = new_node;
		if (head == null) {
			head = new_node;
		}
	}
	public int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}
	public void enQueue(int x) {    
        while (!s1.isEmpty()) {  
            s2.push(s1.pop()); 
        }  
        s1.push(x);    
        while (!s2.isEmpty()) {  
            s1.push(s2.pop());
        }
	}
	public int deQueue() {
        if (s1.isEmpty()) {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }
        int x = s1.peek();  
        s1.pop();  
        return x;  
    }  
}
public class Queue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueue q = new Queueue();
		q.enQueue(1);
		q.enQueue(3);
		q.enQueue(5);
		System.out.println(q.deQueue());
		q.enQueue(66);
		q.enQueue(3);
		System.out.println(q.deQueue());

	}
}

