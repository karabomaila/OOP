package org.oop;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Detective duke = new Detective();
        System.out.println("I am "+ duke.name + ", " + duke.age + " years old, and I am " + duke.height + " meters tall.");
        duke.age = duke.age + 1;

        Case dukesCase = new Case("The sword is missing.");
        System.out.println(dukesCase.clues[0]);

    }
}
