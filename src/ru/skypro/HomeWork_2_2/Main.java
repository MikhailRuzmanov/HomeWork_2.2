package ru.skypro.HomeWork_2_2;

public class Main {
    public static  void main(String[] args ){
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 40, 86, 12,43, 78);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона","Грейнжер", 65, 55, 88, 96, 89);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 25, 26, 34, 37, 33);


        Hufflepuff zachariahSmith = new Hufflepuff("Захария","Смит",55,87,59,26,45);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 77, 53, 54, 89, 32);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 55, 87, 96, 24, 15);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 42,54,68,7,20,45);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 45,31,68,55,16,33);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 23, 63, 52, 47,12,66);

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 44, 96, 33, 23, 47, 56, 47);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 12,47,25,36,69,58,47);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 23,56,89, 78,45,12,15);

        System.out.println("=====================");
        System.out.println("Домашняя работа №2.2");
        System.out.println("=====================");
        System.out.println(" ");

        System.out.println(harryPotter.toString());
        Gryffindor.comparisonGryffindorStudents(harryPotter, hermioneGranger);
        Hufflepuff.comparisonHufflepuffStudents(zachariahSmith, cedricDiggory);
        Ravenclaw.comparisonRavenclawStudents(zhouChang, padmaPatil);
        Slytherin.comparisonSlytherinStudents(dracoMalfoy, gregoryGoyle);
        Hogwarts.comparingTwoStudents(harryPotter, dracoMalfoy);







    }



}
