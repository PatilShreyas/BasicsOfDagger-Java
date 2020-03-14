package life;

import javax.inject.Inject;

public class Shelter {

    public Money mMoney;

    @Inject
    public Shelter(Money money) {
        this.mMoney = money;

        if (mMoney != null) {
            System.out.println("I've my own house to live!");
        } else {
            System.out.println("I don't have my own house yet!");
        }
    }
}
