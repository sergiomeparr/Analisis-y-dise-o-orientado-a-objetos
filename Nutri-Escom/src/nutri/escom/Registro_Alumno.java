package nutri.escom;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static net.sf.jasperreports.view.JasperViewer.viewReport;
import static net.ucanaccess.converters.Functions.date;

public class Registro_Alumno extends javax.swing.JFrame{

    String url = "jdbc:ucanaccess://C:\\base\\Base.mdb";
    Connection conexion;        
    String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    
    public Registro_Alumno() {
        initComponents();
        Calendar date = Calendar.getInstance();
        Calendar date1 = GregorianCalendar.getInstance();
        String fecha, fecha1, fecha2 = "";
        fecha1 = date1.getTime().toLocaleString();
        char str1[] = fecha1.toCharArray();
        for(int i = 0; i < fecha1.length() - 12; i++){
            fecha2 += str1[i];
        }
        //fecha = date.get(Calendar.DATE)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        this.jTextField13.setText(fecha2);
        //this.jTextField13.setText(fecha);
        jButton5.setEnabled(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel20 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        jLabel20.setText("jLabel20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumno");
        setMinimumSize(new java.awt.Dimension(633, 430));
        setResizable(false);
        getContentPane().setLayout(null);

        panelPrincipal.setName("panelPrincipal"); // NOI18N

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("  Apellidos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 90, 60, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Edad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 130, 40, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("  Nombre");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 50, 60, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Correo Electrónico");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 113, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Boleta");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 210, 69, 29);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(141, 40, 150, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(141, 81, 150, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(141, 122, 150, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(140, 160, 150, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(141, 204, 150, 30);

        jButton2.setText("Siguiente");
        jButton2.setName(""); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 300, 96, 48);

        jButton1.setText("Anterior");
        jButton1.setName("Anterior"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 300, 96, 48);

        jLabel19.setForeground(new java.awt.Color(102, 102, 255));
        jLabel19.setText("años");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(295, 135, 32, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Desktop\\Imagenes3\\2.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 20, 210, 210);

        jButton6.setText("Foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(320, 250, 80, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(410, 250, 170, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Desktop\\Nutri-Escom\\src\\Imagenes\\plantas_1.png")); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(0, 0, 600, 370);

