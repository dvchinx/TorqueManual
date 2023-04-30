package Info.Isuzu;
import Info.Tool;
/**
 *
 * @author dvchinx_
 */
public class Isuzu {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Isuzu4JA1(){
        Tool.RellenarMain("2.500", "89-...", DEFAULT, DEFAULT, "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-ie", "51 lb-pie", "75 lb-pie", "4to Apriete:", "-90°+75 lb-pie", "5to:", "Reapriete");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Isuzu4JB1(){
        Tool.RellenarMain("2.771", "84-98", "93.0 mm", "102.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "36 lb-pie", "+60°giro", "4to Apriete:", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("116-130 lb-pie", "58-65 lb-pie", "90 lb-pie");
        
        Tool.RellenarTablaReglajes("0.16 mm", "0.16 mm", "**", DEFAULT);
    }
    
    public static void Isuzu6VD1(){
        Tool.RellenarMain("2.835", "80-85", "3.500\"", "2.990\"", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "40 lb-pie", "65-75 lb-pie", "Reapriete:", "A los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("63-74 lb-pie", "34-40 lb-pie", "50 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void Isuzu4JH1(){
        Tool.RellenarMain("3.000", "89-...", DEFAULT, DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Isuzu4BD1(){
        Tool.RellenarMain("3.856", "86-91", "102.0 mm", "118.0 mm", "Diesel", DEFAULT);
        
        Tool.RellenarTablaTorquesCulata("50 lb-pie", "65 lb-pie", "90°-120° giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("173 lb-pie", "29 lb-pie+(60°-90°)", "20 lb-pie+(60°-90°)");
        
        Tool.RellenarTablaReglajes("0.30 mm", DEFAULT, "0.30mm**", "0.30mm");
    }
    
    public static void Isuzu4BD2(){
        Tool.RellenarMain("3.900", "85-99", "102 mm", "118 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("60 lb-pie", "+130°giro", DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("180 lb-pie", "29 lb-pie +80°giro", "29 lb-pie +90°giro");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.016\"", DEFAULT, "0.016\"");
    }
    
    public static void Isuzu4HG1(){
        Tool.RellenarMain("4.570", DEFAULT, "115 mm", "125 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("72 lb-pie", "109 lb-pie", "+45°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("98 lb-pie +30°+60°", "30 lb-pie +30+60°giro", DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Isuzu6BD1(){
        Tool.RellenarMain("5.800", "76-88", "102 mm", "118 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("50 lb-pie", "70 lb-pie", "*", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("174 lb-pie", "87 lb-pie", "161 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.016\"", DEFAULT, "0.016\"");
    }
    
    public static void Isuzu6BG1(){
        Tool.RellenarMain("6.500", "88-94", "105.0 mm", "120.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void IsuzuDH100(){
        Tool.RellenarMain("10.179", "82-87", "120 mm", DEFAULT, "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
    
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Isuzu6RA1(){
        Tool.RellenarMain("12.023", "70-80", "135.0 mm", "140.0 mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("100 lb-pie", "145 lb-pie", "+60°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("280 lb-pie", "75 lb-pie", DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
}
