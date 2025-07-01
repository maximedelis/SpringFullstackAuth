package mxdl.website.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegistrationForm {

    @Size(min = 4, max = 16)
    @Pattern(regexp = "[ -~]*", message = "username must contain printable ascii characters")
    private String username;

    @Size(min = 8, max = 64)
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    @Override
    public String toString() {
        return "Person(Name: " + this.username + ")";
    }
}