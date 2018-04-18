/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recepcija.view;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import recepcija.model.Operater;
import recepcija.model.Soba;
import recepcija.pomocno.HibernateUtil;

/**
 *
 * @author Petar
 */
public class Izbornik extends javax.swing.JFrame {

    private Operater operater;

    public Izbornik() {
        initComponents();
        
        DefaultTableModel m = (DefaultTableModel) tblSoba.getModel();

        m.setRowCount(0);

        List<Soba> lista = HibernateUtil.getSession().createQuery(
                "from Soba").list();
        Object niz[] = new Object[6];

        for (Soba s : lista) {
            niz[0] = s.getBrojSobe();
            niz[1] = s.getKat();
            niz[2] = s.getBrojLezaja();
            niz[3] = s.getBrojObroka();
            niz[4] = s.isInternet();
            niz[5] = s.isTelefon();
            m.addRow(niz);
            m.setValueAt(s, m.getRowCount() - 1, 0);


        this.operater = operater;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        DatePicker dp = new DatePicker();
        dp.setSize(jPanel2.getSize());
        jPanel2.add(dp);

        DatePicker dp2 = new DatePicker();
        dp2.setSize(jPanel1.getSize());
        jPanel1.add(dp2);

        DatePickerSettings dateSettings = new DatePickerSettings();

        dp.setLocale(new Locale("hr", "HR"));
        dp2.setLocale(new Locale("hr", "HR"));

        }
    }

   

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRezerviraj = new javax.swing.JButton();
        btnIzlaz = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSoba = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RecepcijaAPP");
        setMinimumSize(new java.awt.Dimension(836, 540));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcija/view/Hotel room.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Datum prijave");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 260, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Datum odjave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 260, 100, 20);

        btnRezerviraj.setText("Rezerviraj");
        btnRezerviraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervirajActionPerformed(evt);
            }
        });
        getContentPane().add(btnRezerviraj);
        btnRezerviraj.setBounds(620, 340, 140, 23);

        btnIzlaz.setText("Izlaz");
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });
        getContentPane().add(btnIzlaz);
        btnIzlaz.setBounds(620, 420, 140, 23);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 250, 160, 30);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 250, 160, 30);

        tblSoba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Broj sobe", "Broj kata", "Broj ležaja", "Broj obroka", "Telefon", "Internet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSoba);
        if (tblSoba.getColumnModel().getColumnCount() > 0) {
            tblSoba.getColumnModel().getColumn(0).setResizable(false);
            tblSoba.getColumnModel().getColumn(1).setResizable(false);
            tblSoba.getColumnModel().getColumn(2).setResizable(false);
            tblSoba.getColumnModel().getColumn(3).setResizable(false);
            tblSoba.getColumnModel().getColumn(4).setResizable(false);
            tblSoba.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 340, 610, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("POPIS SVIH SOBA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 310, 170, 20);

        jMenu1.setText("Sobe");

        jMenuItem1.setText("Dodaj nove sobe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void btnRezervirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervirajActionPerformed
        Rezervacija r = new Rezervacija();
        r.setVisible(true);
    }//GEN-LAST:event_btnRezervirajActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new DodajSobu().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnRezerviraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSoba;
    // End of variables declaration//GEN-END:variables

   

}
