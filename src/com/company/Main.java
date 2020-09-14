package com.company;

public class Main {

    public static void main(String[] args) {

        double[] arr = {1.2, -2.3, 3.1, 1.4, 4.5, -3.7, -5.7, 7.7, -8.5, 10.3, 6.7, -7. - 5, 4.4, 9.8, 6.8};

        int total=0;
        double summa=0;
        boolean knopka = false;

        for (double number1:arr){

            if (number1 < 0) {
                knopka= true;
            }

            if( knopka){
                total++;
                summa+=number1;
            }


        }
        System.out.println(summa/total);

    }
}
