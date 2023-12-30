import java.util.Scanner;

class FireAir {     //FireAir Class
    String song;
    FireAir nextSong;
    Scanner s = new Scanner(System.in);
     
    public FireAir (String s){      //FireAir Constructor
        song=s;
    }

    int menu() {        
        System.out.println("\n\tWelcome to Fire Air Music Player");
        System.out.println("\nOperations: ");
        System.out.println("1. Display all songs");
        System.out.println("2. Search a song");
        System.out.println("3. Add new song");
        System.out.println("4. Update a song");
        System.out.println("5. Delete a song");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Ch = s.nextInt();
        return Ch;
    }
     
    void display() {    
        int i=1;
        for(FireAir temp=this;temp!=null;temp=temp.nextSong){
            System.out.println(i + ". " + temp.song);
            i++;
        }       
    } 

    public FireAir add(String song,int pos){        //Method to add element in linked list
        FireAir temp=this;
        FireAir temp1=this;
        FireAir data_node=new FireAir(song);

        if(pos==1){
            data_node.nextSong=temp;                
            return data_node;
        }
        else if(pos-1<=total() && pos>0){
            int counter=2; 
            for(temp=temp1;temp!=null;temp=temp.nextSong){
                if(counter<pos){
                    counter++;
                }
                else if(counter==pos){
                    break;
                }
            }
            data_node.nextSong=temp.nextSong; 
            temp.nextSong=data_node;
            temp=temp1;

            return temp;
        }
        System.out.println("position is invalid ");
        return temp;
    }

    int search(String songname) {       //Method to search element in Linked list

        FireAir tempMusic=this;
        FireAir tempMusic1=this;
        int counter=0;

        for(tempMusic=tempMusic1;tempMusic!=null;tempMusic=tempMusic.nextSong){
            counter++;
            if(tempMusic.song.equalsIgnoreCase(songname)){
                System.out.println("The song is present ");
                return counter;
            }
        }
        System.out.println("The song is not present");
        return -1;
    }

    FireAir delete(String songname) {       //Method to delete element in linked list
        FireAir tempMusic=this;
       
        if(tempMusic.song.equalsIgnoreCase(songname)){
            System.out.println("The song is deleted successfully");
            return tempMusic.nextSong;
        }
         
        for(FireAir temp=tempMusic.nextSong;temp!=null;temp=temp.nextSong){
            if(temp.song.equalsIgnoreCase(songname)){

                if(temp.nextSong==null){
                    tempMusic.nextSong=null;
                    System.out.println("The song is deleted successfully");
                    return this;
                }

                tempMusic.nextSong=temp.nextSong; 
                System.out.println("The song is deleted successfully");   
            }
          tempMusic=tempMusic.nextSong;
        }
        return this;  
    }

    void update(String songname,String newname) {       //Method to update an existing element in linked list
        FireAir tempMusic=this;
        FireAir tempMusic1=this;
        
        for(tempMusic=tempMusic1;tempMusic!=null;tempMusic=tempMusic.nextSong){
            if(tempMusic.song.equalsIgnoreCase(songname)){
                tempMusic.song=newname;
                System.out.println("The song is updated successfully");
                return;
            }
        }
        System.out.println("The song is not updated ");
    }

    int total() {       //returns total no of elements
        int total_songs=0;
        for(FireAir temp=this;temp!=null;temp=temp.nextSong){
            total_songs++;
        }
        return total_songs;
    }
}

class Task1 {       //Main class
    public static void main(String[] args) {        //Main method
        Scanner sc = new Scanner(System.in);
       
        String[] song = { "Blame", "Pakistan Zindabad", "Pasoori"};
               
        FireAir musicList=new FireAir(song[0]);
        FireAir temp=musicList;

        for(int i=1;i<song.length;i++){     //inserting in linked list
            temp.nextSong=new FireAir(song[i]);
            temp=temp.nextSong;
        }

        int c=0;

        do {
            c = musicList.menu();
            
            switch(c){
                case 1:{
                    musicList.display();
                    break;
                } 
                case 2:{
                    System.out.print("Enter song name to search : ");
                    sc.nextLine();
                    String n=sc.nextLine();
                    musicList.search(n);
                    break;
                }    
                case 3:{
                    System.out.print("Enter song name : ");
                    String m=sc.nextLine();
                    System.out.print("Enter position (Starting from 1) : ");
                    int pos=sc.nextInt();
                    musicList=musicList.add(m,pos);
                    break;
                }
                case 4:{
                    System.out.print("Enter song name to update : ");
                    sc.nextLine();
                    String mi=sc.nextLine();
                    System.out.print("Enter new name: ");
                    String  e=sc.nextLine();
                    musicList.update(mi,e);
                    break;
                }
                case 5:{
                    System.out.print("Enter song name to delete : ");
                    String so=sc.next();
                    musicList=musicList.delete(so);
                    break;
                }
                case 0:{
                    continue;                      
                }
                default:{
                    System.out.println("Incorrect Choice ");
                }

            }

            System.out.print("\nPress any key to continue"+ 
                             "\n      0 to exit \n\nChoice:");
            c = sc.nextInt();
        } while (c!=0);
    }

}