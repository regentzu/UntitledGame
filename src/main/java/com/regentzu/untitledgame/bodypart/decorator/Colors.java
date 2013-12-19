package com.regentzu.untitledgame.bodypart.decorator;

/**
 * Created on 12/16/13.
 */
public enum Colors {
    BLUE("blue"),
    BROWN("brown"),
    GREEN("green"),
    INDIGO("indigo"),
    ORANGE("orange"),
    RED("red"),
    YELLOW("yellow"),
    VIOLET("violet");

    protected String description;

    Colors(String colorDescription) {
        this.description = colorDescription;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
