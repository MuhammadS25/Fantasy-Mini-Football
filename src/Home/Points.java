package Home;

import static Home.Login_Form_s.*;
import javax.swing.ImageIcon;
import fantasy_football.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Islam
 */
public class Points extends javax.swing.JFrame {

    /**
     * Creates new form Points
     */
    public Points() {
        initComponents();
    }
    
    String user1points;
    String user1average;
    Points(String User1points, String User1average) {
        initComponents();
        this.user1points = User1points;
        this.user1average = User1average;
        if (League1.LeaGue[2].Players[0] instanceof GoalKeepers){
        jLabel4.setText(String.valueOf(League1.LeaGue[2].After_Captain()));
        jLabel2.setText(String.valueOf(user1average));
        }
        else {
        for(int i=0;i<2;i++){
        if ((i==0)&&(bool==true)){    
        jLabel4.setText(String.valueOf(League1.LeaGue[i].After_Captain()));
        jLabel2.setText(String.valueOf(user1average));
        }
        else if ((i==1)&&(bool==false)){    
        jLabel4.setText(String.valueOf(League1.LeaGue[i].After_Captain()));
        jLabel2.setText(String.valueOf(user1average));
        }
        }
        }
        //clubs pic
        if (User2.Players[0] instanceof GoalKeepers)
        {
                for(int i=0;i<11;i++)
          {
              if(User2.Players[0].getClub().equals("Barcelona"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\Fantasy\\clubs\\Barcelona.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
                 
               
              }
              else if(User2.Players[0].getClub().equals("Real Madrid"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }else if(User2.Players[0].getClub().equals("Liverpool"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("Juventus"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("Bayern Munchen"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("PSG"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("Man City"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("Atletico"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              else if(User2.Players[0].getClub().equals("Chelsea"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField1.setText(User2.Players[0].getName());
                  jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()));
               
              }
              if(User2.Players[1].getClub().equals("Barcelona"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Real Madrid"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }else if(User2.Players[1].getClub().equals("Liverpool"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Juventus"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Bayern Munchen"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("PSG"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Man City"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Atletico"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              else if(User2.Players[1].getClub().equals("Chelsea"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField2.setText(User2.Players[1].getName());
                  jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()));
               
              }
              if(User2.Players[2].getClub().equals("Barcelona"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Real Madrid"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }else if(User2.Players[2].getClub().equals("Liverpool"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Juventus"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Bayern Munchen"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("PSG"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Man City"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Atletico"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(User2.Players[2].getClub().equals("Chelsea"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField3.setText(User2.Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
               if(User2.Players[3].getClub().equals("Barcelona"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Real Madrid"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }else if(User2.Players[3].getClub().equals("Liverpool"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Juventus"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Bayern Munchen"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("PSG"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Man City"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Atletico"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              else if(User2.Players[3].getClub().equals("Chelsea"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField4.setText(User2.Players[3].getName());
                  jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()));
               
              }
              if(User2.Players[4].getClub().equals("Barcelona"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Real Madrid"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }else if(User2.Players[4].getClub().equals("Liverpool"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Juventus"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Bayern Munchen"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("PSG"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Man City"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Atletico"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
              else if(User2.Players[4].getClub().equals("Chelsea"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField5.setText(User2.Players[4].getName());
                  jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()));
               
              }
               if(User2.Players[5].getClub().equals("Barcelona"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Real Madrid"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }else if(User2.Players[5].getClub().equals("Liverpool"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Juventus"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Bayern Munchen"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("PSG"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Man City"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Atletico"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
              else if(User2.Players[5].getClub().equals("Chelsea"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField8.setText(User2.Players[5].getName());
                  jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()));
               
              }
               if(User2.Players[6].getClub().equals("Barcelona"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Real Madrid"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }else if(User2.Players[6].getClub().equals("Liverpool"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Juventus"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Bayern Munchen"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("PSG"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Man City"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Atletico"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
              else if(User2.Players[6].getClub().equals("Chelsea"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField6.setText(User2.Players[6].getName());
                  jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()));
               
              }
               if(User2.Players[7].getClub().equals("Barcelona"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Real Madrid"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }else if(User2.Players[7].getClub().equals("Liverpool"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Juventus"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Bayern Munchen"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("PSG"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Man City"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Atletico"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
              else if(User2.Players[7].getClub().equals("Chelsea"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField7.setText(User2.Players[7].getName());
                  jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()));
               
              }
               if(User2.Players[8].getClub().equals("Barcelona"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Real Madrid"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }else if(User2.Players[8].getClub().equals("Liverpool"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Juventus"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Bayern Munchen"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("PSG"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Man City"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Atletico"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
              else if(User2.Players[8].getClub().equals("Chelsea"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField9.setText(User2.Players[8].getName());
                  jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()));
               
              }
               if(User2.Players[9].getClub().equals("Barcelona"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Real Madrid"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }else if(User2.Players[9].getClub().equals("Liverpool"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Juventus"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Bayern Munchen"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("PSG"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Man City"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Atletico"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
              else if(User2.Players[9].getClub().equals("Chelsea"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField11.setText(User2.Players[9].getName());
                  jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()));
               
              }
               if(User2.Players[10].getClub().equals("Barcelona"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Real Madrid"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }else if(User2.Players[10].getClub().equals("Liverpool"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Juventus"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Bayern Munchen"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("PSG"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Man City"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Atletico"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              else if(User2.Players[10].getClub().equals("Chelsea"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField10.setText(User2.Players[10].getName());
                  jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()));
               
              }
              
              
          }
        }
        else 
        {
            for (int j=0;j<2;j++){
                if ((bool)||((!bool)&&(j==1))){
                for(int i=0;i<11;i++)
          {
              
              if(League1.LeaGue[j].Players[0].getClub().equals("Barcelona"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
                 
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Real Madrid"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[0].getClub().equals("Liverpool"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Juventus"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Bayern Munchen"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("PSG"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Man City"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Atletico"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[0].getClub().equals("Chelsea"))
              {
                  jLabel10.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField1.setText(League1.LeaGue[j].Players[0].getName());
                  jLabel11.setText(Integer.toString(League1.LeaGue[j].Players[0].Calc_Points()));
               
              }
              if(League1.LeaGue[j].Players[1].getClub().equals("Barcelona"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Real Madrid"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[1].getClub().equals("Liverpool"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Juventus"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Bayern Munchen"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("PSG"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Man City"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Atletico"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[1].getClub().equals("Chelsea"))
              {
                  jLabel12.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField2.setText(League1.LeaGue[j].Players[1].getName());
                  jLabel13.setText(Integer.toString(League1.LeaGue[j].Players[1].Calc_Points()));
               
              }
              if(League1.LeaGue[j].Players[2].getClub().equals("Barcelona"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Real Madrid"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[2].getClub().equals("Liverpool"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Juventus"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Bayern Munchen"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("PSG"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Man City"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Atletico"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[2].getClub().equals("Chelsea"))
              {
                  jLabel14.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField3.setText(League1.LeaGue[j].Players[2].getName());
                  jLabel15.setText(Integer.toString(League1.LeaGue[j].Players[2].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[3].getClub().equals("Barcelona"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Real Madrid"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[3].getClub().equals("Liverpool"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Juventus"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Bayern Munchen"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("PSG"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Man City"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Atletico"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[3].getClub().equals("Chelsea"))
              {
                  jLabel16.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField4.setText(League1.LeaGue[j].Players[3].getName());
                  jLabel17.setText(Integer.toString(League1.LeaGue[j].Players[3].Calc_Points()));
               
              }
              if(League1.LeaGue[j].Players[4].getClub().equals("Barcelona"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Real Madrid"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[4].getClub().equals("Liverpool"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Juventus"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Bayern Munchen"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("PSG"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Man City"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Atletico"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[4].getClub().equals("Chelsea"))
              {
                  jLabel18.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField5.setText(League1.LeaGue[j].Players[4].getName());
                  jLabel19.setText(Integer.toString(League1.LeaGue[j].Players[4].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[5].getClub().equals("Barcelona"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Real Madrid"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[5].getClub().equals("Liverpool"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Juventus"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Bayern Munchen"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("PSG"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Man City"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Atletico"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[5].getClub().equals("Chelsea"))
              {
                  jLabel24.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField8.setText(League1.LeaGue[j].Players[5].getName());
                  jLabel25.setText(Integer.toString(League1.LeaGue[j].Players[5].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[6].getClub().equals("Barcelona"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Real Madrid"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[6].getClub().equals("Liverpool"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Juventus"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Bayern Munchen"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("PSG"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Man City"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Atletico"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[6].getClub().equals("Chelsea"))
              {
                  jLabel20.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField6.setText(League1.LeaGue[j].Players[6].getName());
                  jLabel21.setText(Integer.toString(League1.LeaGue[j].Players[6].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[7].getClub().equals("Barcelona"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Real Madrid"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[7].getClub().equals("Liverpool"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Juventus"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Bayern Munchen"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("PSG"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Man City"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Atletico"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[7].getClub().equals("Chelsea"))
              {
                  jLabel22.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField7.setText(League1.LeaGue[j].Players[7].getName());
                  jLabel23.setText(Integer.toString(League1.LeaGue[j].Players[7].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[8].getClub().equals("Barcelona"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Real Madrid"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[8].getClub().equals("Liverpool"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Juventus"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Bayern Munchen"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("PSG"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Man City"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Atletico"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[8].getClub().equals("Chelsea"))
              {
                  jLabel26.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField9.setText(League1.LeaGue[j].Players[8].getName());
                  jLabel27.setText(Integer.toString(League1.LeaGue[j].Players[8].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[9].getClub().equals("Barcelona"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Real Madrid"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[9].getClub().equals("Liverpool"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Juventus"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Bayern Munchen"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("PSG"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Man City"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Atletico"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[9].getClub().equals("Chelsea"))
              {
                  jLabel30.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField11.setText(League1.LeaGue[j].Players[9].getName());
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()));
               
              }
               if(League1.LeaGue[j].Players[10].getClub().equals("Barcelona"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Barcelona.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Real Madrid"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Real Madrid.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }else if(League1.LeaGue[j].Players[10].getClub().equals("Liverpool"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Liverpool.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Juventus"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Juventus.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Bayern Munchen"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Bayern Munchen.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("PSG"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\PSG.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Man City"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Man City.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Atletico"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Atletico.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              else if(League1.LeaGue[j].Players[10].getClub().equals("Chelsea"))
              {
                  jLabel28.setIcon(new ImageIcon("C:\\fantasy\\Clubs\\Chelsea.png"));
                  jTextField10.setText(League1.LeaGue[j].Players[10].getName());
                  jLabel29.setText(Integer.toString(League1.LeaGue[j].Players[10].Calc_Points()));
               
              }
              
                  jLabel31.setText(Integer.toString(League1.LeaGue[j].Players[9].Calc_Points()*2));
              }
     

              
          }
           if (bool)
               break;
          }
        }    
       if (Captain=="0"){
       jLabel11.setText(Integer.toString(User2.Players[0].Calc_Points()*2));
       }
       else if (Captain=="1"){
       jLabel13.setText(Integer.toString(User2.Players[1].Calc_Points()*2));
       }
       else if (Captain=="2"){
       jLabel15.setText(Integer.toString(User2.Players[2].Calc_Points()*2));
       }
       else if (Captain=="3"){
       jLabel17.setText(Integer.toString(User2.Players[3].Calc_Points()*2));
       }
       else if (Captain=="4"){
       jLabel19.setText(Integer.toString(User2.Players[4].Calc_Points()*2));
       }
       else if (Captain=="5"){
       jLabel25.setText(Integer.toString(User2.Players[5].Calc_Points()*2));
       }
       else if (Captain=="6"){
       jLabel21.setText(Integer.toString(User2.Players[6].Calc_Points()*2));
       }
       else if (Captain=="7"){
       jLabel23.setText(Integer.toString(User2.Players[7].Calc_Points()*2));
       }
       else if (Captain=="8"){
       jLabel27.setText(Integer.toString(User2.Players[8].Calc_Points()*2));
       }
       else if (Captain=="9"){
       jLabel31.setText(Integer.toString(User2.Players[9].Calc_Points()*2));
       }
       else if (Captain=="10"){
       jLabel29.setText(Integer.toString(User2.Players[10].Calc_Points()*2));
       }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(null);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("jLabel31");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(110, 270, 80, 16);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("jTextField11");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(110, 250, 80, 22);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel30);
        jLabel30.setBounds(100, 190, 100, 60);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("jLabel29");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(370, 260, 80, 16);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("jTextField10");
        jPanel1.add(jTextField10);
        jTextField10.setBounds(370, 240, 80, 22);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel28);
        jLabel28.setBounds(360, 180, 100, 60);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("jLabel27");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(620, 270, 80, 16);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("jTextField9");
        jPanel1.add(jTextField9);
        jTextField9.setBounds(620, 250, 80, 22);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(610, 190, 100, 60);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("jLabel25");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(70, 370, 80, 16);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("jTextField8");
        jPanel1.add(jTextField8);
        jTextField8.setBounds(70, 350, 80, 22);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel24);
        jLabel24.setBounds(60, 290, 100, 60);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("jLabel23");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(270, 370, 80, 16);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("jTextField7");
        jPanel1.add(jTextField7);
        jTextField7.setBounds(270, 350, 80, 22);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(260, 290, 100, 60);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(450, 370, 80, 16);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("jTextField6");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(450, 350, 80, 22);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(440, 290, 100, 60);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(670, 370, 80, 20);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(670, 350, 80, 22);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(660, 290, 100, 60);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(110, 470, 80, 20);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(110, 450, 80, 22);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(360, 470, 80, 16);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(100, 390, 100, 60);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("jTextField3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(360, 450, 80, 22);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 470, 80, 16);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(350, 390, 100, 60);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(600, 390, 100, 60);
        jLabel12.getAccessibleContext().setAccessibleDescription("");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(610, 450, 80, 22);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(350, 490, 100, 60);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 570, 80, 16);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 80, 30);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(360, 550, 80, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Total Season");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 810, 50);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("60");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 50, 66, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Average");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 90, 110, 22);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SQUAD");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("82");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(390, 40, 70, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Score");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(370, 90, 130, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("985");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(680, 60, 60, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Highest");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(670, 80, 100, 30);

        jSeparator1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 42, 810, 10);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 51, 810, 112);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/Overview - Google Chrome 23_12_2020 08_33_21 م (2).png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 170, 810, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Fanatsy back = new Fanatsy();
        back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Points().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
