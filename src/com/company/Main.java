package com.company;

public class Main {

    public static void main(String[] args) {
        friday(24, 10);
        friday(15, 20);
        friday(46, 12);
        friday(45,28);
        friday(13,34);


    }

    public static String friday(int ageOfperson, int temperature) {

        if ((ageOfperson > 20 && ageOfperson < 45) || (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";

        }
        if ((ageOfperson < 20) || (temperature > 0 && temperature < 28)) {
            System.out.println("Можно идти гулять");
            return "Можно идти гулять";

        }
        if ((ageOfperson > 45) || (temperature > -10 && temperature < 25)) {
            System.out.println("Оставайтесь дома");
            return "Оставайтесь дома";

        } else {
            System.out.println("Оставайтесь дома");
            return "Оставайтесь дома";

        }


    }

}




