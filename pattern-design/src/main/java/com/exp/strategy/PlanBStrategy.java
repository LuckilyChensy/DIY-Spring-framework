package com.exp.strategy;

public class PlanBStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("8折");
    }
}
