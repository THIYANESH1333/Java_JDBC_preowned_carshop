package com.thiyaneshcarshop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carshopmanager {
    private List<carshopdetail> carshop;
    private Scanner sc = new Scanner(System.in);
    private int idCounter = 1;

    public carshopmanager() {
        carshop = new ArrayList<>();
    }

    public void add() {
        System.out.println("Number of cars to add:");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Details of car " + (i + 1) + ":");
            carshopdetail shop = new carshopdetail();
            System.out.println("Name of the car:");
            shop.setName(sc.nextLine());
            System.out.println("Location of car:");
            shop.setLocation(sc.nextLine());
            System.out.println("Rating of car");
            shop.setRating(sc.nextDouble());
            sc.nextLine();
            System.out.println("Showroom open time:");
            shop.setOpeningTime(sc.nextLine());
            System.out.println("Showroom close time:");
            shop.setClosingTime(sc.nextLine());
            shop.setId(generateId(shop));
            carshop.add(shop);
        }
        System.out.println("Successfully added");
    }

    private String generateId(carshopdetail shop) {
        return String.format("%s %02d", shop.getName(), idCounter++);
    }

    public void show() {
        if (carshop.isEmpty()) {
            System.out.println("No car in the inventory.");
            return;
        }
        for (int i = 0; i < carshop.size(); i++) {
            System.out.println("Details of car " + (i + 1) + ":");
            System.out.println(carshop.get(i).toString());
        }
    }

    public void remove(String id) {
        carshop.removeIf(shop -> shop.getId().equals(id));
        System.out.println("car with ID " + id + " removed.");
    }

    public void update(String id) {
        for (carshopdetail shop : carshop) {
            if (shop.getId().equals(id)) {
                System.out.println("Updating details for car with ID: " + id);
                System.out.println("New name of car:");
                shop.setName(sc.nextLine());
                System.out.println("New location of car:");
                shop.setLocation(sc.nextLine());
                System.out.println("New rating of car:");
                shop.setRating(sc.nextDouble());
                sc.nextLine(); 
                System.out.println("New open time:");
                shop.setOpeningTime(sc.nextLine());
                System.out.println("New close time:");
                shop.setClosingTime(sc.nextLine());
                return;
            }
        }
        System.out.println("car with ID " + id + " not found.");
    }

    public void search(String id) {
        for (carshopdetail shop : carshop) {
            if (shop.getId().equals(id)) {
                System.out.println("Details of car with ID " + id + ":");
                System.out.println(shop.toString());
                return;
            }
        }
        System.out.println("car with ID " + id + " not found.");
    }
}
