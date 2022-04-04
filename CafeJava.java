public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        double fullOrder;
        double overPaid;
        
        // Menu items
        double mochaPrice = 6.5;
        int dripCoffeePrice = 3;
        int lattePrice = 5;
        double cappuccinoPrice = 7.5;
    
    
        // Customer name
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
    if(isReadyOrder2 == true){
        System.out.println(customer2 + readyMessage);
    }
        fullOrder = lattePrice + lattePrice;
        System.out.println(fullOrder);

        boolean isReadyOrder3 = true;
        overPaid = lattePrice - dripCoffeePrice;

            System.out.println(displayTotalMessage + overPaid);

        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION
        // 1
        System.out.println(generalGreeting + customer1 + pendingMessage);
        // 2
        System.out.println(generalGreeting + customer4 + pendingMessage + displayTotalMessage + cappuccinoPrice);
        // 3
        // System.out.println(generalGreeting + customer2 + pendingMessage + isReadyMessage2);
        // 4
        // System.out.println(customer3 + readyMessage3);
    }
}
