import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n  ______                __   ____          _             ");
        System.out.println(" |  ____|              / _| / __ \\        | |            ");
        System.out.println(" | |__ ___   ___  ___ | |_ | |  | |_ __ __| |_ __ _ _ __ ");
        System.out.println(" |  __/ _ \\ / _ \\/ __||  _|| |  | | '__/ _` | '__| | '_ \\");
        System.out.println(" | | | (_) | (_) \\__ \\| |  | |__| | | | (_| | |  | | | |");
        System.out.println(" |_|  \\___/ \\___/|___/|_|   \\____/|_|  \\__,_|_|  |_| |_|");
        System.out.println("                   S Y S T E M                   \n");

        System.out.print("  loading");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(400);
            System.out.print(".");
        }
        System.out.println("\n");

        boolean runProgram = true;

        while(runProgram) {
            double total = 0;
            String receipt = "";
            boolean continueOrdering = true;
            int storeChoice = 0;

            while(continueOrdering) {
                System.out.println("\n==============================================");
                System.out.println("          FOOD ORDERING SYSTEM          ");
                System.out.println("==============================================");
                System.out.println(" Choose a Store:");
                System.out.println(" [1] Jollibee");
                System.out.println(" [2] Chowking");
                System.out.println(" [3] Greenwich");
                System.out.println(" [4] Starbucks");
                System.out.println(" [5] Checkout");
                System.out.print(" Enter your choice: ");

                if(!sc.hasNextInt()) {
                    System.out.println(" >>> Invalid input! Please enter a number.");
                    sc.next(); 
                    continue;
                }
                storeChoice = sc.nextInt();
                
                if(storeChoice == 5){
                    break; 
                }   

                int itemChoice = 0;
                int qty = 0;
                String itemName = "";
                double itemPrice = 0;
                boolean validStore = true;

                switch(storeChoice) {
                    case 1:
                        System.out.println("\n----------------------------------------------");
                        System.out.println("  JOLLIBEE MENU");
                        System.out.println("----------------------------------------------");
                        System.out.println("  [1] 1-pc Chickenjoy       - P82");
                        System.out.println("  [2] 1-pc Burger Steak     - P60");
                        System.out.println("  [3] Jolly Spaghetti       - P60");
                        System.out.println("  [4] Chocolate Sundae      - P54");
                        System.out.println("  [5] Jolly Crispy Fries    - P55");   
                        System.out.println("  [6] Back to Stores");
                        System.out.println("----------------------------------------------");
                        System.out.print("  Enter your choice: ");

                        if(!sc.hasNextInt()) { System.out.println(">>> Invalid input!"); sc.next(); continue; }
                        itemChoice = sc.nextInt();
                        if(itemChoice == 6) continue;
                        if(itemChoice < 1 || itemChoice > 5) { System.out.println(">>> Invalid Choice."); continue; }
                        
                        if(itemChoice == 1) { itemName = "1-pc Chickenjoy"; itemPrice = 82; }
                        else if(itemChoice == 2) { itemName = "1-pc Burger Steak"; itemPrice = 60; }
                        else if(itemChoice == 3) { itemName = "Jolly Spaghetti"; itemPrice = 60; }
                        else if(itemChoice == 4) { itemName = "Chocolate Sundae"; itemPrice = 54; }
                        else if(itemChoice == 5) { itemName = "Jolly Crispy Fries"; itemPrice = 55; }
                        break;

                    case 2:
                        System.out.println("\n----------------------------------------------");
                        System.out.println("  CHOWKING MENU");
                        System.out.println("----------------------------------------------");
                        System.out.println("  [1] 1-pc Chicken Lauriat  - P129");
                        System.out.println("  [2] Beef Chao Fan         - P115");
                        System.out.println("  [3] Sweet & Sour Pork     - P135");
                        System.out.println("  [4] Siomai (4 pcs)        - P65");
                        System.out.println("  [5] Halo-Halo Supreme     - P75 ");
                        System.out.println("  [6] Back to Stores");
                        System.out.println("----------------------------------------------");
                        System.out.print("  Enter your choice: ");

                        if(!sc.hasNextInt()) { System.out.println(">>> Invalid input!"); sc.next(); continue; }
                        itemChoice = sc.nextInt();
                        if(itemChoice == 6) continue;
                        if(itemChoice < 1 || itemChoice > 5) { System.out.println(">>> Invalid Choice."); continue; }
                        
                        if(itemChoice == 1) { itemName = "1-pc Chicken Lauriat"; itemPrice = 129; }
                        else if(itemChoice == 2) { itemName = "Beef Chao Fan"; itemPrice = 115; }
                        else if(itemChoice == 3) { itemName = "Sweet & Sour Pork"; itemPrice = 135; }
                        else if(itemChoice == 4) { itemName = "Siomai (4 pcs)"; itemPrice = 65; }
                        else if(itemChoice == 5) { itemName = "Halo-Halo Supreme"; itemPrice = 75; }
                        break;

                    case 3:
                        System.out.println("\n----------------------------------------------");
                        System.out.println("  GREENWICH MENU");
                        System.out.println("----------------------------------------------");
                        System.out.println("  [1] Hawaiian Overload     - P399");
                        System.out.println("  [2] Carbonara             - P149");
                        System.out.println("  [3] Lasagna               - P159");
                        System.out.println("  [4] Chicken Wings         - P199");
                        System.out.println("  [5] Garlic Bread          - P79");
                        System.out.println("  [6] Back to Stores");
                        System.out.println("----------------------------------------------");
                        System.out.print("  Enter your choice: ");

                        if(!sc.hasNextInt()) { System.out.println(">>> Invalid input!"); sc.next(); continue; }
                        itemChoice = sc.nextInt();
                        if(itemChoice == 6) continue;
                        if(itemChoice < 1 || itemChoice > 5) { System.out.println(">>> Invalid Choice."); continue; }
                        
                        if(itemChoice == 1) { itemName = "Hawaiian Overload Pizza"; itemPrice = 399; }
                        else if(itemChoice == 2) { itemName = "Carbonara"; itemPrice = 149; }
                        else if(itemChoice == 3) { itemName = "Lasagna"; itemPrice = 159; }
                        else if(itemChoice == 4) { itemName = "Chicken Wings"; itemPrice = 199; }
                        else if(itemChoice == 5) { itemName = "Garlic Bread"; itemPrice = 79; }
                        break; 
                    
                    case 4:
                        System.out.println("\n----------------------------------------------");
                        System.out.println("  STARBUCKS MENU");
                        System.out.println("----------------------------------------------");
                        System.out.println("  [1] Caffe Latte           - P170");
                        System.out.println("  [2] Caramel Macchiato     - P195");
                        System.out.println("  [3] Java Chip Frappuccino - P185");
                        System.out.println("  [4] Iced Americano        - P150");
                        System.out.println("  [5] Butter Croissant      - P95");
                        System.out.println("  [6] Back to Stores");
                        System.out.println("----------------------------------------------");
                        System.out.print("  Enter your choice: ");

                        if(!sc.hasNextInt()) { System.out.println(">>> Invalid input!"); sc.next(); continue; }
                        itemChoice = sc.nextInt();
                        if(itemChoice == 6) continue;
                        if(itemChoice < 1 || itemChoice > 5) { System.out.println(">>> Invalid Choice."); continue; }
                        
                        if(itemChoice <= 4) {
                            System.out.println("\n  Choose Size:");
                            System.out.println("  [1] Tall");
                            System.out.println("  [2] Grande (+P20)");
                            System.out.println("  [3] Venti (+P40)");
                            System.out.print("  Enter size choice: ");

                            if(!sc.hasNextInt()) { System.out.println(">>> Invalid input!"); sc.next(); continue; }
                            int sizeChoice = sc.nextInt();
                            double sizeAdd = 0;
                            String sizeName = "Tall";
                            if(sizeChoice == 2) { sizeAdd = 20; sizeName = "Grande"; }
                            else if(sizeChoice == 3) { sizeAdd = 40; sizeName = "Venti"; }
                            else if(sizeChoice != 1) { System.out.println(">>> Invalid size. Defaulting to Tall."); }

                            if(itemChoice == 1) { itemName = "Caffe Latte (" + sizeName + ")"; itemPrice = 170 + sizeAdd; }
                            else if(itemChoice == 2) { itemName = "Caramel Macchiato (" + sizeName + ")"; itemPrice = 195 + sizeAdd; }
                            else if(itemChoice == 3) { itemName = "Java Chip Frappuccino (" + sizeName + ")"; itemPrice = 185 + sizeAdd; }
                            else if(itemChoice == 4) { itemName = "Iced Americano (" + sizeName + ")"; itemPrice = 150 + sizeAdd; }
                        } else {
                            itemName = "Butter Croissant";
                            itemPrice = 95;
                        }
                        break;

                    default:
                        System.out.println(">>> Invalid store choice. Try again.");
                        validStore = false;
                        break;
                }

                if(!validStore) continue;
                
                boolean validQty = false;
                while(!validQty) {
                    System.out.print("\n  Enter quantity: ");
                    if(sc.hasNextInt()) {
                        qty = sc.nextInt();
                        if(qty > 0) {
                            validQty = true;
                        } else {
                            System.out.println(">>> Quantity must be greater than 0.");
                        }
                    } else {
                        System.out.println(">>> Invalid input. Please enter a valid number.");
                        sc.next(); 
                    }
                }

                double subtotal = itemPrice * qty;
                total += subtotal;
                receipt += String.format("  %-25s x%d   - P%.2f\n", itemName, qty, subtotal);  
                
                System.out.println("----------------------------------------------");
                System.out.printf("  Added: %s x%d - P%.2f\n", itemName, qty, subtotal);   
                System.out.printf("  Current Total: P%.2f\n", total);
                System.out.println("----------------------------------------------");

                boolean validAnswer = false;
                String orderMore = "";
                while(!validAnswer) {
                    System.out.print("\n  Do you want to order more? (Y/N): ");
                    orderMore = sc.next();
                    if(orderMore.equalsIgnoreCase("Y") || orderMore.equalsIgnoreCase("N")) {
                        validAnswer = true;
                    } else {
                        System.out.println(">>> Invalid input. Please enter Y or N.");
                    }
                }

                if(orderMore.equalsIgnoreCase("N")) {
                    continueOrdering = false;
                }
            }

            if (total == 0) {
                System.out.println("\n>>> Your cart is empty. Returning to store menu...");
                continue; 
            }

            System.out.println("\n  Processing order");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(400);
                System.out.print(".");
            }
            System.out.println("\n");

            System.out.println("==============================================");
            System.out.println("            OFFICIAL RECEIPT            ");
            System.out.println("==============================================");
            System.out.print(receipt);
            System.out.println("----------------------------------------------");
            
            if(total >= 1000) {
                double discount = total * 0.10;
                total -= discount;
                System.out.printf("  Subtotal:              P%.2f\n", total + discount);
                System.out.printf("  Discount (10%%):        -P%.2f\n", discount);
            }
            System.out.printf("  TOTAL:                 P%.2f\n", total);
            System.out.println("----------------------------------------------");
            
            double payment = 0;
            boolean validPayment = false;
            while(!validPayment) {
                System.out.print("  Enter payment: P ");
                if(sc.hasNextDouble()) {
                    payment = sc.nextDouble();
                    if(payment >= total) {
                        validPayment = true;
                    } else {
                        System.out.printf(">>> Insufficient payment. Please enter P%.2f or more.\n", total);
                    }
                } else {
                    System.out.println(">>> Invalid input! Please enter a valid amount.");
                    sc.next();
                }
            }
            
            System.out.printf("  Change:                P%.2f\n", (payment - total));
            System.out.println("==============================================");
            System.out.println("  Thank you for your order! Have a great day!");
            System.out.println("==============================================");
            
            System.out.print("\n  Do you want to place another order? (Y/N): ");
            String anotherOrder = sc.next();
            if(!anotherOrder.equalsIgnoreCase("Y")) {
                System.out.println("\n  Goodbye! Thank you for using the system.");
                runProgram = false;
            }
        }
    }
}