package com.alkaraawy;

public class Main {

    public static void main(String[] args) {

        for (int i=5;i>=1;i--){

            for (int j=1; j<=i; j++) {

                  System.out.print(j);


            }

            System.out.println( );


        }


        System.out.println( "*----------------------------------------------------");

        int y=1;
        for (int i=1;i<=5;i++){

            for (int j=1; j<=i; j++) {

                System.out.print(j);


            }
            y++;
            System.out.println( );


        }


    }
}
