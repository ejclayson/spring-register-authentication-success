package com.tesda.bankwebapp.models;

public class RegistrationDTO {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String password;

    public RegistrationDTO() {
        super();
    }

    public RegistrationDTO(String username, String firstname, String lastname, String email, String mobile,
            String password) {
        super();
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;

    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;

    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;

    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public String toString() {
        return "Registration info: username: " + this.username + " password: " + this.password;
    }

}
