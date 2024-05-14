package Restaurant;

import Restaurant.Database;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    static Database database;

    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Restaurant Management system  \n");

        int num;
//		do{
        System.out.println("0. Restaurant.Exit\n1. Login"); //login yaptığımızda ne olduğumuza sistem mi karar veriyor yoksa biz mi seçiyoruz
// bence login ekranı ardından nereye aitsek oraya yönlendirmesi daha mantıklı
        num = scanner.nextInt();

        switch (num) {
            case 0: break;
            case 1: login();break;
            default : System.out.println("Error!");
        }
//		}while(num != 0);
    }

    private static void login(){
        System.out.print("\nEnter your ID:");
        String ID  = scanner.next();
    }
}
