package javajus;

public class Player {

    private String firstName;
    private String lastName;
    private int score;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    public int addToScore(int score){
        this.score += score;
        return score;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
