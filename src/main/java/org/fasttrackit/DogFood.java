package org.fasttrackit;

public class DogFood extends PetShop {
    public String name = "Purina";




    public DogFood(String name ){
        this.name= name;

    }




    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public int getAgeSelection() {
        return ageSelection;
    }

    public void setAgeSelection(int ageSelection) {
        this.ageSelection = ageSelection;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getStature() {
        return stature;
    }

    public void setStature(String stature) {
        this.stature = stature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }
}