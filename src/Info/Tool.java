package Info;
import Principal.JfrTorques;

/**
 *
 * @author dvchinx_
 */
public class Tool {
    
    public static void RellenarMain(String cilindraje, String anio, String cilindro, String carrera, String tipo, String pais){
        JfrTorques.txtCilindraje.setText(cilindraje);
        JfrTorques.txtAnoMotor.setText(anio);
        JfrTorques.txtCilindro.setText(cilindro);
        JfrTorques.txtCarrera.setText(carrera);
        JfrTorques.txtTipo.setText(tipo);
        JfrTorques.txtPaisOrigen.setText(pais);
    }
    
    public static void RellenarTablaTorquesCulata(String primer, String segundo, String tercero, String extraFnl0, String extra0, String extraFnl1, String extra1){
        JfrTorques.txtPrimerApriete.setText(primer);
        JfrTorques.txtSegundoApriete.setText(segundo);
        JfrTorques.txtTercerApriete.setText(tercero);
        JfrTorques.txtFnlExtraApriete0.setText(extraFnl0);
        JfrTorques.txtExtraApriete0.setText(extra0);
        JfrTorques.txtFnlExtraApriete1.setText(extraFnl1);
        JfrTorques.txtExtraApriete1.setText(extra1);
    }
    
    public static void RellenarTablaTorquesExtra(String bancada, String biela, String volante){
        JfrTorques.txtBancada.setText(bancada);
        JfrTorques.txtBiela.setText(biela);
        JfrTorques.txtVolante.setText(volante);
    }
    
    public static void RellenarTablaReglajes(String hotAdm, String coldAdm, String hotEsc, String coldEsc){
        JfrTorques.txtHotAdmision.setText(hotAdm);
        JfrTorques.txtColdAdmision.setText(coldAdm);
        
        JfrTorques.txtHotEscape.setText(hotEsc);
        JfrTorques.txtColdEscape.setText(coldEsc);
    }
}
