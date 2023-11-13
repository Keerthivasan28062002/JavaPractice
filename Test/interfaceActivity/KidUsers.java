package com.interfaceActivity;

import java.util.Objects;

public class KidUsers implements ILibraryUser{
    private int age;
    private String bookType;

    KidUsers(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    public void registerAccount() {
        if(age<12){
            System.out.println("You have successfully registered under a kids account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(Objects.equals(bookType, "Kids")){
            System.out.println("Book issued successfully, return it in 10days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
