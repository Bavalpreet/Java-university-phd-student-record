/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegeprojectm;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;
import java.text.*;
import java.awt.print.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import org.apache.commons.lang.ObjectUtils.Null;
/**
 *
 * @author Jatinder Walia
 */




public class NewJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() throws SQLException, IOException {
        initComponents();
        fetchdata();
        fetchdataup();
        fetchdatac();
        fetchdatacup();
        fetchdatapr();
        fetchdatasupervisor();
        fetchdatadel();
        setguideseats();
        visibleoff();
        
        
        ((JTextField)dor.getDateEditor().getUiComponent()).setText("");
        ((JTextField)edate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)redate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)fdelay.getDateEditor().getUiComponent()).setText("");
        ((JTextField)sdelay.getDateEditor().getUiComponent()).setText("");
        ((JTextField)rdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)dops.getDateEditor().getUiComponent()).setText("");
        ((JTextField)ts.getDateEditor().getUiComponent()).setText("");
        ((JTextField)edateup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)rdateup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)fdelayup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)sdelayup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)rdateup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)dopsup.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tsup.getDateEditor().getUiComponent()).setText("");
       // coguidecombo.setSelectedItem(Null);
        coguidecombo.insertItemAt("", 0);
        coguidecupcombo.insertItemAt("", 0);
        
        
        
        /*((JTextField)redate.getDateEditor().getUiComponent()).getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
        warn();
        }
        public void removeUpdate(DocumentEvent e) {
        warn();
        }
        public void insertUpdate(DocumentEvent e) {
       warn();
     }

     public void warn() {
    
        String dr = ((JTextField)redate.getDateEditor().getUiComponent()).getText();
        String string = dr;
        DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, 90);
        Date futureDate = cal.getTime();
        fdelay.setDate(futureDate);
         
  }
} );
        
        
        
        
        ((JTextField)redateup.getDateEditor().getUiComponent()).getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
        warn();
        }
        public void removeUpdate(DocumentEvent e) {
        warn();
        }
        public void insertUpdate(DocumentEvent e) {
       warn();
     }

     public void warn() {
    
        String dr = ((JTextField)redateup.getDateEditor().getUiComponent()).getText();
        String string = dr;
        DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, 90);
        Date futureDate = cal.getTime();
        fdelayup.setDate(futureDate);
         
  }
} );*/
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        designation = new javax.swing.JComboBox<>();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        nosgu = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        dor = new com.toedter.calendar.JDateChooser();
        jLabel61 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        smobile = new javax.swing.JTextField();
        aseats = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        facultyc = new javax.swing.JComboBox<>();
        departmentc = new javax.swing.JComboBox<>();
        guidecombo = new javax.swing.JComboBox<>();
        fdelaybox = new javax.swing.JCheckBox();
        sdelaybox = new javax.swing.JCheckBox();
        renrollbox = new javax.swing.JCheckBox();
        edate = new com.toedter.calendar.JDateChooser();
        rdate = new com.toedter.calendar.JDateChooser();
        redate = new com.toedter.calendar.JDateChooser();
        fdelay = new com.toedter.calendar.JDateChooser();
        sdelay = new com.toedter.calendar.JDateChooser();
        dops = new com.toedter.calendar.JDateChooser();
        ts = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        coguidecombo = new javax.swing.JComboBox<>();
        cobox = new javax.swing.JCheckBox();
        gvs = new javax.swing.JTextField();
        cgvs = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        rno = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        facultyup = new javax.swing.JComboBox<>();
        departmentup = new javax.swing.JComboBox<>();
        nameup = new javax.swing.JTextField();
        designationup = new javax.swing.JComboBox<>();
        premobileup = new javax.swing.JTextField();
        mobileup = new javax.swing.JTextField();
        emailup = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        dorup = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        snameup = new javax.swing.JTextField();
        rnoup = new javax.swing.JTextField();
        smobilenew = new javax.swing.JTextField();
        aseatsup = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        facultycup = new javax.swing.JComboBox<>();
        departmentcup = new javax.swing.JComboBox<>();
        guidecupcombo = new javax.swing.JComboBox<>();
        fdelayboxup = new javax.swing.JCheckBox();
        sdelayboxup = new javax.swing.JCheckBox();
        reenrollboxup = new javax.swing.JCheckBox();
        edateup = new com.toedter.calendar.JDateChooser();
        rdateup = new com.toedter.calendar.JDateChooser();
        dopsup = new com.toedter.calendar.JDateChooser();
        tsup = new com.toedter.calendar.JDateChooser();
        redateup = new com.toedter.calendar.JDateChooser();
        fdelayup = new com.toedter.calendar.JDateChooser();
        sdelayup = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        coguidecupcombo = new javax.swing.JComboBox<>();
        coboxup = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        guidepr = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        departmentpr = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        facultypr = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        cmdprint = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jComboBoxsd = new javax.swing.JComboBox<>();
        jComboBoxsd2 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("C:\\Users\\DELL\\Desktop\\back00.png");
                Image i=im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        facultydel = new javax.swing.JComboBox<>();
        departmentdel = new javax.swing.JComboBox<>();
        guidedelcombo = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        stunnamedel = new javax.swing.JTextField();
        stumobdel = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Department");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 190, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 190, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Designation");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 190, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Mobile");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 190, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 190, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("DOR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 190, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Faculty");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 190, 40));

        faculty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        faculty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultyItemStateChanged(evt);
            }
        });
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel1.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 190, 40));

        department.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 190, 40));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 190, 40));

        designation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Associate Professor", "Assistant Professor", " " }));
        designation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                designationItemStateChanged(evt);
            }
        });
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 190, 40));

        mobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 190, 40));

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 190, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, 130, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel20.setText("ADD SUPERVISOR");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 350, 33));

        nosgu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nosgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosguActionPerformed(evt);
            }
        });
        jPanel1.add(nosgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 190, 40));

        jLabel57.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel57.setText("No of seats");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 110, 40));

        dor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(dor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 190, 40));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setText("DOB");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        dob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 190, 40));

        jTabbedPane1.addTab("Add Supervisor", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Student Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 180, 27));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Supervisor");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 180, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Student Mobile");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 180, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Enroll Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 180, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Re-enroll Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 70, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("First Delay");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 70, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Second Delay");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 70, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Registration Date");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, 70, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Additional Seats");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 700, 70, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Date Of Pre Submission");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 740, 110, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Thesis Submission");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 780, 70, 20));

        sname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel2.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 210, 40));

        smobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        smobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                smobileKeyTyped(evt);
            }
        });
        jPanel2.add(smobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 210, 40));
        jPanel2.add(aseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 690, 100, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 107, 32));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setText("ADD  STUDENT");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 330, 35));

        jLabel43.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel43.setText("faculty");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 30));

        jLabel44.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel44.setText("department");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 180, 30));

        facultyc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facultyc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultycItemStateChanged(evt);
            }
        });
        facultyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultycActionPerformed(evt);
            }
        });
        jPanel2.add(facultyc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 210, 40));

        departmentc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentcItemStateChanged(evt);
            }
        });
        departmentc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentcActionPerformed(evt);
            }
        });
        jPanel2.add(departmentc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 210, 40));

        guidecombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guidecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        guidecombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                guidecomboItemStateChanged(evt);
            }
        });
        guidecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guidecomboActionPerformed(evt);
            }
        });
        jPanel2.add(guidecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 210, 40));

        fdelaybox.setText("Select");
        fdelaybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdelayboxActionPerformed(evt);
            }
        });
        jPanel2.add(fdelaybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 580, 60, 20));

        sdelaybox.setText("Select");
        sdelaybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdelayboxActionPerformed(evt);
            }
        });
        jPanel2.add(sdelaybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 620, -1, 20));

        renrollbox.setText("Select");
        renrollbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renrollboxActionPerformed(evt);
            }
        });
        jPanel2.add(renrollbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, -1, 20));

        edate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 210, 40));
        jPanel2.add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 650, 100, -1));
        jPanel2.add(redate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 530, -1, -1));
        jPanel2.add(fdelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 570, -1, -1));
        jPanel2.add(sdelay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 610, -1, -1));
        jPanel2.add(dops, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 730, 100, -1));
        jPanel2.add(ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 780, 100, -1));

        jLabel58.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel58.setText("Co Supervisor");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, 30));

        coguidecombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coguidecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        coguidecombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coguidecomboItemStateChanged(evt);
            }
        });
        jPanel2.add(coguidecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 210, 40));

        cobox.setText("select");
        cobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coboxActionPerformed(evt);
            }
        });
        jPanel2.add(cobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, 30));

        gvs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gvsActionPerformed(evt);
            }
        });
        jPanel2.add(gvs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 100, 40));

        cgvs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(cgvs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 280, 100, 40));

        jLabel60.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel60.setText("Registeration Number");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        rno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 210, 40));

        jTabbedPane1.addTab("Add Candidate", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Faculty");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 200, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Department");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 200, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Name");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 200, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setText("Designation");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 200, 40));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("previous mobile no");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 200, 40));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setText("new mobile no");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 200, 40));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setText("E-mail");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 200, 30));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setText("DOR");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 200, 40));

        facultyup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facultyup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        facultyup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultyupItemStateChanged(evt);
            }
        });
        jPanel3.add(facultyup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 202, 250, 40));

        departmentup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(departmentup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 262, 250, 40));

        nameup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(nameup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 312, 250, 40));

        designationup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        designationup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Associate Professor", "Assistant Professor", " " }));
        jPanel3.add(designationup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 362, 250, 40));

        premobileup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(premobileup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 412, 250, 40));

        mobileup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(mobileup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 462, 250, 40));

        emailup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(emailup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 512, 250, 40));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel29.setText("UPDATE SUPERVISOR");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 420, 36));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Update Guide");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 150, 40));

        dorup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(dorup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 250, 40));

        jTabbedPane1.addTab("Update Supervisor", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setText("Student Name");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 210, 40));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setText("Supervisor");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 210, 30));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setText("Registeration Number");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 30));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setText("Student new Mobile");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 210, 30));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setText("Enrol Date");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 210, 30));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setText("Re enrol Date");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 210, 30));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setText("First Delay");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 210, 30));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setText("Second Delay");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 210, 30));

        jLabel38.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel38.setText("Registration Date");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 210, 30));

        jLabel39.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel39.setText("Additional Seats");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 210, 30));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setText("Date Of Pre Submission");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 210, 30));

        jLabel41.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel41.setText("Thesis Submission");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 210, 30));

        snameup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(snameup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 170, 40));

        rnoup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(rnoup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 170, 40));

        smobilenew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        smobilenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smobilenewActionPerformed(evt);
            }
        });
        jPanel4.add(smobilenew, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 170, 40));

        aseatsup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(aseatsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, 170, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Update Student");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 170, 41));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel42.setText("UPDATE CANDIDATE");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 420, 30));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel45.setText("Faculty");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 210, 40));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel46.setText("Department");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 210, 40));

        facultycup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facultycup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        facultycup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultycupItemStateChanged(evt);
            }
        });
        jPanel4.add(facultycup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 40));

        departmentcup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentcup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentcup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentcupItemStateChanged(evt);
            }
        });
        jPanel4.add(departmentcup, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 170, 40));

        guidecupcombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guidecupcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        guidecupcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                guidecupcomboItemStateChanged(evt);
            }
        });
        jPanel4.add(guidecupcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 170, 40));

        fdelayboxup.setText("Select");
        fdelayboxup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdelayboxupActionPerformed(evt);
            }
        });
        jPanel4.add(fdelayboxup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 110, 40));

        sdelayboxup.setText("Select");
        sdelayboxup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdelayboxupActionPerformed(evt);
            }
        });
        jPanel4.add(sdelayboxup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 110, 40));

        reenrollboxup.setText("Select");
        reenrollboxup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reenrollboxupActionPerformed(evt);
            }
        });
        jPanel4.add(reenrollboxup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 110, 50));

        edateup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(edateup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 170, 30));

        rdateup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(rdateup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 170, 30));

        dopsup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(dopsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 170, 30));

        tsup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(tsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 170, 30));

        redateup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(redateup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 170, 30));

        fdelayup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(fdelayup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 320, 170, 30));

        sdelayup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(sdelayup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 360, 170, 30));

        jLabel59.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel59.setText("Co Supervisor");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 30));

        coguidecupcombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coguidecupcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(coguidecupcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 170, 40));

        coboxup.setText("select");
        coboxup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coboxupActionPerformed(evt);
            }
        });
        jPanel4.add(coboxup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 90, 30));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("go");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 229, 60, 40));

        jTabbedPane1.addTab("Update Candidate", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "R_No", "S_Name", "G_Name", "S_Mobile", "Enroll_Date", "Re_enroll_Date", "First_Delay", "Second_Delay", "Registeration_Date", "Additional_Seats", "Date_of_pre_submission", "Thesis_submission"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 214));

        jLabel47.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel47.setText("Select Guide");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 150, 30));

        guidepr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guidepr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(guidepr, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 200, 40));

        jLabel48.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel48.setText("Select Department");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, 29));

        departmentpr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentpr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentpr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentprItemStateChanged(evt);
            }
        });
        jPanel5.add(departmentpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 200, 40));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel49.setText("Select Faculty");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 150, 32));

        facultypr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facultypr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        facultypr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultyprItemStateChanged(evt);
            }
        });
        jPanel5.add(facultypr, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 200, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 110, 40));

        cmdprint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmdprint.setText("Print");
        cmdprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprintActionPerformed(evt);
            }
        });
        jPanel5.add(cmdprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 110, 40));

        jTabbedPane1.addTab(" Student data", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Faculty", "Department", "Supervisor", "Designation", "Mobile", "Email", "seats", "DOB", "DOR"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 290));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setText("Select Faculty");
        jPanel7.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 160, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setText("Select Department");
        jPanel7.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 160, 30));

        jComboBoxsd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxsd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxsd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxsdItemStateChanged(evt);
            }
        });
        jPanel7.add(jComboBoxsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 160, 40));

        jComboBoxsd2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxsd2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jComboBoxsd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 160, 40));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        jTabbedPane1.addTab("Supervisor Data", jPanel7);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel50.setText("Delete Guide");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 310, 26));

        jLabel51.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel51.setText("Faculty");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 170, 30));

        jLabel52.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel52.setText("Department");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, 30));

        jLabel53.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel53.setText("Guide name");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 170, 30));

        facultydel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facultydel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        facultydel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultydelItemStateChanged(evt);
            }
        });
        jPanel6.add(facultydel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 190, 40));

        departmentdel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentdel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentdel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentdelItemStateChanged(evt);
            }
        });
        jPanel6.add(departmentdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 190, 40));

        guidedelcombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guidedelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(guidedelcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 190, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Delete Guide");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 140, 40));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel54.setText("Delete Student");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 270, -1));

        jLabel55.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel55.setText("student name");
        jPanel6.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 150, 40));

        jLabel56.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel56.setText("student phone");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 150, 40));

        stunnamedel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(stunnamedel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 170, 40));

        stumobdel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(stumobdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 380, 170, 40));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Delete Student");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, 160, 40));

        jTabbedPane1.addTab("Delete", jPanel6);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.LINE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void edateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edateMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="delete from Table2 where S_Mobile='"+stumobdel.getText()+"'";
            PreparedStatement pst;
            pst=connection.prepareStatement(query);
            int xx=pst.executeUpdate();
            if(xx>0)
            {
                JOptionPane.showMessageDialog(null,"deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"cant delete");
            }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="delete from Table1 where Supervisor='"+guidedelcombo.getSelectedItem()+"'";
            PreparedStatement pst;
            pst=connection.prepareStatement(query);
            int xx=pst.executeUpdate();
            if(xx>0)
            {
                JOptionPane.showMessageDialog(null,"deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"cant delete");
            }

        }catch(SQLException ex){
            System.out.println("no");
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="delete from Table2 where Supervisor='"+guidedelcombo.getSelectedItem()+"'";
            PreparedStatement pst;
            pst=connection.prepareStatement(query);
            int xx=pst.executeUpdate();
            if(xx>0)
            {
                JOptionPane.showMessageDialog(null,"deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"cant delete");
            }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void departmentdelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentdelItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentdel.getSelectedItem()+"' AND Faculty='"+facultydel.getSelectedItem()+"' ";
            ResultSet res=statement.executeQuery(query);
            guidedelcombo.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                guidedelcombo.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_departmentdelItemStateChanged

    private void facultydelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultydelItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+facultydel.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            departmentdel.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                departmentdel.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultydelItemStateChanged

    private void cmdprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("");
        MessageFormat footer=  new MessageFormat("page{0,number,integer}");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer);

        }catch(java.awt.print.PrinterException e){
            System.err.format("cannot print", e.getMessage());
        }
    }//GEN-LAST:event_cmdprintActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select * from Table2 where Supervisor='"+guidepr.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(res));

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void facultyprItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultyprItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+facultypr.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            departmentpr.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                departmentpr.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultyprItemStateChanged

    private void departmentprItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentprItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentpr.getSelectedItem()+"'AND Faculty='"+facultypr.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            guidepr.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                guidepr.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_departmentprItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String r_noup = rnoup.getText();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            String s_name ="";
            String smobile="";
            // String edate="";
            String fcup="";
            String depcup="";
            String gname="";

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            PreparedStatement ps = connection.prepareStatement("select * from Table2 where R_No=?");
            ps.setString(1, r_noup);
            resultSet=  ps.executeQuery();
            if(resultSet.next()){
                s_name= resultSet.getString("S_Name");
                smobile=resultSet.getString("S_Mobile");
                //  edate=resultSet.getString("Enroll_Date");
                gname=resultSet.getString("Supervisor");
                fcup=resultSet.getString("Faculty");
                depcup=resultSet.getString("Department");

                //  address = rs.getString("address");
            }
            snameup.setText(s_name);
            smobilenew.setText(smobile);
            guidecupcombo.setSelectedItem(gname);
            facultycup.setSelectedItem(fcup);
            departmentcup.setSelectedItem(depcup);

            // edateup.setDateFormatString(edate);

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void coboxupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coboxupActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentcup.getSelectedItem()+"'AND Faculty='"+facultycup.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);

            coguidecupcombo.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                if(coboxup.isSelected()){
                    coguidecupcombo.addItem(s);}
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_coboxupActionPerformed

    private void reenrollboxupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reenrollboxupActionPerformed
        // TODO add your handling code here:
        if(reenrollboxup.isSelected()){
            String dr = ((JTextField)edateup.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 365);
            Date futureDate = cal.getTime();
            redateup.setDate(futureDate);
        }
        else{
            ((JTextField)redateup.getDateEditor().getUiComponent()).setText("");
            fdelayboxup.setSelected(false);
            ((JTextField)fdelayup.getDateEditor().getUiComponent()).setText("");
            sdelayboxup.setSelected(false);
            ((JTextField)sdelayup.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_reenrollboxupActionPerformed

    private void sdelayboxupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdelayboxupActionPerformed
        // TODO add your handling code here:
        if(sdelayboxup.isSelected()){
            String dr = ((JTextField)fdelayup.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 91);
            Date futureDate = cal.getTime();
            sdelayup.setDate(futureDate);
        }
        else{
            ((JTextField)sdelayup.getDateEditor().getUiComponent()).setText("");

        }
    }//GEN-LAST:event_sdelayboxupActionPerformed

    private void fdelayboxupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdelayboxupActionPerformed
        // TODO add your handling code here:
        if(fdelayboxup.isSelected()){
            String dr = ((JTextField)redateup.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 91);
            Date futureDate = cal.getTime();
            fdelayup.setDate(futureDate);
        }
        else{
            ((JTextField)fdelayup.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_fdelayboxupActionPerformed

    private void guidecupcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_guidecupcomboItemStateChanged
        // TODO add your handling code here:

        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select No_of_Seats from Table1 where Supervisor='"+guidecombo.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            // jTable1.setModel(DbUtils.resultSetToTableModel(res));
            while(res.next()){
                float s = res.getFloat(1);
                String p = Float.toString(s);
                gvs.setText(p);

            }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_guidecupcomboItemStateChanged

    private void departmentcupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentcupItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentcup.getSelectedItem()+"'AND Faculty='"+facultycup.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            guidecupcombo.removeAllItems();
            coguidecupcombo.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                guidecupcombo.addItem(s);
                if(coboxup.isSelected()){
                    coguidecupcombo.addItem(s);
                }
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_departmentcupItemStateChanged

    private void facultycupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultycupItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+facultycup.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            departmentcup.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                departmentcup.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultycupItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            String s_name=snameup.getText();
            String Supervisor=guidecupcombo.getSelectedItem().toString();
            String fac=facultycup.getSelectedItem().toString();
            String dept=departmentcup.getSelectedItem().toString();
            //   String cSupervisor=coguidecupcombo.getSelectedItem().toString();
            String enroll_date=((JTextField)edateup.getDateEditor().getUiComponent()).getText();
            String re_enroll_date = ((JTextField)rdateup.getDateEditor().getUiComponent()).getText();
            String first_delay=((JTextField)fdelayup.getDateEditor().getUiComponent()).getText();
            String second_delay=((JTextField)sdelayup.getDateEditor().getUiComponent()).getText();
            String reg_date=((JTextField)rdateup.getDateEditor().getUiComponent()).getText();
            String add_seats = aseatsup.getText();
            String date_of_pre_sub = ((JTextField)dopsup.getDateEditor().getUiComponent()).getText();
            String thesis_sub = ((JTextField)tsup.getDateEditor().getUiComponent()).getText();
            String r_noup = rnoup.getText();
            String smobnew=smobilenew.getText();

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            }catch(Exception e){
                System.out.println(e);
            }

            try {

                String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
                String dbURL = "jdbc:ucanaccess://"
                + msAccDB;

                connection = DriverManager.getConnection(dbURL);

                statement = connection.createStatement();
                String query="UPDATE  Table2  SET S_Name=?,Supervisor=?,Co_Supervisor=? ,Faculty=?,Department = ?,S_Mobile=?,Enroll_Date=?,Re_enroll_Date=?,First_Delay=?,Second_Delay=?,Registeration_Date=?,Additional_Seats=?,Date_of_pre_submission=?,Thesis_Submission=? WHERE R_No=?";
                PreparedStatement pst;
                pst=connection.prepareStatement(query);
                pst.setString(1, s_name);
                pst.setString(2, Supervisor);
                if (coboxup.isSelected()){
                    String cSupervisor=coguidecupcombo.getSelectedItem().toString();
                    pst.setString(3, cSupervisor); }
                else{
                    String cSupervisor=" ";
                    pst.setString(3, cSupervisor);
                }
                pst.setString(4, fac);
                pst.setString(5, dept);
                pst.setString(6, smobnew);
                pst.setString(7, enroll_date);
                pst.setString(8, re_enroll_date);
                pst.setString(9, first_delay);
                pst.setString(10,second_delay);
                pst.setString(11,reg_date);
                pst.setString(12,add_seats);
                pst.setString(13,date_of_pre_sub);
                pst.setString(14,thesis_sub);
                pst.setString(15,r_noup);
                //String str;
                /*
                //arrangement of seats when guide name is updated  1318 to 1339
                String query7="Select Supervisor from Table2 where R_No ='"+rnoup.getText()+"'";
                ResultSet res=statement.executeQuery(query7);
                // jTable1.setModel(DbUtils.resultSetToTableModel(res));
                String st1;

                while(res.next()){
                    // String st = (String) guidecupcombo.getSelectedItem();
                    st1 = res.getString(1);
                    System.out.print(st1);
                    if (st1!=guidecupcombo.getSelectedItem()){
                        String query8="UPDATE Table1 set No_of_Seats=No_of_Seats+1 where Supervisor='"+st1+"'";
                        String query9="UPDATE Table1 set No_of_Seats=No_of_Seats-1 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                        PreparedStatement pst8;
                        PreparedStatement pst9;
                        //if (guidecupcombo.itemSelected)
                        pst8 = connection.prepareStatement(query8);
                        pst9 = connection.prepareStatement(query9);
                        pst8.executeUpdate();
                        pst9.executeUpdate();
                    }
                }

                //arrangement of seats when coguide name is updated  1341 to 1362
                String query10="Select Co_Supervisor from Table2 where R_No ='"+rnoup.getText()+"'";
                ResultSet res1=statement.executeQuery(query10);
                // jTable1.setModel(DbUtils.resultSetToTableModel(res));
                String st2;

                while(res1.next()){
                    // String st = (String) guidecupcombo.getSelectedItem();
                    st2 = res1.getString(1);
                    System.out.print(st2);
                    if (st2!=coguidecupcombo.getSelectedItem()){
                        String query11="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+st2+"'";
                        String query12="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+coguidecupcombo.getSelectedItem()+"'";
                        PreparedStatement pst11;
                        PreparedStatement pst12;
                        //if (guidecupcombo.itemSelected)
                        pst11 = connection.prepareStatement(query11);
                        pst12 = connection.prepareStatement(query12);
                        pst11.executeUpdate();
                        pst12.executeUpdate();
                    }
                }

                */

                String query13="Select Supervisor,Co_Supervisor from Table2 where R_No ='"+rnoup.getText()+"'";
                ResultSet res2=statement.executeQuery(query13);
                String st3,st4;

                while(res2.next()){
                    st3 = res2.getString(1);
                    st4 = res2.getString(2);

                    System.out.print(st3);
                    System.out.print(st4);
                    //if(st4!=coguidecupcombo.getSelectedItem()){

                        if(st4.trim().isEmpty()&&st3==guidecupcombo.getSelectedItem())
                        {
                            String query16="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                            String query17="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+coguidecupcombo.getSelectedItem()+"'";
                            PreparedStatement pst16;
                            pst16 = connection.prepareStatement(query16);
                            pst16.executeUpdate();
                            PreparedStatement pst17;
                            pst17 = connection.prepareStatement(query17);
                            pst17.executeUpdate();
                        }
                        else if(st4.trim().isEmpty()&&st3!=guidecupcombo.getSelectedItem())
                        {
                            String query22="UPDATE Table1 set No_of_Seats=No_of_Seats-1.0 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                            String query23="UPDATE Table1 set No_of_Seats=No_of_Seats+1.0 where Supervisor='"+st3+"'";
                            PreparedStatement pst22;
                            pst22 = connection.prepareStatement(query22);
                            pst22.executeUpdate();
                            PreparedStatement pst23;
                            pst23 = connection.prepareStatement(query23);
                            pst23.executeUpdate();
                        }

                        //arrangement of seats when coguide name is updated  and guide name is updated
                        else if(st3!=guidecupcombo.getSelectedItem()&&st4!=coguidecupcombo.getSelectedItem()){
                            String query11="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+st3+"'";
                            String query12="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+coguidecupcombo.getSelectedItem()+"'";
                            String query14="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+st4+"'";
                            String query15="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                            PreparedStatement pst11;
                            PreparedStatement pst12;
                            PreparedStatement pst14;
                            PreparedStatement pst15;
                            //if (guidecupcombo.itemSelected)
                            pst11 = connection.prepareStatement(query11);
                            pst12 = connection.prepareStatement(query12);
                            pst14 = connection.prepareStatement(query14);
                            pst15 = connection.prepareStatement(query15);
                            pst11.executeUpdate();
                            pst12.executeUpdate();
                            pst14.executeUpdate();
                            pst15.executeUpdate();
                        }
                        // }
                    else if(st3==guidecupcombo.getSelectedItem()&&st4!=coguidecupcombo.getSelectedItem()){
                        String query18="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+st4+"'";
                        String query19="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+coguidecupcombo.getSelectedItem()+"'";
                        PreparedStatement pst18;
                        pst18 = connection.prepareStatement(query18);
                        pst18.executeUpdate();
                        PreparedStatement pst19;
                        pst19 = connection.prepareStatement(query19);
                        pst19.executeUpdate();
                    }
                    else if(st3!=guidecupcombo.getSelectedItem()&&st4==coguidecupcombo.getSelectedItem()&&coboxup.isSelected()){
                        String query20="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5 where Supervisor='"+st3+"'";
                        String query21="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                        PreparedStatement pst20;
                        pst20 = connection.prepareStatement(query20);
                        pst20.executeUpdate();
                        PreparedStatement pst21;
                        pst21 = connection.prepareStatement(query21);
                        pst21.executeUpdate();
                    }

                }

                String str1=((JTextField)dopsup.getDateEditor().getUiComponent()).getText();

                int xx=pst.executeUpdate();

                if(xx>0)
                {

                    JOptionPane.showMessageDialog(null,"update successful");

                    if (!str1.trim().isEmpty()){
                        // String query="INSERT INTO Table2(S_Name,Supervisor,Co_Supervisor,S_Mobile,Enroll_Date,Re_enroll_Date,First_Delay,Second_Delay,Registeration_Date,Additional_Seats,Date_of_pre_submission,Thesis_Submission) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                        String query4="UPDATE Table1 set No_of_Seats=No_of_Seats+1 where Supervisor='"+guidecupcombo.getSelectedItem()+"'";
                        String query5="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5  where Supervisor='"+guidecupcombo.getSelectedItem()+"'" ;
                        String query6="UPDATE Table1 set No_of_Seats=No_of_Seats+0.5  where Supervisor='"+coguidecupcombo.getSelectedItem()+"'" ;

                        if (coboxup.isSelected()){
                            PreparedStatement pst5;
                            PreparedStatement pst6;
                            //if (guidecupcombo.itemSelected)
                            pst5 = connection.prepareStatement(query5);
                            pst6 = connection.prepareStatement(query6);
                            pst5.executeUpdate();
                            pst6.executeUpdate();}
                        else{
                            PreparedStatement pst4;

                            pst4=connection.prepareStatement(query4);
                            pst4.executeUpdate();
                        }

                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"update failed");
                }
                snameup.setText("");
                ((JTextField)edateup.getDateEditor().getUiComponent()).setText("");
                ((JTextField)redateup.getDateEditor().getUiComponent()).setText("");
                ((JTextField)fdelayup.getDateEditor().getUiComponent()).setText("");
                ((JTextField)sdelayup.getDateEditor().getUiComponent()).setText("");
                ((JTextField)rdateup.getDateEditor().getUiComponent()).setText("");
                aseatsup.setText("");
                ((JTextField)dopsup.getDateEditor().getUiComponent()).setText("");
                ((JTextField)tsup.getDateEditor().getUiComponent()).setText("");
                rnoup.setText("");
                smobilenew.setText("");
                reenrollboxup.setSelected(false);
                fdelayboxup.setSelected(false);
                sdelayboxup.setSelected(false);

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }}catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"a field is empty");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void smobilenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smobilenewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smobilenewActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String fac=facultyup.getSelectedItem().toString();
        String dep=departmentup.getSelectedItem().toString();
        String nm=nameup.getText();
        String des=designationup.getSelectedItem().toString();
        String olmob=premobileup.getText();
        String newmob=mobileup.getText();
        String ema=emailup.getText();

        String dr = ((JTextField)dorup.getDateEditor().getUiComponent()).getText();
        //DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        //String dr=df.format(dor.getDate()).toString();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try {

            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);

            statement = connection.createStatement();
            String query="update Table1 set Faculty=?,Department=?,Supervisor=?,Designation=?,Mobile=?,Email=?,DOR=? where Mobile=?";
            String query1="Select Supervisor,No_of_seats,Designation from Table1 where Mobile='"+olmob+"'";
            PreparedStatement pst,pst1,pst2,pst3,pst4,pst5,pst6,pst7,pst8,pst9;

            ResultSet rs=statement.executeQuery(query1);
            while(rs.next()){
                String s3= rs.getString(1);
                String s4= rs.getString(2);
                String s5= rs.getString(3);
                if(s3!=nm){
                    String query2="update Table2 set Supervisor=? where Supervisor='"+s3+"'";
                    String query3="update Table2 set Co_Supervisor=? where Co_Supervisor='"+s3+"'";
                    pst1=connection.prepareStatement(query2);
                    pst1.setString(1, nm);
                    pst1.executeUpdate();
                    pst2=connection.prepareStatement(query3);
                    pst2.setString(1,nm);
                    pst2.executeUpdate();
                }
                if(s5.equals("Assistant Professor") && designationup.getSelectedItem().equals("Associate Professor"))
                {
                    String query4="UPDATE Table1 set No_of_seats=No_of_seats+2.0 where Mobile='"+olmob+"'";    //1
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());
                    pst4=connection.prepareStatement(query4);
                    pst4.executeUpdate();
                }
                else if(s5.equals("Associate Professor") && designationup.getSelectedItem().equals("Professor"))
                {
                    String query5="UPDATE Table1 set No_of_seats=No_of_seats+2.0 where Mobile='"+olmob+"'";    //2
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());
                    pst5=connection.prepareStatement(query5);
                    pst5.executeUpdate();
                }
                else if(s5.equals("Professor") && designationup.getSelectedItem().equals("Assistant Professor"))
                {
                    String query6="UPDATE Table1 set No_of_seats=No_of_seats-4.0 where Mobile='"+olmob+"'";   //3
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());
                    pst6=connection.prepareStatement(query6);
                    pst6.executeUpdate();
                }
                else if(s5.equals("Professor") && designationup.getSelectedItem().equals("Associate Professor"))
                {
                    String query7="UPDATE Table1 set No_of_seats=No_of_seats-2.0 where Mobile='"+olmob+"'";   //4
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());
                    pst7=connection.prepareStatement(query7);
                    pst7.executeUpdate();
                }
                else if(s5.equals("Associate Professor") && designationup.getSelectedItem().equals("Assistant Professor"))
                {
                    String query8="UPDATE Table1 set No_of_seats=No_of_seats-2.0 where Mobile='"+olmob+"'";
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());                                        //5
                    pst8=connection.prepareStatement(query8);
                    pst8.executeUpdate();
                }
                else if(s5.equals("Assistant Professor") && designationup.getSelectedItem().equals("Professor"))
                {
                    String query9="UPDATE Table1 set No_of_seats=No_of_seats+4.0 where Mobile='"+olmob+"'";   //6
                    System.out.println(s5);
                    System.out.println(designationup.getSelectedItem());
                    pst9=connection.prepareStatement(query9);
                    pst9.executeUpdate();
                }

                System.out.println(s3);
            }
            pst=connection.prepareStatement(query);
            pst.setString(1, fac);
            pst.setString(2, dep);
            pst.setString(3, nm);
            pst.setString(4, des);
            pst.setString(5,newmob );
            pst.setString(6, ema);
            pst.setString(7,dr);
            pst.setString(8, olmob);
            String str;
            int xx=pst.executeUpdate();
            if(xx>0)
            {
                JOptionPane.showMessageDialog(null,"updated");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Update failed");
            }
            nameup.setText("");
            premobileup.setText("");
            mobileup.setText("");
            emailup.setText("");

        }
        catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null,"failed ");
            System.out.println(sqlex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void facultyupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultyupItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+facultyup.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            departmentup.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                departmentup.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultyupItemStateChanged

    private void gvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gvsActionPerformed

    private void coboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coboxActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentc.getSelectedItem()+"'AND Faculty='"+facultyc.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);

            coguidecombo.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                if(cobox.isSelected()){
                    coguidecombo.addItem(s);}
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_coboxActionPerformed

    private void coguidecomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coguidecomboItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select No_of_Seats from Table1 where Supervisor='"+coguidecombo.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            // jTable1.setModel(DbUtils.resultSetToTableModel(res));
            while(res.next()){
                float s = res.getFloat(1);
                String p = Float.toString(s);
                cgvs.setText(p);

            }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_coguidecomboItemStateChanged

    private void renrollboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renrollboxActionPerformed
        // TODO add your handling code here:
        if(renrollbox.isSelected()){
            String dr = ((JTextField)edate.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 365);
            Date futureDate = cal.getTime();
            redate.setDate(futureDate);
        }
        else{
            ((JTextField)redate.getDateEditor().getUiComponent()).setText("");
            fdelaybox.setSelected(false);
            ((JTextField)fdelay.getDateEditor().getUiComponent()).setText("");
            sdelaybox.setSelected(false);
            ((JTextField)sdelay.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_renrollboxActionPerformed

    private void sdelayboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdelayboxActionPerformed
        // TODO add your handling code here:
        if(sdelaybox.isSelected()){
            String dr = ((JTextField)fdelay.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 91);
            Date futureDate = cal.getTime();
            sdelay.setDate(futureDate);
        }
        else{
            ((JTextField)sdelay.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_sdelayboxActionPerformed

    private void fdelayboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdelayboxActionPerformed
        // TODO add your handling code here:
        if(fdelaybox.isSelected()){
            String dr = ((JTextField)redate.getDateEditor().getUiComponent()).getText();
            String string = dr;
            DateFormat format = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 91);
            Date futureDate = cal.getTime();
            fdelay.setDate(futureDate);
        }
        else{
            ((JTextField)fdelay.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_fdelayboxActionPerformed

    private void guidecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guidecomboActionPerformed

    }//GEN-LAST:event_guidecomboActionPerformed

    private void guidecomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_guidecomboItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select No_of_Seats from Table1 where Supervisor='"+guidecombo.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            // jTable1.setModel(DbUtils.resultSetToTableModel(res));
            while(res.next()){
                float s = res.getFloat(1);
                String p = Float.toString(s);
                gvs.setText(p);

            }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_guidecomboItemStateChanged

    private void departmentcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentcActionPerformed

    private void departmentcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentcItemStateChanged
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Supervisor from Table1 where Department='"+departmentc.getSelectedItem()+"'AND Faculty='"+facultyc.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            guidecombo.removeAllItems();
            coguidecombo.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                guidecombo.addItem(s);
                if(cobox.isSelected()){
                    coguidecombo.addItem(s);}
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_departmentcItemStateChanged

    private void facultycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultycActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultycActionPerformed

    private void facultycItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultycItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+facultyc.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            departmentc.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                departmentc.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultycItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String r_no=rno.getText();
        String s_name=sname.getText();
        String Supervisor=guidecombo.getSelectedItem().toString();
        String fac=facultyc.getSelectedItem().toString();
        String dep=departmentc.getSelectedItem().toString();
        String enroll_date=((JTextField)edate.getDateEditor().getUiComponent()).getText();
        // String re_enroll_date =((JTextField)redate.getDateEditor().getUiComponent()).getText();
        //  String first_delay=((JTextField)fdelay.getDateEditor().getUiComponent()).getText();
        //  String second_delay=((JTextField)sdelay.getDateEditor().getUiComponent()).getText();
        //  String reg_date=((JTextField)rdate.getDateEditor().getUiComponent()).getText();
        //  String add_seats = aseats.getText();
        //  String date_of_pre_sub =((JTextField)dops.getDateEditor().getUiComponent()).getText();
        //  String thesis_sub =((JTextField)ts.getDateEditor().getUiComponent()).getText();
        String smob = smobile.getText();
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(smob);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try {

            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);

            statement = connection.createStatement();
            String query="INSERT INTO Table2(R_No,S_Name,Supervisor,Co_Supervisor,Faculty,Department,S_Mobile,Enroll_Date,Re_enroll_Date,First_Delay,Second_Delay,Registeration_Date,Additional_Seats,Date_of_pre_submission,Thesis_Submission) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String query1="UPDATE Table1 set No_of_Seats=No_of_Seats-1 where Supervisor='"+guidecombo.getSelectedItem()+"'";
            String query2="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5  where Supervisor='"+guidecombo.getSelectedItem()+"'" ;
            String query3="UPDATE Table1 set No_of_Seats=No_of_Seats-0.5  where Supervisor='"+coguidecombo.getSelectedItem()+"'" ;
            PreparedStatement pst;
            pst=connection.prepareStatement(query);

            if(m.matches()){
                pst.setString(1, r_no);
                pst.setString(2, s_name);
                pst.setString(3, Supervisor);
                if (cobox.isSelected()){
                    String coSupervisor=coguidecombo.getSelectedItem().toString();
                    pst.setString(4, coSupervisor); }
                else{
                    String coSupervisor=" ";
                    pst.setString(4, coSupervisor);}

                pst.setString(5, fac);
                pst.setString(6, dep);
                pst.setString(7, smob);
                pst.setString(8, enroll_date);
                pst.setString(9,((JTextField)redate.getDateEditor().getUiComponent()).getText());
                pst.setString(10,((JTextField)fdelay.getDateEditor().getUiComponent()).getText());
                pst.setString(11,((JTextField)sdelay.getDateEditor().getUiComponent()).getText());
                pst.setString(12,((JTextField)rdate.getDateEditor().getUiComponent()).getText());
                pst.setString(13,aseats.getText());
                pst.setString(14,((JTextField)dops.getDateEditor().getUiComponent()).getText());
                pst.setString(15,((JTextField)ts.getDateEditor().getUiComponent()).getText());
                String str;
                int xx=pst.executeUpdate();
                if(xx>0)
                {
                    if (cobox.isSelected()){
                        PreparedStatement pst1;
                        PreparedStatement pst3;

                        pst1 = connection.prepareStatement(query2);
                        pst3 = connection.prepareStatement(query3);
                        pst1.executeUpdate();
                        pst3.executeUpdate();}
                    else{
                        PreparedStatement pst2;
                        pst2 = connection.prepareStatement(query1);
                        pst2.executeUpdate();
                    }
                    JOptionPane.showMessageDialog(null,"new student added");
                    showseats();
                }}
                else
                {
                    JOptionPane.showMessageDialog(null,"invalid student");

                }
                // to clear the fields after pressing the save button
                sname.setText("");
                rno.setText("");
                ((JTextField)edate.getDateEditor().getUiComponent()).setText("");
                ((JTextField)redate.getDateEditor().getUiComponent()).setText("");
                ((JTextField)fdelay.getDateEditor().getUiComponent()).setText("");
                ((JTextField)sdelay.getDateEditor().getUiComponent()).setText("");
                ((JTextField)rdate.getDateEditor().getUiComponent()).setText("");
                aseats.setText("");
                ((JTextField)dops.getDateEditor().getUiComponent()).setText("");
                ((JTextField)ts.getDateEditor().getUiComponent()).setText("");
                smobile.setText("");
                renrollbox.setSelected(false);
                fdelaybox.setSelected(false);
                sdelaybox.setSelected(false);
                cobox.setSelected(false);
                coguidecombo.removeAllItems();
                //guidecombo.removeAllItems();
                //facultyc.removeAllItems();
                //departmentc.removeAllItems();
                cgvs.setText("");
                //gvs.setText("");

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void smobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_smobileKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_smobileKeyTyped

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void nosguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nosguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nosguActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String facg=faculty.getSelectedItem().toString();
        String depg=department.getSelectedItem().toString();
        String nmg=name.getText();
        String desg=designation.getSelectedItem().toString();
        String nosg=nosgu.getText();
        float nseats = Float.parseFloat(nosg);
        String mobg=mobile.getText();
        String emag=email.getText();
        String drg = ((JTextField)dor.getDateEditor().getUiComponent()).getText();
        String db = ((JTextField)dob.getDateEditor().getUiComponent()).getText();

        //if (s.equals("null")) {
            //String dr="null";
            //}
        //else{
            //DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            //String dr=df.format(dor.getDate()).toString();}

        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(mobg);

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try {

            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);

            statement = connection.createStatement();
            String query="INSERT INTO Table1(Faculty,Department,Supervisor,Designation,Mobile,Email,No_of_seats,DOB,DOR) VALUES(?,?,?,?,?,?,?,?,?)";
            String query1="select DOB,DOR from Table1 where Supervisor='"+nmg+"'";
            ResultSet res=statement.executeQuery(query1);

            if(!res.next()){
                PreparedStatement pst;
                pst=connection.prepareStatement(query);
                if(m.matches()){
                    pst.setString(1, facg);
                    pst.setString(2, depg);
                    pst.setString(3, nmg);
                    pst.setString(4, desg);
                    pst.setString(5, mobg);
                    pst.setString(6,emag);
                    pst.setFloat(7, nseats);
                    pst.setString(8, db);
                    pst.setString(9, drg);
                    String str;
                    int xx=pst.executeUpdate();
                    if(xx>0)
                    {
                        JOptionPane.showMessageDialog(null,"new guide added");
                    }}
                    else
                    {
                        JOptionPane.showMessageDialog(null,"invalid guide");
                    }

                }
                else
                {

                    String s=res.getString(1);
                    String s1=res.getString(2);
                    System.out.println(s);
                    System.out.println(s1);

                    // JOptionPane.showMessageDialog(null,"user already exist");
                    if(s.equals(((JTextField)dob.getDateEditor().getUiComponent()).getText()) && s1.equals(((JTextField)dor.getDateEditor().getUiComponent()).getText()))
                    {
                        JOptionPane.showMessageDialog(null,"user already exist");
                        System.out.println(s);
                        System.out.println(s1);

                    }

                }

                name.setText("");
                mobile.setText("");
                email.setText("");
                //nosgu.setText("");
                ((JTextField)dob.getDateEditor().getUiComponent()).setText("");

                ((JTextField)dor.getDateEditor().getUiComponent()).setText("");

                fetchdata();
                fetchdataup();
                fetchdatac();
                fetchdatacup();
                fetchdatapr();
                fetchdatadel();
            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mobileKeyTyped

    private void designationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_designationItemStateChanged
        // TODO add your handling code here:
        setguideseats();
    }//GEN-LAST:event_designationItemStateChanged

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void facultyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultyItemStateChanged
        // TODO add your handling code here:
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+faculty.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            department.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                department.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_facultyItemStateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select * from Table1 where Department='"+jComboBoxsd2.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            jTable2.setModel(DbUtils.resultSetToTableModel(res));

        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBoxsdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxsdItemStateChanged
        // TODO add your handling code here:
        
         Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select Department from Table4 where Faculty='"+jComboBoxsd.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
            jComboBoxsd2.removeAllItems();
            while(res.next()){
                String s=res.getString(1);
                jComboBoxsd2.addItem(s);
            }
        }catch(SQLException ex){
            System.out.println("no");
        }
    }//GEN-LAST:event_jComboBoxsdItemStateChanged
    
    
    public void fetchdatadel()throws SQLException{
       facultydel.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               facultydel.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    }     

    
    
    
    
    
    
    
    
    
    
    public void fetchdatacup()throws SQLException{
       facultycup.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               facultycup.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    }     
    
    
    
    
     public void fetchdatac()throws SQLException{
       facultyc.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               facultyc.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
       
       
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void fetchdata()throws SQLException{
       faculty.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               faculty.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    
    }
    
    public void fetchdatapr()throws SQLException{
       facultypr.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               facultypr.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    }
    
    
    
    
    public void fetchdatasupervisor()throws SQLException{
       jComboBoxsd.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               jComboBoxsd.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    }
   
    
    
    
    
    
    
    
    
    
    
    public void fetchdataup()throws SQLException{
       facultyup.removeAllItems();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }catch(Exception e){
            System.out.println(e);
        }

       try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
                    + msAccDB; 
 

            connection = DriverManager.getConnection(dbURL);  
            statement = connection.createStatement();
           String query="select * from Table3";
           PreparedStatement pst;
            pst=connection.prepareStatement(query);
           ResultSet res=pst.executeQuery();
           while(res.next()){
               String s=res.getString(1);
               facultyup.addItem(s);
           }
       }catch(SQLException ex){
           System.out.println("no");
       }
    }
   
    
    public void setguideseats(){
        String des=(String) designation.getSelectedItem();
        if(des.contentEquals("Professor")){
            nosgu.setText("8");
        }
        else if(des.contentEquals("Associate Professor")){
            nosgu.setText("6");
        }
        else{
            nosgu.setText("4");
        }
    }
    
    public void visibleoff(){
        renrollbox.setVisible(false);
        redate.setVisible(false);
        fdelaybox.setVisible(false);
        sdelaybox.setVisible(false);
        sdelay.setVisible(false);
        rdate.setVisible(false);
        aseats.setVisible(false);
        dops.setVisible(false);
        ts.setVisible(false);
        fdelay.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        
    }
    

    
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
    public void showseats(){
          Connection connection = null;
        Statement statement = null;

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String msAccDB = "C:\\Users\\DELL\\Documents\\guides.accdb";
            String dbURL = "jdbc:ucanaccess://"
            + msAccDB;

            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            String query="select No_of_Seats from Table1 where Supervisor='"+guidecombo.getSelectedItem()+"'";
            ResultSet res=statement.executeQuery(query);
           // jTable1.setModel(DbUtils.resultSetToTableModel(res));
           while(res.next()){
           float s = res.getFloat(1);
           String p = Float.toString(s);
           gvs.setText(p);
           
           }

        }catch(SQLException ex){
            System.out.println("no");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aseats;
    private javax.swing.JTextField aseatsup;
    private javax.swing.JTextField cgvs;
    private javax.swing.JButton cmdprint;
    private javax.swing.JCheckBox cobox;
    private javax.swing.JCheckBox coboxup;
    private javax.swing.JComboBox<String> coguidecombo;
    private javax.swing.JComboBox<String> coguidecupcombo;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> departmentc;
    private javax.swing.JComboBox<String> departmentcup;
    private javax.swing.JComboBox<String> departmentdel;
    private javax.swing.JComboBox<String> departmentpr;
    private javax.swing.JComboBox<String> departmentup;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JComboBox<String> designationup;
    private com.toedter.calendar.JDateChooser dob;
    private com.toedter.calendar.JDateChooser dops;
    private com.toedter.calendar.JDateChooser dopsup;
    private com.toedter.calendar.JDateChooser dor;
    private com.toedter.calendar.JDateChooser dorup;
    private com.toedter.calendar.JDateChooser edate;
    private com.toedter.calendar.JDateChooser edateup;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailup;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JComboBox<String> facultyc;
    private javax.swing.JComboBox<String> facultycup;
    private javax.swing.JComboBox<String> facultydel;
    private javax.swing.JComboBox<String> facultypr;
    private javax.swing.JComboBox<String> facultyup;
    private com.toedter.calendar.JDateChooser fdelay;
    private javax.swing.JCheckBox fdelaybox;
    private javax.swing.JCheckBox fdelayboxup;
    private com.toedter.calendar.JDateChooser fdelayup;
    private javax.swing.JComboBox<String> guidecombo;
    private javax.swing.JComboBox<String> guidecupcombo;
    private javax.swing.JComboBox<String> guidedelcombo;
    private javax.swing.JComboBox<String> guidepr;
    private javax.swing.JTextField gvs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxsd;
    private javax.swing.JComboBox<String> jComboBoxsd2;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mobileup;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameup;
    private javax.swing.JTextField nosgu;
    private javax.swing.JTextField premobileup;
    private com.toedter.calendar.JDateChooser rdate;
    private com.toedter.calendar.JDateChooser rdateup;
    private com.toedter.calendar.JDateChooser redate;
    private com.toedter.calendar.JDateChooser redateup;
    private javax.swing.JCheckBox reenrollboxup;
    private javax.swing.JCheckBox renrollbox;
    private javax.swing.JTextField rno;
    private javax.swing.JTextField rnoup;
    private com.toedter.calendar.JDateChooser sdelay;
    private javax.swing.JCheckBox sdelaybox;
    private javax.swing.JCheckBox sdelayboxup;
    private com.toedter.calendar.JDateChooser sdelayup;
    private javax.swing.JTextField smobile;
    private javax.swing.JTextField smobilenew;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField snameup;
    private javax.swing.JTextField stumobdel;
    private javax.swing.JTextField stunnamedel;
    private com.toedter.calendar.JDateChooser ts;
    private com.toedter.calendar.JDateChooser tsup;
    // End of variables declaration//GEN-END:variables
}
