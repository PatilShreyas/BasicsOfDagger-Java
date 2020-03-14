package life;

import javax.inject.Inject;

public class Life {

    public Needs mNeeds;

    @Inject
    public Life(Needs needs) {
        this.mNeeds = needs;
    }

    public void enjoy() {
        if (mNeeds.fulfilled()) {
            System.out.println("I'm enjoying my life! :)");
        } else {
            System.out.println("I can't enjoy my life :(");
        }
    }
}
