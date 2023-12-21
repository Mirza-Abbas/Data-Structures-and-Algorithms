class Task4 {
    public static void Hits(){
        
        int playerHits = 0, enemyHits = 0, totalHits = 1, max=10, min=1;
        int Players = (int)(Math.random() * (max- min) + 2); 
        System.out.println("Total number of Players in team: "+ Players);
  
        while (totalHits<=Players){
            System.out.println("Pair of Numbers:");

            int num1 = (int)(Math.random() * 5);            
            int num2 = (int)(Math.random() * 5);      

            System.out.println("Number1: "+ num1);
            System.out.println("Number2: "+ num2);
  
            if (num1==num2){
                System.out.println("Enemy got hit by your team!");
                playerHits++;
            } else {
                System.out.println("You got hit by the enemy team!");
                enemyHits++;
            }
            totalHits++;
        }   
  
        if (playerHits>enemyHits){      
            System.out.println("Game Over! You Won");
        } else if (playerHits<enemyHits){
            System.out.println("Game Over! You Lost");
        } else if (playerHits==enemyHits){
            System.out.println("Game Over! It's a Tie");
        }
  
    }      
  
    public static void main(String[] args) {
  
        Hits();
  
    }       
}        