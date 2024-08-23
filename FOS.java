import java.util.Scanner;

class Ordering {
	
    // For Pizza
    Scanner sc = new Scanner(System.in);
    String pizzaName1 = "Margherita";
    String pizzaName2 = "Cheese N Corn";
    String pizzaName3 = "Fresh Veggie";
    String pizzaName4 = "Farmhouse";
    String pizzaName5 = "Peppy Panner";
    String pizzaName6 = "Mexican Green Wave";
    String pizzaName7 = "7-Cheese";
    double pizza1_price = 99.00;
    double pizza2_price = 229.00;
    double pizza3_price = 229.00;
    double pizza4_price = 279.00;
    double pizza5_price = 279.00;
    double pizza6_price = 329.00;
    double pizza7_price = 329.00;
    int p_quantity;
	String size;
    int selectedPizzaType;

    // For Beverages
    String BName1 = "Pepsi";
    String BName2 = "Coca Cola";
    String BName3 = "7 Up";
    String BName4 = "Mountain Dew";
    String BName5 = "Prime";
    double B1_price = 30.00;
    double B2_price = 30.00;
    double B3_price = 30.00;
    double B4_price = 30.00;
    double B5_price = 60.00;
    int bq;
    int selectedBType;

   

    // For Bill
    double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p; // pizza
    double bg1 = 0, bg2 = 0, bg3 = 0, bg4 = 0, bg5 = 0, bg; // beverages
  
