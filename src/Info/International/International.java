package Info.International;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class International {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void InternationalBD220(){
        Tool.RellenarMain("3.605", "50-63", "3.562\"", "3.688\"", "Diesel", "U.S.A");
    
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "50 lb-pie", "85-95 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75-85 lb-pie", "45-55 lb-pie", "70-80 lb-pie");
        
        Tool.RellenarTablaReglajes("0.63mm", DEFAULT, "0.63mm", DEFAULT);
    }
    
    public static void InternationalBD264(){
        Tool.RellenarMain("4.326", "63-74", "3.812\"", "4.125\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "55 lb-pie", "85-95 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75-85 lb-pie", "45-55 lb-pie", DEFAULT);
        
        Tool.RellenarTablaReglajes("0.025\" -0.027\"", DEFAULT, "0.025\" -0.027\"", DEFAULT);
    }    
    
    public static void International266(){
        Tool.RellenarMain("4.359", "59-72", "3.625\"", "3.219\"", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", "90-100 lb-pie", "Reapriete:", "A los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75-85 lb-pie", "45-55 lb-pie", "55 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void International304(){
        Tool.RellenarMain("4.982", "59-80", "3.875\"", "3.219\"", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", "90-100 lb-pie", "Reapriete:", "A los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75-85 lb-pie", "45-55 lb-pie", "55 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void International345(){
        Tool.RellenarMain("5.654", "68-80", "3.875\"", "3.656\"", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", "90-100 lb-pie", "Reapriete:", "A los 20min", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75-85 lb-pie", "45-55 lb-pie", "55 lb-pie");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráulicos", "Impulsadores", "Hidráulicos");
    }
    
    public static void InternationalDT360(){
        Tool.RellenarMain("5.900", "90-96", "3.875\"", "5.085\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("110 lb-pie", "155 lb-pie", "165 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("115 lb-pie", "80 lb-pie", "100 lb-pie");
        
        Tool.RellenarTablaReglajes("0.25 mm", "0.25 mm", "0.25 mm", "0.25 mm");
    }
    
    public static void InternationalDT408(){
        Tool.RellenarMain("6.700", "94-...", "4.300\"", "5.350\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("110 lb-pie", "155 lb-pie", "165 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("115 lb-pie", "115 lb-pie", "100 lb-pie");
        
        Tool.RellenarTablaReglajes("0.25 mm", "0.25 mm", "0.25 mm", "0.25 mm");
    }
    
    public static void InternationalRD450(){
        Tool.RellenarMain("7.374", "53-76", "4.375\"", "5.000\"", "Gasolina", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "60 lb-pie", "75-85 lb-pie", "4to Apriete:", "100-110 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("100-110 lb-pie", "65-75 lb-pie", "150-160 lb-pie");
        
        Tool.RellenarTablaReglajes("0.025 pulg", DEFAULT, "0.025 pulg", DEFAULT);
    }
    
    public static void InternationalDT466(){
        Tool.RellenarMain("7.600", "...-94", "4.300\"", "5.350\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("110 lb-pie", "155 lb-pie", "165 lb-pie", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("115 lb-pie", "115 lb-pie", "100 lb-pie");
        
        Tool.RellenarTablaReglajes("0.25 mm", "0.25 mm", "0.25 mm", "0.25 mm");
    }
    
    public static void International466El(){
        Tool.RellenarMain("7.6 Lts", "00-04", "4.300\"", "4.680\"", "Diesel", "U.S.A");
        
        Tool.RellenarTablaTorquesCulata("100 lb-pie", "130 lb-pie", "+90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("*", "**115 lb-pie", DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.63 mm(0.025\")", DEFAULT, "0.63 mm(0.025\")");
    }
}
