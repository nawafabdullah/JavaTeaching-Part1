import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        /*
         * String[] menu = new String[5]; menu[0] = "pizza"; menu[1] = "Burger"; menu[2]
         * = "IceCream"; menu[3] = "Sushi"; menu[4] = "Fries";
         */
        int orderNum;
        int iOrders = 0;
        Boolean Terminator = true;
        String [] orders = new String[30];

        System.out.println("========== Hadeel's resturant ==========");
        System.out.println("Please make a selection...");
        String[] menu = { "", "Pizza", "Burger", "IceCream", "Sushi", "Fries" };

        for (int i = 0; i < menu.length; i++) {
            if (i == 0) {
            } else {
                System.out.println(i + "." + menu[i]);
            }
        }

        do {
            orderNum = GetUserInput();
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
          iOrders++;
          System.out.print ("IOrders = " + iOrders);
        } while (orderNum != 0);

        System.out.println ("The user has ordered the following..."); 
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

        /*
         * Scanner keyboard = new Scanner(System.in);
         * System.out.println("Enter your adress: "); String adress
         * =keyboard.nextLine(); System.out.println("your order: " + menu [order-1] +
         * " will be deliverd to the adress: " + adress);
         * 
         */
    }

    public static int GetUserInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the num of you order/s .. \n Press 0 when done");
        int order = input.nextInt();
        return order;
    }

}

