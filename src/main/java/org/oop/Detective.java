package org.oop;

// A detective class with no access control modifiers.
class Detective {
    String name = " Duke";
    int age =  43;
    double height = 4.4;

    void sayHello(){
        System.out.println("Hello detective");
    }

    void sayAge(){
        System.out.println("I am " + age + " years old.");
    }

    int getAge(){ return this.age;}

}
