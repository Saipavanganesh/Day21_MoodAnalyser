package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your statement");
        String message = sc.nextLine();
        System.out.println(moodAnalyser.analyseMood(message));
    }
}
