package com.qa;

public class Cat {

    public Cat() {
        this("Anonymous", "White");

//        this.breed = "bengal";
//        this.name = "Anonymous";
//        this.colour = "white";
//        this.gender = Gender.FEMALE;
//        this.age = 0;
    }
    public Cat(String name, String breed, String Colour, Gender gender, int age)
    {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
        
    }
    //Overloading the constructor
    public Cat(String inputName, String inputColour)
    {
//        this.name = inputName;
//        this.colour = inputColour;
        this(inputName, "bengal", inputColour, Gender.FEMALE, 0);
    }
    private String breed;
    private String name;
    private String colour;
    private Gender gender;
    private int age;

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
}
