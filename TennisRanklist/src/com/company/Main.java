package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int count = scan.nextInt();
        int startingPoints = scan.nextInt();
        String stageOfTournament = "";
        int pointsW = 0;
        int pointsF = 0;
        int pointsSF = 0;
        int countW = 0;

        for (int i = 0;i < count; i++){
            stageOfTournament = scan.next();

            if (stageOfTournament.equals("W")){
                pointsW += 2000;
                countW += 1;
            }else if (stageOfTournament.equals("F")){
                pointsF += 1200;
            }else if (stageOfTournament.equals("SF")){
                pointsSF += 720;
            }

        }
        int points = pointsW + pointsF + pointsSF + startingPoints;
        int averagePoints = (points - startingPoints) / count;
        double percentsW = ((double)countW / (double)count) * 100;
        System.out.printf("Final points: %d %nAverage points: %d %n%.2f%%", points, averagePoints,percentsW);
    }
}
