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
    public static void comparisonSlytherinStudents(Slytherin dracoMalfoy, Slytherin gregoryGoyle){
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Сравнение двух учеников из факульетета Слизерин");
        System.out.println(" ");
        int sumDracoMalfoy = dracoMalfoy.getCunning() + dracoMalfoy.getDetermination() + dracoMalfoy.getAmbition() + dracoMalfoy.getResourcefulness() + dracoMalfoy.getPower();
        int sumGregoryGoyle = gregoryGoyle.getCunning() + gregoryGoyle.getDetermination() + gregoryGoyle.getAmbition() + gregoryGoyle.getResourcefulness() + gregoryGoyle.getPower();
        if (sumDracoMalfoy > sumGregoryGoyle) {
            System.out.println(dracoMalfoy.getName() + " " + " лучший Слизеринец, чем" + " " + gregoryGoyle.getName());
        }else{
            System.out.println(gregoryGoyle.getName() + " " + " лучший Слизеринец, чем" + " " + dracoMalfoy.getName());

        }
        System.out.println(" ");
        System.out.println("--------завершили сравнение из Слизерин-------------");
    }
}
