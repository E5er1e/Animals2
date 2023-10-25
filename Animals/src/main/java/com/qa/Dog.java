package com.qa;

public class Dog extends Animals
{
    public void AnimalSpeech(
    ) {System.out.println("WUFF WUFF WOOF I'M A BLIMING DOGO");
    }

    public int Dogsize;
    public int WalkLength;
    public int WalkLengthMax;

    public Dog() {
        this(0);

//        this.breed = "bengal";
//        this.name = "Anonymous";
//        this.colour = "white";
//        this.gender = Gender.FEMALE;
//        this.age = 0;
    }
    public Dog(int Dogsize)
    {
        this.Dogsize = Dogsize;
    }

    public void setDogsize(int pounds) throws InvalidExceptions {
        Dogsize = pounds;
        if (pounds > 0 && pounds < 50 ) {
            setWalkLengthMax(50);
            System.out.println("Maximum time to walk a small sized dog is 30 Minutes");
        }
        else if (pounds >= 50 && pounds < 150 ) {
            setWalkLengthMax(150);
            System.out.println("Maximum time to walk a Medium sized dog is 120 Minutes");
        }
        else if (pounds >= 150) {
            setWalkLengthMax(250);
            System.out.println("Maximum time to walk a Large sized dog is 240 Minutes");
        }
        else
      //      System.out.println("Please add DogSize in pounds");
        throw new InvalidExceptions("DOG SIZE GIVEN IS BELOW 1 pound");
    }

    public void setWalkLengthMax(int walkLengthMax) {
        WalkLengthMax = walkLengthMax;
    }

    public int getWalkLengthMax() {
        return WalkLengthMax;
    }

    public int getDogsize() {
        return Dogsize;
    }
    public void setWalkLength(int walkLength) {
        WalkLength = walkLength;
    }
    public int getWalkLength() {
        return WalkLength;
    }

    public String WalkSize(String Dogsize, int WalkLength) throws InvalidExceptions
    {
        if (Dogsize == "null") {
            return ("Please enter a dog-size");
        }
        else if (WalkLength > getWalkLengthMax())
        {
            return ("Walk Length is to large for that dogsize");
        }
        else
        return "That dogsize is fine to walk for that length of time";
    }


//
//    public String ShortWalk() {
//        return null;
//    }
//
//    @Override
//    public String Run() {
//        return null;
//    }
//
//    @Override
//    public String LongWalk() {
//        return super.LongWalk();
//    }
}
