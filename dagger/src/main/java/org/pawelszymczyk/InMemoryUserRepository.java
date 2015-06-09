package org.pawelszymczyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> users = new HashMap<String, User>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User find(int id) {
        return users.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<User>(users.values());
    }
}
