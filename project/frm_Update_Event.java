package project;

import java.awt.*;
import javax.swing.*;

public class frm_Update_Event extends javax.swing.JFrame
{
    //Object of classes
    Event obj_Event;

    public frm_Update_Event()
    {
        initComponents();
        this.setTitle("Edit Event");
        this.setSize(600, 700);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.scaleBckgrd();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        obj_Event = new Event();
    }

    //Method to clear fields
    public void clear()
    {
        txt_Name.setText("");
        txt_Date.setText("");
        txt_Day.setText("");
        txt_Venue.setText("");
        txt_Budget.setText("");
        txt_Club.setText("");
        txt_Ticket.setText("");
        txt_Descript.setText("");
    }

    //Method to set background image on lbl_Bckgrd
    public void scaleBckgrd()
    {
        //Scaling Image for lbl_Bckgrd (Main Background)
        lbl_Bckgrd.setSize(this.getWidth(), this.getHeight());
        ImageIcon ic_Bckgrd = new ImageIcon(getClass().getResource("/resources/bckgrd_Student.jpg"));
        Image img_Bckgrd = ic_Bckgrd.getImage();
        Image imgScaled_Bckgrd = img_Bckgrd.getScaledInstance(lbl_Bckgrd.getWidth(), lbl_Bckgrd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Bckgrd = new ImageIcon(imgScaled_Bckgrd);
        lbl_Bckgrd.setIcon(scaled_Bckgrd);
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

        lbl_Day = new javax.swing.JLabel();
        txt_Venue = new javax.swing.JTextField();
        lbl_Name = new javax.swing.JLabel();
        lbl_Venue = new javax.swing.JLabel();
        lbl_Budget = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        lbl_Descript = new javax.swing.JLabel();
        Ticket = new javax.swing.JLabel();
        lbl_Club = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_Date = new javax.swing.JTextField();
        txt_Day = new javax.swing.JTextField();
        txt_Budget = new javax.swing.JTextField();
        txt_Club = new javax.swing.JTextField();
        txt_Ticket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Descript = new javax.swing.JTextArea();
        btn_Close = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Del = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        lbl_Bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Event Approval");
        setBackground(new java.awt.Color(109, 197, 163));
        setLocationByPlatform(true);
        setName("Frame"); // NOI18N
        getContentPane().setLayout(null);

        lbl_Day.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Day.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Day.setText("Day:");
        getContentPane().add(lbl_Day);
        lbl_Day.setBounds(90, 140, 41, 45);

        txt_Venue.setBackground(new java.awt.Color(255, 255, 255));
        txt_Venue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Venue.setForeground(new java.awt.Color(0, 0, 0));
        txt_Venue.setText("txt_Venue");
        getContentPane().add(txt_Venue);
        txt_Venue.setBounds(140, 210, 243, 45);

        lbl_Name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Name.setText("Name:");
        getContentPane().add(lbl_Name);
        lbl_Name.setBounds(70, 20, 58, 45);

        lbl_Venue.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Venue.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Venue.setText("Venue:");
        getContentPane().add(lbl_Venue);
        lbl_Venue.setBounds(70, 210, 64, 45);

        lbl_Budget.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Budget.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Budget.setText("Budget:");
        getContentPane().add(lbl_Budget);
        lbl_Budget.setBounds(60, 280, 70, 45);

        lbl_Date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Date.setText("Date:");
        getContentPane().add(lbl_Date);
        lbl_Date.setBounds(80, 80, 47, 45);

        lbl_Descript.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Descript.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Descript.setText("Description:");
        getContentPane().add(lbl_Descript);
        lbl_Descript.setBounds(20, 480, 107, 45);

        Ticket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Ticket.setForeground(new java.awt.Color(255, 255, 255));
        Ticket.setText("Ticket:");
        getContentPane().add(Ticket);
        Ticket.setBounds(60, 420, 60, 45);

        lbl_Club.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Club.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Club.setText("Club:");
        getContentPane().add(lbl_Club);
        lbl_Club.setBounds(80, 350, 47, 45);

        txt_Name.setEditable(false);
        txt_Name.setBackground(new java.awt.Color(255, 255, 255));
        txt_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Name.setForeground(new java.awt.Color(0, 0, 0));
        txt_Name.setText("txt_Name");
        txt_Name.setToolTipText("Not Updatable");
        getContentPane().add(txt_Name);
        txt_Name.setBounds(140, 20, 243, 45);

        txt_Date.setBackground(new java.awt.Color(255, 255, 255));
        txt_Date.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Date.setForeground(new java.awt.Color(0, 0, 0));
        txt_Date.setText("txt_Date");
        getContentPane().add(txt_Date);
        txt_Date.setBounds(140, 80, 243, 45);

        txt_Day.setBackground(new java.awt.Color(255, 255, 255));
        txt_Day.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Day.setForeground(new java.awt.Color(0, 0, 0));
        txt_Day.setText("txt_Day");
        getContentPane().add(txt_Day);
        txt_Day.setBounds(140, 150, 243, 45);

        txt_Budget.setBackground(new java.awt.Color(255, 255, 255));
        txt_Budget.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Budget.setForeground(new java.awt.Color(0, 0, 0));
        txt_Budget.setText("txt_Budget");
        getContentPane().add(txt_Budget);
        txt_Budget.setBounds(140, 280, 243, 45);

        txt_Club.setBackground(new java.awt.Color(255, 255, 255));
        txt_Club.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Club.setForeground(new java.awt.Color(0, 0, 0));
        txt_Club.setText("txt_Club");
        getContentPane().add(txt_Club);
        txt_Club.setBounds(140, 350, 243, 45);

        txt_Ticket.setBackground(new java.awt.Color(255, 255, 255));
        txt_Ticket.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Ticket.setForeground(new java.awt.Color(0, 0, 0));
        txt_Ticket.setText("txt_Ticket");
        getContentPane().add(txt_Ticket);
        txt_Ticket.setBounds(140, 420, 243, 45);

        txt_Descript.setBackground(new java.awt.Color(255, 255, 255));
        txt_Descript.setColumns(20);
        txt_Descript.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_Descript.setForeground(new java.awt.Color(0, 0, 0));
        txt_Descript.setRows(5);
        txt_Descript.setText("txt_Descript");
        jScrollPane1.setViewportView(txt_Descript);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 480, 243, 160);

        btn_Close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Close.setText("Close");
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_CloseMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Close);
        btn_Close.setBounds(430, 310, 109, 45);

