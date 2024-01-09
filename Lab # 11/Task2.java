class Node{
	Object data;
	Node next;

	Node(Object d){
		data=d;
	}
}

class LinkedQueue {
	Node front, rear;
	int size;

	public LinkedQueue(){ 
		front = rear = null; 
	}

	public void enQueue(Object data){
        Node newNode=new Node(data);

        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next = newNode;
			rear = rear.next;
        }
        size++;
    }

	public Object deQueue(){
        if(isEmpty())
            return null;
        else{
            Node tempNode=front;
            front=tempNode.next;
            tempNode.next=null;
            return tempNode.data;
        }
    }

	public void displayQueue(){
        Node temp=front;
		if(temp!=null){
        	System.out.print("\n[ ");
		}
        while(temp!=null){
			if(temp.next==null){
				System.out.print(temp.data + " ]\n");
				break;
			}
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }

	boolean isEmpty(){
		if(front==null){
			return true;
		}
		else{
			return false;
		}
	}
}


public class Task2 {
	public static void main(String[] args){
		LinkedQueue q = new LinkedQueue();
		q.displayQueue();
		q.enQueue("Task 1");
		q.enQueue("Task 2");
		q.enQueue("Task 3");
		q.enQueue("Task 4");
		q.enQueue("Task 5");
		q.displayQueue();
		q.deQueue();
		q.deQueue();
		q.displayQueue();
	}
}

