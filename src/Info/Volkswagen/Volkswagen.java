package Info.Volkswagen;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Volkswagen {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Volkswagen410T(){
        Tool.RellenarMain("4.300", "00-...", "103.0mm", "129.0mm", "Diesel", "Brasil");
        
        Tool.RellenarTablaTorquesCulata("60 Nm", "60°±3°giro", "60°±3°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("35±10N+90°±3°giro", "30±N+60°±3°giro", DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.40mm", DEFAULT, "0.40mm");
    }
    
    public static void Volkswagen(){
        Tool.RellenarMain("1.800", "84-87", DEFAULT, DEFAULT, "Gasolina", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "43 lb-pie", DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void VolkswagenAEB(){
        Tool.RellenarMain("1.800", "97-...", DEFAULT, DEFAULT, "Gasolina", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "43 lb-pie", "-90°+43lb-pie", "4to Apriete:", "90°giro", "5to Apriete:", "90°giro");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void VolkswagenAPQ(){
        Tool.RellenarMain("2.000", "00-...", DEFAULT, DEFAULT, "Gasolina", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("15 lb-pie", "29 lb-pie", "-90°+20 lb-pie", "4to Apriete:", "90°giro", "5to Apriete:", "90°giro");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
