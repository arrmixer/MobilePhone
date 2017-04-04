package com.AE;

import java.util.ArrayList;

/**
 * Created by Angel on 11/23/16.
 */
public class Contacts {
    private ArrayList<String> nameAndPhoneNumber;



    public Contacts(ArrayList<String> name) {
        this.nameAndPhoneNumber = name;

    }

    public ArrayList<String> getNameAndPhoneNumber() {
        return nameAndPhoneNumber;
    }
}
