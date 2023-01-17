package com.bridgelabz;

public class MoodAnalyser  {
    public String analyseMood(String message){
        String mood;

        if(message.toLowerCase().contains("sad")){
            mood = "SAD";
        }
        else if (message.toLowerCase().contains("sad")) {
            mood = "HAPPY";
        }
        else {
            mood = "Enter another statement about mood";
        }
        return mood;
    }
}
