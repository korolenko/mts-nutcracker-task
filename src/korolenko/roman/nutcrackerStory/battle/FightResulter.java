package korolenko.roman.nutcrackerStory.battle;

import korolenko.roman.nutcrackerStory.battle.army.Orders;

public class FightResulter {
    public static OrderResult getResult(String armyUnitName, Orders order){
        if(order == Orders.ATTACK && armyUnitName.equalsIgnoreCase("Polishinel")){
            return OrderResult.UNFADING_GLORY;
        } else if (order == Orders.ATTACK && armyUnitName.equalsIgnoreCase("mouseArtillery")){
            return OrderResult.DISGUSTING_KERNELS;
        } else if (order == Orders.REFUSAL_TO_FIGHT && armyUnitName.equalsIgnoreCase("hussars")){
            return OrderResult.UNABLE_TO_FIGHT;
        } else if(order == Orders.RUSHING_WITH_A_VICTORY_CRY && armyUnitName.equalsIgnoreCase("mouses")){
            return OrderResult.OVERTURN_THE_BENCH;
        } else {
            throw new IllegalArgumentException("Unable to produce result for parameters: "
                    + armyUnitName + " " + order.name());
        }
    }
}
