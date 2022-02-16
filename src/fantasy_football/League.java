/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy_football;
import java.util.*;

/**
 *
 * @author EGYPT
 */
public class League {
    private  String LeagueName="Fantasy_Football";
    public Users LeaGue[]=new Users[10];

    public League() {
    }
    

    public League(String LeagueName) {
        this.LeagueName = LeagueName;
    }

    public String getLeagueName() {
        return LeagueName;
    }

//    @Override
//    public int compareTo(Object t) {
//     for (int i=0;i<this.LeaGue.length;i++){
//     for (int j=i+1;j<this.LeaGue.length;j++){
//     if (this.LeaGue[i].After_Captain()>this.LeaGue[j].After_Captain())
//         return 1;
//     else if (this.LeaGue[i].After_Captain()<this.LeaGue[j].After_Captain())
//         return -1;
//     else return 0;
//     }
//     }   
//     return 0;
//    }
    
}
