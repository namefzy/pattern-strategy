package com.gupao.edu.strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
    public static void main(String[] args) {
        PromotionActivity activity1111 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(""));
    }
}
