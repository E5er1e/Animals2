package com.qa;

public class Dog extends Animals
{
    public void AnimalSpeech(
    ) {System.out.println("WUFF WUFF WOOF I'M A BLIMING DOGO");
    }

    public int Dogsize;
    public int WalkLength;
    public int WalkLengthMax;
    public boolean dead;

    public void setDead(boolean dead) {

        this.dead = dead;

    }

    public boolean getDead() {
        return true;
    }


    public Dog() {
        this(0);
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
    public void setWalkLength(int walkLength) throws InvalidExceptions {
        WalkLength = walkLength;
        if (dead == true) {
            throw new InvalidExceptions("THE DOGS DEAD, IT CAN'T WALK. PLEASE DO NOT ATTEMPT");
        }
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
