package com.bridgelabz;

public class MoodAnalysisException extends Exception{
    public enum exc{
        NULL,EMPTY;
    }
    final exc msgType;
    public MoodAnalysisException(exc msgType) {
        this.msgType = msgType;
    }
}
