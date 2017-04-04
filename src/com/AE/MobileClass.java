package com.AE;

import java.util.ArrayList;

/**
 * Created by Angel on 11/23/16.
 */
public class MobileClass {

    private ArrayList<String> contactsList = new ArrayList<String>();

    public void addContact(String item) {
        contactsList.add(item);
    }

    public ArrayList<String> getContactsList() {
        return contactsList;
    }

    public void printContactsList(){
        System.out.println("You have " + contactsList.size() + " contacts in your mobile.");
        for (int i = 0;i<contactsList.size(); i++) {
            System.out.println((i + 1) + ". " + contactsList.get(i));
        }

    }

    public void modifyContactItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0){
            modifyContactItem(position, newItem);
        }
    }

    private void modifyContactItem(int position, String newItem){
        contactsList.set(position, newItem);
        System.out.println("Grocery item" + (position + 1) + " has been modified.");
    }

    public void removeContactItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeContactItem(position);
        }
    }

    private void removeContactItem(int position) {
        contactsList.remove(position);
    }

    private int findItem(String searchItem) {
        return contactsList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }

        return false;
    }


}
