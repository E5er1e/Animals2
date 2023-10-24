package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat();
        cat1.setName("Bob");
        System.out.println("Name is " + cat1.getName());

        cat1.setGender(Gender.MALE);
        System.out.println("Gender is " + cat1.getGender());

        System.out.println("Breed: " + cat1.getBreed());

        Cat cat2 = new Cat("Alice", "Ginger");

        Cat cat3 = new Cat();
        System.out.println(cat3);



    }
}
