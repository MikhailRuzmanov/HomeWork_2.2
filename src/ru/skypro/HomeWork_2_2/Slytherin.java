package ru.skypro.HomeWork_2_2;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String comparisonSlytherinStudents(Slytherin slytherin){

        if ((cunning + determination + ambition + resourcefulness + power) > (slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getPower())) {
            return getName() + " " + " лучший Слизеренец, чем" + " " + slytherin.getName();
        }else{
            return slytherin.getName() + " " + " лучший Слизеренецец, чем" + " " + getName();

        }
    }
}
