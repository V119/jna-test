package org.example;

public class App2 {
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        JnaLibrary.User.UserValue user1 = new JnaLibrary.User.UserValue("user1", 101, 230.2131);
        JnaLibrary.INSTANCE.printUser(user1);
        JnaLibrary.INSTANCE.printUserRef(user1);

        System.out.println("user ref");
        JnaLibrary.User.UserRef user2 = new JnaLibrary.User.UserRef("user2", 101, 230.2131);
        JnaLibrary.INSTANCE.printUser(user2);
        JnaLibrary.INSTANCE.printUserRef(user2);
    }
}
