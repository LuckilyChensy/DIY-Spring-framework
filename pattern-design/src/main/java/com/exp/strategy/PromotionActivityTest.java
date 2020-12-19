package com.exp.strategy;

import org.junit.platform.commons.util.StringUtils;

public class PromotionActivityTest {

    public static void main(String[] args) {

        PromotionActivity promotionStrategy = null;

        String promotionKey = "A";

        if(promotionKey.equals("A")){
            promotionStrategy = new PromotionActivity(new PlanAStrategy());
        }else if(promotionKey.equals("B")){
            promotionStrategy = new PromotionActivity(new PlanBStrategy());
        }

        promotionStrategy.execute();
    }
}
