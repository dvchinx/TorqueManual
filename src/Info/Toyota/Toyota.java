package Info.Toyota;
import Info.Tool;

/**
 *
 * @author dvchinx_
 */
public class Toyota {
    private static final String DEFAULT = "--:--";
    private static final String DEFAULT_EXTRA_FNL = "--:--";
    private static final String DEFAULT_EXTRA = "";
    
    public static void Toyota4KE(){
        Tool.RellenarMain("1.290", "78-84", "75.0mm", "73.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("5.4 kg-m", "6.6 kg-m", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("5.4-6.6 kg-m", "4.0-5.2 kg-m", "5.4-6.6 kg-m");
        
        Tool.RellenarTablaReglajes("Impulsadores", "Hidráhulicos", "Impulsadores", "Hidráhulicos");
    }
    
    public static void Toyota2ELU(){
        Tool.RellenarMain("1.295", "84-96", "73.0mm", "77.4mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("21 lb-pie", "36 lb-pie", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("40 lb-pie", "30 lb-pie", "60 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", DEFAULT, "0.20mm", DEFAULT);
    }
    
    public static void Toyota1NZFE(){
        Tool.RellenarMain("1.298", "96-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "-90°+22 lb-pie", "90°giro", "4to Apriete:", "90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Toyota3AU(){
        Tool.RellenarMain("1.452", "82-88", "77.5mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("15 lb-pie", "29 lb-pie", "47 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie", "30 lb-pie", "60 kg-m");
        
        Tool.RellenarTablaReglajes("0.20mm", "0.18mm", "0.30mm", "0.28mm");
    }
    
    public static void Toyota1AU(){
        Tool.RellenarMain("1.452", "79-82", "77.5mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("15 lb-pie", "29 lb-pie", "40-47 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("44 lb-pie", "36 lb-pie", DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Toyota3E3EE(){
        Tool.RellenarMain("1.456", "86-90", "73.0mm", "87.2mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "36 lb-pie", "36 lb-pie", "4to Apriete:", "+90giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("42 lb-pie", "29 lb-pie", "65 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.17 mm", DEFAULT, "0.17 mm");
    }
    
    public static void Toyota2R(){
        Tool.RellenarMain("1.490", "65-71", "78.0mm", "78.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("15 lb-pie", "30 lb-pie", "52-63 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("52-63 lb-pie", "29-36 lb-pie", "45 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", DEFAULT, "0.36mm", DEFAULT);
    }
    
    public static void Toyota2NZFE(){
        Tool.RellenarMain("1.496", "96-...", DEFAULT, DEFAULT, "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "-90°+22 lb-pie", "90°giro", "4to Apriete:", "90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes(DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    }
    
    public static void Toyota4AGLC(){
        Tool.RellenarMain("1.587", "84-85", "81.0mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("25 lb-pie", "45 lb-pie", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie", "36 lb-pie", "57 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.20 mm", DEFAULT, "0.20 mm");
    }
    
    public static void Toyota4ALC(){
        Tool.RellenarMain("1.587", "83-85", "81.0mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("5.4 kg-m", "6.6 kg-m", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("5.4-6.6 kg-m", "3.5-4.5 kg-m", "7.5-8.5 kg-m");
        
        Tool.RellenarTablaReglajes("0.008\n", DEFAULT, "0.0012\"", DEFAULT);
    }
    
    public static void Toyota4AC(){
        Tool.RellenarMain("1.587", "86-87", "81.0mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("20 lb-pie", "45 lb-pie", "lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie", "36 lb-pie", "45 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.20mm", DEFAULT, "0.25mm");
    }
    
    public static void Toyota4AFE(){
        Tool.RellenarMain("1.587", "87-94", "81.0mm", "77.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("5.6 kg-m", "6.6 kg-m", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("5.6 kg-m", "4.6 kg-m", "7.0 kg-m");
        
        Tool.RellenarTablaReglajes("0.20 mm", DEFAULT, "0.33 mm", DEFAULT);
    }
    
    public static void Toyota12R(){
        Tool.RellenarMain("1.588", "76-79", "80.5 mm", "78.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("35 lb-pie", "70 lb-pie", "100 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("75 lb-pie", "45 lb-pie", "60 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20 mm", DEFAULT, "0.35 mm", DEFAULT);
    }
    
    public static void Toyota2TC(){
        Tool.RellenarMain("1.588", "79-84", "85.0mm", "70.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("60 lb-pie", "50 lb-pie", "70 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.20 mm", DEFAULT, "0.25 mm");
    }
    
    public static void Toyota5R(){
        Tool.RellenarMain("1.994", "75-82", "88.0mm", "82.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("6.5 kg-m", DEFAULT, DEFAULT, "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("6.1 kg-m", "5.1 kg-m", "8.3 kg-m");
        
        Tool.RellenarTablaReglajes("0.20 mm", DEFAULT, "0.33 mm", DEFAULT);
    }
    
    public static void Toyota2SELU(){
        Tool.RellenarMain("1.995", "82/...", "84.0mm", "90.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("40 lb-pie", "60 lb-pie", "90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("45 lb-pie", "45 lb-pie", "70 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.20 mm", DEFAULT, "0.20 mm");
    }
    
    public static void Toyota3Y(){
        Tool.RellenarMain("1.998", "83-90", "86.0mm", "86.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("22 lb-pie", "43 lb-pie", "65 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("6.1 kg-m", "5.0 kg-m", "8.0 kg-m");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.24 mm", DEFAULT, "0.33 mm");
    }
    
    public static void Toyota5SFE(){
        Tool.RellenarMain("2.164", "90-96", "87.0 mm", "91.0 mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("18 lb-pie", "36 lb-pie", "+giro de 90°", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("43 lb-pie", "18 lb-pie+90°giro", "65 lb-pie");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.011\"", DEFAULT, "0.015\"");
    }
    
    public static void Toyota13B(){
        Tool.RellenarMain("3.431", "84-89", "102.0mm", "105.0mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("36 lb-pie", "+90°giro", "+90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra(DEFAULT, DEFAULT, DEFAULT);
        
        Tool.RellenarTablaReglajes("0.008\"", "0.010\"", "0.014\"", "0.016\"");
    }
    
    public static void Toyota14B(){
        Tool.RellenarMain("3.660", "88/...", "102.0mm", "112.0mm", "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("5 kg-m", "+90°giro", "+90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("20 kg-m", "7kg-m+90°giro", "18 kg-m");
        
        Tool.RellenarTablaReglajes("0.25 mm", "0.25 mm", "0.40 mm", "0.40 mm");
    }
    
    public static void Toyota3RZFE(){
        Tool.RellenarMain("3.700", "94-00", "95.0mm", "95.0mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("29 lb-pie", "+90°giro", "+90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("29lb-pie+90°giro", "33lb-pie+90°giro", "19lb-pie+90°giroM/T");
        
        Tool.RellenarTablaReglajes(DEFAULT, "0.006\"-0.010\"", DEFAULT, "0.0010\"-0.014\"");
    }
    
    public static void Toyota15BT(){
        Tool.RellenarMain("4.1 lts", "95-95", "108.0mm", DEFAULT, "Diesel", "Japón");
        
        Tool.RellenarTablaTorquesCulata("27 lb-pie", "+90°giro", "+90°giro", DEFAULT_EXTRA_FNL, DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("109 lb-pie", "38 lb-pie+90°giro", "87 lb-pie");
        
        Tool.RellenarTablaReglajes("0.007\"", DEFAULT, "0.014\"", DEFAULT);
    }
    
    public static void Toyota2F(){
        Tool.RellenarMain("4.230", "75-80", "94.0mm", "101.6mm", "Gasolina", "Japón");
        
        Tool.RellenarTablaTorquesCulata("30 lb-pie", "60 lb-pie", "83-98 lb-pie", "Reapriete a los 20min", DEFAULT_EXTRA, DEFAULT_EXTRA_FNL, DEFAULT_EXTRA);
        Tool.RellenarTablaTorquesExtra("90-108 lb-pie", "45-55 lb-pie", "50 lb-pie");
        
        Tool.RellenarTablaReglajes("0.20mm", DEFAULT, "0.35mm", DEFAULT);
    }
}
