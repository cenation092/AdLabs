/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adlabs;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mohitrai
 */
public class FiveRunAdd extends javax.swing.JFrame {

    /**
     * Creates new form FiveRunAdd
     */
    File f ;
    // username userid goal 4_states language category h1 h2 desc web img logo
    
    public static String info[] = new String[100];
    public String debug(int l){
        String s = "";
        for( int i = 0; i < l; i++ ){
            s += info[i];
            s += "\n";
        }
        return s;
    }
    
    public FiveRunAdd() {
        initComponents();
        LogOut1.setText(info[0]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Home1 = new javax.swing.JButton();
        LogOut1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        privacy1 = new javax.swing.JButton();
        imgUpload = new javax.swing.JButton();
        logoUpload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Noteworthy", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Ad");

        jLabel11.setFont(new java.awt.Font("Noteworthy", 1, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Labs");

        Home1.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 3.57.11 PM.png")); // NOI18N
        Home1.setBorderPainted(false);
        Home1.setContentAreaFilled(false);
        Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Home1)
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 819, -1));

        LogOut1.setBackground(new java.awt.Color(255, 0, 51));
        LogOut1.setFont(new java.awt.Font("Monaco", 1, 20)); // NOI18N
        LogOut1.setForeground(new java.awt.Color(255, 255, 255));
        LogOut1.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 3.26.05 PM.png")); // NOI18N
        LogOut1.setText("LOG OUT");
        LogOut1.setBorderPainted(false);
        LogOut1.setContentAreaFilled(false);
        LogOut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut1ActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 0, 150, 54));

        jPanel7.setBackground(new java.awt.Color(212, 211, 211));
        jPanel7.setForeground(new java.awt.Color(153, 153, 153));

        jLabel20.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-10-30 at 4.12.15 PM.png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel21.setText("2018 AdLabs | ");

        privacy1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        privacy1.setForeground(new java.awt.Color(0, 153, 255));
        privacy1.setText("Privacy Policy");
        privacy1.setBorderPainted(false);
        privacy1.setContentAreaFilled(false);
        privacy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        privacy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacy1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(privacy1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 680, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privacy1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 960, 20));

        imgUpload.setBorderPainted(false);
        imgUpload.setContentAreaFilled(false);
        imgUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgUploadActionPerformed(evt);
            }
        });
        jPanel1.add(imgUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 199, 100, 100));

        logoUpload.setBorderPainted(false);
        logoUpload.setContentAreaFilled(false);
        logoUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoUploadActionPerformed(evt);
            }
        });
        jPanel1.add(logoUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 389, 100, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-05 at 5.07.55 PM.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-05 at 5.13.28 PM.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-05 at 5.11.16 PM.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-05 at 5.12.55 PM.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-05 at 5.11.16 PM.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        next.setBorderPainted(false);
        next.setContentAreaFilled(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 90, 40));

        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 90, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-01 at 7.18.33 PM.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        icon.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 240, 170));

        icon1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 170));
        jPanel1.add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 30));
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/mohitrai/Desktop/Screenshot 2018-11-12 at 12.01.12 AM.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Successfully ");
        this.dispose();
        front nf = new front();
        nf.setVisible(rootPaneCheckingEnabled);
    }                                       

    private void imgUploadActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        JFileChooser fl = new JFileChooser();
        fl.showOpenDialog(null);
        f = fl.getSelectedFile();
        String name = f.getAbsolutePath();
        imgLabel.setText(name);
        icon.setIcon(ResizeImage(name, null));
    }                                         

    private void logoUploadActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JFileChooser fl = new JFileChooser();
        fl.showOpenDialog(null);
        f = fl.getSelectedFile();
        String name = f.getAbsolutePath();
        logoLabel.setText(name);
        icon1.setIcon(ResizeImage(name, null));
    }                                          

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        this.dispose();
        FourRunAdd.main(info);
    }                                    

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        info[13] = imgLabel.getText();
        info[14] = logoLabel.getText();
        int flag = 1;
        for( int i = 0; i < 15; i++ ){
            if( info[i].length() == 0 )flag = 0;
        }
        if( flag == 0 ){
            JOptionPane.showMessageDialog(null, "Fill all the Details");
        }
        else{
            JOptionPane.showMessageDialog(null, debug(15));
            this.dispose();
            SixRunAdd.main(info);
        }
    }                                    

    private void privacy1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        privacy.main(info);
    }                                        

    private void Home1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        this.dispose();
        runAdd.main(info);
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for( int i = 0; i < args.length; i++ ){
            info[i] = args[i];
        }
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
            java.util.logging.Logger.getLogger(FiveRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiveRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiveRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiveRunAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiveRunAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Home1;
    private javax.swing.JButton LogOut1;
    private javax.swing.JButton back;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton imgUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoUpload;
    private javax.swing.JButton next;
    private javax.swing.JButton privacy1;
    // End of variables declaration                   

    private ImageIcon ResizeImage(String path, byte[] pic) {
        ImageIcon My = null;
        if( path != null ){
            My = new ImageIcon(path);
        }
        else{
            My = new ImageIcon(pic);
        }
        Image img = My.getImage();
        Image nimage = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(nimage);
        return image;
    }
}
