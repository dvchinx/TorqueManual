package Info.Caterpillar;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Caterpillar {

    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";

    public static void Caterpillar3116() {
        Tool.RellenarMain(DEFAULT, "89 - 98", "105mm", "127mm", "Diesel", "U.S.A");

        Tool.RellenarTablaTorquesCulata("**60 lb-pie", "**99-12 lb-pie", "305-335 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie + 90°giro", "45 lb-pie + 60°giro", "100 lb-pie");

        Tool.RellenarTablaReglajes(DEFAULT, "0.0015\"", DEFAULT, "0.025\"");
    }

    public static void Caterpillar3126E() {
        Tool.RellenarMain(DEFAULT, "95 - 02", "110mm", "127mm", "Diesel", "U.S.A");

        Tool.RellenarTablaTorquesCulata("121 lb-pie", "305 lb-pie", "355 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("40 lb-pie + 90°giro*", "45 lb-pie + 65°giro***", "79-101 lb-pie");

        Tool.RellenarTablaReglajes(DEFAULT, "0.0015\"", DEFAULT, "0.025\"");
    }

    public static void Caterpillar3208() {
        Tool.RellenarMain(DEFAULT, DEFAULT, "114.3mm", "127mm", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("60 lb-pie", "95(6marcas) lb-pie", "110(7marcas) lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("30 lb-pie + 120°giro", "30 lb-pie + 60°giro", "55lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.015\"", DEFAULT, "0.025\"");
    }
    
    public static void Caterpillar3406(){
        Tool.RellenarMain(DEFAULT, DEFAULT, DEFAULT, DEFAULT, "Diesel", DEFAULT);
        
        Tool.RellenarTablaTorquesCulata("202 lb-pie", "325 lb-pie | *33lb-pie", "-90°+325lb-pie", "4to Apriete:", "-90°+325 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
