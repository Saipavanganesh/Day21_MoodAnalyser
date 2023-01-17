package com.bridgelabz;

public class MoodAnalyser  {
    String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException{
        String mood = null;
        try{
            if(message.equals("")){
                System.out.println("Mood statement should not be empty"); ;
                throw new MoodAnalysisException(MoodAnalysisException.exc.EMPTY);
            }
            else if (message == null) {
                System.out.println("Mood statement should not be empty");
                throw new MoodAnalysisException(MoodAnalysisException.exc.NULL);
            } else if (message.toLowerCase().contains("sad")) {
                mood = "SAD";
            } else {
                mood = "HAPPY";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return mood;
    }
}
