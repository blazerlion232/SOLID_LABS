public class PremiumDiscountPolicy implements DiscountPolicy {
    
    public double calculate(double amount){
        if(amount > 1000){    
            return 0.2 * amount;
        }else{
            return 0.1 * amount;
        }
    }
}
