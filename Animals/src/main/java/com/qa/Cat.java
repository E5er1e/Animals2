package com.qa;

public class Cat extends Animals implements Walkable {


    public String meow(){
        String pitch = null;
        String terror_level = null;
        String Loudness = null;
        return pitch + terror_level + Loudness;
    }


    public Cat() {
        this("Anonymous", "White");

//        this.breed = "bengal";
//        this.name = "Anonymous";
//        this.colour = "white";
//        this.gender = Gender.FEMALE;
//        this.age = 0;
    }
    public Cat(String name, String breed, String colour, Gender gender, int age)
    {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
        
    }
    //Overloading the constructor
    public Cat(String inputName, String inputColour, String inputBreed)
    {
//        this.name = inputName;
//        this.colour = inputColour;
        this(inputName,inputBreed , inputColour, Gender.FEMALE, 0);
    }
    private String breed;
    private String name;
    private String colour;
    private Gender gender;
    private int age;

    public Cat(String alice, String ginger) {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        String output = String.format("%s is a %s %s. Their gender is %s. They are %d years old!",getName(), getColour(), getBreed(), getGender(), getAge() );
        return output;

    }

    @Override
    public void AnimalSpeech() {
        System.out.println("MEOWWWWWWWWWWWWWWWWWWWW MEOWWWWWW - if you can't tell i'm a cat");
    }

    @Override
    public String ShortWalk() {
        return this.colour + " Cat is going on a ShortWalk";
    }

    @Override
    public String Run() {
        return this.colour + " Cat is going on a run";
    }

    @Override
    public String LongWalk() {
        return this.colour + " Cat is going on a Long Walk";
    }
}
