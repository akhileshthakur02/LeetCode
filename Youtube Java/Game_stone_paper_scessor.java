import java.util.Random;
import java.util.Scanner;
public class Game_stone_paper_scessor {
    public static void main(String[] args) {
        System.out.println("0 is for Rock");
        System.out.println("1 is for Paper");
        System.out.println("2 is for Scessor");
        // Scanner sc = new Scanner(System.in);
        int computerChoice;
        int myChoice;

        int computerWon=0;
        int iWon=0;
        for(int game=1;game<=5;game++){
            Random rand = new Random();
            computerChoice = rand.nextInt(2);
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            myChoice = sc.nextInt();
            switch(myChoice){
                case '0':
                System.out.println("I choose Rock");

                case '1':
                System.out.println("I choose Paper");

                case '2':
                System.out.println("I choose Scessor");
            }

                switch(computerChoice){
                    case'0':
                    System.out.println("Computer choose Rock");

                    case '1':
                    System.out.println("Computer choose Paper");

                    case '2':
                    System.out.println("Computer choose Scessor");
                }

               
                if(computerChoice == myChoice){
                    System.out.println("Match is tie");
                }
                else if(computerChoice==0 && myChoice==1){
                    System.out.println("I won th the game");
                    iWon++;
                }
                else if(computerChoice==0 && myChoice==2){
                    System.out.println("Computer won the game");
                    computerWon++;
                }
                else if(computerChoice==1 && myChoice==0){
                    System.out.println("I won the game");
                    iWon++;
                }
                else if(computerChoice==1 && myChoice==2){
                    System.out.println("i won the game");
                    iWon++;
                }
                else if(computerChoice==2 && myChoice==0){
                    System.out.println("Computer won the game");
                    computerWon++;
                }
                else if(computerChoice==2 && myChoice==1){
                    System.out.println("Computer won the game");
                    computerWon++;
                }
               if(game==5)
                break;    
        }
        System.out.println("------Points of the match---------");
        System.out.println(computerWon +" Points ");
        System.out.println(iWon+" Points ");
        System.out.println("-----------------------------------");
        if(computerWon==iWon){
            System.out.println("Match is tie");
        }
        else if(computerWon>iWon){
            System.out.println("Computer will win ");
        }
        else{
            System.out.println("I will win ");
        }
    }
}
