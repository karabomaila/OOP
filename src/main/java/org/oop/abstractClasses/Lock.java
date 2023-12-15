package org.oop.abstractClasses;

public abstract class Lock {
    protected String secretWord;
    protected int secretNumber;
    protected int numberOfAttempts;

    Lock(){
        numberOfAttempts = 6;
    }

    public abstract boolean openWithSecretNumber(int number, int attempts);
    public abstract boolean openWithSecretWord(String secretWord);
}
