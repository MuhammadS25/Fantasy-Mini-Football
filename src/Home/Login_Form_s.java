/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;


import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import fantasy_football.Fantasy_Football;
import fantasy_football.Users;
import fantasy_football.Player;
import fantasy_football.Defenders;
import fantasy_football.League;
import fantasy_football.MidFielders;
import fantasy_football.Strikers;
import fantasy_football.GoalKeepers;
import java.util.Arrays;
import project.Signupnew;
import java.util.*;



/**
 *
 * @author lenovo
 */
public class Login_Form_s extends javax.swing.JFrame {
           public static Player benzema=new Strikers("Benzema","Real Madrid",10,8, 5, 6, 2, 0, 0);
        public static Player jovic=new Strikers("Jovic","Real Madrid",3,1, 2, 2, 1, 0, 0);
        public static  Player kroos=new MidFielders("Kroos","Real Madrid",10,2, 6, 6, 3, 0, 0);
        public static Player modric=new MidFielders("Modric","Real Madrid",10,4, 8, 6, 1, 0, 0);
        public static Player casemiro=new MidFielders("Casemiro","Real Madrid",10,3, 2, 6, 4, 0, 0);
        public static Player hazard=new MidFielders("Hazard","Real Madrid",3,2, 1, 2, 1, 0, 0);
        public static Player rodrygo=new MidFielders("Rodrygo","Real Madrid",3,2, 1, 2, 1, 0, 0);
        public static Player valverde=new MidFielders("Valverde","Real Madrid",7,2, 3, 4, 3, 0, 0);
        public static Player ramos=new Defenders("Ramos","Real Madrid",10,3, 1, 6, 3, 0, 0);
        public static Player mendy=new Defenders("Mendy","Real Madrid",9,1, 2, 6, 3, 0, 0);
        public static Player varane=new Defenders("Varane","Real Madrid",10,0, 0, 6, 3, 0, 1);
        public static Player carvajal=new Defenders("Carvajal","Real Madrid",6,0, 2, 3, 2, 0, 0);
        public static Player Vazquez=new Defenders("Vazquez","Real Madrid",4,1, 2, 2, 1, 0, 0);
        public static Player courtois=new GoalKeepers("Courtois","Real Madrid",10,0, 0, 6, 0, 0, 0);
        public static Player firmino=new Strikers("Firmino","Liverpool",13,11, 5, 7, 2, 0, 0);
        public static Player minamino=new Strikers("Minamino","Liverpool",2,1, 0, 1, 0, 0, 0);
        public static Player salah=new MidFielders("Salah","Liverpool",13,11, 7, 7, 1, 0, 0);
        public static Player jota=new MidFielders("Jota","Liverpool",9,7, 3, 5, 1, 0, 0);
        public static Player mane=new MidFielders("Mane","Liverpool",13,10, 4, 7, 3, 0, 0);
        public static Player fabinho=new MidFielders("Fabinho","Liverpool",6,2, 1, 6, 3, 0, 0);
        public static Player thiago=new MidFielders("Thiago","Liverpool",6,2, 1, 6, 3, 0, 0);
        public static Player henderson=new MidFielders("Henderson","Liverpool",10,2, 4, 6, 2, 0, 0);
        public static Player vandijk=new Defenders("VanDijk","Liverpool",13,2, 2, 7, 3, 0, 0);
        public static Player robertson=new Defenders("Robertson","Liverpool",13,1, 3, 7, 2, 0, 0);
        public static Player arnold=new Defenders("Arnold","Liverpool",13,1, 5, 7, 2, 0, 0);
        public static Player gomez=new Defenders("Gomez","Liverpool",9,0, 0, 5, 2, 0, 0);
        public static Player matip=new Defenders("Matip","Liverpool",3,1, 0, 2, 2, 0, 1);
        public static Player alisson=new GoalKeepers("Alisson","Liverpool",11,0, 0, 7, 1, 0, 0);
        public static Player ronaldo=new Strikers("Ronaldo","Juventus",12,15, 4, 5, 2, 0, 0);
        public static Player morata=new Strikers("Morata","Juventus",9,7, 4, 4, 2, 0, 0);
        public static Player dybala=new Strikers("Dybala","Juventus",7,5, 3, 4, 0, 0, 0);
        public static Player cuadrado=new MidFielders("Cuadrado","Juventus",11,1, 4, 6, 2, 1, 1);
        public static Player bentancur=new MidFielders("Bentancur","Juventus",7,1, 2, 3, 2, 1, 0);
        public static Player bernardeschi=new MidFielders("Bernardeschi","Juventus",9,3, 4, 5, 2, 0, 0);
        public static Player rabiot=new MidFielders("Rabiot","Juventus",5,1, 3, 3, 1, 1, 0);
        public static Player bonucci=new Defenders("Bonucci","Juventus",11,1, 0, 7, 1, 0, 1);
        public static Player deligt=new Defenders("DeLigt","Juventus",9,2, 0, 4, 3, 1, 1);
        public static Player sandro=new Defenders("Sandro","Juventus",11,0, 2, 7, 1, 0, 1);
        public static Player chiellini=new Defenders("Chellini","Juventus",5,0, 0, 5, 2, 0, 0);
        public static Player danilo=new Defenders("Danilo","Juventus",11,0, 2, 6, 3, 1, 1);
        public static Player szczesny=new GoalKeepers("Szczesny","Juventus",7,0, 0, 3, 0, 0, 1);
        public static Player buffon=new GoalKeepers("Buffon","Juventus",5,0, 0, 4, 0, 0, 0);
        public static Player lewandowski=new Strikers("Lewandowski","Bayern Munchen",12,13, 4, 6, 3, 0, 0);
        public static Player muller=new MidFielders("Muller","Bayern Munchen",11,9, 5, 6, 3, 0, 0);
        public static Player sane=new MidFielders("Sane","Bayern Munchen",9,5, 2, 4, 2, 0, 0);
        public static Player koman=new MidFielders("Koman","Bayern Munchen",10,6, 3, 5, 3, 0, 0);
        public static Player goretzka=new MidFielders("Goretzka","Bayern Munchen",10,2, 2, 6, 3, 0, 0);
        public static Player gnabry=new MidFielders("Gnabry","Bayern Munchen",7,5, 2, 4, 2, 0, 0);
        public static Player kimmich=new Defenders("Kimmich","Bayern Munchen",10,3, 5, 6, 3, 0, 1);
        public static Player hernandez=new Defenders("Hernandez","Bayern Munchen",8,1, 0, 4, 3, 1, 0);
        public static Player alaba=new Defenders("Alaba","Bayern Munchen",8,0, 2, 5, 3, 0, 1);
        public static Player sule=new Defenders("Sule","Bayern Munchen",6,1, 0, 3, 1, 1, 0);
        public static Player boateng=new Defenders("Boateng","Bayern Munchen",4,0, 0, 1, 1, 0, 0);
        public static Player pavard=new Defenders("Pavard","Bayern Munchen",6,2, 3, 4, 2, 0, 0);
        public static Player Davies=new Defenders("Davies","Bayern Munchen",11,1, 5, 6, 2, 0, 1);
        public static Player neuer=new GoalKeepers("Neuer","Bayern Munchen",12,0, 0, 7, 0, 0, 0);
        public static Player messi=new Strikers("Messi","Barcelona",10,11, 9, 5, 3, 0, 0);
        public static Player dembele=new Strikers("Dembele","Barcelona",3,2, 0, 2, 1, 0, 0);
        public static Player griezmann=new Strikers("Griezmann","Barcelona",7,2, 5, 2, 3, 0, 0);
        public static Player fati=new MidFielders("Fati","Barcelona",8,6, 2, 4, 2, 0, 0);
        public static Player coutinho=new MidFielders("Coutinho","Barcelona",9,4, 4, 4, 2, 0, 0);
        public static Player dejong=new MidFielders("Dejong","Barcelona",9,1, 2, 5, 2, 0, 1);
        public static Player pjanic=new MidFielders("Pjanic","Barcelona",7,0, 3, 4, 2, 0, 0);
        public static Player busquets=new MidFielders("Busquets","Barcelona",4,0, 1, 1, 1, 1, 0);
        public static Player dest=new Defenders("Dest","Barcelona",6,1, 3, 5, 2, 0, 0);
        public static Player lenglet=new Defenders("Lenglet","Barcelona",10,1, 0, 5,3 , 0, 0);
        public static Player pique=new Defenders("Pique","Barcelona",5,0, 0, 3, 2, 1, 1);
        public static Player alba=new Defenders("Alba","Barcelona",10,1, 2, 5, 3, 0, 0);
        public static Player roberto=new Defenders("Roberto","Barcelona",4,0, 1, 2, 2, 0, 1);
        public static Player stegen=new GoalKeepers("Ter Stegen","Barcelona",6,0, 0, 4, 1, 0, 0);
        public static Player neto=new GoalKeepers("Neto","Barcelona",4,0, 0, 3, 0, 0, 0);
        public static Player neymar=new Strikers("Neymar Jr","PSG",10,11, 7, 4, 1, 0, 0);
        public static Player mbappe=new Strikers("Mbappe","PSG",10,9, 3, 4, 0, 0, 0);
        public static Player kean=new Strikers("Kean","PSG",4,1, 2, 1, 0, 0, 0);
        public static Player dimaria=new MidFielders("Di Maria","PSG",10,6, 4, 4, 0, 0, 0);
        public static Player pereira=new MidFielders("Pereira","PSG",9,2, 1, 4, 0, 0, 0);
        public static Player herrera=new MidFielders("Herrera","PSG",8,1, 1, 4, 0, 0, 0);
        public static Player verratti=new MidFielders("Verratti","PSG",10,1, 4, 4, 0, 0, 0);
        public static Player kimpembe=new Defenders("Kimpembe","PSG",10,1, 0, 4, 1, 1, 1);
        public static Player marquinhos=new Defenders("Marquinhos","PSG",10,2, 1, 4, 3, 0, 1);
        public static Player florenzi=new Defenders("Florenzi","PSG",8,0, 3, 4, 2, 1, 0);
        public static Player kurzawa=new Defenders("Kurzawa","PSG",9,1, 1, 4, 0, 1, 1);
        public static Player navas=new GoalKeepers("Navas","PSG",10,0, 0, 4, 1, 0, 0);
        public static Player aguero=new Strikers("Aguero","Man City",10,8, 5, 6, 1, 0, 0);
        public static Player jesus=new Strikers("Jesus","Man City",7,5, 4, 4, 3, 0, 0);
        public static Player debruyne=new MidFielders("De Bruyne","Man City",10,6, 8, 6, 2, 0, 0);
        public static Player sterling=new MidFielders("Sterling","Man City",10,7, 5, 6, 1, 0, 0);
        public static Player torres=new MidFielders("Torres","Man City",8,4, 3, 5, 2, 0, 0);
        public static Player foden=new MidFielders("Foden","Man City",7,5, 3, 5, 2, 0, 0);
        public static Player gundogan=new MidFielders("Gundogan","Man City",9,3, 5, 5, 2, 0, 0);
        public static Player mehrez=new MidFielders("Mehrez","Man City",5,3, 3, 2, 1, 0, 0);
        public static Player fernandinho=new MidFielders("Fernandinho","Man City",10,1, 2, 5, 3, 0, 1);
        public static Player walker=new Defenders("Walker","Man City",8,1, 3, 5, 2, 0, 0);
        public static Player cancelo=new Defenders("Cancelo","Man City",6,0, 3, 5, 2, 0, 1);
        public static Player dias=new Defenders("Dias","Man City",6,1, 0, 5, 2, 0, 0);
        public static Player stones=new Defenders("Stones","Man City",4,0, 0, 3, 1, 0, 1);
        public static Player laporte=new Defenders("Laporte","Man City",9,1, 0, 5, 1, 0, 0);
        public static Player ake=new Defenders("Ake","Man City",3,0, 0, 2, 1, 0, 0);
        public static Player ederson=new GoalKeepers("Ederson","Man City",9,0, 1, 5, 0, 0, 0);
        public static Player costa=new Strikers("Costa","Atletico",4,2, 2, 3, 2, 0, 0);
        public static Player suarez=new Strikers("Suarez","Atletico",10,9, 5, 6, 3, 0, 0);
        public static Player felix=new Strikers("Felix","Atletico",10,6, 2, 6, 1, 0, 0);
        public static Player llorente=new MidFielders("Llorente","Atletico",10,5, 3, 6, 2, 0, 0);
        public static Player carrasco=new MidFielders("Carrasco","Atletico",9,3, 4, 5, 1, 0, 0);
        public static Player saul=new MidFielders("Saul","Atletico",8,3, 2, 4, 2, 0, 0);
        public static Player koke=new MidFielders("Koke","Atletico",7,1, 2, 5, 1, 0, 0);
        public static Player correa=new MidFielders("Correa","Atletico",7,1, 2, 4, 0, 0, 0);
        public static Player savic=new Defenders("Savic","Atletico",10,0, 0, 6, 2, 0, 1);
        public static Player gimenez=new Defenders("Gimenez","Atletico",10,1, 0, 6, 2, 0, 0);
        public static Player trippier=new Defenders("Trippier","Atletico",10,0, 3, 6, 2, 0, 1);
        public static Player lodi=new Defenders("Lodi","Atletico",10,0, 2, 6, 2, 1, 0);
        public static Player hermoso=new Defenders("Hermoso","Atletico",6,0, 1, 4, 2, 0, 0);
        public static Player oblack=new GoalKeepers("Oblack","Atletico",10,0, 0, 6, 0, 0, 0);
        public static Player werner=new Strikers("Werner","Chelsea",8,5, 2, 4, 1, 0, 0);
        public static Player giroud=new Strikers("Giroud","Chelsea",8,4, 1, 4, 0, 0, 0);
        public static Player kante=new MidFielders("Kante","Chelsea",7,2, 2, 4, 1, 0, 0);
        public static Player jorginho=new MidFielders("Jorginho","Chelsea",7,4, 2, 4, 3, 0, 1);
        public static Player haverts=new MidFielders("Havertz","Chelsea",6,3, 4, 3, 0, 0, 0);
        public static Player ziyech=new MidFielders("Ziyech","Chelsea",5,2, 2, 3, 0, 0, 0);
        public static Player kovacic=new MidFielders("Kovacic","Chelsea",4,0, 2, 2, 1, 0, 0);
        public static Player silva=new Defenders("Silva","Chelsea",7,1, 0, 3, 3, 0, 1);
        public static Player zouma=new Defenders("Zouma","Chelsea",7,1, 1, 4, 3, 0, 0);
        public static Player chilwell=new Defenders("Chilwell","Chelsea",8,1, 3, 4, 2, 0, 0);
        public static Player azpilicueta=new Defenders("Azpilicueta","Chelsea",6,0, 1, 3, 2, 0, 0);
        public static Player kepa=new GoalKeepers("Kepa","Chelsea",8,0, 0, 1, 0, 0, 2);
        
