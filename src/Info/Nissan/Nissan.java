package Info.Nissan;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Nissan {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void NissanSD22(){
        Tool.RellenarMain("2.2 Lts", "81-83", "83.0 mm", "100.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("*40 lb-pie", "*60 lb-pie", "*95 lb-pie", "Tornillos Cortos", "36 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("125 lb-pie", "40 lb-pie", "35 lb-pie");
        
        Tool.RellenarTablaReglajes("0.35 mm(0.014\")", DEFAULT, "0.35 mm(0.014\")", DEFAULT);
    }
    
    public static void NissanKA24E(){
        Tool.RellenarMain("2.389", "89-94", "89.0 mm", "96.0 mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("29 N-m", "78 N-m", DEFAULT, "", "aflojar 360° apretar 29N-m", "", "80-85°giro");
        Tool.RellenarTablaTorquesExtra("5.3 Kg-m", "5.3 Kg-m", "15 Kg-m");
        
        Tool.RellenarTablaReglajes("0.30 mm", DEFAULT, "0.30 mm", DEFAULT);
    }
    
    public static void NissanTD27(){
        Tool.RellenarMain("2.700", "88-92", "96.0 mm", "92.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("36 lb-pie", "45 lb-pie", "72 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("130 lb-pie", "60 lb-pie", "114 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void NissanVG30E(){
        Tool.RellenarMain("2.960", "86-97", "87.0 mm", "83.0 mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "43 lb-pie", "65 lb-pie", "Reapriete:", "A los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("67-74 lb-pie", "30 lb-pie", DEFAULT);
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
}
