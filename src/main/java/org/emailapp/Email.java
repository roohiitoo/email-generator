package org.emailapp;

public class Email {
    private String firstName;
    private String lastName
    private String password;
    private int passwordLength=8;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        this.password = randomPassword(passwordLength);
    }


    private String randomPassword(int length){
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char [] password = new char[length];
        for (int i =0; i<length; i++){
            int random = (int)(Math.random() * charSet.length());
            password[i] = charSet.charAt(random)
        }
        return new String(password);

    }

}
