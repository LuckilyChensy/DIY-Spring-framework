package com.exp.strategy;

public class PlanCStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("9折");
    }
}
