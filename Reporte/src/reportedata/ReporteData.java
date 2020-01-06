/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedata;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jucazuse
 */
public class ReporteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException {
      
       Datos datos=new Datos();
       
       Atributos atributos=new Atributos(System.getProperty("user.name"), System.getProperty("os.arch"), System.getProperty("os.name"));
        
       datos.addDatos(atributos);
       
       JasperReport reporte=(JasperReport) JRLoader.loadObject("report1.jasper");
       JasperPrint jasperPrint=JasperFillManager.fillReport(reporte, null,datos);
       
       JasperViewer viwer=new JasperViewer(jasperPrint);
       viwer.setTitle("primer reporte sin bases de datos ");
       viwer.setVisible(true);
       
       JRExporter exporte=new JRPdfExporter();
       exporte.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
       exporte.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte.pdf"));
       exporte.exportReport();
    }
}
