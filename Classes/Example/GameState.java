package Classes.Example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Styrmir S. Thorarinsson
 *
 * Graphical User Interface Programming
 * HBV201G, Spring 2016
 * Tutor: Ebba Þ. Hvannberg
 *
 * Snakes & Ladders (Java Program)
 * Assignment 6 FINAL
 *             by
 * Student: Styrmir S. Þórarinsson, D5
 * Email: sth315@hi.is
 *
 *
 *
 * This class tracks all the information needed to run the game.
 *
 * It records and holds all the game states, such as who's turn is next,
 * where each player is on the board, location of snakes and ladders etc.
 *
 * Also generates random locations and slide/climb distances of snakes and ladders on game board.
 *
 * Could save and reload games by saving an XML version of the class and
 * later reading from the XML file back into a GameState class.
 */

public class GameState {
    public int turn; // what game turn is it
    public boolean playerTurn; // is it the players turn? By default the player starts first.
    public boolean playerStart; // set to true of the player takes the first turn in the game
    public boolean gameOver; // true if game is over
    public boolean playerWinner; // checked at end of game, true if player wins, false if computer wins

    public int lastDiceRoll; // holds the last rolled dice

    public int numberOfAIPlayers = 3;
    public int[] locationPlayers = new int[4]; //saves current square position of players on board: 0=user, 1 AI nr 1, 2 AI nr 2, 3 AI nr 3.
    public int locationPlayerToClick; // holds the location on the board the player is to click after rolling the dice, once clicked locationPlayer is updated

    public int numberOfColumns = 5;
    public int numberOfRows = 5;
    public int totalPlayAreaDimension = 500; //determines x and y dimensions of game board


    public int[][] snakes; // array that holds the locations of the snakes and how far to slide, ex. Snakes[i][0] == location, Snakes[i][1] == slide distance
    public int[][] ladders; //array that holds the locations of the ladders and how far they clim, ex. Ladders[i][0] == location, Ladders[i][1] == climb distance
    public int numberOfSnakes = 3; //how many snakes to generate on the board
    public int numberOfLadders = 3; //how many ladders to generate on the board

    public boolean computerClimbedLadder = false; // used to monitor if computer hit a ladder
    public boolean computerSlidSnake = false;  // used to monitor if computer slid on a snake

    public enum THEMES {
        WHITE_GRAY_BLUE,
        WHITE_GRAY_BLACK,
        ORANGE_WHITE_BLACK
    }
    public THEMES theme;

    // could add other variables for fun such as how many times has a player slid down a ladder/climbed a stair

    //class constructor
    public GameState() {
        turn = 1;
        playerTurn = true;
        playerStart = true;
        gameOver = false;
        playerWinner = true;

        lastDiceRoll = 0;

        locationPlayers[0] = 0;
        locationPlayers[1] = 0;
        locationPlayers[2] = 0;
        locationPlayers[3] = 0;

        theme = theme.WHITE_GRAY_BLUE;

        generateSnakesAndLadders();
    }

    /*
        Automatically create randomize snakes and ladders for the game board.
    */

    public void generateSnakesAndLadders() {
        //create numberOfSnakes snakes and numberOfLadders ladders

        //initiate arrays to the correct dimensions
        snakes = new int[numberOfSnakes][2];
        ladders = new int[numberOfLadders][2];

        //create snakes
        for (int i = 0; i < numberOfSnakes; i++) {
            int square = randomSquare();
            int slideDistance = randomClimbSlideDistance(square, false);

            snakes[i][0] = square;
            snakes[i][1] = slideDistance;
        }

        //create ladders
        for (int i = 0; i < numberOfLadders; i++) {
            int square = randomSquare();
            int climbDistance = randomClimbSlideDistance(square, true);

            ladders[i][0] = square;
            ladders[i][1] = climbDistance;
        }
    }

    /*
        returns an integer between 1 and 23, representing the array item of the
        corresponding random quare to place snake or ladder at, makes sure the
        square isn't already taken for another snake or ladder
    */
    private int randomSquare() {
        // initialize random seed class
        Random random = new Random();
        // define max and minimum values to return from random seed
        int max = 23, min = 1;
        // generate random number betwen max and min
        int square = random.nextInt(max - min + 1) + min;

        //keep generating new square numbers until unused square is found
        while (squareAlreadyUsed(square) == true) {
            square = random.nextInt(max - min + 1) + min;
        }

        return square;
    }

    /*
        returns an integer between 1 and 6, representing the number of squares to
        slide or climb if player lands on snake or ladder
    */
    private int randomClimbSlideDistance(int square, boolean ladder) {
        // initialize random seed class
        Random random = new Random();
        // define max and minimum values to return from random seed
        int max = 6, min = 1;
        // generate random number betwen max and min
        int moveDistance = random.nextInt(max - min + 1) + min;

        //make sure slide or climb doesn't land on another ladder or snake
        if (ladder == true) {
            while (squareAlreadyUsed(square + moveDistance) == true)
                moveDistance++;
        }
        if (ladder == true) {
            while (squareAlreadyUsed(square + moveDistance) == true)
                moveDistance++;
        }

        return moveDistance;
    }

    /*
        makes sure there is not already a slider or ladder at that square,
        returns true if square already used, if square free returns false
    */
    private boolean squareAlreadyUsed(int square) {
        boolean alreadyUsed = false;

        //check if snakes array already contains same square, sets alreadyUsed to true if that's the case
        for (int i = 0; i < numberOfSnakes; i++) {
            if (snakes[i][0] == square)
                alreadyUsed = true;
        }
        //check if ladders array already contains same square, sets alreadyUsed to true if that's the case
        for (int i = 0; i < numberOfLadders; i++) {
            if (ladders[i][0] == square)
                alreadyUsed = true;
        }

        return alreadyUsed;
    }
}
