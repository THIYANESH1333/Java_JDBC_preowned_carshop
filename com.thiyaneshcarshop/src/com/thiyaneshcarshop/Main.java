package com.thiyaneshcarshop;
import java.util.*;
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventory inventory = new inventory();
        cars cs=new cars();
int choice;
do {
System.out.println("1. Add");
System.out.println("2. Update");
System.out.println("3. Remove");
System.out.println("4. Search by ID");
System.out.println("5. Show");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
scanner.nextLine();
switch (choice) {
case 1:	
/*System.out.print("Enter id : ");
int id = scanner.nextInt();
System.out.print("Enter brand : ");
String brand = scanner.nextLine();
scanner.nextLine(); 
System.out.print("Enter name: ");
String name1 = scanner.nextLine();
System.out.print("Enter price: ");
int price = scanner.nextInt();
scanner.nextLine(); 
System.out.print("Enter milage: ");
int milage = scanner.nextInt();
scanner.nextLine(); 
cars newProduct = new cars();
inventory.addProduct(newProduct);
System.out.println("Product added successfully.");
break;
*/
	System.out.print("Enter brand : ");
	cs.setBrand(scanner.nextLine());
	scanner.nextLine(); 
	System.out.print("Enter name: ");
	cs.setName1(scanner.nextLine());
	System.out.print("Enter price: ");
	cs.setPrice(scanner.nextInt());
	scanner.nextLine(); 
	System.out.print("Enter milage: ");
	cs.setMilage(scanner.nextInt());
	scanner.nextLine(); 
	inventory.addProduct(cs);
	break;
case 2:
/*System.out.print("Enter product to update (0-" + (inventory.getProducts().size() - 1) + "): ");
int indexToUpdate = scanner.nextInt();
scanner.nextLine(); 
if (indexToUpdate>= 0 &&indexToUpdate<inventory.getProducts().size()) {
System.out.print("Enter new product name: ");
                        String updatedProductName = scanner.nextLine();
System.out.print("Enter new product price: ");
double updatedPrice = scanner.nextDouble();
scanner.nextLine(); 
cars updatedProduct = new cars();
inventory.updateProduct(indexToUpdate, updatedProduct);
System.out.println("Product updated successfully.");
                    } 
else {
System.out.println("Invalid index. No product updated.");
                    }
break;*/
System.out.println("Enter ID to Update the product");
int caridupdate=scanner.nextInt();
cs.setId(caridupdate);
System.out.println("Enter the records to update");
scanner.nextLine(); 
System.out.print("Enter name: ");
cs.setName1(scanner.nextLine());
System.out.print("Enter price: ");
cs.setPrice(scanner.nextInt());
scanner.nextLine();
inventory.updateProduct(cs);
break;

case 3:
/*System.out.print("Enter product to remove (0-" + (inventory.getProducts().size() - 1) + "): ");
int indexToRemove = scanner.nextInt();
scanner.nextLine();
inventory.removeProduct(indexToRemove);
break;*/
System.out.println("Enter ID to Update the product");
int cariddelete=scanner.nextInt();
inventory.removeProduct(cariddelete);
break;	
case 4:
System.out.print("Enter product ID to search: ");
int searchId = scanner.nextInt();
scanner.nextLine();
cars foundProduct = (cars) inventory.getBrand();
if (foundProduct != null) {
System.out.println("Product found:");
System.out.println(foundProduct);
                    } else
                    {
System.out.println("Product not found.");
                    }
break;
case 5:
System.out.println("All products in inventory:");
inventory.showAllProducts();
break;
case 6:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
scanner.close();
    }
}

