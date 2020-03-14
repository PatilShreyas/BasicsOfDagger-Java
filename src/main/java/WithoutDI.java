import life.*;

/**
 * MainNoDI is a class which does not uses Dagger DI Dependency Injection.
 */
public class WithoutDI {
    public static void main(String[] args) {
        Education education = new Education();

        Job job = new Job(education);

        Money money = new Money(job);

        Food food = new Food(money);
        Clothes clothes = new Clothes(money);
        Shelter shelter = new Shelter(money);

        Needs needs = new Needs(food, clothes, shelter);

        Life life = new Life(needs);

        life.enjoy();
    }
}
