package com.faisal;

public class Client extends UserAcount{
    String names;
    String phone;
    String email;

    public Client(String names, String phone, String email, String userPassword) {
        super(userPassword);
        this.names = names;
        this.phone = phone;
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
