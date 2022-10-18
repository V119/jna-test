package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

public interface JnaLibrary extends Library {
    JnaLibrary INSTANCE = Native.load("JnaTest", JnaLibrary.class);
    int max(int a, int b);

    void printUser(User user);

    void printUserRef(User user);

    @Structure.FieldOrder({"name", "height", "weight"})
    public static class User extends Structure {
        public String name;
        public int height;
        public double weight;

        public User(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public static class UserValue extends User implements Structure.ByValue {
            public UserValue(String name, int height, double weight) {
                super(name, height, weight);
            }
        }

        public static class UserRef extends User implements Structure.ByReference {
            public UserRef(String name, int height, double weight) {
                super(name, height, weight);
            }
        }
    }
}
