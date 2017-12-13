package org.fasttrackit;

public class Rescuer {
    public String name = "Flaviu";
    private Double money=100.5;

    private String gender;
    private int age;
    private String livingConditions;
    private int petsNumber;

    public void feed(Animal animal, DogFood food){
        DogFood dogFood = new DogFood("purina");
        Animal dog = new Animal();
        System.out.println(name + "gave some"+ dogFood.name + "to" + dog.name );
    }

    public void entertain(Animal animal, EntertainmentActivity entertainmentActivity){
        Animal dog = new Animal();
        EntertainmentActivity entertainmentActivity1 = new EntertainmentActivity("fetching");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }

    public int getPetsNumber() {
        return petsNumber;
    }

    public void setPetsNumber(int petsNumber) {
        this.petsNumber = petsNumber;
    }
}
