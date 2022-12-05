
import ProjectPackage.ProvideConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Timings extends javax.swing.JFrame {

    public Timings() {
        initComponents();
        Calendar cal = Calendar.getInstance();
      
      String hour = Integer.toString(cal.get(Calendar.HOUR_OF_DAY));
      String minute = Integer.toString(cal.get(Calendar.MINUTE));
      String second = Integer.toString(cal.get(Calendar.SECOND));
      jTextField1.setText(hour+":"+minute+" AM");
      jTextField2.setText(hour+":"+minute+" AM");
      jTextField3.setText(hour+":"+minute+" AM");
      jTextField4.setText(hour+":"+minute+" AM");
      jTextField5.setText(hour+":"+minute+" AM");
      jTextField7.setText(hour+":"+minute+" AM");
      jTextField8.setText(hour+":"+minute+" AM");
      jTextField9.setText(hour+":"+minute+" AM");
      jTextField10.setText(hour+":"+minute+" AM");
      jTextField11.setText(hour+":"+minute+" AM");
      jTextField12.setText(hour+":"+minute+" AM");
      jTextField13.setText(hour+":"+minute+" AM");
      jTextField14.setText(hour+":"+minute+" AM");
      jTextField15.setText(hour+":"+minute+" AM");
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black_820_450x400.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(425, 150));
        setMinimumSize(new java.awt.Dimension(905, 660));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 660));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/set time 240.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 660));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DAY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("FROM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("TO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("MONDAY:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("TUESDAY:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("WEDNESDAY:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("THURSDAY:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("FRIDAY:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("SATURDAY:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("SUNDAY:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 181, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 150, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 150, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 150, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 150, 30));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 150, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 150, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 150, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 150, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 150, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 150, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 150, -1));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 150, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        String from1 = jTextField1.getText();
        String to1 = jTextField2.getText();
        
        String from2 = jTextField3.getText();
        String to2 = jTextField4.getText();
        
        String from3 = jTextField5.getText();
        String to3 = jTextField7.getText();
        
        String from4 = jTextField8.getText();
        String to4 = jTextField9.getText();
        
        String from5 = jTextField10.getText();
        String to5 = jTextField11.getText();
       
        String from6 = jTextField12.getText();
        String to6 = jTextField13.getText();
        String from7 = jTextField14.getText();
        String to7 = jTextField15.getText();
        String name1 = "Monday";
        String name2 = "Tuesday";
        String name3 = "Wednesday";
        String name4 = "Thursday";
        String name5 = "Friday";
        String name6 = "Saturday";
        String name7 = "Sunday";
        
        try
        {
           Connection con = ProvideConnection.getCon();
           Statement st = con.createStatement();
           st.executeUpdate("UPDATE Timings SET from_time='"+from1+"',to_time='"+to1+"' WHERE day='"+name1+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from2+"',to_time='"+to2+"' WHERE day='"+name2+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from3+"',to_time='"+to3+"' WHERE day='"+name3+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from4+"',to_time='"+to4+"' WHERE day='"+name4+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from5+"',to_time='"+to5+"' WHERE day='"+name5+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from6+"',to_time='"+to6+"' WHERE day='"+name6+"'");
           st.executeUpdate("UPDATE Timings SET from_time='"+from7+"',to_time='"+to7+"' WHERE day='"+name7+"'");
           
           JOptionPane.showMessageDialog(null,"Timings successfully updated!");
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name1 = "Monday";
        String name2 = "Tuesday";
        String name3 = "Wednesday";
        String name4 = "Thursday";
        String name5 = "Friday";
        String name6 = "Saturday";
        String name7 = "Sunday";
        
        
        try
        {
            Connection con = ProvideConnection.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name1+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name2+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name3+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name4+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name5+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name6+"'" );
            st.executeUpdate("UPDATE timings SET from_time = '00:00 AM',to_time = '00:00 AM' WHERE day='"+name7+"'" );
            
            JOptionPane.showMessageDialog(null,"Timings successfully reset!");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(Timings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
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
