package Info.Mitsubishi;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Mitsubichi {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void MitsubishiG54B(){
        Tool.RellenarMain("2.555", "88-96", "91.1 mm", "98.0 mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", "72-80 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("54-61 lb-pie", "35 lb-pie", "990-101 lb-pie");
        
        Tool.RellenarTablaReglajes("0.15 mm", DEFAULT, "0.25 mm", DEFAULT);
    }
    
    public static void Mitsubishi6G74(){
        Tool.RellenarMain("3.496", "97-04", "93.0 mm", "82.8 mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "50 lb-pie", "80 lb-pie", "Retorqueo:", "20 min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("54 lb-pie", "38 lb-pie", "54 lb-pie Automatico");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void Mitsubishi4D34(){
        Tool.RellenarMain("3.907", "00-...", "110.0 mm", "115.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("145 N-m", "90°giro", DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("59 N-m +90°giro", "29 N-m +90°giro", "76 lb-pie");
        
        Tool.RellenarTablaReglajes("0.30 mm", DEFAULT, "0.35 mm", DEFAULT);
    }
}
