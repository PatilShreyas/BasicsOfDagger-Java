package life;

import javax.inject.Inject;

public class Food {

    public Money mMoney;

    @Inject
    public Food(Money money) {
        this.mMoney = money;

        if (mMoney != null) {
            System.out.println("I can eat delicious dishes!");
        } else {
            System.out.println("I even can't eat meal two times a day!");
        }
    }
}
