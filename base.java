public class base {
    public static void main(String[] args){
        
        DiscountService DP = new DiscountService();
        double originalAmount = 100.0;
        customerType currentCustomer = customerType.Premium;
        double finalPrice = DP.checkout(originalAmount, currentCustomer);

        System.out.println("The Cusotmers type is " + currentCustomer + " ,the original price was: £" + originalAmount + " and their savings are: £" + finalPrice + ".");

    }
}
