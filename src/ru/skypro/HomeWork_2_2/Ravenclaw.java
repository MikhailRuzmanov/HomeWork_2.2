package ru.skypro.HomeWork_2_2;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public static void comparisonRavenclawStudents(Ravenclaw zhouChang, Ravenclaw padmaPatil){
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Сравнение двух учеников из факульетета Когтевран");
        System.out.println(" ");
        int sumZhouChang = zhouChang.getIntelligence() + zhouChang.getWisdom() + zhouChang.getWit() + zhouChang.getCreativity();
        int sumPadmaPatil = padmaPatil.getIntelligence() + padmaPatil.getWisdom() + padmaPatil.getWit() + padmaPatil.getCreativity();
        if (sumZhouChang > sumPadmaPatil) {
            System.out.println(zhouChang.getName() + " " + " лучший Когтевранец, чем" + " " + padmaPatil.getName());
        }else{
            System.out.println(padmaPatil.getName() + " " + " лучший Когтевранец, чем" + " " + zhouChang.getName());

        }
        System.out.println(" ");
        System.out.println("--------завершили сравнение из Когтевран-------------");
    }
}
