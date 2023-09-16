package ru.skypro.HomeWork_2_2;

import java.sql.SQLOutput;

public class Hogwarts {
    private String name;
    private  String surname;
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

    public static void comparingTwoStudents(Gryffindor harryPotter, Slytherin dracoMalfoy){
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Сравнение двух учеников из разных факульетов по магии и расстоянию трасгресии");
        System.out.println(" ");

        if (harryPotter.getMagic() > dracoMalfoy.getMagic()){
            System.out.println(harryPotter.getName() + " " + harryPotter.getSurname() + " обладает большей мощностью магии, чем " + dracoMalfoy.getName() + " " + dracoMalfoy.getSurname() );
        }else{
            System.out.println(dracoMalfoy.getName() + " " + dracoMalfoy.getSurname()  + " обладает большей мощностью магии, чем " + harryPotter.getName() + " " + harryPotter.getSurname() );
        }
        if (harryPotter.getTransgression() > dracoMalfoy.getTransgression()){
            System.out.println(harryPotter.getName() + " " + harryPotter.getSurname() + " обладает большем расстоянием трансгрессии, чем " + dracoMalfoy.getName() + " " + dracoMalfoy.getSurname() );
        }else{
            System.out.println(dracoMalfoy.getName() + " " + dracoMalfoy.getSurname()  + " обладает большем расстоянием трансгрессии, чем " + harryPotter.getName() + " " + harryPotter.getSurname() );
        }
        System.out.println(" ");
        System.out.println("-------- завершили сравнение ------------");


    }




}
