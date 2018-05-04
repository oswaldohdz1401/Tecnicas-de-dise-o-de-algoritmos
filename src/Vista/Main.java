/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.controladorBotonPrimerAlgoritmo;
import Controlador.controladorBotonSegundoAlgortmo;
/**
 *
 * @author Gracia Y Paz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jPanelPrincipal Principal = new jPanelPrincipal();
        
        controladorBotonPrimerAlgoritmo c;
        c = new controladorBotonPrimerAlgoritmo(Principal);
        
        controladorBotonSegundoAlgortmo cc;
        cc = new controladorBotonSegundoAlgortmo(Principal);
        
        
        Principal.setLocationRelativeTo(null);
        Principal.setResizable(false);
        Principal.setVisible(true);
        
    }
    
}
