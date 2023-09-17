package ru.skypro.HomeWork_2_2;

public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String comparingTwoStudentsMagic(Hogwarts hogwarts) {

        if (magic > hogwarts.getMagic()) {
            return name + " " + surname + " обладает большей мощностью магии, чем " + hogwarts.getName() + " " + hogwarts.getSurname();
        } else {
            return hogwarts.getName() + " " + hogwarts.getSurname() + " обладает большей мощностью магии, чем " + getName() + " " + getSurname();
        }
    }

    public String comparingTwoStudentsTransgression(Hogwarts hogwarts){
        if (transgression > hogwarts.getTransgression()) {
            return name + " " + surname + " обладает большем расстоянием трансгрессии, чем " + hogwarts.getName() + " " + hogwarts.getSurname();
        } else {
            return hogwarts.getName() + " " + hogwarts.getSurname() + " обладает большем расстоянием трансгрессии, чем " + name + " " + surname;
        }

    }




}
