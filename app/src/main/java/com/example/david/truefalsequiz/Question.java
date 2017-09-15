package com.example.david.truefalsequiz;

/**
 * Created by gosht on 9/15/2017.
 */

public class Question {
    private String qustionText;
    private boolean answer;

    public Question(String qustionText, boolean answer) {
        this.qustionText = qustionText;
        this.answer = answer;
    }

    public String getQustionText() {
        return qustionText;
    }

    public boolean isAnswer() {
        return answer;
    }

    /**
     * @param userAnswer
     * @return true if answers match, false otherwise
     */
    public boolean checkAnswer(boolean userAnswer){
        return answer == userAnswer;
    }
}
