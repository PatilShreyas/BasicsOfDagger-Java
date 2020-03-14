package life;

import javax.inject.Inject;

public class Needs {

    public Food mFood;
    public Clothes mClothes;
    public Shelter mShelter;

    @Inject
    public Needs(Food food, Clothes clothes, Shelter shelter) {
        this.mFood = food;
        this.mClothes = clothes;
        this.mShelter = shelter;
    }

    public boolean fulfilled() {
        return mFood != null && mClothes != null && mShelter != null && mFood.mMoney != null;
    }
}
