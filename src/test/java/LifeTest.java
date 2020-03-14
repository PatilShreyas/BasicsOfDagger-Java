import di.DaggerLifeComponent;
import life.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class LifeTest {

    @Test
    public void test_life() {
        Life life = DaggerLifeComponent.create().getLife();

        assertNotNull(life);

        Needs needs = life.mNeeds;
        assertNotNull(needs);
        assertNotNull(needs.mClothes);
        assertNotNull(needs.mFood);
        assertNotNull(needs.mShelter);

        Money money = needs.mClothes.mMoney;
        assertNotNull(money);

        Job job = money.mJob;
        assertNotNull(job);

        Education education = job.mEducation;
        assertNotNull(education);
    }
}
