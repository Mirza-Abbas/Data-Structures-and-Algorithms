import java.util.ArrayList;

class stack<T> {        //Stack Class	

	ArrayList<T> A;
    T[] arr;
	int top = -1;
	int size;

	stack(int size){        //Stack Constructor
		this.size = size;
		this.A = new ArrayList<T>(size);
        arr = (T[])new Object[size];
	}

	void push(T d){     //Push Method
		if (top + 1 == size) {
			System.out.println("Overflow");
		}
		else {
			++top;
			arr[top]=d;
		}
	}

	T peek(){       //Peek Method
		if (top < 0) {
			System.out.println("Underflow");
            return null;
		}
		else{
			return arr[top];
        }
    }

	T pop(){        //Pop Method
        T d;
        if (top == -1) {
			System.out.println("Underflow");
		}
		else{
            d=arr[top];
            top--;
            return d;
        }
        return null;
	}

	boolean empty(){        //epty Method
        return (top==-1); 
    }

	int getsize(){
		return (top+1);
	}

	int search(T d){
		int index=0;
		for(int i=0;i<=top;i++){
			if(arr[i].equals(d)){
				index=i;
				break;
			}
			else{
				index=-1;
			}
		}
		return index;
	}

	void display(){
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}
	}
}

public class Task1 {        //Main Class
	public static void main(String[] args){

		stack<String> s1 = new stack<>(10);
		s1.push("Hello");
		s1.push("World1");
		s1.push("World2");
		s1.push("World3");
		s1.push("World4");
		s1.push("World5");
		s1.push("World6");
		s1.push("World7");
		s1.push("World8");
		s1.push("World9");

		System.out.println("\nStack Empty: " + s1.empty());
		System.out.println("\nStack Size: " + s1.getsize());
		System.out.println("\nElement present at Index: " + s1.search("World2"));
		System.out.println("\nElement at top: " + s1.peek());
		s1.pop();
        System.out.println("\nElement at top: " + s1.peek() + "\n");
		s1.display();
		System.out.println("\n");
	}
}
