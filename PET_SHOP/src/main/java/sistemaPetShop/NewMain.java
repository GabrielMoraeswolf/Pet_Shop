/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaPetShop;
import java.util.GregorianCalendar;
import telas.TelaLogin;
/**
 *
 * @author andre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int dia = calendar.get(GregorianCalendar.DAY_OF_MONTH) ;
        int mes = calendar.get(GregorianCalendar.MONTH) + 1;
        System.out.println(dia + "\n" + mes);
        Conta conta = new Conta();
        Loja loja = new Loja(conta); 
        // TODO code application logic here
        new TelaLogin(loja).setVisible(true);
        
    }
    
}
