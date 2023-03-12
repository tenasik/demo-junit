package com.example.demojunit;

public class Validator {

    public boolean isAllowedToEnterLiquorStore(int age, boolean inCompanyOfAParent, boolean hasADog, boolean isBlind) {
        if (!isBlind && hasADog) {
            return false;
        }
        if (!inCompanyOfAParent && age < 20) {
            return false;
        }
        return true;
    }
}