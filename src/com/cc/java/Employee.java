package com.cc.java;


import java.util.Random;

public class Employee {
    String[] name = {"Lukas","Ben","Paul","Tim","David","Amelie","Nina","Fiona","Olivia","Alba"};
    String[] lastName = {"Müller","Schneider","Weber","Hofmann","Wagner","Bauer","Klein","Neumann","Schwarz","Zimmermann"};
    
    //Generates the Employee with all informations
    public void getInfo(String flag){
        getName(flag); 
        getEmployeeID();
        getCurrentPosition();
        getYearOfEntry();
        outPut("--------------------------\n");   
        // drawMeAcircle(3,5,2);   
    }
      
    //Generates firstname and lastname with an random number and loops those numbers
    private void getName(String flag){
        Random rand = new Random();
       
        for(int i = 0; i < 1;i++){
            for(int j = 0; j < 1;j++){
                j = rand.nextInt(10);  
                i = rand.nextInt(10);
                    if (flag == "#name") {
                        if(i == 0 || i == 1|| i == 2|| i == 3|| i == 4){
                            drawEmpl("#male");
                        }else if(i == 5 || i == 6|| i == 7|| i == 8|| i == 9){
                            drawEmpl("#female");
                        }

                    System.out.println("Name: " + name[i] + " " + lastName[j]);
                    }
            } 
        }   
    }
   
    //Generates a 4 Digit Number
    private void getEmployeeID(){
        Random rand = new Random();
        System.out.println("Mitarbeiter ID: " + rand.nextInt(10000));
    }

    //Generates a Jobtitel with randomnumber
    private void getCurrentPosition(){
        String[] position = {"CEO","CTO","COO","Programmierer","Designer"};
        Random rand = new Random();

        for(int i = 0; i < 1; i++){
            i = rand.nextInt(5);
            System.out.println("Aktuelle Position: " + position[i]);
        }
    }

    //Generates a Year between 1990 and 2021
    private void getYearOfEntry(){
        int max = 2021;
        int min = 1990;
        int range = max - min;

        for(int i = 0; i < 1; i++){
            int rand = (int)(Math.random() * range) + min;
            System.out.println("Eintrittsjahr: " + rand);
        }
    }

    //Draws a female or male face to console
    private void drawEmpl(String gender){
        String[] emplMale ={"   |||||    "," .'     '.  ","|  O   O  | ","|    *    | ","|    _    | "," '.     .'  ","   -...-  "};
        String[] emplFemale = {"     _______    ","   / ||||||| \\  ","  /|  O   O  |\\ "," / |    *    | \\","/  |    _    |  \\","   '.      .'  ","      -...-    "};
		
        for(int i = 0; i < emplMale.length;i++){
            if(gender == "#male"){   
                System.out.println(emplMale[i]);
            }
        }

        for(int j = 0; j < emplFemale.length; j++){
            if(gender == "#female"){
                System.out.println(emplFemale[j]);    
            }      
		}
    }

    //Simple output method
    private static void outPut(String outStr) {
		System.out.println(outStr);
	}

    /***********************************************************************************/
    // not working properly. Supposed to be drawing a circel
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
    /***********************************************************************************/
}


