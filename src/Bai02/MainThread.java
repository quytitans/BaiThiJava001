package Bai02;

import java.util.Scanner;

public class MainThread {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter aString: ");
        String str1 = scanner.nextLine();
        String[] words=str1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
