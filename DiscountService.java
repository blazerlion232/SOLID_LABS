//DiscountService.java
public class DiscountService{

    public double checkout(double amount, customerType customerType){
      DiscountPolicy policy = DiscountPolicyFactory.getPolicy(customerType);
      double finalPrice = policy.calculate(amount);
      return finalPrice;
    }

}

