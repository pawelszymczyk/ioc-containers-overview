package org.pawelszymczyk;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name) {
        User user = new User(UUID.randomUUID().toString(), name);

        userRepository.save(user);
    }

    public List<String> findAllUsernames() {
        return userRepository.findAll().stream().map(u -> u.getName()).collect(Collectors.toList());
    }
}
