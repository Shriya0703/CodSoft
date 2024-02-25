import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome Buddy!");
        System.out.println("Hey Buddy, you have "+chances+" chances to win the game");
        while(playAgain){
            int rand = getRandN(1,100);
            boolean guess = false;
            for(int i = 0; i < chances; i++){
                System.out.print("Chance "+(i+1)+": Enter your guess: ");
                int user = sc.nextInt();
                if(user == rand){
                    guess = true;
                    finals++;
                    System.out.println("You won!");
                    System.out.println("Well Done! You guessed in "+(i+1)+" chances");
                    break;
                }else if(user > rand){
                    System.out.println("Too High");
                }else{
                    System.out.println("Too Low");
                }
            }
            if(!guess){
                System.out.println("Sorry Buddy, you lost all chances. The number is: "+rand);
            }
                System.out.println("Do you want to try again (y/n)?");
                String pA = sc.next();
                playAgain = pA.equalsIgnoreCase("y");
        }
            System.out.println("That's it Buddy! Hope you enjoyed");
            System.out.println("Here is your score: "+finals);
    }
        public static int getRandN(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}