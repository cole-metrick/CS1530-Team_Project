import java.util.ArrayList;

public class Game {
    String learningPath;
    String languages[];
    ArrayList<CodingChallenge> codingChallenges;
    ArrayList<CodingChallenge> assignedChallenges;
    ArrayList<CodingChallenge> inProgressChallenges;
    ArrayList<CodingChallenge> completedChallenges;

    public Game() {
        learningPath = "NONE";
        languages = new String[]{"C", "C++", "C#", "Java", " Python"};
        codingChallenges = new ArrayList<>();
        assignedChallenges = new ArrayList<>();
        inProgressChallenges = new ArrayList<>();
        completedChallenges = new ArrayList<>();
    }

    public Game(String lp) {
        learningPath = lp;
        languages = new String[]{"C", "C++", "C#", "Java", " Python"};
        codingChallenges = new ArrayList<>();
        assignedChallenges = new ArrayList<>();
        inProgressChallenges = new ArrayList<>();
        completedChallenges = new ArrayList<>();
    }
}