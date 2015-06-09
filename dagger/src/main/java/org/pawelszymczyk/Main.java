package org.pawelszymczyk;

import dagger.ObjectGraph;

public class Main {

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new MainModule());
        UserService userService = objectGraph.get(UserService.class);
        userService.addUser("Kazik");
        userService.addUser("Janek");

        userService.findAllUsernames().forEach(System.out::println);
    }
}
