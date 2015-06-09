package org.pawelszymczyk;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(
    injects = { UserService.class },
    library = true
)
public class MainModule {

    @Provides
    @Singleton
    UserService userService() { return new UserService(provideHeater());}

    @Provides
    @Singleton
    UserRepository provideHeater() {
        return new InMemoryUserRepository();
    }
}
