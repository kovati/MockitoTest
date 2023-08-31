package org.example;

public class User {

    private String id;
    private String passwordHash;
    private boolean enabled;

    public User(String id, String passwordHash, boolean enabled) {
        this.id = id;
        this.passwordHash = passwordHash;
        this.enabled = enabled;
    }

    public String getId() {
        return this.id;
    }
    public boolean isEnabled() {
        return this.enabled;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }
    // ...
}
