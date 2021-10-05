package project;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class frm_Booking extends javax.swing.JFrame
{
    //Object of class
    frm_Welcome obj_frm_Welcome;
    frm_Detail_Attendee obj_frm_Detail_Attendee;
    
    //CONSTRUCTORS
    public frm_Booking()
    {
        initComponents();
        this.setTitle("Booking Form");
        this.setSize(700, 550);        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.scaleBckgrd();
        this.setData();
        
        //sets rootPanel transparent so image can to shown and sets size of rootpanel same as JFrame
        this.rootPanel.setOpaque(false);
        this.rootPanel.setSize(this.getWidth() - 50, this.getHeight());       
    }

    //Method to set background image on lbl_Bckgrd
    public void scaleBckgrd()
    {
        //Scaling Image for lbl_Bckgrd (Main Background)
        lbl_Bckgrnd.setSize(this.getWidth(), this.getHeight());
        ImageIcon ic_Bckgrnd = new ImageIcon(getClass().getResource("/resources/bckgrnd_Customer.jpeg"));
        Image img_Bckgrnd = ic_Bckgrnd.getImage();
        Image imgScaled_Bckgrnd = img_Bckgrnd.getScaledInstance(lbl_Bckgrnd.getWidth(), lbl_Bckgrnd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Bckgrnd = new ImageIcon(imgScaled_Bckgrnd);
        lbl_Bckgrnd.setIcon(scaled_Bckgrnd);
    }

    //Method to set data on text fields by fetching it from DB
    public void setData()
    {
        //CODE for fetching data from DB from tbl_Up_Events and show on table
        //Things for DB
        //Connection_to_DB it connects to Access DB
        Connect_to_DB obj_conDB = new Connect_to_DB();
        Connection obj_con = obj_conDB.make_Connection();

        //Statement is used for updating, inserting and deleting
        Statement stmt = null;
        ResultSet res = null;

        try
        {
            stmt = obj_con.createStatement();

            String str_Data = "select * from tbl_Up_Events";

            res = stmt.executeQuery(str_Data);

            while (res.next())
            {
                String Name = res.getString("evntName");
                String Day = res.getString("evntDay");
                String Date = res.getString("evntDate");
                String Venue = res.getString("evntVenue");

                String table[] =
                {
                    Name, Day, Date, Venue
                };

                DefaultTableModel tblModel = (DefaultTableModel) tbl_Event.getModel();
                tblModel.addRow(table);
            }

            obj_con.close();

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        //CODE for tables ENDS
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rootPanel = new javax.swing.JPanel();
        lbl_Table = new javax.swing.JLabel();
        lbl_Heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Event = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_Close = new javax.swing.JButton();
        lbl_Bckgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbl_Table.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Table.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Table.setText("Upcoming Events");

        lbl_Heading.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Heading.setText("Register for Event");

        tbl_Event.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbl_Event.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Event Name", "Date", "Day", "Venue"
            }
        ));
        tbl_Event.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tbl_EventMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Event);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Click on Event Name to Register");

        btn_Close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Close.setText("Close");
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(lbl_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 386, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);
        rootPanel.setBounds(20, 20, 740, 750);

        lbl_Bckgrnd.setText("lbl_Bckgrnd");
        getContentPane().add(lbl_Bckgrnd);
        lbl_Bckgrnd.setBounds(0, 0, 781, 787);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //MOUSE click event on table (it opens frm_Details_Attendee)
    private void tbl_EventMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tbl_EventMouseClicked
    {//GEN-HEADEREND:event_tbl_EventMouseClicked
        int index = tbl_Event.getSelectedRow();
        TableModel Model = tbl_Event.getModel();
        
        String Event = Model.getValueAt(index, 0).toString();
        String Date = Model.getValueAt(index, 1).toString();
        String Day = Model.getValueAt(index, 2).toString();
        String Venue = Model.getValueAt(index, 3).toString();      
        
        obj_frm_Detail_Attendee = new frm_Detail_Attendee();

        obj_frm_Detail_Attendee.setTxt_Event(Event);
        obj_frm_Detail_Attendee.setTxt_Date(Date);
        obj_frm_Detail_Attendee.setTxt_Day(Day);
        obj_frm_Detail_Attendee.setTxt_Venue(Venue);
        
        obj_frm_Detail_Attendee.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbl_EventMouseClicked

    //Method for btn_Close (It takes back to frm_Welcome)
    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_CloseMouseClicked
    {//GEN-HEADEREND:event_btn_CloseMouseClicked
        this.dispose();
        obj_frm_Welcome = new frm_Welcome();        
    }//GEN-LAST:event_btn_CloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frm_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frm_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frm_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frm_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frm_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bckgrnd;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_Table;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tbl_Event;
    // End of variables declaration//GEN-END:variables
}
