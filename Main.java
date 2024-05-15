package Restaurant;

import Restaurant.Database;
import java.util.List;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    static Database database;

    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Restaurant Management system  \n");

        int num;
//		do{
        System.out.println("0.Exit\n1. Login"); //login yaptığımızda ne olduğumuza sistem mi karar veriyor yoksa biz mi seçiyoruz
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
        System.out.print("Enter your password:");
        String password  = scanner.next();

        // Kullanıcıları users.csv dosyasından oku
        List<String[]> users = database.readUsers();
        boolean userFound = false;
        String position = "";

        // Kullanıcıları kontrol et
        for (String[] user : users) {
            if (user[1].trim().equals(ID) && user[4].trim().equals(password)) { // ID ve şifre eşleşirse
                userFound = true;
                position = user[2];
                break;
            }
        }

        // Kullanıcı bulunduysa ilgili pozisyonun menüsünü yazdır
        if (userFound) {
            switch (position.trim()) {
                case "Waiter":
                    System.out.println("Waiter menu:");
                    Waiter waiter = new Waiter(ID, position);
                    waiter.menu(database, waiter);
                    break;
                case "Cashier":
                    System.out.println("Cashier menu:");
                    Cashier cashier = new Cashier(ID, position);
                    cashier.menu(database, cashier);
                    break;
                case "Manager":
                    System.out.println("Manager menu:");
                    Manager manager = new Manager(ID, position);
                    manager.menu(database, manager);
                    break;
                default:
                    System.out.println("Error: Unknown position!");
            }
        } else {
            System.out.println("Error: User not found or wrong password!");
        }
    }



}
