package korolenko.roman.nutcrackerStory.buttle;

import korolenko.roman.nutcrackerStory.buttle.army.Orders;

public class FightResulter {
    public static OrderResult getResult(String forceName, Orders order){
        if(order == Orders.ATTACK && forceName.equalsIgnoreCase("Polishinel")){
            return OrderResult.UNFADING_GLORY;
        } else if (order == Orders.ATTACK && forceName.equalsIgnoreCase("mouseArtillery")){
            return OrderResult.DISGUSTING_KERNELS;
        } else if (order == Orders.REFUSAL_TO_FIGHT && forceName.equalsIgnoreCase("hussars")){
            return OrderResult.UNABLE_TO_FIGHT;
        } else if(order == Orders.RUSHING_WITH_A_VICTORY_CRY && forceName.equalsIgnoreCase("mouses")){
            return OrderResult.OVERTURN_THE_BENCH;
        }
        return null;
    }
}
