/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy_football;

/**
 *
 * @author EGYPT
 */
public abstract class Player {
    private String name ;
    private String club;
    private int Games_Played;
    private int goals;
    private int assists;
    private int cleen_sheets;
    private int Yellow_Cards;
    private int Red_Cards;
    private int OwnGoals;
    protected int Points;

    public Player() {
    }

    public Player(String name, String club) {
        this.name = name;
        this.club = club;
    }

    public Player(int Games_Played, int goals, int assists, int cleen_sheets, int Yellow_Cards, int Red_Cards, int OwnGoals) {
        this.Games_Played = Games_Played;
        this.goals = goals;
        this.assists = assists;
        this.cleen_sheets = cleen_sheets;
        this.Yellow_Cards = Yellow_Cards;
        this.Red_Cards = Red_Cards;
        this.OwnGoals = OwnGoals;
    }

    public Player(String name, String club, int Games_Played, int goals, int assists, int cleen_sheets, int Yellow_Cards, int Red_Cards, int OwnGoals) {
        this.name = name;
        this.club = club;
        this.Games_Played = Games_Played;
        this.goals = goals;
        this.assists = assists;
        this.cleen_sheets = cleen_sheets;
        this.Yellow_Cards = Yellow_Cards;
        this.Red_Cards = Red_Cards;
        this.OwnGoals = OwnGoals;
    }

    public void setGames_Played(int Games_Played) {
        this.Games_Played = Games_Played;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setCleen_sheets(int cleen_sheets) {
        this.cleen_sheets = cleen_sheets;
    }

    public void setYellow_Cards(int Yellow_Cards) {
        this.Yellow_Cards = Yellow_Cards;
    }

    public void setRed_Cards(int Red_Cards) {
        this.Red_Cards = Red_Cards;
    }

    public void setOwnGoals(int OwnGoals) {
        this.OwnGoals = OwnGoals;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public int getGames_Played() {
        return Games_Played;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getCleen_sheets() {
        return cleen_sheets;
    }

    public int getYellow_Cards() {
        return Yellow_Cards;
    }

    public int getRed_Cards() {
        return Red_Cards;
    }

    public int getOwnGoals() {
        return OwnGoals;
    }
    
    public abstract int Calc_Points ();
}
