package di;

import dagger.Component;
import life.Life;

import javax.inject.Singleton;

@Singleton
@Component
public interface LifeComponent {
    Life getLife();
}
