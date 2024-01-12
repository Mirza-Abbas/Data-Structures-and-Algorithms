import java.util.Scanner;


class ContactAppHashTable{

    static private class Node{ 
        Object key;
        Object value;
        Node next;
    }

    Node[] table;
    int size;  
    Scanner s=new Scanner(System.in);

    public ContactAppHashTable() {
        table = new Node[100];
    }
 
     public ContactAppHashTable(int Size) {
        table = new Node[Size];
    }

    int menu(){
        System.out.println("\n\t\tWelcome to Contact App");
        System.out.println("\nOperations: ");
        System.out.println("1. Display all contacts");
        System.out.println("2. Search a contact");
        System.out.println("3. Add a new contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Choice=s.nextInt();
        return Choice;
    }

    void Display(){
        System.out.println();
        if(size==0){
            System.out.println("Empty");
            return;
        }
        int n=1;
        for (int i = 0; i < table.length; i++) {
            Node temp = table[i];
            while (temp != null) {
                System.out.println(n + ". " + temp.key + ", " + temp.value);
                temp = temp.next;
                n++;
            }
        }
    } 

    boolean Search(Object key) {

        int index = hash(key);  
        Node temp = table[index]; 

        while (temp != null) {

            if (temp.key.equals(key)){
                System.out.println("Found");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
        return false;
    }  

    public void Add(Object key, Object value) {

        int index = hash(key);
        Node temp = table[index];

        while (temp != null){
           if (temp.key.equals(key))
              break;
           temp = temp.next;
        }

        if (temp != null) {
           temp.value = value;
        }
        else {

           if (size >= 0.75*table.length) {
              resize();
           }

           Node newNode = new Node();
           newNode.key = key;
           newNode.value = value;
           newNode.next = table[index];
           table[index] = newNode;
           size++;
        }
    }

    public void Delete(Object key) {  

        if(Search(key)){
            int index = hash(key);  
            if (table[index].key.equals(key)) {
               table[index] = table[index].next;
               size--; 
               return;
            }
        }
    }

    void Update(Object key, Object newkey){

        if(Search(key)){
            int index = hash(key); 
            Node temp = table[index]; 
            if (temp.key.equals(key)){
                table[index]=null;
                --size;
                Add(newkey,temp.value);
                return;
            } 
            while (temp.next != null) {
                if (temp.next.key.equals(key)){
                    Add(newkey,temp.value);
                    temp.next=temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public int size() {
        return size;
    }
 
    private int hash(Object key) {
        return (Math.abs(key.hashCode())) % table.length;
    }
 
    private void resize() {
        Node[] newtable = new Node[table.length*2];
        for (int i = 0; i < table.length; i++) {
            Node list = table[i]; 
            while (list != null) {
                Node next = list.next;  
                int hash = (Math.abs(list.key.hashCode())) % newtable.length;
                list.next = newtable[hash];
                newtable[hash] = list;
                list = next;  
            }
        }
        table = newtable;
    }
}

class Task1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        ContactAppHashTable c=new ContactAppHashTable(100);
        int Choice=0;
        do{
            Choice=c.menu();
            switch(Choice){
                case 1: c.Display(); break;
                case 2: {
                    System.out.println("Enter Name to Search: ");
                    Object key = s.nextLine();
                    c.Search(key); break;
                }
                case 3: {
                    System.out.println("Enter Name: ");
                    Object key = s.nextLine();
                    System.out.println("Enter Contact Number: ");
                    Object value = s.nextLine();
                    c.Add(key, value); 
                    break;
                }
                case 4: {
                    System.out.println("Enter Name to Update: ");
                    Object key = s.nextLine();
                    System.out.println("Enter New Name to Search: ");
                    Object newkey = s.nextLine();
                    c.Update(key, newkey); 
                    break;
                }
                case 5: {
                    System.out.println("Enter Name to Delete: ");
                    Object key = s.nextLine();
                    c.Delete(key); 
                    break;
                }
                case 0: Choice=0; break;
                default: System.out.println("\nInvalid Choice");
            }
            if(Choice==0){
                break;
            }
            System.out.print("\nPress any no. to continue \n      or 0 to exit \n\nChoice: ");
            Choice=s.nextInt();
            s.nextLine();
        }while(Choice!=0);
    }
}