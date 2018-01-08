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

    private List<DogFood>availableFood= new ArrayList<DogFood>();
    EntertainmentActivity[]availableActivities = new EntertainmentActivity[3];

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
        DogFood animalFood = new DogFood( "milk");
        availableFood.set(0, dogFood);
        availableFood.set(1, animalFood);

    }

public void start() {
        initFood();
        initAvtivities();
}
private void initAvtivities(){
        EntertainmentActivity activity = new EntertainmentActivity("fetching");
        EntertainmentActivity funActivity = new EntertainmentActivity("findTheTreats");
        availableActivities[0] = activity;
        availableActivities[1] = funActivity;


}
}













