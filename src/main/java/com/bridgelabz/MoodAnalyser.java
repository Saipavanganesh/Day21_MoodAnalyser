package com.bridgelabz;

public class MoodAnalyser {
    public void analyseMood(String message){
        if(message.contains("sad")){
            System.out.println("SAD");
        }
        else {
            System.out.println("HAPPY");
        }
    }
}
