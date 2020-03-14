package life;

import javax.inject.Inject;

public class Clothes {

    public Money mMoney;

    @Inject
    public Clothes(Money money) {
        this.mMoney = money;

        if (mMoney != null) {
            System.out.println("I've Clothes to wear!");
        } else {
            System.out.println("I don't have enough clothes to wear!");
        }
    }
}
