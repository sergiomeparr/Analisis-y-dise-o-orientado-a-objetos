/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedata;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author jucazuse
 */
public class Datos implements JRDataSource {
    
    private List<Atributos> atributos = new ArrayList<>();
    private int indiciParticipantes = -1;
    
    @Override
    public boolean next() throws JRException {
        return ++indiciParticipantes < atributos.size();
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        
        if ("username".equals(jrf.getName())) {
            valor = atributos.get(indiciParticipantes).getUsername();
        } else if ("arquitectura".equals(jrf.getName())) {
            valor = atributos.get(indiciParticipantes).getArquitectura();
        } else if ("sistemaO".equals(jrf.getName())) {
            valor = atributos.get(indiciParticipantes).getSistemaO();
        }
        return valor;
    }

    public void addDatos(Atributos atributo) {
        this.atributos.add(atributo);
    }
}