        btn_Update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_UpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Update);
        btn_Update.setBounds(430, 20, 109, 45);

        btn_Del.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Del.setText("Delete");
        btn_Del.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_DelMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Del);
        btn_Del.setBounds(430, 90, 109, 45);

        btn_Clear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_ClearMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Clear);
        btn_Clear.setBounds(430, 160, 109, 45);

        btn_Add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.setEnabled(false);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_AddMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Add);
        btn_Add.setBounds(430, 230, 109, 45);

        lbl_Bckgrd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_Bckgrd);
        lbl_Bckgrd.setBounds(0, 0, 680, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for btn_Update
    private void btn_UpdateMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_UpdateMouseClicked
    {//GEN-HEADEREND:event_btn_UpdateMouseClicked
        boolean Success = obj_Event.update_Event(getTxt_Name(), getTxt_Date(), getTxt_Day(), getTxt_Venue(), getTxt_Budget(), getTxt_Descript(), getTxt_Club(), getTxt_Ticket());

        if (Success)
        {
            JOptionPane.showMessageDialog(null, "Event Updated Successfully");
            this.dispose();
        }
    }//GEN-LAST:event_btn_UpdateMouseClicked

    //btn_Close
    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_CloseMouseClicked
    {//GEN-HEADEREND:event_btn_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_CloseMouseClicked

    //Method for btn_Del
    private void btn_DelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_DelMouseClicked
    {//GEN-HEADEREND:event_btn_DelMouseClicked
        boolean Success = obj_Event.del_Event(getTxt_Name(), "upcoming");

        if (Success)
        {
            JOptionPane.showMessageDialog(null, "Event Deleted Successfully");
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Event Deleted Successfully");
            this.dispose();
        }
    }//GEN-LAST:event_btn_DelMouseClicked

    //Method for btn_Clear
    private void btn_ClearMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_ClearMouseClicked
    {//GEN-HEADEREND:event_btn_ClearMouseClicked
        clear();
        btn_Add.setEnabled(true);
        txt_Name.setEditable(true);
    }//GEN-LAST:event_btn_ClearMouseClicked

    //Method for btn_Add (if add new entry in DB tbl_Up_Events)
    private void btn_AddMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_AddMouseClicked
    {//GEN-HEADEREND:event_btn_AddMouseClicked
        String Ticket = txt_Ticket.getText();
        boolean Success;
        int chk = 0;

        if (txt_Name.getText().isEmpty() || txt_Day.getText().isEmpty() || txt_Date.getText().isEmpty() || txt_Venue.getText().isEmpty() || txt_Budget.getText().isEmpty() || txt_Club.getText().isEmpty() || txt_Ticket.getText().isEmpty() || txt_Descript.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please, Enter in all fields");
            txt_Name.requestFocus();
        }
        else
        {
            try
            {
                chk = Integer.parseInt(Ticket);

                if (chk > 0)
                {
                    Success = obj_Event.appr_Pro_Event(getTxt_Name(), getTxt_Date(), getTxt_Day(), getTxt_Venue(), getTxt_Budget(), getTxt_Descript(), getTxt_Club(), getTxt_Ticket());

                    if (Success)
                    {
                        JOptionPane.showMessageDialog(this, "Event Added Successfully");
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Something went wrong");
                        this.dispose();
                    }
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please, Enter correct Ticket price.");
                txt_Ticket.requestFocus();
            }
        }

        //boolean Success = obj_Event.update_Event(getTxt_Name(), getTxt_Date(), getTxt_Day(), getTxt_Venue(), getTxt_Budget(), getTxt_Descript(), getTxt_Club(), getTxt_Ticket());

    }//GEN-LAST:event_btn_AddMouseClicked

    //SETTER GETTER START
    public String getTxt_Budget()
    {
        return txt_Budget.getText();
    }

    public void setTxt_Budget(String Budget)
    {
        this.txt_Budget.setText(Budget);
    }

    public String getTxt_Date()
    {
        return txt_Date.getText();
    }

    public void setTxt_Date(String Date)
    {
        this.txt_Date.setText(Date);
    }

    public String getTxt_Day()
    {
        return txt_Day.getText();
    }

    public void setTxt_Day(String Day)
    {
        this.txt_Day.setText(Day);
    }

    public String getTxt_Descript()
    {
        return txt_Descript.getText();
    }

    public void setTxt_Descript(String Descript)
    {
        this.txt_Descript.setText(Descript);
    }

    public String getTxt_Name()
    {
        return txt_Name.getText();
    }

    public void setTxt_Name(String Name)
    {
        this.txt_Name.setText(Name);
    }

    public String getTxt_Venue()
    {
        return txt_Venue.getText();
    }

    public void setTxt_Venue(String Venue)
    {
        this.txt_Venue.setText(Venue);
    }

    public String getTxt_Club()
    {
        return txt_Club.getText();
    }

    public void setTxt_Club(String Club)
    {
        this.txt_Club.setText(Club);
    }

    public String getTxt_Ticket()
    {
        return txt_Ticket.getText();
    }

    public void setTxt_Ticket(String Ticket)
    {
        this.txt_Ticket.setText(Ticket);
    }
    //SETTER GETTER END

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ticket;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Del;
    private javax.swing.JButton btn_Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bckgrd;
    private javax.swing.JLabel lbl_Budget;
    private javax.swing.JLabel lbl_Club;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Day;
    private javax.swing.JLabel lbl_Descript;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Venue;
    private javax.swing.JTextField txt_Budget;
    private javax.swing.JTextField txt_Club;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Day;
    private javax.swing.JTextArea txt_Descript;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Ticket;
    private javax.swing.JTextField txt_Venue;
    // End of variables declaration//GEN-END:variables
}
