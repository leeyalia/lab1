package javajus;

import java.util.ArrayList;

public class Game {
    static void main(){

        boolean playing  = true;
        while(playing){
            System.out.println();
            System.out.println("===Welcome to the game!===");

            ArrayList<Player> playerList = GameHelpers.createPlayers(2);
            Player player1 = playerList.get(0);
            Player player2 = playerList.get(1);

            System.out.println("===Game Start!===");

            for(int i = 1; i < 3; i ++){
                int diceroll = Dice.diceroll();
                System.out.println("Player " + player1.getFullName() + " / round " + i + ": " + diceroll);
                player1.addToScore(diceroll);
            }

            System.out.println(player1.getFullName() + ":" + player1.getScore());

            for(int i = 1; i < 3; i ++){
                int diceroll = Dice.diceroll();
                System.out.println("Player " + player2.getFullName() + " / round " + i + ": " + diceroll);
                player2.addToScore(diceroll);
            }

            System.out.println(player2.getFullName() + ":" + player2.getScore());

            if(player1.getScore() > player2.getScore()){
                System.out.println("Winner is " + player1.getFullName());
            } else if (player1.getScore() < player2.getScore()){
                System.out.println("Winner is " + player2.getFullName());
            } else {
                System.out.println("End in a tie.");
            }

            String answer = IO.readln("Do you want to continue the game? (Yes/No)");

            if(answer.equalsIgnoreCase("No")){
                playing = false;
            }
        }


    }
}
