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

    public static void comparisonHufflepuffStudents(Hufflepuff zachariahSmith, Hufflepuff cedricDiggory){
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Сравнение двух учеников из факульетета Пуффендуй");
        System.out.println(" ");
        int sumZachariahSmith = zachariahSmith.getIndustriousness() + zachariahSmith.getLoyalty() + zachariahSmith.getHonesty();
        int sumCedricDiggory = cedricDiggory.getIndustriousness() + cedricDiggory.getLoyalty() + cedricDiggory.getHonesty();
        if (sumZachariahSmith > sumCedricDiggory) {
            System.out.println(zachariahSmith.getName() + " " + " лучший Пуффендуец, чем" + " " + cedricDiggory.getName());
        }else{
            System.out.println(cedricDiggory.getName() + " " + " лучший Пуффендуец, чем" + " " + zachariahSmith.getName());

        }
        System.out.println(" ");
        System.out.println("--------завершили сравнение из Пуффендуй-------------");
    }
}
