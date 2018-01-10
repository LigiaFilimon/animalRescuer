package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Rescuer rescuer = new Rescuer();
    Dog dog = new Dog();
    DogFood dogFood = new DogFood("Purina");
    Vet vet = new Vet();
    Cat cat = new Cat();
    Animal animal;
    String name;

    private List<DogFood> availableFood = new ArrayList<DogFood>();
    EntertainmentActivity[] availableActivities = new EntertainmentActivity[3];

    public List<DogFood> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<DogFood> availableFood) {
        this.availableFood = availableFood;
    }

    public EntertainmentActivity[] getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(EntertainmentActivity[] availableActivities) {
        this.availableActivities = availableActivities;
    }

    private void initFood() {
        DogFood dogFood = new DogFood("Purina");
        DogFood animalFood = new DogFood("milk");
        availableFood.set(0, dogFood);
        availableFood.set(1, animalFood);
        availableFood.add(new DogFood("Purina"));
        availableFood.add(new DogFood("milk"));
    }
    private void initActivities() {
        EntertainmentActivity activity = new EntertainmentActivity("fetching");
        EntertainmentActivity funActivity = new EntertainmentActivity("findTheTreats");
        availableActivities[0] = activity;
        availableActivities[1] = funActivity;


    }
    public void start() {
        initFood();
        initActivities();

        for (DogFood dogFood : availableFood) {
            if (dogFood != null) {
                System.out.println(dogFood.getType());
            }
        }
    for (EntertainmentActivity entertainmentActivity : availableActivities) {
            if (availableActivities != null) {
                System.out.println(entertainmentActivity.name);
            }
    }


    }




}















