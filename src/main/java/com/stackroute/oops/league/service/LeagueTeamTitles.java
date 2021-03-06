package com.stackroute.oops.league.service;

/**
 * Enum to store the four team titles
 * Contains one field description and a parameterized constructor to initialize it
 * Modify this code by adding description to each enum constants
 */
public enum LeagueTeamTitles {
    HIPHOP("Hiphop"), WIN2WIN("Win2Win"), HAPPYFEET("Happy Feet"), LUCKYSTRIKE("Lucky Strike");
    private String title;
    LeagueTeamTitles (String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
}
