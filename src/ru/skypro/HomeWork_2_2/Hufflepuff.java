package ru.skypro.HomeWork_2_2;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String comparisonHufflepuffStudents(Hufflepuff hufflepuff) {

        return (industriousness + loyalty + honesty) > (hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() + hufflepuff.getHonesty()) ?
                getName() + " " + " лучший Гриффиндорец, чем" + " " + hufflepuff.getName() :
                hufflepuff.getName() + " " + " лучший Гриффиндорец, чем" + " " + getName();

    }
}
