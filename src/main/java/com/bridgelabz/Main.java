package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your statement");
        String message = sc.nextLine();
        message = message.toLowerCase();
        moodAnalyser.analyseMood(message);
    }
}
