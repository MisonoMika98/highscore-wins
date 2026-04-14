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

        // splits formatting up into array, for the example given in the user input it would give me "Home:Visitor" and "21:9"
        String[] formatParts = finalScore.split("\\|");

        // splits team names at the ":"
        String[] teams = formatParts[0].split(":");

        // splits scores at the ":"
        String[] scores = formatParts[1].split(":");


        // assigns home and visitor team names to the teams array
        String homeTeam = teams[0];
        String visitorTeam = teams[1];


        // converts team scores from strings into integers and assigns them to the scores array
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);



        // checks for the winner of the match using booleans and outputs results
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

