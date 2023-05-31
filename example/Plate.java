package org.example;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0){
            this.food = -1 * food;
        } else {
            this.food = food;
        }
    }
     public void putMoreFood(int food){
         if (food < 0){
             this.food += -1 * food;
         } else {
             this.food += food;
         }
     }
}
