package com.superuserdev.riddletester;

/**
 *
 * @author Arya
 */
public class Riddle {
    private String question;
    private String answer;
    private boolean isSet;
    
    /**
     * This is the default constructor
     */
    public Riddle(){
        question = "here is a default question";
        answer = "hello";
        isSet = false;
    }
    
    /**
     * This parameterized constructor is used to initialize a riddle object with the given question and answer
     * @param question is the question to be set for the riddle
     * @param answer is the answer to be set for the riddle
     */
    public Riddle(String question, String answer){
        this.question = question;
        this.answer = answer;        
        isSet = true;
    }
    
    /**
     * This method returns the question for the riddle
     * @return It returns the question string for the riddle
     */
    public String getQuestion(){
        return question;
    }
    
    /**
     * This method is used to set an question if it is not set before
     * @param question is the question to be set for the riddle
     */
    public void setQuestion(String question){
        this.question = question;
    }
    
    /**
     * This method is used to set an answer if it is not set before
     * @param answer is the answer to be set for the riddle
     */
    public void setAnswer(String answer){
        if(!isSet){
            this.answer = answer;
            isSet = true;
        }
        else
            System.out.println("Answer cannot be changed");
    }
    
    /**
     * This method is used to check a given answer with the actual answer to the riddle
     * @param answer is the answer to be checked for the riddle
     * @return This method returns true if the answer is correct else returns false
     */
    public boolean checkAnswer(String answer){
        return this.answer.equalsIgnoreCase(answer);
    }
}
