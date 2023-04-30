package Info.Kia;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Kia {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void KiaJ2(){
        Tool.RellenarMain("2.700", DEFAULT, "94.5 mm", DEFAULT, "Diesel", "Corea");
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void KiaJT(){
        Tool.RellenarMain("3.000", DEFAULT, DEFAULT, DEFAULT, "Diesel", "Corea");
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void KiaJ3(){
        Tool.RellenarMain("3.000", DEFAULT, "97.1 mm", DEFAULT, "Diesel", "Corea");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "43 lb-pie", "58 lb-pie", "4to Apriete:", "-90°+58 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
