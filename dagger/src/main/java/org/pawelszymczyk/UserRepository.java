package org.pawelszymczyk;

import java.util.List;

public interface UserRepository {
    void save(User user);
    User find(int id);
    List<User> findAll();
}
