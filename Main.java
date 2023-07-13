/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<OrderManagmentSystem> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Menu");
            System.out.println("2. Display orders");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                int arr[]={60,60,80,70,60,90,100};
                String name[]={"Momos     ","Burger     ","Noodle    ","Spring roll","French Fries","Fried Rice","Thali       "};
                while(true){
                    System.out.println("     item                       price");
                    System.out.println("1.   momos                      60");
                    System.out.println("2.   Burger                     60");
                    System.out.println("3.   noodle                     80");
                    System.out.println("4.   Spring roll                70");
                    System.out.println("5.   French Fries               60");
                    System.out.println("6.   Fried Rice                 90");
                    System.out.println("7.   Thali                      100");
                    System.out.print("Enter item no: ");
                    int itemNo= scanner.nextInt();
                    if(itemNo<=0 || itemNo>7){
                        System.out.println("Wrong Choice! Try again\n");
                        continue;
                    }
                    String itemName=name[itemNo-1];
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    int price = arr[itemNo-1];

                    OrderManagmentSystem order = new OrderManagmentSystem(itemName, quantity, price);

                    orders.add(order);
                    System.out.println("Want to order more(Y/N)?: ");
                    char in=scanner.next().charAt(0);
                    if(in=='N' || in=='n'){
                        System.out.println("Order placed successfully!");
                        break;
                    }
                }
                    break;

       case 2:
        if (orders.isEmpty()) {
              System.out.println("No orders found!");
           } else {
              System.out.println("Orders:");
              System.out.println("Item Name\t\t\t\tQuantity\tPrice\tTotal Price");
              int total=0;
              for (OrderManagmentSystem o : orders) {
                            total+=o.getTotalPrice();
                            System.out.println(o.getItemName()+"\t\t\t\t"+o.getQuantity()+"\t\t"+o.getPrice()+"\t"+o.getTotalPrice());
                        }
                        System.out.println("\nTotal amount :"+total);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using our system!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
