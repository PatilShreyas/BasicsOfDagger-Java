package life;

import javax.inject.Inject;

public class Job {

    public Education mEducation;

    @Inject
    public Job(Education education) {
        this.mEducation = education;

        if (mEducation != null) {
            System.out.println("I've Job!");
        } else {
            System.out.println("I'm not well educated!");
        }
    }
}
