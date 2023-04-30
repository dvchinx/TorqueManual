package Info.Cummins;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Cummins {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Cummins6BT(){
        Tool.RellenarMain("5.900", "92-...", "102mm", "120mm", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("66 lb-pie", DEFAULT, DEFAULT, "Tornillos Largos:", "89 lb-pie", "Avance Todos:", "90°giro");
        Tool.RellenarTablaTorquesExtra("130 lb-pie", "*", "101 ñb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.010 pulg", DEFAULT, "0.020 pulg");
    }
    
    public static void Cummins155(){
        Tool.RellenarMain("6.196", DEFAULT, "4 5/8 pulg", "3 3/4 pulg", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("40 lb-pie", "80-90 lb-pie", "110-115 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("* 110 lb-pie", "**", "145 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Cummins4BT(){
        Tool.RellenarMain("3.900", DEFAULT, "102.0mm", DEFAULT, "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("60 N-m", "90 N-m", "120 N-m", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }    
    
    public static void Cummins210(){
        Tool.RellenarMain("8.228cc", DEFAULT, "4 5/8 pulg", "3 3/4 pulg", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("*80-90 lb-pie", "110-115 lb-pie", DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("**110 lb-pie", "***", "1145 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void CumminsL10(){
        Tool.RellenarMain("9.981cc", DEFAULT, "4.900\"", "5.400\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("75 lb-pie", "125 lb-pie", "175 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("*155 lb-pie", "155 lb-pie", "145 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.014\"", DEFAULT, "0.027\"");
    }
    
    public static void Cummins855(){
        Tool.RellenarMain("13.991cc", DEFAULT, "5.500\"", "6.000\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("20-25 lb-pie", "80-100 lb-pie", "265-305 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("**300-310 lb-pie", "***150 lb-pie", "220 lb-pie");
        
        Tool.RellenarTablaReglajes("0.36mm", DEFAULT, "0.69mm", DEFAULT);
    }
    
    public static void Cummins6CT(){
        Tool.RellenarMain("8.300", DEFAULT, "114.0mm", DEFAULT, "Diesel", "U.S.A");
    
        Tool.RellenarTablaTorquesCulata("36 lb-pie", "108 lb-pie", "145 lb-pie", "Reapriete:", "20 min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
