package day02;

import java.util.Scanner;

public class Mathematics {
    private boolean isPrime(int number){
        int i = 2;
        if(number<2){
            return false;
        }
        else if (number==2||number==3){
            return true;
        }
        else{
            while(i<=number/2){
                if(number%i==0){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mathematics mat = new Mathematics();
        Scanner sc = new Scanner(System.in);
        int szam;
        do{
            System.out.print("Adjon meg egy pozitív egész számot(-1->kilépés): ");
            szam= sc.nextInt();
            sc.nextLine();
            if (szam==-1){
                System.out.println("Program kilép...");
                break;
            }
            if(mat.isPrime(szam)){
                System.out.println("Prím!");
            }
            else{
                System.out.println("NEM prím!");
            }
        }while(true);
    }
}
