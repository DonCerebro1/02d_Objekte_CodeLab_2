package com.cc.java;


import java.util.Random;

public class Employee {
    String[] name = {"Lukas","Ben","Paul","Tim","David","Amelie","Nina","Fiona","Olivia","Alba"};
    String[] lastName = {"Müller","Schneider","Weber","Hofmann","Wagner","Bauer","Klein","Neumann","Schwarz","Zimmermann"};
    String[] month = {"Januar","Feburar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
    String[] position = {"CEO","CTO","COO","Programmierer","Designer"};
    String[] division = {"IT-Abteilung","Design-Abteilung","Geschäftsleitung"};
    
    //gets whole Information 
    public void getInfo(String flag){
        getEmployee(flag);
        getJobId();
        outPut("--------------------------\n");   
          
    }

    //Generates employees with first names, last names and Birthdays
    private void getEmployee(String flag){
        Random rand = new Random();
        int maxYear = 2003;
        int minYear = 1950;
        int range = maxYear - minYear;
        int day = rand.nextInt(31) + 1;
        int year = (int)(Math.random() * range) + minYear;
       
        for(int i = 0; i < 1;i++){
            for(int j = 0; j < 1;j++){
                for(int k = 0; k < 1; k++){
                j = rand.nextInt(10);  
                i = rand.nextInt(10);
                k = rand.nextInt(12);
                    if (flag == "#name") {
                        if(i == 0 || i == 1|| i == 2|| i == 3|| i == 4){
                            drawEmpl("#male");
                        }else if(i == 5 || i == 6|| i == 7|| i == 8|| i == 9){
                            drawEmpl("#female");
                        }

                    System.out.println("Name: " + name[i] + " " + lastName[j]);
                    System.out.println("Geburtstag: " + day + "." + month[k] + " " + year );
                    }
                } 
            }
        }   
    }

    //Generates ID Number, Year of entry as well as Job titel and Job division
    private void getJobId(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        int max = 2021;
        int min = 1990;
        int range = max - min;

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 1;j++){
                int entryYear = (int)(Math.random() * range) + min;
            
            i = rand.nextInt(5);
                if(i == 0 || i == 1 || i == 2){
                    System.out.println("Mitarbeiter ID: " + id + "\n" + "Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[2] + "\n" + "Eintrittsjahr: " + entryYear);
                }else if(i == 3){
                    System.out.println("Mitarbeiter ID: " + id + "\n" + "Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[0] + "\n" + "Eintrittsjahr: " + entryYear);
                }else if(i == 4){
                    System.out.println("Mitarbeiter ID: " + id + "\n" + "Aktuelle Position: " + position[i] + "\n" + "Abteilung: " + division[1] + "\n" + "Eintrittsjahr: " + entryYear);
                }
            }
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


