package com.exp.strategy;

public class PlanAStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("7折");
    }
}
