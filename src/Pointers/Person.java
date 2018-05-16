package Pointers;

import static Pointers.hairColor.*;

public class Person {

    hairColor hairColor = BROWN;

    public Person() {

    }
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        // The alias will also change to PURPLE.
//        peterParker.hairColor = PURPLE;

        System.out.println("Hair color of Peter Parker is: " + peterParker.hairColor);
        System.out.println("Hair color of Spider-Man is: " + spiderMan.hairColor);
    }
}
