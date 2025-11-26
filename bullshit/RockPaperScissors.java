package bites.examples;

import java.util.HashMap;

public class RockPaperScissors {
    private static final HashMap<String, HashMap<String, String>> rules = new HashMap<>();
    static {
        // Rock
        HashMap<String, String> rockOutcomes = new HashMap<>();
        rockOutcomes.put("rock", "It's a draw");
        rockOutcomes.put("paper", "Player 2 wins");
        rockOutcomes.put("scissors", "Player 1 wins");
        rules.put("rock", rockOutcomes);

        // Paper
        HashMap<String, String> paperOutcomes = new HashMap<>();
        paperOutcomes.put("rock", "Player 1 wins");
        paperOutcomes.put("paper", "It's a draw");
        paperOutcomes.put("scissors", "Player 2 wins");
        rules.put("paper", paperOutcomes);

        // Scissors
        HashMap<String, String> scissorsOutcomes = new HashMap<>();
        scissorsOutcomes.put("rock", "Player 2 wins");
        scissorsOutcomes.put("paper", "Player 1 wins");
        scissorsOutcomes.put("scissors", "It's a draw");
        rules.put("scissors", scissorsOutcomes);
    }

    public static String play(String playerOneChoice, String playerTwoChoice) {
        if (!rules.containsKey(playerOneChoice) || !rules.get(playerOneChoice).containsKey(playerTwoChoice)) {
            return "Invalid choice provided. Must be 'rock', 'paper', or 'scissors'.";
        }
        return rules.get(playerOneChoice).get(playerTwoChoice);
    }
}