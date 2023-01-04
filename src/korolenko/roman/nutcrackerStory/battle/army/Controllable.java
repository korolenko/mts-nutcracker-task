package korolenko.roman.nutcrackerStory.battle.army;

import korolenko.roman.nutcrackerStory.battle.OrderResult;

public interface Controllable {
    OrderResult executeOrder(Orders order);
}
