class ArrayQueue{
    Object[] queue;
    int rear,front;

    ArrayQueue(int cap){
        queue=new Object[cap];
        rear=front=0;
    }

    public void enQueue(Object data){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
            
        else{
            queue[rear]=data;
            rear++;
        }
    }

    public Object deQueue(){
        if(isEmpty())
            return null;
        else{
            Object temp=queue[front];
            for(int i=front; i<rear; i++){
                queue[i]=queue[i+1];
            }
            rear--;
            return temp;
        }
    }

    public void displayQueue(){
        if(queue[front]!=null){
            System.out.print("\n[ ");
        }
        for(int i=front; i<=rear-1; i++){
            if(i==rear-1){
                System.out.print(queue[rear-1]+" ]\n");
                break;
            }
            System.out.print(queue[i]+", ");
        }
    }

    boolean isFull(){
        if(queue.length==rear){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty(){
        if(rear==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        ArrayQueue q=new ArrayQueue(20);

        q.enQueue("Task 1");
        q.enQueue("Task 2");
        q.enQueue("Task 3");
        q.enQueue("Task 4");
        q.displayQueue();
        q.deQueue();
        q.deQueue();
        q.displayQueue();
    }
}
