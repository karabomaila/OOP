package org.oop.abstractClasses;

public class Locksub extends Lock{

    Locksub(int secretNumber, String secretWord){
        super();
        this.secretNumber = secretNumber;
        this.secretWord = secretWord;
        this.numberOfAttempts = 5;
    }

    @Override
    public boolean openWithSecretNumber(int number, int attempts) {
        if (number == secretNumber && attempts < numberOfAttempts) return true;
        return false;
    }

    @Override
    public boolean openWithSecretWord(String secretWord) {
        return this.secretWord.equals(secretWord);
    }

    public static void creatLock(){
        Locksub locksub = new Locksub(3344, "java");
        System.out.println(locksub.openWithSecretNumber(433, 1));
        System.out.println(locksub.openWithSecretWord("java"));

        Lock lock = new Locksub(1234, "Java");
        System.out.println(lock.openWithSecretNumber(1234, 6));
        System.out.println(lock.openWithSecretWord("java"));
    }
}
