/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;
import fantasy_football.*;
import Home.*;

/**
 *
 * @author EGYPT
 */
public class League extends javax.swing.JFrame {

    /**
     * Creates new form League
     */
    public League() {
        initComponents();
        jLabel2.setText(Login_Form_s.League1.getLeagueName());
        if (Login_Form_s.League1.LeaGue[2].Players[0] instanceof GoalKeepers){
        if ((Login_Form_s.League1.LeaGue[0].After_Captain()>Login_Form_s.League1.LeaGue[1].After_Captain())&&(Login_Form_s.League1.LeaGue[0].After_Captain()>Login_Form_s.League1.LeaGue[2].After_Captain())){
        jLabel12.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel11.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel13.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        if (Login_Form_s.League1.LeaGue[1].After_Captain()>Login_Form_s.League1.LeaGue[2].After_Captain()){
        jLabel14.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[2].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[2].Top_Player().getName());
        }
        else {
        jLabel14.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[2].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[2].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        }
        
        }
        
        
        else if ((Login_Form_s.League1.LeaGue[1].After_Captain()>Login_Form_s.League1.LeaGue[0].After_Captain())&&(Login_Form_s.League1.LeaGue[1].After_Captain()>Login_Form_s.League1.LeaGue[2].After_Captain())){
        jLabel12.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel11.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel13.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        if (Login_Form_s.League1.LeaGue[0].After_Captain()>Login_Form_s.League1.LeaGue[2].After_Captain()){
        jLabel14.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[2].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[2].Top_Player().getName());
        }
        else {
        jLabel14.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[2].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[2].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        }
        
        }
        
        
        else if ((Login_Form_s.League1.LeaGue[2].After_Captain()>Login_Form_s.League1.LeaGue[1].After_Captain())&&(Login_Form_s.League1.LeaGue[2].After_Captain()>Login_Form_s.League1.LeaGue[0].After_Captain())){
        jLabel12.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel11.setText(String.valueOf(Login_Form_s.League1.LeaGue[2].After_Captain()));
        jLabel13.setText(Login_Form_s.League1.LeaGue[2].Top_Player().getName());
        if (Login_Form_s.League1.LeaGue[1].After_Captain()>Login_Form_s.League1.LeaGue[0].After_Captain()){
        jLabel14.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        }
        else {
        jLabel14.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        jLabel17.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel18.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel19.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        }
        
        }
       
        
        }
        
        
        
        
      
        else {
        if (Login_Form_s.League1.LeaGue[1].After_Captain()>Login_Form_s.League1.LeaGue[0].After_Captain()){
        jLabel12.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel11.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel13.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        jLabel14.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        }
        else {
        jLabel12.setText(Login_Form_s.League1.LeaGue[0].getUsername());
        jLabel11.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
        jLabel13.setText(Login_Form_s.League1.LeaGue[0].Top_Player().getName());
        jLabel14.setText(Login_Form_s.League1.LeaGue[1].getUsername());
        jLabel15.setText(String.valueOf(Login_Form_s.League1.LeaGue[1].After_Captain()));
        jLabel16.setText(Login_Form_s.League1.LeaGue[1].Top_Player().getName());
        }
        jLabel17.setText(Login_Form_s.League1.LeaGue[2].getUsername());
        jLabel18.setText("0");
        jLabel19.setText("Not Selected Yet");
        
        }
        
    }
    String userx;
    League(String Username2){
        this.userx = Username2;
        jLabel1.setText("mm");
       
//    int first=0;
//    int last=0;
//        System.out.println(Login_Form_s.League1.LeaGue[0].getUsername());
//    for (int i=0;i<3;i++){
//    for (int j=i+1;j<3;j++){
//    if (Login_Form_s.League1.LeaGue[i].After_Captain()>Login_Form_s.League1.LeaGue[j].After_Captain()){
//    jLabel1.setText((Login_Form_s.League1.LeaGue[i].getUsername()));
//    jLabel2.setText(String.valueOf(Login_Form_s.League1.LeaGue[i].After_Captain()));
//    first=i;
//    for (int t=0;t<11;t++){ 
//    for (int g=t+1;g<11;g++){
//    if (Login_Form_s.League1.LeaGue[i].Players[t].Calc_Points()>Login_Form_s.League1.LeaGue[i].Players[g].Calc_Points()){
//    jLabel3.setText((Login_Form_s.League1.LeaGue[i].Players[t].getName()));
//    }
//    }
//    }
//    }
//    }
//    }
//    for (int i=0;i<3;i++){
//    for (int j=i+1;j<3;j++){
//    if (Login_Form_s.League1.LeaGue[i].After_Captain()<Login_Form_s.League1.LeaGue[j].After_Captain()){
//    jLabel7.setText((Login_Form_s.League1.LeaGue[i].getUsername()));
//    jLabel8.setText(String.valueOf(Login_Form_s.League1.LeaGue[i].After_Captain()));
//    last=i;
//    for (int t=0;t<11;t++){
//    for (int g=t+1;g<11;g++){
//    if (Login_Form_s.League1.LeaGue[i].Players[t].Calc_Points()>Login_Form_s.League1.LeaGue[i].Players[g].Calc_Points()){
//    jLabel9.setText((Login_Form_s.League1.LeaGue[i].Players[t].getName()));
//    }
//    }
//    }
//    }
//    }
//    }
//    for (int i=0;i<3;i++){
//    if (i==first||i==last)
//        continue;
//    jLabel4.setText((Login_Form_s.League1.LeaGue[i].getUsername()));
//    jLabel5.setText(String.valueOf(Login_Form_s.League1.LeaGue[i].After_Captain()));
//    for (int t=0;t<11;t++){
//    for (int g=t+1;g<11;g++){
//    if (Login_Form_s.League1.LeaGue[i].Players[t].Calc_Points()>Login_Form_s.League1.LeaGue[i].Players[g].Calc_Points()){
//    jLabel6.setText((Login_Form_s.League1.LeaGue[i].Players[t].getName()));
//    }
//    }
//    }
//    }
    
    //if (Login_Form_s.League1.LeaGue[0].After_Captain()>Login_Form_s.League1.LeaGue[1].After_Captain()){
      //  String s=Login_Form_s.League1.LeaGue[0].getUsername();
        //System.out.println(Login_Form_s.League1.LeaGue[0].getUsername());
       // System.out.println(s);
    //jLabel16.setText((s));
    //jLabel2.setText(String.valueOf(Login_Form_s.League1.LeaGue[0].After_Captain()));
    //}
    
    
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 230, 500, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 160, 500, 2);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(-10, 100, 510, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 300, 500, 2);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 106, 140, 40);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(230, 100, 120, 60);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jlabel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 10, 150, 30);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(360, 237, 130, 60);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(230, 237, 110, 60);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(70, 237, 110, 60);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 167, 130, 60);

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(230, 167, 120, 60);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(80, 167, 130, 60);

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(360, 100, 140, 60);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("3.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 260, 14, 17);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("2.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 190, 14, 17);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 120, 41, 20);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Top Player");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 80, 100, 17);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Totall");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 80, 44, 17);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Team&Manager");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 70, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rank");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 70, 30);

        jLabel1.setDisplayedMnemonic('j');
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/WhatsApp Image 2020-12-23 at 4.05.27 PM.jpeg"))); // NOI18N
        jLabel1.setText("3.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 450);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 130, 41, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(League.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(League.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(League.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(League.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new League().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
