import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean continuegame=true;
        while(continuegame){

            System.out.print("Enter your choice: ");
        String userchoice=scan.next();
        
        String[] choices={"rock","paper","scissors"};
        Random rand=new Random();
        int option = rand.nextInt(0,choices.length);
        String compchoice=choices[option];
        System.out.printf("Computers choice: %s\n",compchoice);
        

       if(userchoice.equalsIgnoreCase(compchoice)){
        System.out.println("Draw");
       }
       else{
        if(userchoice.equalsIgnoreCase("rock") || compchoice.equalsIgnoreCase("paper")){
            System.out.println("You win!\n");

        }
        if(userchoice.equalsIgnoreCase("paper") || compchoice.equalsIgnoreCase("rock")){
            System.out.println("Computer wins!\n");

        }

       }
       System.out.print("Want to play again(yes/no)? ");
       String yesno=scan.next();

       if(yesno.equalsIgnoreCase("yes")){
        continuegame=true;
        continue;
       }
       else{
        continuegame=false;
        break;
       }

        }
        System.out.println("You have exited the game! ");
        

        }


    }
    

