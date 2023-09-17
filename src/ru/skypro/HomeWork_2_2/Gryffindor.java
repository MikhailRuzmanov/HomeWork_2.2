package ru.skypro.HomeWork_2_2;

public class Gryffindor  extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String comparisonGryffindorStudents(Gryffindor gryffindor){

        return  (nobility + honor + bravery)>(gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery()) ?
                getName() + " " + " лучший Гриффиндорец, чем" + " " + gryffindor.getName():
                gryffindor.getName() + " " + " лучший Гриффиндорец, чем" + " " + getName();
    }

    public String toString(){
        return "Имя студента: " + getName() + ";" + "\n" +  "Фамилия студента: " + getSurname()
                + ";" + "\n" +  "Сила магии: " + getMagic() +  ";" + "\n" +  "Расстояние трансгрессии: " + getTransgression()
                +  ";" + "\n" +  "Благородство: " + getNobility()+  ";" + "\n" +  "Честь: " + getHonor()+  ";" + "\n" +  "Храбрость: " + getBravery() +  ";";

    }
}
