package life;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Money {

    public Job mJob;

    @Inject
    public Money(Job job) {
        this.mJob = job;

        if (mJob != null) {
            System.out.println("I've Money!");
        } else {
            System.out.println("I'm not working yet!");
        }
    }
}
