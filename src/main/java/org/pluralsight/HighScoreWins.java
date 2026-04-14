package org.pluralsight;

import java.util.Scanner;

public class HighScoreWins
{
    static void main()
    {

        Scanner input = new Scanner(System.in);

        // asks user for score in specific format
        System.out.print("Please enter your game score in this format (i.e. Home:Visitor|21:9): ");
        String finalScore = input.nextLine();

        // splits formatting up into an array so it can be read
        String[] formatParts = finalScore.split("\\|");
        String[] teams = formatParts[0].split(":");
        String[] scores = formatParts[1].split(":");

        // assign team names and scores to the array
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // checks for the winner of the match using booleans
        if (homeScore > visitorScore)
        {
            System.out.println("Winner: " + homeTeam + " " + homeScore + ":" + visitorScore + " " + visitorTeam);
        }

        else if (visitorScore > homeScore)
        {
            System.out.println("Winner: " + visitorTeam + " " + visitorScore + ":" + homeScore + " " + homeTeam);
        }

        else if (homeScore == visitorScore)
        {
            System.out.println("It's a tie!");
        }

        else
        {
            System.out.println("What are you cooking...");
        }

    }
}

