package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    public void testMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String currentMood =  moodAnalyser.analyseMood("I am in sad Mood");
        Assertions.assertEquals("SAD" , currentMood);
    }
}