package org.example;

public class Cat implements PetDoings{
    private String name;
    private int appetite;

    private boolean fed = false;
    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite < 0) {
            this.appetite = -1 * appetite;
        } else {
            this.appetite = appetite;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public void eat(Plate plate) {
        if (plate.getFood() > this.appetite) {
            System.out.println(this.name + " съедает " + this.appetite + " единиц еды");
            plate.setFood(plate.getFood() - this.appetite);
            this.fed = true;
        }
        else {
            System.out.println("Еды не хватает, " + name + " остаётся голодным!");
        }
    }
}