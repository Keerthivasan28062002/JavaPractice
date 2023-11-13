package com.interfaceActivity;

import java.util.Objects;

public class AdultUsers implements ILibraryUser{
    private int age;
    private String bookType;

    AdultUsers(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    public void registerAccount() {
        if(age>12){
            System.out.println("You have successfully registered under a Adult account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(Objects.equals(bookType, "Fiction")){
            System.out.println("Book issued successfully, return it in 7days");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult books");
        }
    }


}
