package day01;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Students student = new Students();
        Scanner sc = new Scanner(System.in);
        int magassag=-1;

        do {
            System.out.print("Adja meg a magasságot(0 esetén kilépés): ");
            magassag=sc.nextInt();
            sc.nextLine();
            if(magassag==0)
                break;
            student.addHeight(magassag);
        }while(true);
        if(student.isHeightsIncreasing()){
            System.out.println("A magasságok növekvőek!");
        }
        else{
            System.out.println("A magasságok NEM növekvőek!");
        }
        System.out.println("A magasságok: ");
        System.out.println(student.getHeights());


    }
}
