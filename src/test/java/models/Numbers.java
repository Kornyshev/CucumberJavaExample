package models;

import lombok.Getter;

@Getter
public enum Numbers {

    /*
    Just two values as example
    */
    TWO (2),
    FIVE (5);

    private final int intValue;

    Numbers(int i) {
        this.intValue = i;
    }

}
