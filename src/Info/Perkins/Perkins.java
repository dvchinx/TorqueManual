package Info.Perkins;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Perkins {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Perkins63542(){
        Tool.RellenarMain("5.800", DEFAULT, "98.5mm", "127.0mm", "Diesel", "Inglaterra");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "50 lb-pie", "85 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("150 lb-pie", "75 lb-pie", "80 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Perkins63544(){
        Tool.RellenarMain("5.800", DEFAULT, "98.5mm", "127.0mm", "Diesel", "Inglaterra");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "58 lb-pie", "98 lb-pie", "Retorqueo 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("150 lb-pie", "75 lb-pie", "80 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.20mm (0.008\")", DEFAULT, "0.45mm (0.018\")");
    }
    
    public static void Perkins6372(){
        Tool.RellenarMain("6.105", DEFAULT, "101.0mm", "134.0mm", "Diesel", "Inglaterra");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "58 lb-pie", "98 lb-pie", "Reapriete 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("180 lb-pie", "90 lb-pie", "80 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
