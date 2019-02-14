/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cercavocali;

import java.util.Vector;
import java.util.concurrent.Semaphore;

/**
 *
 * @author broch_mattia
 */
public class datiCondivisi {
    
    private Semaphore sem;
    private String coda;
    
    public datiCondivisi(){
        coda ="";
        sem=new Semaphore(1);
    }

    public datiCondivisi(Semaphore sem, String coda) {
        this.sem = sem;
        this.coda = coda;
    }

    public Semaphore getSem() {
        return sem;
    }

    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    public String getCoda() {
        return coda;
    }

    public void addEl(char carattere) {
        this.coda += carattere;
    }
    
    
    
    
    
}
