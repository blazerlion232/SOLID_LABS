public class DiscountPolicyFactory{
        public static DiscountPolicy getPolicy(customerType type){
            switch(type){
                case Regular:
                    return new RegularDiscountPolicy();
                case Premium:
                    return new PremiumDiscountPolicy();
                case Guest:
                    return new GuestDiscountPolicy();
                case Student:
                    return new StudentDiscountPolicy();
                default:
                    throw new IllegalArgumentException("Invalid value");
            }
        }
    }