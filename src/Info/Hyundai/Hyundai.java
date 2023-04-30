package Info.Hyundai;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Hyundai {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Hyundai4D56(){
        Tool.RellenarMain("1.476", DEFAULT, DEFAULT, DEFAULT, "Diesel", "Corea");
    
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "58 lb-pie", "87 lb-pie", "Reapriete", "a los 20 min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