    void pizza() {
        @SuppressWarnings("unused")
        boolean pizza_select = true;
        System.out.println();
        System.out.println("*Results for Pizza*");
        System.out.println("1. " + pizzaName1 + "\t                 " + "Price :" + pizza1_price);
        System.out.println("2. " + pizzaName2 + "\t         " + "Price :" + pizza2_price);
        System.out.println("3. " + pizzaName3 + "\t                 " + "Price :" + pizza3_price);
        System.out.println("4. " + pizzaName4 + "\t                 " + "Price :" + pizza4_price);
        System.out.println("5. " + pizzaName5 + "\t                 " + "Price :" + pizza5_price);      
        System.out.println("6. " + pizzaName6 + "\t         " + "Price :" + pizza6_price);
        System.out.println("7. " + pizzaName7 + "\t                 " + "Price :" + pizza7_price);
        System.out.println();
		
        System.out.println("For Medium extra 100rs");
        System.out.println("For Large extra 200rs");
		
		 System.out.println();
        System.out.println("8. Go To Home Page");
        System.out.println();
        System.out.print("Which Pizza Do You Want To Buy : ");
        int p_no = sc.nextInt();

        switch (p_no) {
            case 1: {
				
				System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 1;
                break;
            }
            case 2: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 2;
                break;
            }
            case 3: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 3;
                break;
            }
            case 4: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 4;
                break;
            }
            case 5: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 5;
                break;
            }
            case 6: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 6;
                break;
            }
            case 7: {
               System.out.print("Pizza Quantity = ");
                p_quantity = sc.nextInt();
				System.out.print("Pizza Size = ");
				size = sc.next();
				sc.nextLine();
                selectedPizzaType = 7;
                break;
            }
            case 8: {
                System.out.println("\n" + "*WELCOME TO HOME PAGE*" + "\n");
                pizza_select = false;
                break;
            }
            default: {
                System.out.println("*Enter Appropriate Pizza Choice*");
                pizza();
                break;
            }
        }

        if (p_no >= 1 && 7 >= p_no) {
            System.out.println("ARE YOU SURE?");
            System.out.println(" Enter 1(OK) Or Enter 2(Cancel)");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println("Your Choice has been confirmed.");
            }
            if (check == 2) {
                pizza();
            } else if (check != 1 && check != 2) {
                System.out.println("*Please Confirm your Choice*");
                pizza();
            }
        }
    }

    void selectedpizza() {
        int i = selectedPizzaType;
		
		String x="small";
	    String y="medium";
    	String z="large";
	
        if (i == 1) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName1);
		   
		   if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza1_price + " INR");
            p1 =  p_quantity *pizza1_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza1_price) + (100*p_quantity)) + " INR");
            p1 =  p_quantity *pizza1_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza1_price) + (200*p_quantity)) + " INR");
            p1 =  p_quantity *pizza1_price + 200*p_quantity;
		   }
		   
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 2) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName2);
           
            if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza2_price + " INR");
            p2 =  p_quantity *pizza2_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza2_price) + (100*p_quantity)) + " INR");
            p2 =  p_quantity *pizza2_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza2_price) + (200*p_quantity)) + " INR");
            p2 =  p_quantity *pizza2_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 3) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName3);
          
             if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza3_price + " INR");
            p3 =  p_quantity *pizza3_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza3_price) + (100*p_quantity)) + " INR");
            p3 =  p_quantity *pizza3_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza3_price) + (200*p_quantity)) + " INR");
            p3 =  p_quantity *pizza3_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 4) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName4);
          
             if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza4_price + " INR");
            p4 =  p_quantity *pizza4_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza4_price) + (100*p_quantity)) + " INR");
            p4 =  p_quantity *pizza4_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza4_price) + (200*p_quantity)) + " INR");
            p4 =  p_quantity *pizza4_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 5) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName5);
        
             if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza5_price + " INR");
            p5 =  p_quantity *pizza5_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza5_price) + (100*p_quantity)) + " INR");
            p5 =  p_quantity *pizza5_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza5_price) + (200*p_quantity)) + " INR");
            p5 =  p_quantity *pizza5_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 6) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName6);
          
             if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza6_price + " INR");
            p6 =  p_quantity *pizza6_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza6_price) + (100*p_quantity)) + " INR");
            p6 =  p_quantity *pizza6_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza6_price) + (200*p_quantity)) + " INR");
            p6 =  p_quantity *pizza6_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 7) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + pizzaName7);
          
             if(size.equalsIgnoreCase(x))
		   {
            System.out.println("Price: " +  p_quantity *pizza7_price + " INR");
            p7 =  p_quantity *pizza7_price;
		   }
		    if(size.equalsIgnoreCase(y))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza7_price) + (100*p_quantity)) + " INR");
            p7 =  p_quantity *pizza7_price + 100*p_quantity;
		   }
		    if(size.equalsIgnoreCase(z))
		   {
            System.out.println("Price: " +  ((p_quantity *pizza7_price) + (200*p_quantity)) + " INR");
            p7 =  p_quantity *pizza7_price + 200*p_quantity;
		   }
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
    }

    void beverages() {
        @SuppressWarnings("unused")
        boolean beverages_select = true;

        System.out.println();
        System.out.println("*Results for Beverages");
       
        System.out.println("1. " + BName1 + "\t    " + "Price :" + B1_price);
        System.out.println("2. " + BName2 + "\t    " + "Price :" + B2_price);
        System.out.println("3. " + BName3 + "\t            " + "Price :" + B3_price);
        System.out.println("4. " + BName4 + "\t    " + "Price :" + B4_price);
        System.out.println("5. " + BName5 + "\t    " + "Price :" + B5_price);
        System.out.println();
        System.out.println("6. Go To Home Page");
        System.out.println();
        System.out.print("Which Beverages Do You Want To Buy : ");
        int beverages_no = sc.nextInt();

        switch (beverages_no) {
            case 1: {
                System.out.print("Beverage Quantity = ");
                bq = sc.nextInt();
                selectedBType = 1;
                break;
            }
            case 2: {
               System.out.print("Beverage Quantity = ");
                bq = sc.nextInt();
                selectedBType = 2;
                break;
            }
            case 3: {
               System.out.print("Beverage Quantity = ");
                bq = sc.nextInt();
                selectedBType = 3;
                break;
            }
            case 4: {
                System.out.print("Beverage Quantity = ");
                bq = sc.nextInt();
                selectedBType = 4;
                break;
            }
            case 5: {
               System.out.print("Beverage Quantity = ");
                bq = sc.nextInt();
                selectedBType = 5;
                break;
            }
            case 6: {
                beverages_select = false;
                break;
            }
            default: {
                System.out.println("Enter Appropriate Beverage Choice");
                break;
            }
        }
        if (beverages_no == 6) {
            System.out.println("*WELCOME TO HOME PAGE*");
        }
        if (beverages_no >= 1 && 5 >= beverages_no) {
            System.out.println("Plese Enter 1(OK) Or Enter 2(Cancel)");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println("Your Choice has been confirmed.");
            }
            if (check == 2) {
                beverages();
            } else if (check != 1 && check != 2) {
                System.out.println("*Please Confirm your Choice*");
                beverages();
            }
        }
    }

    void selectedBeverages() {
        int i = selectedBType;
        if (i == 1) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + BName1);
          
            System.out.println("Price: " + bq*B1_price + " INR");
            bg1 = bq*B1_price;
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 2) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + BName2);
           
            System.out.println("Price: " + bq*B2_price + " INR");
            bg2 = bq*B2_price;
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 3) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + BName3);
           
            System.out.println("Price: " + bq*B3_price + " INR");
            bg3 = bq*B3_price;
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 4) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + BName4);
            
            System.out.println("Price: " + bq*B4_price + " INR");
            bg4 = bq*B4_price;
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
        if (i == 5) {
            System.out.println();
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println("You have selected: " + BName5);
           
            System.out.println("Price: " + bq*B5_price + " INR");
            bg5 = bq*B5_price;
            System.out.println("--------x--------x--------x--------x---------x---------x");
            System.out.println();
        }
    }

    void billing() {
        System.out.println("                ~~~~~BILL~~~~~");
        System.out.println();
        System.out.println();
        p = p1 + p2 + p3 + p4 + p5 + p6 + p7;
        bg = bg1 + bg2 + bg3 + bg4 + bg5;
		String c1="DIWALI";
		String c2="JANMASTHAMI";
		String c3="15AUG";
		String coupon;
		boolean z=true;
		boolean z1=true;
		boolean z2=true;
		boolean z3=true;
		double totalBill = p + bg ;
		
		System.out.println("Coupons Available");
		System.out.println();
		System.out.println("1. DIWALI");
		System.out.println("   100Rs. off on orders above 499");
		System.out.println();
		System.out.println("2. JANMASTHAMI");
		System.out.println("   50Rs. off on orders above 299");
		System.out.println();
		System.out.println("3. 15AUG");
		System.out.println("   up to 50% off");
		System.out.println();
		do
		{
		System.out.println("Enter 1 for coupon");
		System.out.println("Enter 2 for forward");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1 : 
			z2 = false;
			System.out.println("Enter coupon code : ");
		    coupon = sc.next();
            System.out.println();
			
		if(totalBill>499)
		{
		 if (coupon.equalsIgnoreCase(c1))
		 {
			 System.out.println("Total Bill Generated : " + (totalBill-100));
             System.out.println();
             System.out.println();
			 z=false;
		 }
		}

		if(totalBill>299)
		{
		 if (coupon.equalsIgnoreCase(c2))
		 {
			 System.out.println("Total Bill Generated : " + (totalBill-50));
             System.out.println();
             System.out.println();
			  z=false;
		 }
		}

		if(totalBill>399)
		{
		 if (coupon.equalsIgnoreCase(c3))
		 {
			 System.out.println("Total Bill Generated : " + (totalBill - (totalBill/10)));
             System.out.println();
             System.out.println();
			  z=false;
		 }
		}
        
		if(z)
		{
			System.out.println("Total Bill Generated : " + totalBill);
             System.out.println("*coupon not applied");
             System.out.println();
             System.out.println();
		}
		break;
		
		case 2 : 
		if(z2)
		{
			System.out.println("Total Bill Generated : " + totalBill);
             System.out.println();
             System.out.println();
			 z1 = false;
		}
		if(z3)
		{
		z1 = false;	
		}
		break;
		}
		}
		while(z1);
       

        if (totalBill > 1) {
            System.out.println("                ~~PAYMENT~~ ");

            System.out.println("1. Online (Credit/Debit Card , Net Banking , UPI)");
            System.out.println("2. COD (If Total Bill is Less Than 1000.0 INR)");
            System.out.print("Choose Payment Method : ");
            int payment = sc.nextInt();
            @SuppressWarnings("unused")
            String address;
            boolean payment_method = true;
            while (payment_method) {
                switch (payment) {
                    case 1: {
                        System.out.print("Enter Amount To Pay : ");
                        double online_payment = sc.nextDouble();
                        if (online_payment == totalBill) {
                            System.out.println();
                            System.out.println("        PAYMENT SUCESSFULL");
                            System.out.println();
                            System.out.print("Enter Address : ");
                            sc.nextLine();
                            address = sc.nextLine();
                            System.out.println();
                            System.out.println("Your Furniture Will Delivered Within 50 - 70 Minutes");
                            System.out.println("=====THANK YOU=====");
                            System.out.println();
                            System.out.println();
                            payment_method = false;
                            break;
                        } else {
                            System.out.println("*Entered Amount Does Not Match Bill Generated Amount*");
                            billing();
                            payment_method = false;
                            break;
                        }
                    }
                    case 2: {
                        if (totalBill <= 1000) {
                            System.out.print("Enter Address : ");
                            sc.nextLine();
                            address = sc.nextLine();
                            System.out.println();
                            System.out.println("Your Order Will Delivered Within 50 - 70 Minutes");
                            System.out.println("=====THANK YOU=====");
                            System.out.println();
                            System.out.println();
                            payment_method = false;
                            break;
                        } else {
                            System.out.println("*As Your Total Bill Is Above 1000 INR You Have To Pay Online*");
                            System.out.println();
                            billing();
                            payment_method = false;
                            break;
                        }
                    }
                    default: {
                        System.out.println("*Please Enter Valid Payment Method*");
                        System.out.println();
                        System.out.println();
                        billing();
                        payment_method = false;
                        break;
                    }
                }
            }
        }
    }
}

