import java.util.Scanner;
//Creates NPC Object
class NPC {
    public String sex;
    public String race;
    public String age;
    public String oc;
    public NPC(){}
    public NPC(String sex, String race, String age, String oc){
        this.sex = sex;    //Gender
        this.race = race;  //D&D race elf, tiefling, human, etc.
        this.age = age;    //Age
        this.oc = oc;      //Occupation
    }
    public void printDetails(){
        System.out.println("Sex: " + sex);
        System.out.println("Race: " + race);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + oc);
    }
}

public class Main {
    public static void main(String[] args) {
        //Creates scanner sc to read input
        Scanner sc= new Scanner(System.in);
        NPC npc = new NPC();
        //Starting Text
        System.out.println("Welcome to my D&D NPC generator. Below are your options for what type of generation you want to use. There will be certain city options which have a higher chance of generating a group of races over others.");
        System.out.println("1. Completely Random");

        //Defines String
        String word = " ";
        //Gets number option for which generator the user will use
        System.out.print("Type the number option you would like to use: ");
        word = sc.next();
        //Runs if user selects Completely Random
        //It's not random yet LOL
        if (word.equals("1")) {
            System.out.println("Running Completely Random");
            npc = new NPC("Male","Human","18-24","Bard");
            npc.printDetails();
        }
    }
}