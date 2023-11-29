package org.oop;

class Case {
    int numberOfClues;
    String[] clues = new String[10];

    Case(String clue){
        numberOfClues = 1;
        clues[0] = clue;
    }

    // constructor overloading
    Case(String clue, String clue2){
        this(clue); // must be the first statement
        numberOfClues = 2;
        clues[1] = clue2;
    }
}
