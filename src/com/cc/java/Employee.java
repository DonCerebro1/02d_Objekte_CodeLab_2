package com.cc.java;

import java.util.Random;

public class Employee {

    public void getInfo(String flag){
        getName(flag); 
        getEmployeeID();
        getCurrentPosition();
        getYearOfEntry();
        outPut("--------------------------\n");   
        // drawMeAcircle(3,5,2);   
    }
      
   private void getName(String flag){
      drawEmpl();
       String[] name = {"Lukas","Ben","Paul","Tim","David","Amelie","Nina","Fiona","Olivia","Alba"};
       String[] lastName = {"Müller","Schneider","Weber","Hofmann","Wagner","Bauer","Klein","Neumann","Schwarz","Zimmermann"};
       Random rand = new Random();
       
       for(int i = 0; i < 1;i++){
           for(int j = 0; j < 1;j++){
            j = rand.nextInt(10);  
            i = rand.nextInt(10);
                if (flag == "#name") {
                    System.out.println("Name: " + name[i] + " " + lastName[j]);
                }
            }
        }
    }
   
   private void getEmployeeID(){
        Random rand = new Random();
        System.out.println("Mitarbeiter ID: " + rand.nextInt(10000));
    }

    private void getCurrentPosition(){
        String[] position = {"CEO","CTO","COO","Programmierer","Designer"};
        Random rand = new Random();

        for(int i = 0; i < 1; i++){
            i = rand.nextInt(5);
            System.out.println("Aktuelle Position: " + position[i]);
        }
    }

    private void getYearOfEntry(){
        int max = 2021;
        int min = 1990;
        int range = max - min;

        for(int i = 0; i < 1; i++){
            int rand = (int)(Math.random() * range) + min;
            System.out.println("Eintrittsjahr: " + rand);
        }
    }

    private void drawEmpl(){

        outPut("   |||||    ");
        outPut(" .'     '.  ");
        outPut("|  O   O  | ");
        outPut("|    *    | ");
        outPut("|    _    | ");
        outPut(" '.     .'  ");
        outPut("   -...-    \n");
    }

    // not working properly
    private static void drawMeAcircle(int posX, int posY, int radius) {
        for (int i = 0;i <= posX + radius; i++) {
           for (int j = 1;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void outPut(String outStr) {
		System.out.println(outStr);
	}
}