       public static Player selections[]={benzema,jovic,kroos ,modric ,casemiro ,hazard ,rodrygo,valverde 
       ,ramos ,mendy ,varane ,carvajal ,Vazquez ,courtois ,firmino ,minamino ,salah ,jota ,mane ,fabinho
       ,thiago ,henderson ,vandijk ,robertson ,arnold ,gomez ,matip ,alisson ,ronaldo ,morata ,dybala 
      ,cuadrado ,bentancur ,bernardeschi ,rabiot ,bonucci ,deligt ,sandro ,chiellini ,danilo ,szczesny
      ,buffon ,lewandowski ,muller ,sane ,koman ,goretzka ,gnabry ,kimmich ,hernandez ,alaba 
      ,sule ,boateng ,pavard ,Davies ,neuer ,messi ,dembele ,griezmann ,fati ,coutinho ,dejong 
      ,pjanic ,busquets ,dest,lenglet ,pique ,alba ,roberto ,stegen ,neto ,neymar ,mbappe ,kean 
      ,dimaria ,pereira ,herrera ,verratti ,kimpembe ,marquinhos ,florenzi ,kurzawa ,navas ,aguero
      ,jesus ,debruyne ,sterling ,torres ,foden ,gundogan ,mehrez ,fernandinho ,walker ,cancelo ,dias 
      ,stones ,laporte ,ake ,ederson ,costa ,suarez ,felix ,llorente ,carrasco ,saul ,koke ,correa ,savic 
      ,gimenez ,trippier ,lodi ,hermoso ,oblack ,werner ,giroud ,kante ,jorginho ,haverts 
      ,ziyech ,kovacic ,silva ,zouma ,chilwell ,azpilicueta ,kepa};
      public static String Captain=new String("9");
      public static Boolean bool =new Boolean(true);
      public static Users User1=new Users("Muhammad","m123456");
      public static Users User3=new Users("Jeka","j123456");
      public static Users User2 = new Users();
      public static League League1=new League();
//      public static League League2=new League();
    /**
     * Creates new form Login_Form_s
     */
    public Login_Form_s() {
        initComponents();
        jTextField1.setBackground(new Color(0,0,0));
        jPasswordField1.setBackground(new Color(0,0,0));
       
       
       
        User1.Players[0]=stegen;
        User1.Players[1]=Davies;
        User1.Players[2]=ramos;
        User1.Players[3]=arnold;
        User1.Players[4]=salah;
        User1.Players[5]=jota;
        User1.Players[6]=cuadrado;
        User1.Players[7]=torres;
        User1.Players[8]=ronaldo;
        User1.Players[9]=benzema;
        User1.Players[10]=neymar;
        System.out.println(User1.getTotal_Points());
        User3.Players[0]=oblack;
        User3.Players[1]=kimmich;
        User3.Players[2]=mendy;
        User3.Players[3]=robertson;
        User3.Players[4]=hazard;
        User3.Players[5]=debruyne;
        User3.Players[6]=sterling;
        User3.Players[7]=ziyech;
        User3.Players[8]=lewandowski;
        User3.Players[9]=messi;
        User3.Players[10]=mbappe;
        System.out.println(User3.getTotal_Points());
        
        League1.LeaGue[0]=User1;
        League1.LeaGue[1]=User3;
        League1.LeaGue[2]=User2;
//        League2.LeaGue[0]=User1;
//        League2.LeaGue[1]=User3;
        //League2.LeaGue[2]=User2;
//        List<Users> Leagues=new ArrayList<Users>();
//        Leagues.add(User1);
//        Leagues.add(User3);
////        Leagues.add(User2);
//        Collections.sort(Leagues);
////        Arrays.sort(League2.LeaGue);
        System.out.println(User1.Top_Player().getName());
        System.out.println(User3.Top_Player().getName());
//        for (Users user:Leagues){
//            //System.out.println(League2.LeaGue[0].getUsername()+""+League2.LeaGue[0].After_Captain());
//            System.out.println(user);
//        }
        
       
      
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
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(java.awt.Color.white);
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(java.awt.Color.white);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(120, 230, 130, 30);

        jSeparator1.setForeground(java.awt.Color.black);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(120, 270, 130, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(370, 10, 30, 20);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("LOGIN");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(90, 360, 80, 30);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(190, 360, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_lock_32px_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 290, 34, 30);

        jPasswordField1.setForeground(java.awt.Color.white);
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(120, 290, 130, 30);

        jSeparator2.setForeground(java.awt.Color.black);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(120, 330, 130, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/icons8_messi_48px.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 220, 45, 48);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Forget your Password?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(100, 410, 190, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/WhatsApp Image 2020-12-23 at 4.05.27 PM.jpeg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 390, 440);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/WhatsApp Image 2020-12-23 at 2.02.13 PM.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name = jTextField1.getText();
        String pass = jPasswordField1.getText();
        if(name.equals(User1.getUsername()) && pass.equals(User1.getPassword()))
        {

            int Totalpoints1 = User1.getTotal_Points();
            int Averagepoints1 = 473 ;
            new Fanatsy(Totalpoints1 , Averagepoints1).setVisible(true);

           
           try {
            JFXPanel j = new JFXPanel(); 
          String uri = new File("UEFA Champions League Theme Song [On Screen].mp3").toURI().toString();
          new MediaPlayer(new Media(uri)).play();
           } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           
        }
       
        }
        else if(name.equals(User3.getUsername()) && pass.equals(User3.getPassword()))
        {

            int Totalpoints1 = User3.getTotal_Points();
            int Averagepoints1 = 473 ;
            bool=false;
            new Fanatsy(Totalpoints1 , Averagepoints1).setVisible(true);

           
           try {
            JFXPanel j = new JFXPanel(); 
          String uri = new File("UEFA Champions League Theme Song [On Screen].mp3").toURI().toString();
          new MediaPlayer(new Media(uri)).play();
           } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           
        }
       
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel2,"invalid");
            
        }
        
        
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Signupnew register = new Signupnew();
            register.setVisible(true);
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
      
              
    }//GEN-LAST:event_jButton1MousePressed

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
            java.util.logging.Logger.getLogger(Login_Form_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
