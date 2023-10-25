package com.qa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InvalidExceptions {
        Cat cat1 = new Cat();
        cat1.setName("Bob");
        System.out.println("Name is " + cat1.getName());

        cat1.setGender(Gender.MALE);
        System.out.println("Gender is " + cat1.getGender());

        System.out.println("Breed: " + cat1.getBreed());

        Cat cat2 = new Cat("Alice", "Ginger");

        Cat cat3 = new Cat();
        System.out.println(cat3);

        System.out.println("wildcat");

        Wild wildcat = new Wild();
        System.out.println("hello" + wildcat);

        Domestic domesticCat = new Domestic();
        System.out.println(domesticCat);

        Cat[] cats = {new Cat(), new Cat("Winnie", "brown", "British Blue"), new Cat("Cosmo", "Grey", "tabby")};
        for (Cat c : cats) {
            c.setAge(5);
            System.out.println(c);
            System.out.println(c.LongWalk());
            System.out.println(c.ShortWalk());
        }
        Wild[] wildcats = {new Wild(), new Wild("Tiger", "brown"), new Wild("Lion", "Yellow")};
        for (Wild w : wildcats) {
            System.out.println(w);
        }    //Type     Name    //New type ///Inside array
        Animals[] animals = new Animals[]{new Cat(), new Dog()};
        for (Animals a : animals) {
            a.AnimalSpeech();
        }

        Dog dogA = new Dog();
        try {
            dogA.setDogsize(5);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        dogA.setDead(true);
        try {
            dogA.setWalkLength(50);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        finally{
            System.out.println("WELL DONE YOU'VE MADE IT HERE");
        }
    }
}