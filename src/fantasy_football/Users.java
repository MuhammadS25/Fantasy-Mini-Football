/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy_football ;
import Home.*;
/**
 *
 * @author EGYPT
 */
public class Users implements Comparable{
    private String Username;
    private String Password;
    public Player Players[]=new Player[11];
    private int Total_Points;
    

    public Users() {
        this.Username="New User";
        this.Password="00";
    }

    public Users(String Username) {
        this.Username = Username;
    }

    public Users(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPlayers(Player[] Players) {
        this.Players = Players;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public Player[] getPlayers() {
        return Players;
    }
    public int getTotal_Points(){
        if (this.Total_Points>0)
          return this.Total_Points;
    for(int i=0;i<11;i++){
    this.Total_Points+=this.Players[i].Calc_Points();
    }
    return this.Total_Points;
    } 
    public int After_Captain(){    
    int sum=0;
    sum=this.Total_Points+this.Players[Integer.parseInt(Login_Form_s.Captain)].Calc_Points();
    //this.Total_Points+=this.Players[Integer.parseInt(Login_Form_s.Captain)].Calc_Points();
    return sum;
    } 
    public Player Top_Player(){
    int temp=0;
    int count=0;
    for (int i=0;i<11;i++){
        count=0;
    for (int j=i+1;j<11;j++){
    if (this.Players[i].Calc_Points()<this.Players[j].Calc_Points()){
        count++;
        break;
    }
    }
    if (count==0){
        temp=i;
        break;
    }
    }
    return this.Players[temp];
    }
    
    public boolean CheckTeam(){
    int CountTeam=0;
    int strikers=0;
    int midfiekders=0;
    int defenders=0;
    int goalkeeper=0;
    for (int i=0;i<11;i++){
        CountTeam=1;
        if (this.Players[i] instanceof GoalKeepers)
            goalkeeper++;
        else if(this.Players[i] instanceof Defenders)
            defenders++;
        else if(this.Players[i] instanceof MidFielders)
            midfiekders++;
        else if(this.Players[i] instanceof Strikers)
            strikers++;
        for(int j=i+1;j<11;j++){
            
        if((this.Players[i].getName()).equals(this.Players[j].getName())){
        return true;
        }
        if((this.Players[i].getClub()).equals(this.Players[j].getClub())){
        CountTeam++;
        if (CountTeam>3)
            return true;
        }
        
        }
        
        }
    
    if (goalkeeper!=1)
        return true;
    else if (defenders<3||defenders>5)
        return true;
    else if (midfiekders<3||midfiekders>5)
        return true;
    else if (strikers==0||strikers>3)
        return true;
    else
    return false;
    }

    @Override
    public int compareTo(Object t) {
        Users other=(Users)t;
        if (this.After_Captain()>other.After_Captain())
            return 1;
        else if (this.After_Captain()<other.After_Captain())
            return -1;
        else 
            return 0;
    }
    
    
}
