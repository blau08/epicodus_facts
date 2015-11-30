package com.brianjanice.epicodusfacts;

import java.util.Random;

/**
 * Created by Guest on 11/30/15.
 */
public class FactBook {
    //member variables
    public String[] mFacts = {
            "Michael Kaiser-Nyman is the founder of Epicodus.",
            "Epicodus offers 10 different courses.",
            "Epicodus has a 99% job placement rate.",
            "Summer 2015 Ruby had 60 students, but 2 dropped out before class started.",
            "The average age of the Summer 2015 Ruby students was 25.",
            "The Summer 2015 Ruby class had a 3:1 male to female ratio.",
            "The teachers for Summer 2015 Ruby were Mike and Courtney.",
            "The Summer 2015 Ruby class was the last class to graduate from the Lincoln building.",
            "Epicodus is the only coding bootcamp in Portland to have a guaranteed internship.",
            "Epicodus is the only bootcamp to do pair programming."
    };

    //methods
    public String getFact() {

        String fact = "";

        // randomly select a fact
        Random randomGenerator = new Random(); //Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
