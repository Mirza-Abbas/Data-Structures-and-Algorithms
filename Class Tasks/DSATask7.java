import DSATask7.Node;

class Node1{     //Node1 Class

    Node1(String s){     //Node1 Constructor
        Word=s;
    }

    String Word;
    Node1 next;
}       //Node1 Class ends

class Node2{        //Node2 Class

    Node2(String s){        //Node2 Constructor
        Word=s;
    }
    String Word;
    int value=0;
    Node2 next;
}       //Node2 Class ends

class DSATask7 {        //Main Class

    static Node1 Replace(Node1 head, String Old, String New){       //Method to replace word in Node1
        Node1 n;

        for(n=head; n!=null; n=n.next){
            if(n.Word.equalsIgnoreCase(Old)){
                n.Word=New;
            }
            else if(n.next==null){
                System.out.println("Word Not Found");
            }
        }

        return head;
    }

    public static void main(String[] args) {        //Main Method
        
        String str = "I love my University. I have been studying in this university since the last 12 months and I have made many friends, both male and female. The university is providing me a lot of new opportunities to make myself learned and educated in the best way. In future, I will make my university shine on every platform.";
        //String str="a b b c c c d d d d a a";

        String[] a=str.split(" ");  //Splits String into separate words

        Node1 head;
        Node1 p;
        Node2 head2;
        Node2 p2;
        

        for(int i=0;i<a.length;i++){

            if(a[i].charAt(a[i].length()-1)=='.' || a[i].charAt(a[i].length()-1)==','){
                a[i]=a[i].replace(a[i].charAt(a[i].length()-1), ' ');       //Replaces . & , with a space
            }
            a[i] = a[i].replaceAll("\\s","");   //removes all spaces
        
        }

        head=new Node1(a[0]);
        p=head;

        for(int i=1;i<a.length;i++){
            p.next=new Node1(a[i]);     //Stores Words in Node1
            p=p.next;
            
        }

        //head=DSATask8.Replace(head, "School", "MUET");

        //for (Node1 n = head; n!=null; n=n.next){
        //    System.out.print(n.Word+" ");     //Displays All Node1 Words
        //}

        head2=new Node2(head.Word);
        
        for (Node1 n = head; n!=null; n=n.next){            //Stores Words in Node2
            for (Node2 m = head2; m!=null; m=m.next){

                if(m.Word!=null && n.Word.equalsIgnoreCase(m.Word)){        //if Word already exists than increments its value
                    m.value++;
                    break;
                }

                else if(m.next==null){      //else stores the word in a new Node2 object
                    m.next=new Node2(n.Word);
                    m.next.value++;
                    break;
                }
            }
        }

        for (Node2 n = head2; n!=null; n=n.next){       //Display All Node2 Words with values
            System.out.println("\"" + n.Word + "\"" +" Repeated " + n.value + " times\n");
        }

        
        //for (Node2 n = head2; n!=null; n=n.next){       //Displays a Specific Word with value
        //    if(n.Word.equalsIgnoreCase("University")){
        //        System.out.println(n.Word+" Repeated " + n.value + " times");
        //    }
        //}
    }
}
