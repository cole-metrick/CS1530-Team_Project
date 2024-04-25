import java.util.ArrayList;

public class Educator {
    String name;
    String student;
    Game game;

    public Educator() {
        name = "";
        student = ""
        game = new Game();
    }

    public Educator(String n, String stud) {
        name = n;
        student = stud;
        game = new Game();
    }

    public void addCodingChallenge(CodingChallenge challenge) {
        //adds the challnege to the list of possible challenges
        System.out.println("Adding Challenge...");
        game.codingChallenges.add(challenge);
    }

}
