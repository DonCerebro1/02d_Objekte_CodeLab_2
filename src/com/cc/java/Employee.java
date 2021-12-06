package com.cc.java;


import java.util.Random;

public class Employee {
    String[] name = {"Lukas","Ben","Paul","Tim","David","Amelie","Nina","Fiona","Olivia","Alba"};
    String[] lastName = {"Müller","Schneider","Weber","Hofmann","Wagner","Bauer","Klein","Neumann","Schwarz","Zimmermann"};
    String[] month = {"Januar","Feburar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
    
    //Generates the Employee with all informations
    public void getInfo(String flag){
        getName(flag); 
        getEmployeeID();
        getCurrentPosition();
        getYearOfEntry();
        getBirthday();
        outPut("--------------------------\n");   
        // drawMeAcircle(3,5,2);   
    }

    //Generates Birthday-Date
    private void getBirthday(){
        Random rand = new Random();
        int maxYear = 2003;
        int minYear = 1950;
        int range = maxYear - minYear;
        int day = rand.nextInt(31) + 1;
        int year = (int)(Math.random() * range) + minYear;

        for(int i = 0; i < 1; i++){
            i = rand.nextInt(12);
            System.out.println("Geburtstag: " + day + "." + month[i] + " " + year );
        }
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
        String[] division = {"IT-Abteilung","Design-Abteilung","Geschäftsleitung"};
        Random rand = new Random();

        for(int i = 0; i < 1; i++){
            i = rand.nextInt(5);
                if(i == 0 || i == 1 || i == 2){
                    System.out.println("Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[2]);
                }else if(i == 3){
                    System.out.println("Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[0]);
                }else if(i == 4){
                    System.out.println("Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[1]);
                }
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

}


