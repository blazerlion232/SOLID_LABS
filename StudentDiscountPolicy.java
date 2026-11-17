public class StudentDiscountPolicy implements DiscountPolicy{
    public double calculate(double amount){
        if(amount > 1000){
            return 0.1 * amount;
        }else{
            return 0.05 * amount;
        }
    }   
}
