package com.bridgelabz;

public class MoodAnalyser  {
    String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
<<<<<<< HEAD

    public String analyseMood(String message){
        String mood;
            if (message.toLowerCase().contains("sad")) {
                mood = "SAD";
            } else {
                mood = "HAPPY";
            }

=======

    public String analyseMood(String message) throws Exception{
        String mood = null;
        try{
            if(message.equals("")){
                throw new Exception("Entered statement is empty.");
            }
            else if (message.toLowerCase().contains("sad")) {
                mood = "SAD";
            } else {
                mood = "HAPPY";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
>>>>>>> uc2_checkNull
        return mood;
    }
}