        panelPrincipal.addTab("Datos del Alumno", null, jPanel1, "");

        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Peso");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 58, 35, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Cantidad de Água");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 110, 120, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("     Tasa Metabólica basal");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 170, 150, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("IMC");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(75, 226, 40, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("fecha");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(340, 10, 50, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Ejercicio");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(320, 160, 60, 33);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("Estatura");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(320, 100, 70, 33);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(150, 62, 120, 30);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8);
        jTextField8.setBounds(150, 106, 120, 30);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9);
        jTextField9.setBounds(149, 166, 120, 30);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField10);
        jTextField10.setBounds(149, 220, 120, 30);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11);
        jTextField11.setBounds(395, 104, 122, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12);
        jTextField12.setBounds(395, 165, 122, 30);

        jButton3.setText("Anterior");
        jButton3.setName("form_anterior"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(140, 300, 96, 48);

        jButton4.setText("Guardar");
        jButton4.setName("Guardar"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(470, 300, 99, 48);

        jButton5.setText("Siguiente");
        jButton5.setName("Sig_form"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(290, 300, 96, 48);

        jTextField13.setText("00/00/00");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13);
        jTextField13.setBounds(400, 10, 68, 30);

        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setText("kg");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(276, 65, 20, 14);

        jLabel15.setForeground(new java.awt.Color(102, 102, 255));
        jLabel15.setText("L");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(276, 119, 14, 14);

        jLabel16.setForeground(new java.awt.Color(102, 102, 255));
        jLabel16.setText("cal");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(273, 179, 25, 14);

        jLabel17.setForeground(new java.awt.Color(102, 102, 255));
        jLabel17.setText("cm");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(521, 107, 20, 14);

        jLabel18.setForeground(new java.awt.Color(102, 102, 255));
        jLabel18.setText("min");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(521, 168, 30, 14);

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Desktop\\Nutri-Escom\\src\\Imagenes\\plantas_1.png")); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(0, 0, 610, 370);

        panelPrincipal.addTab("Evaluación Antropométrica", jPanel2);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(10, 11, 605, 400);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Desktop\\Nutri-Escom\\src\\Imagenes\\plantas_1.png")); // NOI18N
        jLabel21.setMaximumSize(new java.awt.Dimension(600, 600));
        jLabel21.setMinimumSize(new java.awt.Dimension(600, 600));
        jLabel21.setName(""); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 0, 730, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Seguridad obj = new Seguridad();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panelPrincipal.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Calendar date = Calendar.getInstance();
        String fecha;
        fecha = date.get(Calendar.DATE)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        String text1 = jTextField6.getText();
        String codBuscar;
        codBuscar = jTextField6.getText();                
        int valor1 = Integer.parseInt(text1);
        boolean encontro = false;
        if(valor1 < 2012000000){
            JOptionPane.showMessageDialog(null, "Boleta no vigente");
        }
        if(valor1 >= 2012000000){
                try{   
                    conexion=DriverManager.getConnection(url);
                    Statement s = conexion.createStatement();
                    String access = "INSERT INTO Alumno(Nombre,Apellidos,Edad,Correo_Electronico, Boleta, Foto)" 
                            + " values('" +this.jTextField2.getText()+"',"
                            + "'" +this.jTextField3.getText()+"',"
                            + "'" +this.jTextField4.getText()+"',"
                            + "'" +this.jTextField5.getText()+"',"
                            + "'" +this.jTextField6.getText()+"',"
                            + "'" +this.jTextField1.getText()+"')";
                            //+ "'" +this.jTextField1.getText()+"')";
                    String access1 = " INSERT INTO Evaluacion_antropomorfica(idAlumno,Peso,Cantidad_de_agua,Edad_metabolica,Fecha,Estatura,Ejercicio,IMC)"
                            + " values('" +this.jTextField6.getText()+"',"
                            + "'" +this.jTextField7.getText()+"',"
                            + "'" +this.jTextField8.getText()+"',"
                            + "'" +this.jTextField9.getText()+"',"
                            + "'" +this.jTextField13.getText()+"',"
                            + "'" +this.jTextField11.getText()+"',"
                            + "'" +this.jTextField12.getText()+"',"
                            + "'" +this.jTextField10.getText()+"')";
                    s.executeUpdate(access);
                    s.executeUpdate(access1);
                    s.close();
                    conexion.close();
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "El error es "+ex);
                    //JOptionPane.showMessageDialog(rootPane, ex);
                }
                jButton5.setEnabled(true);
                jButton4.setEnabled(false);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //String fecha, dia, mes , año;
        String text = jTextField10.getText();
        double valor = Double.parseDouble(text);
        Calendar date = Calendar.getInstance();
        Calendar date1 = GregorianCalendar.getInstance();
        
        String fecha, fecha1, fecha2 = "", fecha3;
        fecha1 = date1.getTime().toLocaleString();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        date1.add(Calendar.MONTH, 1);
        fecha3 = sdf.format(date1.getTime());
        
        char str1[] = fecha3.toCharArray();
        for(int i = 0; i < fecha3.length() - 9; i++){
            fecha2 += str1[i];
        }
        
        fecha = date.get(Calendar.DATE)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);        
        if(valor <= 18.4){
            try{    
                JasperReport jr = (JasperReport) JRLoader.loadObject(Registro_Alumno.class.getResource("/report/Reporte.jasper"));
                HashMap par = new HashMap();
                par.put("nombre",Registro_Alumno.jTextField2.getText());
                par.put("apellidos",Registro_Alumno.jTextField3.getText());
                par.put("boleta",Registro_Alumno.jTextField6.getText());
                par.put("fecha",fecha2);
                //par.put("fecha",fecha);
                par.put("peso",Registro_Alumno.jTextField7.getText());
                par.put("cantidad",Registro_Alumno.jTextField8.getText());
                par.put("tasa",Registro_Alumno.jTextField9.getText());
                par.put("estatura",Registro_Alumno.jTextField11.getText());
                par.put("imc",Registro_Alumno.jTextField10.getText());
                JasperPrint jp = JasperFillManager.fillReport(jr, par, new JREmptyDataSource());
                JasperViewer visor = new JasperViewer(jp, false);
                visor.setVisible(true);
                visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);    
                //JasperViewer.viewReport(jp);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "El error es "+ex);
            }
        }
        if(valor >=18.5 && valor <= 24.9){
            try{    
                JasperReport jr = (JasperReport) JRLoader.loadObject(Registro_Alumno.class.getResource("/report/Reporte_2.jasper"));
                HashMap par = new HashMap();
                par.put("nombre",Registro_Alumno.jTextField2.getText());
                par.put("apellidos",Registro_Alumno.jTextField3.getText());
                par.put("boleta",Registro_Alumno.jTextField6.getText());
                par.put("fecha",fecha2);
                par.put("peso",Registro_Alumno.jTextField7.getText());
                par.put("cantidad",Registro_Alumno.jTextField8.getText());
                par.put("tasa",Registro_Alumno.jTextField9.getText());
                par.put("estatura",Registro_Alumno.jTextField11.getText());
                par.put("imc",Registro_Alumno.jTextField10.getText());
                JasperPrint jp = JasperFillManager.fillReport(jr, par, new JREmptyDataSource());
                JasperViewer visor = new JasperViewer(jp, false);
                visor.setVisible(true);
                visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);  
//visor.setVisible(true); 
                //JasperViewer.viewReport(jp);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "El error es "+ex);
            }
        }
        if(valor >=25){
            try{    
                JasperReport jr = (JasperReport) JRLoader.loadObject(Registro_Alumno.class.getResource("/report/Reporte_1.jasper"));
                HashMap par = new HashMap();
                par.put("nombre",jTextField2.getText());
                par.put("apellidos",jTextField3.getText());
                par.put("boleta",jTextField6.getText());
                par.put("fecha",fecha2);
                par.put("peso",jTextField7.getText());
                par.put("cantidad",jTextField8.getText());
                par.put("tasa",jTextField9.getText());
                par.put("estatura",Registro_Alumno.jTextField11.getText());
                par.put("imc",Registro_Alumno.jTextField10.getText());
                JasperPrint jp = JasperFillManager.fillReport(jr, par, new JREmptyDataSource());
                JasperViewer visor = new JasperViewer(jp, false);
                visor.setVisible(true);
                visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);  
//visor.setVisible(true);
                //JasperViewer.viewReport(jp);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "El error es "+ex);
            }
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int ventana = archivo.showOpenDialog(null); 
        if(ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            jTextField1.setText(String.valueOf(file));
            Image foto =  getToolkit().getImage(jTextField1.getText());
            foto = foto.getScaledInstance(210, 210, Image.SCALE_DEFAULT);
            jLabel1.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    private javax.swing.JTree jTree1;
    private javax.swing.JTabbedPane panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
