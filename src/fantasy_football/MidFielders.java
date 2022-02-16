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
public class MidFielders extends Player {
    

    public MidFielders() {
        this.Points=0;
    }

    public MidFielders(String name, String club) {
        super(name, club);
    }
    

    public MidFielders(int Games_Played, int goals, int assists, int cleen_sheets, int Yellow_Cards, int Red_Cards, int OwnGoals) {
        super(Games_Played, goals, assists, cleen_sheets, Yellow_Cards, Red_Cards, OwnGoals);
    }

    public MidFielders(String name, String club, int Games_Played, int goals, int assists, int cleen_sheets, int Yellow_Cards, int Red_Cards, int OwnGoals) {
        super(name, club, Games_Played, goals, assists, cleen_sheets, Yellow_Cards, Red_Cards, OwnGoals);
    }
    

    @Override
    public int Calc_Points() {
        if(this.Points>0)
            return this.Points;
        
       this.Points+=this.getGames_Played()*2;
       this.Points+=this.getGoals()*4;
       this.Points+=this.getAssists()*3;
       this.Points+=this.getCleen_sheets()*2;
       this.Points-=this.getYellow_Cards();
       this.Points-=this.getRed_Cards()*3;
       this.Points-=this.getOwnGoals()*2;
       return this.Points;
    }

    public int getPoints() {
        return Points;
    }
    
    
}
