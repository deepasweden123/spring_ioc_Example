package se.lexicon.model;

import java.util.Objects;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class AppUser {
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String address;

    public AppUser() {
    }

    public AppUser(String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(userId, appUser.userId) &&
                Objects.equals(name, appUser.name) &&
                Objects.equals(email, appUser.email) &&
                Objects.equals(password, appUser.password) &&
                Objects.equals(address, appUser.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, email, password, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppUser{");
        sb.append("userId=").append(userId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
