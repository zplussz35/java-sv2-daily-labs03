package day03;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int szamtipp;
        int szam= guessTheNumber.getRandomint();
        int i=0;
        System.out.println("Találja ki a számot 1-100 között:");
        do{
            System.out.print((i+1)+". tipp: ");
            szamtipp= sc.nextInt();
            sc.nextLine();
            if(szamtipp<szam){
                System.out.println("Nagyobb ennél!");
            }
            else if(szamtipp> szam){
                System.out.println("Kisebb ennél!");
            }
            else{
                System.out.println("Eltaláltad!");
                System.out.println("Győztél!");
                break;
            }
            i++;
        }while(i<6);
        if(i>=6){
            System.out.println("Sajnos nem sikerült kitalálni.\nA megoldáas: "+szam+" lett volna.");
        }
    }
}
