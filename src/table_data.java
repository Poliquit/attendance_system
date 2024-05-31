
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class table_data extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public table_data() {
        initComponents();
        setLocationRelativeTo(null);
        conn = ConDB.getConnection();
        fetch();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_studentnumber = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_courseyear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_semester = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("TABLE DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student No.#");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(txt_studentnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 30));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 30));
        jPanel1.add(txt_courseyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student CourseYear");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Student Semester");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel1.add(txt_semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Date  dd/mm/yy");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Time 00:00pm");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        jPanel1.add(txt_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 100, 30));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        tbl_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_dataKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);
        if (tbl_data.getColumnModel().getColumnCount() > 0) {
            tbl_data.getColumnModel().getColumn(0).setResizable(false);
            tbl_data.getColumnModel().getColumn(1).setResizable(false);
            tbl_data.getColumnModel().getColumn(2).setResizable(false);
            tbl_data.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 630, 250));

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        btn_insert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        jPanel1.add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        String name = txt_name.getText();
        String student_no = txt_studentnumber.getText();
        String course_yr = txt_courseyear.getText();
        String semester = txt_semester.getText();
        String date = txt_date.getText();
        String time = txt_time.getText();
        
        try {
            pst = conn.prepareStatement("INSERT INTO `data_table`(`student_name`, `student_number`, `course_yr`, `semester`, `date`, `time`) VALUES (?,?,?,?,?,?)");
            
            pst.setString(1, name);
            pst.setString(2, student_no);
            pst.setString(3, course_yr);
            pst.setString(4, semester);
            pst.setString(5, date);
            pst.setString(6, time);
            
            int k = pst.executeUpdate();
            if (k > 0){
                JOptionPane.showMessageDialog(this, "1 Student inserted Successfully","System",1);
                txt_name.setText("");
                txt_studentnumber.setText("");
                txt_courseyear.setText("");
                txt_semester.setText("");
                txt_date.setText("");
                txt_time.setText("");
                fetch();
            } else {
                JOptionPane.showMessageDialog(this, "Error please try again.","System",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         String student_no = txt_studentnumber.getText();
         
         try {
            pst = conn.prepareStatement("DELETE FROM `data_table` WHERE student_number=?");
            pst.setString(1, student_no);
            
            
            int k = pst.executeUpdate();
            if(k == 1 ){
                JOptionPane.showMessageDialog(null, "1 Record has been DELETE");
                txt_name.setText("");
                txt_studentnumber.setText("");
                txt_courseyear.setText("");
                txt_semester.setText("");
                txt_date.setText("");
                txt_time.setText("");
                fetch();
            } else {
                JOptionPane.showMessageDialog(null, "Record not Found");
            }
            
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_dataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_dataKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_dataKeyReleased

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int r = tbl_data.getSelectedRow();
        String click = (tbl_data.getModel().getValueAt(r, 1).toString());
        String sql = "SELECT `student_name`, `student_number`, `course_yr`, `semester`, `date`, `time` FROM `data_table` WHERE student_number='"+click+"'";   
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                String name = rs.getString(1);
                String student_no = rs.getString(2);
                String course_yr = rs.getString(3);
                String semester = rs.getString(4);
                String date = rs.getString(5);
                String time = rs.getString(6);
                
                txt_name.setText(name);
                txt_studentnumber.setText(student_no);
                txt_courseyear.setText(course_yr);
                txt_semester.setText(semester);
                txt_date.setText(date);
                txt_time.setText(time);
                
            }
        } catch (Exception e) {
            System.out.println(e);;
        }
        
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String name = txt_search.getText();
        String sql = "SELECT * FROM `data_table` WHERE INSTR(student_number, '"+name+"')>0";
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbl_data.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    public void fetch() {
        try {
          String sql = "SELECT `student_name`, `student_number`, `course_yr`, `semester`, `date`, `time` FROM `data_table`";
          pst = conn.prepareStatement(sql);
          rs = pst.executeQuery();
          tbl_data.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            System.out.println(e);
        }    
    }
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
            java.util.logging.Logger.getLogger(table_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_courseyear;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_semester;
    private javax.swing.JTextField txt_studentnumber;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
