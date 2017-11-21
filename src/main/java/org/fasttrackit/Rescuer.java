package org.fasttrackit;

public class Rescuer {
    private String name;
    private Double money=100.5;

    private String gender;
    private int age;
    private String livingConditions;
    private int petsNumber;

    public Rescuer(double money){
  this.money=money;

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
