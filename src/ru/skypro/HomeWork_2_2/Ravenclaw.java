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
    public String comparisonRavenclawStudents(Ravenclaw ravenclaw){
        return (intelligence + wisdom + wit+creativity) > (ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity()) ?
                getName() + " " + " лучший Гриффиндорец, чем" + " " + ravenclaw.getName() :
                ravenclaw.getName() + " " + " лучший Гриффиндорец, чем" + " " + getName();
    }
}
