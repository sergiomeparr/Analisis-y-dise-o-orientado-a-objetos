package nutri.escom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static nutri.escom.Modificar.jLabel1;
import static nutri.escom.Modificar.jTextField1;


public class Buscar_Alumno extends javax.swing.JFrame {
    String url = "jdbc:ucanaccess://C:\\base\\Base.mdb";
    Connection conexion;        
    String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    public Buscar_Alumno() {
        initComponents();
        Modificar abrir = new Modificar();
        abrir.setVisible(true);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar la boleta del Alumno");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButton1)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = jTextField1.getText();
        int valor  = Integer.parseInt(text);
        ImageIcon imagen = new ImageIcon();
        int respuesta;
        if (valor >= 2012000000){
            try{
                String url1;
                conexion = DriverManager.getConnection(url);
                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM Alumno WHERE Boleta='"+this.jTextField1.getText()+"'");            
                ResultSet rs1 = s.executeQuery("SELECT * FROM Evaluacion_antropomorfica WHERE idAlumno='"+this.jTextField1.getText()+"'");            
                rs.next();
                rs1.next();
                //Modificar.jTextField1.setText(rs.getString("idAlumno"));
                Modificar.jTextField2.setText(rs.getString("Nombre"));
                Modificar.jTextField3.setText(rs.getString("Apellidos"));
                Modificar.jTextField4.setText(rs.getString("Edad"));
                Modificar.jTextField5.setText(rs.getString("Correo_Electronico"));
                Modificar.jTextField6.setText(rs.getString("Boleta"));
                Modificar.jTextField1.setText(rs.getString("Foto"));
                
                Image foto =  getToolkit().getImage(Modificar.jTextField1.getText());
                foto = foto.getScaledInstance(210, 210, Image.SCALE_DEFAULT);
                Modificar.jLabel1.setIcon(new ImageIcon(foto));
                
                Modificar.jTextField7.setText(rs1.getString("Peso"));
                Modificar.jTextField8.setText(rs1.getString("Cantidad_de_agua"));
                Modificar.jTextField11.setText(rs1.getString("Estatura"));
                Modificar.jTextField9.setText(rs1.getString("Edad_metabolica"));
                Modificar.jTextField10.setText(rs1.getString("IMC"));
                Modificar.jTextField12.setText(rs1.getString("Ejercicio"));

                conexion.close();
                JOptionPane.showMessageDialog(null, "Busqueda exitosa");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Registro no Encontrado");               
            }
        }
        if(valor < 2012000000){
            respuesta = JOptionPane.showConfirmDialog(null, "La boleta ha expirado, ¿Quieres volver al menú?", null, JOptionPane.YES_NO_OPTION);
            if(respuesta == 0){
                Ventana_Seleccion  obj = new Ventana_Seleccion();
                obj.setVisible(true);
                dispose();
            }
            if(respuesta == 1){
                
            }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
