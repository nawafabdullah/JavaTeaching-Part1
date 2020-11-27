import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        DisplayAll();
    }

    
    public static String[] DisplayMenu() {
        System.out.println("========== Hadeel's resturant ==========");
        System.out.println("Please make a selection...");
        String[] menu = { "", "Pizza", "Burger", "IceCream", "Sushi", "Fries" };
        for (int i = 0; i < menu.length; i++) {
            if (i == 0) {
            } else {
                System.out.println(i + "." + menu[i]);
            }
        }
        return menu;
    }

    public static String[] GetUserOrders() {
        Scanner sizeScanner = new Scanner(System.in);
        Scanner orderScanner = new Scanner(System.in);
        int orderNum;
        int iOrders = 0;
        String[] menu = DisplayMenu();

        System.out.println("How many Orders Do you want to place?");
        int size = sizeScanner.nextInt();
        String[] orders = new String[size];
        System.out.println("Please enter the numner of each of your " + size + " orders .. \n Press 0 to exit anytime");

        do {
            orderNum = orderScanner.nextInt();
            if (orderNum == 1) {
                orders[iOrders] = menu[orderNum];
            } else if (orderNum == 2) {
                orders[iOrders] = menu[orderNum];
            } else if (orderNum == 3) {
                orders[iOrders] = menu[orderNum];
            } else if (orderNum == 4) {
                orders[iOrders] = menu[orderNum];
            } else if (orderNum == 5) {
                orders[iOrders] = menu[orderNum];
            }

            System.out.println("You Ordered: " + orders[iOrders]);
            iOrders++;
            if (iOrders < size) {
                System.out.println("Please Proceed with the next order");
            }
        } while (orderNum != 0 && iOrders < size);
        return orders;
    }

    public static String GetUserAddress() {
        Scanner addressScanner = new Scanner(System.in);
        System.out.println("Please write your address: ");
        String address = addressScanner.nextLine();
        return address;
    }

    public static void DisplayAll () {
        String[] orders = GetUserOrders();
        String address = GetUserAddress();
        System.out.println("============= Recipt =============");
        System.out.println("Your order contains the following...");
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }        
        System.out.println("Your address is: " + address);
        System.out.println("=============== End ===============");

    }
}