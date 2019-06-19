package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //pets

        Pet pet = new Pet();
        pet.name = "Dog";
        pet.age = 2;
        pet.happiness = 4;
        pet.hunger = 4;
        pet.energy = 6;
        pet.health = 6;

        Pet pet1 = new Pet();
        pet1.name = "Cat";
        pet1.age = 3;
        pet1.happiness = 6;
        pet1.hunger = 6;
        pet1.energy = 4;
        pet1.health = 4;

        Pet pet2 = new Pet();
        pet2.name = "Horse";
        pet2.age = 8;
        pet2.happiness = 3;
        pet2.hunger = 3;
        pet2.energy = 3;
        pet2.health = 8;

        //rescuer

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Bob";
        rescuer.budget = 150;

        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "Olivia";
        rescuer1.budget = 250;

        Rescuer rescuer2 = new Rescuer();
        rescuer2.name = "Thomas";
        rescuer2.budget = 550;

        //food

        Food food = new Food();
        food.cost = 10;
        food.name = "Fish";
        food.available = true;

        Food food1 = new Food();
        food1.cost = 16;
        food1.name = "Apple";
        food1.available = true;

        Food food2 = new Food();
        food2.cost = 20;
        food2.name = "Banana";
        food2.available = true;

        //activity

        Activity activity = new Activity();
        activity.name = "Run";

        Activity activity1 = new Activity();
        activity1.name = "Swimm";

        Activity activity2 = new Activity();
        activity2.name = "Nap";

        //docs

        Doctor doctor = new Doctor();
        doctor.name = "Dr. Dolittle";
        doctor.specialization = "Cats";
        doctor.treatmentPrice = 50;
        doctor.available = true;

        Doctor doctor1 = new Doctor();
        doctor1.name = "Dr. Strange";
        doctor1.specialization = "Dogs";
        doctor1.treatmentPrice = 40;
        doctor1.available = false;

        Doctor doctor2 = new Doctor();
        doctor2.name = "Assistant John";
        doctor2.specialization = "Parrots";
        doctor2.treatmentPrice = 0;
        doctor2.available = true;








    }

}
