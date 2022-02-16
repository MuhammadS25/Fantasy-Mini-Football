/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy_football;
import Home.Login_Form_s;
import Home.*;
import fantasy_football.*;

/**
 *
 * @author EGYPT
 */
public class Fantasy_Football {
        public static Player benzema=new Strikers("Benzema","Real Madrid",10,8, 5, 6, 2, 0, 0);
        public static Player jovic=new Strikers("Jovic","Real Madrid",3,1, 2, 2, 1, 0, 0);
        public static  Player kroos=new MidFielders("Kroos","Real Madrid",10,2, 6, 6, 3, 0, 0);
        public static Player modric=new MidFielders("Modric","Real Madrid",10,4, 8, 6, 1, 0, 0);
        public static Player casemiro=new MidFielders("Casemiro","Real Madrid",10,3, 2, 6, 4, 0, 0);
        public static Player hazard=new MidFielders("Hazard","Real Madrid",3,2, 1, 2, 1, 0, 0);
        public static Player rodrygo=new MidFielders("rodrygo","Real Madrid",3,2, 1, 2, 1, 0, 0);
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
        public static Player chiellini=new Defenders("Chiellini","Juventus",5,0, 0, 5, 2, 0, 0);
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
        public static Player Davies=new Defenders("Kimmich","Bayern Munchen",11,1, 5, 6, 2, 0, 1);
        public static Player neuer=new GoalKeepers("Neuer","Bayern Munchen",12,0, 0, 7, 0, 0, 0);
        public static Player messi=new Strikers("Messi","Barcelona",10,11, 9, 5, 3, 0, 0);
        public static Player dembele=new Strikers("Dembele","Barcelona",3,2, 0, 2, 1, 0, 0);
        public static Player griezmann=new Strikers("Griezmann","Barcelona",7,2, 5, 2, 3, 0, 0);
        public static Player fati=new MidFielders("Fati","Barcelona",8,6, 2, 4, 2, 0, 0);
        public static Player coutinho=new MidFielders("Coutinho","Barcelona",9,4, 4, 4, 2, 0, 0);
        public static Player dejong=new MidFielders("DeJong","Barcelona",9,1, 2, 5, 2, 0, 1);
        public static Player pjanic=new MidFielders("pjanic","Barcelona",7,0, 3, 4, 2, 0, 0);
        public static Player busquets=new MidFielders("busquets","Barcelona",4,0, 1, 1, 1, 1, 0);
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
         
         
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
          Login_Form_s s = new Login_Form_s();
     
        System.out.println(salah.Calc_Points());
        Users User1=new Users("Muhammad","m123456");
        Users User2=new Users();
        System.out.println(lewandowski.Calc_Points());
        User1.Players[0]=courtois;
        User1.Players[1]=Vazquez;
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
    }
   
    
}
