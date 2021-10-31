package day05;

import java.util.Scanner;

public class JournalMain {

    public static void main(String[] args) {
        Journal journal = new Journal();
        Scanner sc = new Scanner((System.in));
        String name;
        do{
            System.out.print("Adja meg a nevet(ENTER->kilépés): ");
            name=sc.nextLine();
            if( name ==""){
                System.out.println("Kilépés...");
                break;
            }
            System.out.println(journal.addStudent(name)?name+" hozzáadva.":name+" nem adható hozzá!");
        }while(true);
        System.out.println("A tanulók: ");
        System.out.println(journal.getNameList());
    }
}
