package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String answer = "";

        String testSign = handSign;
        switch(testSign) {
            case "rock":
                answer = "paper";
                break;

            case "paper":
                answer = "scissor";
                break;
            case "scissor":
                answer = "rock";
                break;
        }

        return answer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String answer = "";

        String testSign = handSign;
        switch(testSign) {
            case "rock":
                answer = "scissor";
                break;

            case "paper":
                answer = "rock";
                break;
            case "scissor":
                answer = "paper";
                break;
        }

        return answer;

    }

    /**
     * @param input1 a string representative of a hand sign of a player
     * @param input2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String input1, String input2) {

        String winner = "";

        if (input1 == "rock" && input2 == "scissor") {
            winner = "rock";
        } else if (input2 == "paper" && input1 == "rock") {
            winner = "rock";

        }
        return winner;

    }
}
