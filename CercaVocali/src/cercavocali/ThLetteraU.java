/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cercavocali;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Mattia Broch
 * @version 1.0
 * @brief classe che gestisce il thread per cercare la lettera U
 */
public class ThLetteraU extends Thread{
    
    /**
     * @author Mattia Broch
     * @brief Variabile che rappresenta la frase da controllare
     */
    
    private String frase;
    
    private datiCondivisi var;
    
    /**
     * @author Mattia Broch
     * @brief Variabile per scrivere il testo nel JFrame
     */
    
    private javax.swing.JTextArea testo;

    /**
     * @brief costruttore con parametri
     * @author Mattia Broch
     * @param testo dove scrivere le lettere
     */
    
    public ThLetteraU(javax.swing.JTextArea testo,datiCondivisi var){
        frase="Ciao sono un Thread";
        this.testo=testo;
        this.var=var;
    }
    
    /**
     * @brief metodo che scorre la frase e vede se la lettera U è presente, se si la stampa
     * @author Mattia Broch
     */
    
    @Override
    public void run() 
    {        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='u'||frase.charAt(i)=='U')
                //testo.setText(testo.getText()+"u");      
                var.getSem().acquireUninterruptibly();
                var.addEl('u');
                System.out.println(var.getCoda());
                var.getSem().release();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThLetteraU.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
