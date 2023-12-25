import java.util.Scanner;

class App{
    String[] songs;
    Scanner s=new Scanner(System.in);

    App(String[] s){
        songs=new String[s.length];
        for(int i=0;i<s.length;i++){
            songs[i]=s[i];
        }
    }

    int menu(){
        System.out.println("\nOperations: ");
        System.out.println("1. Display all Songs");
        System.out.println("2. Add a new songs");
        System.out.println("3. Delete a songs");
        System.out.println("4. Search a songs");
        System.out.println("5. Update a songs");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Choice=s.nextInt();

        return Choice;
    }

    void Display(){
        for(int i=0;i<songs.length;i++){
            System.out.print("\n"+(i+1) + ". " + songs[i]);
        }
        System.out.println("\n");
    }

    void Add(){
        System.out.println("\nEnter New Song Name: ");
        String newsong=s.next();

        String[] temp=new String[songs.length+1];

        for(int i=0;i<=songs.length;i++){
            if(i<songs.length){
                temp[i]=songs[i];
            }
            else if(i==songs.length){
                temp[i]=newsong;
            }
        }

        songs=new String[temp.length];

        for(int i=0;i<temp.length;i++){
            songs[i]=temp[i];
        }

        System.out.println("Song Added Successfully");

    }

    void Delete(){
        System.out.println("\nEnter Song No. You want to delete (Starting from 1): ");
        int songindex=s.nextInt();
        songindex--;

        String[] temp=new String[songs.length-1];

        if(songindex>-1 && songindex<songs.length){
            for(int i=0;i<songs.length;i++){
                    int index=i;
                    
                    if(i==songindex){
                        continue;
                    }
                    else if(i<songindex){
                        temp[i]=songs[i];
                    }
                    else if(i>songindex){
                        temp[i-1]=songs[i];
                    }
            }
            songs=new String[temp.length];

            for(int i=0;i<temp.length;i++){
                songs[i]=temp[i];
            }

            System.out.println("Song Deleted Successfully");

        }
        else{
            System.out.println("Invalid");
        }
    }

    void Search(){
        System.out.println("\nEnter Song Name You want to Search:");
        String songname=s.next();
        for(int i=0;i<songs.length;i++){
            if(songname.equalsIgnoreCase(songs[i])){
                System.out.println("\nNumber: " + (i+1) + "\tName: " + songs[i]);
                break;
            }
            else if(i==(songs.length-1)){
                System.out.println("\nNot found");
            }
        }
    }

    void Update(){
        System.out.println("Enter Song No. You want to update (Starting from 1): ");
        int songindex=s.nextInt();
        songindex--;
        if(songindex>-1 && songindex<songs.length){
            System.out.println("Enter New Song Name: ");
            String newname=s.next();
            songs[songindex]=newname;
            System.out.println("Song Updated Successfully");
        }
        else {
            System.out.println("\nNot found");
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] songs={"A","B","C"};
        App SongsApp=new App(songs);
        int Choice=0;

        do{
            Choice=SongsApp.menu();
            switch(Choice){
                case 1: SongsApp.Display(); break;
                case 2: SongsApp.Add(); break;
                case 3: SongsApp.Delete(); break;
                case 4: SongsApp.Search(); break;
                case 5: SongsApp.Update(); break;
                case 0: Choice=0; break;
                default: System.out.println("\nInvalid Choice");
            }
            if(Choice==0){
                break;
            }
            System.out.print("\nPress any no. to continue \n      or 0 to exit \n\nChoice:");
            Choice=s.nextInt();
        }while(Choice!=0);
    }
}
