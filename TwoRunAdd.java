/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adlabs;

import javax.swing.JOptionPane;

/**
 *
 * @author mohitrai
 */
public class TwoRunAdd extends javax.swing.JFrame {

    /**
     * Creates new form callYourBusiness
     */
    // username userid goal 4_states
    public static String info[] = new String[100];
    
    public String debug(int l){
        String s = "";
        for( int i = 0; i < l; i++ ){
            s += info[i];
            s += "\n";
        }
        return s;
    }
    public TwoRunAdd() {
        initComponents();
        LogOut.setText(info[0]);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    String Find( String Typed ){
        String ar[] = new String[29];
        ar[0] = "Andhra Pradesh" ; ar[1] = "Arunachal Pradesh" ; ar[2] = "Assam" ;
        ar[3] = "Bihar"; ar[4] = "Chhattisgarh" ; ar[5] = "Goa" ;
        ar[6] = "Gujarat" ; ar[7] = "Haryana"; ar[8] = "Himachal Pradesh" ;
        ar[9] = "Jammu and Kashmir" ; ar[10] = "Jharkhand" ; ar[11] = "Karnataka";
        ar[12] = "Kerala"; ar[13] = "Madhya Pradesh"; ar[14] = "Maharashtra";
        ar[15] = "Manipur"; ar[16] = "Meghalaya"; ar[17] = "Mizoram";
        ar[18] = "Nagaland"; ar[19] = "Odisha"; ar[20] = "Punjab";
        ar[21] = "Rajasthan"; ar[22] = "Sikkim"; ar[23] = "Tamil Nadu";
        ar[24] = "Telangana"; ar[25] = "Tripura"; ar[26] = "Uttar Pradesh";
        ar[27] = "Uttarakhand"; ar[28] = "West Bengal";
        String Show = "\n";
        if( Typed.length() > 0 ){
            char c = (char) (Typed.charAt(0) - 'a' + 'A');
            for( int i = 0; i < 29; i++ ){
                if( ar[i].charAt(0) == Typed.charAt(0) || ar[i].charAt(0) == c ){
                    Show += "               ";
                    Show += ar[i]; 
                    Show += "\n";
                }
            }
        }
        return Show;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        privacy = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        State1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        State2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        State3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        State4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hint = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Ad");

        jLabel6.setFont(new java.awt.Font("Noteworthy", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Labs");

        Home.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 3.57.11 PM.png")); // NOI18N
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Home)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 819, -1));

        LogOut.setBackground(new java.awt.Color(255, 0, 51));
        LogOut.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 3.26.05 PM.png")); // NOI18N
        LogOut.setText("LOG OUT");
        LogOut.setBorderPainted(false);
        LogOut.setContentAreaFilled(false);
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 0, -1, 54));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 5.33.57 PM.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 72, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 5.35.19 PM.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 181, -1, -1));

        Next.setBorderPainted(false);
        Next.setContentAreaFilled(false);
        Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 589, 80, 30));

        jLabel3.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Specify states");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 202, 88, -1));

        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 589, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 5.51.39 PM.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 583, -1, -1));

        jPanel5.setBackground(new java.awt.Color(212, 211, 211));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 4.12.15 PM.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("2018 AdLabs | ");

        privacy.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        privacy.setForeground(new java.awt.Color(0, 153, 255));
        privacy.setText("Privacy Policy");
        privacy.setBorderPainted(false);
        privacy.setContentAreaFilled(false);
        privacy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        privacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 980, -1));

        jLabel9.setFont(new java.awt.Font("KufiStandardGK", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Enter states name in which you want to show adds");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        State1.setBackground(new java.awt.Color(0, 0, 0));
        State1.setFont(new java.awt.Font("KufiStandardGK", 0, 13)); // NOI18N
        State1.setForeground(new java.awt.Color(255, 255, 255));
        State1.setBorder(null);
        State1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State1ActionPerformed(evt);
            }
        });
        State1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                State1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                State1KeyReleased(evt);
            }
        });
        jPanel1.add(State1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-06 at 10.38.48 PM.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 140, -1));

        State2.setBackground(new java.awt.Color(0, 0, 0));
        State2.setFont(new java.awt.Font("KufiStandardGK", 0, 13)); // NOI18N
        State2.setForeground(new java.awt.Color(255, 255, 255));
        State2.setBorder(null);
        State2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State2ActionPerformed(evt);
            }
        });
        State2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                State2KeyReleased(evt);
            }
        });
        jPanel1.add(State2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 150, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-06 at 10.38.48 PM.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 140, -1));

        State3.setBackground(new java.awt.Color(0, 0, 0));
        State3.setFont(new java.awt.Font("KufiStandardGK", 0, 13)); // NOI18N
        State3.setForeground(new java.awt.Color(255, 255, 255));
        State3.setBorder(null);
        State3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State3ActionPerformed(evt);
            }
        });
        State3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                State3KeyReleased(evt);
            }
        });
        jPanel1.add(State3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 150, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-06 at 10.38.48 PM.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, -1));

        State4.setBackground(new java.awt.Color(0, 0, 0));
        State4.setFont(new java.awt.Font("KufiStandardGK", 0, 13)); // NOI18N
        State4.setForeground(new java.awt.Color(255, 255, 255));
        State4.setBorder(null);
        State4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State4ActionPerformed(evt);
            }
        });
        State4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                State4KeyReleased(evt);
            }
        });
        jPanel1.add(State4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 150, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-06 at 10.38.48 PM.png")); // NOI18N
        jLabel13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel13KeyReleased(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 140, -1));

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("2.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("4.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("1.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("3.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        Hint.setEditable(false);
        Hint.setBackground(new java.awt.Color(0, 0, 0));
        Hint.setColumns(20);
        Hint.setForeground(new java.awt.Color(255, 255, 255));
        Hint.setRows(5);
        Hint.setBorder(null);
        jScrollPane1.setViewportView(Hint);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 160));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Thonburi", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Suggestions");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 280, 80, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-12 at 12.12.18 AM.png")); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 279, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Successfully ");
        this.dispose();
        front nf = new front();
        nf.setVisible(rootPaneCheckingEnabled);
    }                                      

    private void State1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void State2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void State3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void State4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void State1KeyReleased(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:  
        String Typed = State1.getText();
        if( Typed.length() > 0 ){
            Hint.setText(Find(Typed));
        }
    }                                  

    private void State1KeyTyped(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
        
    }                               

    private void State2KeyReleased(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        String Typed = State2.getText();
        if( Typed.length() > 0 ){
            Hint.setText(Find(Typed));
        }
    }                                  

    private void State3KeyReleased(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        String Typed = State3.getText();
        if( Typed.length() > 0 ){
            Hint.setText(Find(Typed));
        }
    }                                  

    private void jLabel13KeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void State4KeyReleased(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        String Typed = State4.getText();
        if( Typed.length() > 0 ){
            Hint.setText(Find(Typed));
        }
    }                                  

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        info[3] = State1.getText();
        info[4] = State2.getText();
        info[5] = State3.getText();
        info[6] = State4.getText();
        int flag = 1;
        for( int i = 3; i < 7; i++ ){
            if( info[i].length() == 0 )flag = 0;
        }
        if( flag == 0 ){
            JOptionPane.showMessageDialog(null, "Fill all the Details");
        }
        else{
            JOptionPane.showMessageDialog(null, debug(7));
            this.dispose();
            ThreeRunAdd.main(info);
        }
    }                                    

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        this.dispose();
        RunAd.main(info);
    }                                    

    private void privacyActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        adlabs.privacy.main(info);
    }                                       

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        this.dispose();
        runAdd.main(info);
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        for( int i = 0; i < args.length; i++ ){
            info[i] = args[i];
        }
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
            java.util.logging.Logger.getLogger(TwoRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoRunAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Back;
    private javax.swing.JTextArea Hint;
    private javax.swing.JButton Home;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Next;
    private javax.swing.JTextField State1;
    private javax.swing.JTextField State2;
    private javax.swing.JTextField State3;
    private javax.swing.JTextField State4;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton privacy;
    // End of variables declaration                   
}
