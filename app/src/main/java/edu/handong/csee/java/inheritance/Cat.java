package edu.handong.csee.java.inheritance;

public class Cat extends Animal{
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal myDog = new Dog();
        Animal myMonkey = new Monkey(); // Animal type으로 myDog, myMonkey 생성 -> Dog / Monkey로 할당
        // Polymorphism

        Animal.testClassMethod();
        Cat.testClassMethod();
        Dog.testClassMethod();
        Monkey.testClassMethod();

        // hiding 활용하여 subClass에서 static method 내용 변경
        // The static method in Animal
        // The static method in Cat
        // The static method in Dog
        // The static method in Monkey

        myDog.testInstanceMethod();
        myMonkey.testInstanceMethod();

        // overriding 활용하여 subClass에서 instance method 내용 변경
        // The instance method in Dog
        // The instance method in Monkey




    }
}
