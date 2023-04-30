package Info.Chevrolet;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Chevrolet {
    
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void ChevroletF10A(){
        Tool.RellenarMain("970", "85-00", "65.5mm", "72.00mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("15 lb-pie", "30 lb-pie", "45 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie", "25 lb-pie", "65-70 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.15mm", DEFAULT, "0.15mm");
    }
    
    public static void ChevroletF12S3(){
        Tool.RellenarMain("995", "04-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata(DEFAULT, DEFAULT, DEFAULT, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void ChevroletK12A(){
        Tool.RellenarMain("1.200", "98-02", "68.0mm", DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "36 lb-pie", "-180°giro", "4to Apriete:", "22 lb-pie", "5to Apriete:", "43 lb-pie");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void ChevroletC13N(){
        Tool.RellenarMain("1.297", "76-89", "75.0mm", "73.4mm", "Gasolina", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "+70°giro", "+70°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("36 lb-pie", "20 lb-pie", "25 lb-pie");
        
        Tool.RellenarTablaReglajes("0.006 pulg", DEFAULT, "0.010 pulg", DEFAULT);
    }
    
    public static void ChevroletC14N(){
        Tool.RellenarMain("1.389", "96-...", "77.6,,", DEFAULT, "Gasolina", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "-90°giro + 20lb-pie", "+60°giro", "4to Apriete:", "+60°giro", "5to Apriete:", "+60°giro");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void ChevroletL73(){
        Tool.RellenarMain("1.393", "82-90", "82.0mm", "66.2mm", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "70-75 lb-pie", "Reapriete:", "a los 20 min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("50-55 lb-pie", "31-38 lb-pie", "42-52 lb-pie");
        
        Tool.RellenarTablaReglajes("0.15mm", "0.20mm", "0.15mm", "0.20mm");
    }
    
    public static void Chevrolet4ZA1(){
        Tool.RellenarMain("1.548", "95-98", "82.0mm", "75.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "75 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("72 lb-pie", "33 lb-pie", "69 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.15mm", DEFAULT, "0.25mm");
    }
    
    public static void ChevroletX17D(){
        Tool.RellenarMain("1.686", DEFAULT, "79.0mm", DEFAULT, "Diesel", "Alemania");
        
        Tool.RellenarTablaTorquesCulata("3 kg-m", "+50°giro", "+50°giro", "4to Apriete:", "+50°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void ChevroletG16A(){
        Tool.RellenarMain("1.590", "94-99", "75.0mm", "75.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "47-50 lb-pie", DEFAULT, "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("37-41 lb-pie", "24-27 lb-pie", "55-57 lb-pie");
        
        Tool.RellenarTablaReglajes("0.009-0.011 pulg", "0.052-0.062 pulg", "0.009-0.011 pulg", "0.063-0.079 pulg");
    }
    
    public static void ChevroletG16B(){
        Tool.RellenarMain("1.590", "92/...", "75.0mm", "75.5mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "51-54 lb-pie", DEFAULT, "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("37-41 lb-pie", "24-26 lb-pie", "55-58 lb-pie");
        
        Tool.RellenarTablaReglajes("0.23-0.27mm", "0.13-0.17mm", "0.25-0.29mm", "0.15-0.19mm");
    }
    
    public static void ChevroletX18XE1(){
        Tool.RellenarMain("1.796", "98-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "-90°+18 lb-pie", "+90°giro", "4to Apriete:", "+90°giro", "5to Apriete:", "+90°giro +45°giro");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Chevrolet112OHC(){
        Tool.RellenarMain("1.800", "82-86", "87.0mm", "74.0mm", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "60°giro", "60°giro", "4to Apriete:", "60°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("57 lb-pie", "39 lb-pie", "45 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void Chevrolet112OHV(){
        Tool.RellenarMain("1.839", "82", "89.0mm", "74.0mm", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "75 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("70 lb-pie", "32 lb-pie", "50 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void ChevroletG200Z(){
        Tool.RellenarMain("1.949", "83-87", "87.0mm", "82.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "75 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("72 lb-pie", "33 lb-pie", "69 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", "0.15mm", "0.30mm", "0.25mm");
    }
    
    public static void Chevrolet4ZC1(){
        Tool.RellenarMain("1.994", "89-98", "88.0mm", "82.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "72.3 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("72.3 lb-pie", "43.4 lb-pie", "43.4 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", "0.15mm", "0.30mm", "0.25mm");
    }
    
    public static void ChevroletJ20A(){
        Tool.RellenarMain("1.995", "98.--", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "36 lb-pie", "62 lb-pie", "4to: -180°giro", "5to: 18 lb-pie", "6to: 36 lb-pie", "7mo: 76 lb-pie");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Chevrolet134OHV(){
        Tool.RellenarMain("2.000", "87-93", "89.0mm", "80.0mm", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "60 lb-pie", "70 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("70 lb-pie", "37 lb-pie", "50 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void ChevroletC22NE(){
        Tool.RellenarMain("2.000", "00-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "+60°giro", "+60°giro", "4to Apriete:", "+60°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Chevrolet4ZD1(){
        Tool.RellenarMain("2.254", "89-98", "88.0mm", "82.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "50 lb-pie", "72.3 lb-pie", "Reapriete:", "a los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("72.3 lb-pie", "43.4 lb-pie", "43.4 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", "0.15mm", "0.30mm", "0.25mm");
    }
    
    public static void ChevroletH25A(){
        Tool.RellenarMain("2.494", "96-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "62 lb-pie", "-180°giro", "4to Apriete:", "36 lb-pie", "5to Apriete:", "76 lb-pie");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Chevrolet4JA1(){
        Tool.RellenarMain("2.500", "89-...", DEFAULT, DEFAULT, "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "51 lb-pie", "76 lb-pie", "4to Apriete:", "-90° + 76 lb-pie", "5to:", "Reapriete a los 20min");
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Chevrolet4JB1(){
        Tool.RellenarMain("2.771", "84-98", "93.0mm", "102.0mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "36 lb-pie", "+60°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("116-130 lb-pie", "58-65 lb-pie", "90 lb-pie");
        
        Tool.RellenarTablaReglajes("0.16mm", "0.16mm", DEFAULT, DEFAULT);
    }
}
