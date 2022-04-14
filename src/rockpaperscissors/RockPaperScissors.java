package rockpaperscissors;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissors {
    
    private Player player;
    private Computer computer;
    
    JRadioButton rButtonRock, rButtonPaper, rButtonScissors;
    JButton buttonStart;
    JLabel roundResult, score, scoreBoard, gameRules;
    String computerChoice = "";
    int userWinScore = 0;
    int computerWinScore = 0;
    int roundNumber = 0;
    
    RockPaperScissors() {
        
        JFrame mainGameWindow = new JFrame("Rock-Paper-Scissors");
        
        rButtonRock = new JRadioButton("ROCK", new ImageIcon("images/rock.png"));
        rButtonRock.setBounds(100, 0, 200, 180);

        rButtonPaper= new JRadioButton("PAPER", new ImageIcon("images/paper.png"));
        rButtonPaper.setBounds(300, 0, 200, 170);
            
        rButtonScissors = new JRadioButton("SCISSORS",new ImageIcon("images/scissors.png"));
        rButtonScissors.setBounds(500, 0, 200, 170);
        
        ButtonGroup rpsGame = new ButtonGroup();
        
        rpsGame.add(rButtonRock);
        rpsGame.add(rButtonPaper);
        rpsGame.add(rButtonScissors);
        
        buttonStart = new JButton("PLAY");
        buttonStart.setBounds(120, 180, 215, 80);
        buttonStart.setIcon(new ImageIcon("images/start.png"));
        
        scoreBoard = new JLabel("\t \tSCORE BOARD \t \t");
        scoreBoard.setBounds(490,165 , 100, 20);
        
        roundResult = new JLabel(" ");
        roundResult.setBounds(380, 190, 310, 30);
        roundResult.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        roundResult.setForeground(Color.blue);
        
        score = new JLabel(" ");
        score.setBounds(380, 230, 310, 30);
        score.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        score.setForeground(Color.red);
        
        gameRules = new JLabel(new ImageIcon("images/gameRules.png"));
        gameRules.setBounds(260, 300, 240, 200);
        gameRules.setBorder(BorderFactory.createLineBorder(Color.lightGray, 3));
        
         
        mainGameWindow.add(rButtonRock);
        mainGameWindow.add(rButtonPaper);
        mainGameWindow.add(rButtonScissors);
        mainGameWindow.add(buttonStart);
        mainGameWindow.add(scoreBoard);
        mainGameWindow.add(roundResult);
        mainGameWindow.add(score);
        mainGameWindow.add(gameRules);
        
              
        mainGameWindow.setSize(800, 600);
        mainGameWindow.setLayout(null);
        mainGameWindow.setVisible(true);
              
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random randomComputerChoice = new Random();
                computerChoice = Computer.gettingComputerChoice(randomComputerChoice);
                  

                if(rButtonRock.isSelected() && null != computerChoice) {
                    
                    switch (computerChoice) {
                        case "ROCK":
                            roundResult.setText("  "+"Computer's choice: " + computerChoice + "  " + " ->  TIE "  + "\n");
                            break;
                        case "PAPER":
                            roundResult.setText("  "+"Computer's choice: " + computerChoice + "  " + " ->  COMPUTER WON!"  + "\n");
                            computerWinScore++;
                            break;
                        case "SCISSORS":
                            roundResult.setText("  "+"Computer's choice: " + computerChoice + "  " + " ->  YOU WON!"  + "\n");
                            userWinScore++;
                            break;
                        default:
                            break;
                    }          
                }
                
                else if(rButtonPaper.isSelected() && null != computerChoice) {
                  
                    switch (computerChoice) {
                        case "PAPER": 
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + " ->  TIE "  + "\n");
                            break;
                        case "SCISSORS":
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + " ->  COMPUTER WON!"  + "\n");
                            computerWinScore++;
                            break;
                        case "ROCK":
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + " ->  YOU WON!"  + "\n");
                            userWinScore++;
                            break;
                        default:
                            break;
                    }                      
                }
                else if(rButtonScissors.isSelected() && null != computerChoice) {

                    switch (computerChoice) {
                        case "SCISSORS":
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + "  ->  TIE "  + "\n");
                            break;
                        case "ROCK":
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + "  ->  COMPUTER WON!"  + "\n");
                            computerWinScore++;
                            break;
                        case "PAPER": 
                            roundResult.setText("  "+"Computer' choice: " + computerChoice + "  " + "  ->  YOU WON!" + "\n");
                            userWinScore++;
                            break;
                        default:
                            break;
                    }                                 
                 }              
                 roundNumber++;                
                 score.setText("  "+"Round: " + roundNumber + "   " +" You:  "+ userWinScore + " vs " + "Computer:  " + computerWinScore);            
            }        
        });        
    }
    
    public static void main(String[] args) {
        new RockPaperScissors();
           
    }

}
