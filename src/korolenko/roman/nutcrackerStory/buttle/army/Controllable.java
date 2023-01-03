package korolenko.roman.nutcrackerStory.buttle.army;

import korolenko.roman.nutcrackerStory.buttle.OrderResult;

public interface Controllable {
    OrderResult executeOrder(Orders order);
}
