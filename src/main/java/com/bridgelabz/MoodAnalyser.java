package com.bridgelabz;

public class MoodAnalyser  {
    String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message){
        String mood;
            if (message.toLowerCase().contains("sad")) {
                mood = "SAD";
            } else {
                mood = "HAPPY";
            }

        return mood;
    }
}
