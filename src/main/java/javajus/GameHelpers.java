package javajus;

import java.util.ArrayList;

public class GameHelpers {
    

    public static ArrayList<Player> createPlayers(int nrOfPlayers){
        ArrayList<Player> playerList = new ArrayList<>();
        
        int counter = 1;
        while(playerList.size() < nrOfPlayers){
            String firstName = IO.readln("Player " + counter + "'s first name: ");
            try {
                if (firstName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Name can't be empty!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            String lastName = IO.readln("Player " + counter + "'s last name: ");
            try {
                if (lastName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Name can't be empty!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            Player player = new Player(firstName, lastName);
            playerList.add(player);
            counter++;
        }
        return playerList;
    }
    
}
