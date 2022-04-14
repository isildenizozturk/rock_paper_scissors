package rockpaperscissors;

import java.util.Random;

public class Computer extends RockPaperScissors {
    public Computer() 
    {

    }
    public static String gettingComputerChoice(Random random) {
        int wordChoiceNumber;
        wordChoiceNumber = random.nextInt(3) + 1; // 1 2 3 
       
        String computerChoice = "";
      
            switch (wordChoiceNumber) {
                case 1:
                    computerChoice = "ROCK";
                    break;
                case 2:
                    computerChoice = "PAPER";
                    break;
                case 3:
                    computerChoice = "SCISSORS";
                    break;
                default:
                    break;
            }     

        return computerChoice;            
    } 
}
