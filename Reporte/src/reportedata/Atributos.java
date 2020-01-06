/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedata;

/**
 *
 * @author jucazuse
 */
public class Atributos {
    
    private String username;
    private String arquitectura;
    private String sistemaO;

    public Atributos() {
    }

    public Atributos(String username, String arquitectura, String sistemaO) {
        this.username = username;
        this.arquitectura = arquitectura;
        this.sistemaO = sistemaO;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the arquitectura
     */
    public String getArquitectura() {
        return arquitectura;
    }

    /**
     * @param arquitectura the arquitectura to set
     */
    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    /**
     * @return the sistemaO
     */
    public String getSistemaO() {
        return sistemaO;
    }

    /**
     * @param sistemaO the sistemaO to set
     */
    public void setSistemaO(String sistemaO) {
        this.sistemaO = sistemaO;
    }
    
    
    
}