public class FOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=====WELCOME TO OUR PIZZA SHOP=====");
        System.out.println();
        System.out.println("=====HERE YOU GET THE BEST PIZZAS======");
        System.out.println();
        System.out.println();
        System.out.println("Our shop sells :-");

        Ordering obj = new Ordering();

        boolean exit = true;

        while (exit) {

            System.out.println("1. PIZZA");
            System.out.println("2. BEVERAGES");
            System.out.println("3. PROCEED FOR BILLING");
            System.out.println("4. TO EXIT ");
            System.out.println("Which item would you want to buy ? ");
            System.out.print("Enter item number you want to search for : ");
            int item_no = sc.nextInt();
            System.out.println();

            switch (item_no) {
                case 1: {
                    obj.pizza();
                    obj.selectedpizza();
                    break;
                }
                case 2: {
                    obj.beverages();
                    obj.selectedBeverages();
                    break;
                }
               
                case 3: {
                    obj.billing();
                    break;
                }
                case 4: {
                    System.out.println("==THANK YOU FOR VISITING OUR STORE==");
                    System.out.println();
                    System.out.println("       ==HAVE A NICE DAY==");

                    exit = false;
                    break;
                }
                default: {
                    System.out.println("*Please Enter Appropriate Item Number*");
                    System.out.println();
                    System.out.println();
                    break;
                }
                
            }
            sc.close();
        }
    }
}
