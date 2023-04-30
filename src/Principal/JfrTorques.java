package Principal;

import Info.Caterpillar.Caterpillar;
import Info.Chevrolet.Chevrolet;
import Info.Cummins.Cummins;
import Info.Hyundai.Hyundai;
import Info.International.International;
import Info.Isuzu.Isuzu;
import Info.Kia.Kia;
import Info.Mitsubishi.Mitsubichi;
import Info.Nissan.Nissan;
import Info.Perkins.Perkins;
import Info.Toyota.Toyota;
import Info.Volkswagen.Volkswagen;

/**
 *
 * @author dvchinx_
 */
public class JfrTorques extends javax.swing.JFrame {

    private int xMouse, yMouse;

    public JfrTorques() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        cmbMarca = new javax.swing.JComboBox<>();
        txtMotor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtFnlCilindraje = new javax.swing.JLabel();
        txtCilindraje = new javax.swing.JLabel();
        txtFnlAnoMotor = new javax.swing.JLabel();
        txtAnoMotor = new javax.swing.JLabel();
        txtFnlCilindro = new javax.swing.JLabel();
        txtCilindro = new javax.swing.JLabel();
        txtFnlCarrera = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JLabel();
        txtFnlTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        txtFnlPaisOrigen = new javax.swing.JLabel();
        txtPaisOrigen = new javax.swing.JLabel();
        imgApriete = new javax.swing.JLabel();
        imgCilindros = new javax.swing.JLabel();
        tablaReglajes = new javax.swing.JPanel();
        txtNameTbl1 = new javax.swing.JLabel();
        txtFnlValvEscape = new javax.swing.JLabel();
        txtFnlValvAdmision = new javax.swing.JLabel();
        txtHotAdmision = new javax.swing.JLabel();
        txtFnlHotAdmision = new javax.swing.JLabel();
        txtFnlColdAdmision = new javax.swing.JLabel();
        txtColdAdmision = new javax.swing.JLabel();
        txtFnlHotEscape = new javax.swing.JLabel();
        txtFnlColdEscape = new javax.swing.JLabel();
        txtColdEscape = new javax.swing.JLabel();
        txtHotEscape = new javax.swing.JLabel();
        tablaTorques = new javax.swing.JPanel();
        txtNameTbl0 = new javax.swing.JLabel();
        txtFnlExtraApriete1 = new javax.swing.JLabel();
        txtFnlPrimerApriete = new javax.swing.JLabel();
        txtFnlSegundoApriete = new javax.swing.JLabel();
        txtFnlTercerApriete = new javax.swing.JLabel();
        txtFnlVolante = new javax.swing.JLabel();
        txtFnlBancada = new javax.swing.JLabel();
        txtFnlBiela = new javax.swing.JLabel();
        txtVolante = new javax.swing.JLabel();
        txtPrimerApriete = new javax.swing.JLabel();
        txtSegundoApriete = new javax.swing.JLabel();
        txtExtraApriete1 = new javax.swing.JLabel();
        txtBancada = new javax.swing.JLabel();
        txtBiela = new javax.swing.JLabel();
        txtFnlCulata = new javax.swing.JLabel();
        txtTercerApriete = new javax.swing.JLabel();
        txtFnlExtraApriete0 = new javax.swing.JLabel();
        txtExtraApriete0 = new javax.swing.JLabel();
        btnLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop.setBackground(new java.awt.Color(204, 204, 204));
        pnlTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopMouseDragged(evt);
            }
        });
        pnlTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopMousePressed(evt);
            }
        });
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setFont(new java.awt.Font("Corbel", 1, 21)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        pnlTop.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Manual de Torques");
        pnlTop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 296, 28));

        btnClose1.setFont(new java.awt.Font("Corbel", 1, 21)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(0, 0, 0));
        btnClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose1.setText("-");
        btnClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose1MouseClicked(evt);
            }
        });
        pnlTop.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 40, 40));

        getContentPane().add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbMarca.setBackground(new java.awt.Color(255, 255, 255));
        cmbMarca.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cmbMarca.setForeground(new java.awt.Color(0, 0, 0));
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Caterpillar", "Chevrolet", "Cummins", "Hyundai", "Internacional/Navistar", "Isuzu", "Kia", "Mitsubishi", "Nissan", "Perkins", "Toyota", "Volkswagen" }));
        pnlMain.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 50));

        txtMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtMotor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMotor.setForeground(new java.awt.Color(0, 0, 0));
        txtMotor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMotor.setText("Motor");
        txtMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMotorMouseClicked(evt);
            }
        });
        pnlMain.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 50));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/arrow_forward.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlMain.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 50, 50));

        txtFnlCilindraje.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlCilindraje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlCilindraje.setText("Cilindraje [c.c.]");
        txtFnlCilindraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtFnlCilindraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, 30));

        txtCilindraje.setForeground(new java.awt.Color(0, 0, 0));
        txtCilindraje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCilindraje.setText("--:--");
        txtCilindraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtCilindraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 30));

        txtFnlAnoMotor.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlAnoMotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlAnoMotor.setText("Año Motor");
        txtFnlAnoMotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtFnlAnoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 100, 30));

        txtAnoMotor.setForeground(new java.awt.Color(0, 0, 0));
        txtAnoMotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAnoMotor.setText("--:--");
        txtAnoMotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtAnoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 30));

        txtFnlCilindro.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlCilindro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlCilindro.setText("cilindro (D)");
        txtFnlCilindro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtFnlCilindro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 100, 30));

        txtCilindro.setForeground(new java.awt.Color(0, 0, 0));
        txtCilindro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCilindro.setText("--:--");
        txtCilindro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtCilindro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 100, 30));

        txtFnlCarrera.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlCarrera.setText("Carrera (L)");
        txtFnlCarrera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlMain.add(txtFnlCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 100, 30));

        txtCarrera.setForeground(new java.awt.Color(0, 0, 0));
        txtCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCarrera.setText("--:--");
        txtCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 100, 30));

        txtFnlTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlTipo.setText("Tipo");
        txtFnlTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtFnlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 30));

        txtTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipo.setText("--:--");
        txtTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 100, 30));

        txtFnlPaisOrigen.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlPaisOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFnlPaisOrigen.setText("País de Origen");
        txtFnlPaisOrigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtFnlPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 30));

        txtPaisOrigen.setForeground(new java.awt.Color(0, 0, 0));
        txtPaisOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPaisOrigen.setText("--:--");
        txtPaisOrigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(txtPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 100, 30));

        imgApriete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgApriete.setText("(IMAGE NO AVAILABLE)");
        imgApriete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(imgApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 290, 150));

        imgCilindros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCilindros.setText("(IMG NO AVAILABLE)");
        imgCilindros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(imgCilindros, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 150, 150));

        tablaReglajes.setBackground(new java.awt.Color(255, 255, 255));
        tablaReglajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaReglajes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameTbl1.setForeground(new java.awt.Color(0, 0, 0));
        txtNameTbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNameTbl1.setText("Tabla de Reglajes");
        txtNameTbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaReglajes.add(txtNameTbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 30));

        txtFnlValvEscape.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlValvEscape.setText("Válvulas de Escape:");
        tablaReglajes.add(txtFnlValvEscape, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtFnlValvAdmision.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlValvAdmision.setText("Válvulas de Admisión:");
        tablaReglajes.add(txtFnlValvAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtHotAdmision.setForeground(new java.awt.Color(102, 102, 102));
        txtHotAdmision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHotAdmision.setText("--:--");
        tablaReglajes.add(txtHotAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, -1));

        txtFnlHotAdmision.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlHotAdmision.setText("En Caliente:");
        tablaReglajes.add(txtFnlHotAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtFnlColdAdmision.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlColdAdmision.setText("En Frío:");
        tablaReglajes.add(txtFnlColdAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtColdAdmision.setForeground(new java.awt.Color(102, 102, 102));
        txtColdAdmision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtColdAdmision.setText("--:--");
        tablaReglajes.add(txtColdAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, -1));

        txtFnlHotEscape.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlHotEscape.setText("En Caliente:");
        tablaReglajes.add(txtFnlHotEscape, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtFnlColdEscape.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlColdEscape.setText("En Frío:");
        tablaReglajes.add(txtFnlColdEscape, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtColdEscape.setForeground(new java.awt.Color(102, 102, 102));
        txtColdEscape.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtColdEscape.setText("--:--");
        tablaReglajes.add(txtColdEscape, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, -1));

        txtHotEscape.setForeground(new java.awt.Color(102, 102, 102));
        txtHotEscape.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHotEscape.setText("--:--");
        tablaReglajes.add(txtHotEscape, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, -1));

        pnlMain.add(tablaReglajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 530, -1, 230));

        tablaTorques.setBackground(new java.awt.Color(255, 255, 255));
        tablaTorques.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaTorques.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameTbl0.setForeground(new java.awt.Color(0, 0, 0));
        txtNameTbl0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNameTbl0.setText("Tabla de Torques");
        txtNameTbl0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaTorques.add(txtNameTbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 30));

        txtFnlExtraApriete1.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlExtraApriete1.setText("--:--");
        tablaTorques.add(txtFnlExtraApriete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        txtFnlPrimerApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlPrimerApriete.setText("1er Apriete:");
        tablaTorques.add(txtFnlPrimerApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtFnlSegundoApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlSegundoApriete.setText("2do Apriete:");
        tablaTorques.add(txtFnlSegundoApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtFnlTercerApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlTercerApriete.setText("3er Apriete:");
        tablaTorques.add(txtFnlTercerApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtFnlVolante.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlVolante.setText("Volante");
        tablaTorques.add(txtFnlVolante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtFnlBancada.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlBancada.setText("Bancada");
        tablaTorques.add(txtFnlBancada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtFnlBiela.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlBiela.setText("Biela");
        tablaTorques.add(txtFnlBiela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtVolante.setForeground(new java.awt.Color(102, 102, 102));
        txtVolante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtVolante.setText("--:--");
        tablaTorques.add(txtVolante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        txtPrimerApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtPrimerApriete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPrimerApriete.setText("--:--");
        tablaTorques.add(txtPrimerApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, -1));

        txtSegundoApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtSegundoApriete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSegundoApriete.setText("--:--");
        tablaTorques.add(txtSegundoApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        txtExtraApriete1.setForeground(new java.awt.Color(102, 102, 102));
        txtExtraApriete1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tablaTorques.add(txtExtraApriete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, 20));

        txtBancada.setForeground(new java.awt.Color(102, 102, 102));
        txtBancada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBancada.setText("--:--");
        tablaTorques.add(txtBancada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, -1));

        txtBiela.setForeground(new java.awt.Color(102, 102, 102));
        txtBiela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBiela.setText("--:--");
        tablaTorques.add(txtBiela, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 130, -1));

        txtFnlCulata.setForeground(new java.awt.Color(0, 0, 0));
        txtFnlCulata.setText("Culata (Cámara)");
        tablaTorques.add(txtFnlCulata, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtTercerApriete.setForeground(new java.awt.Color(102, 102, 102));
        txtTercerApriete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTercerApriete.setText("--:--");
        tablaTorques.add(txtTercerApriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        txtFnlExtraApriete0.setForeground(new java.awt.Color(102, 102, 102));
        txtFnlExtraApriete0.setText("--:--");
        tablaTorques.add(txtFnlExtraApriete0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 20));

        txtExtraApriete0.setForeground(new java.awt.Color(102, 102, 102));
        txtExtraApriete0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tablaTorques.add(txtExtraApriete0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 18));

        pnlMain.add(tablaTorques, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, 230));

        btnLista.setBackground(new java.awt.Color(255, 255, 255));
        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lista.png"))); // NOI18N
        btnLista.setBorderPainted(false);
        btnLista.setContentAreaFilled(false);
        btnLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLista.setFocusPainted(false);
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        pnlMain.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 50));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void pnlTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void pnlTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void txtMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMotorMouseClicked
        txtMotor.setText("");
    }//GEN-LAST:event_txtMotorMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int MelMarca = cmbMarca.getSelectedIndex();
        String MelMotor = txtMotor.getText().toUpperCase().replace(" ", "");
        if (MelMarca == 1) {
            switch (MelMotor) {
                case "3116":
                    Caterpillar.Caterpillar3116();
                    break;
                case "3126E":
                    Caterpillar.Caterpillar3126E();
                    break;
                case "3208":
                    Caterpillar.Caterpillar3208();
                    break;
                case "3406":
                    Caterpillar.Caterpillar3406();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if (MelMarca == 2) {
            switch (MelMotor) {
                case "F10A":
                    Chevrolet.ChevroletF10A();
                    break;
                case "F12S3":
                    Chevrolet.ChevroletF12S3();
                    break;
                case "K12A":
                    Chevrolet.ChevroletK12A();
                    break;
                case "C13N/S":
                    Chevrolet.ChevroletC13N();
                    break;
                case "C13N":
                    Chevrolet.ChevroletC13N();
                    break;
                case "C14N":
                    Chevrolet.ChevroletC14N();
                    break;
                case "L73":
                    Chevrolet.ChevroletL73();
                    break;
                case "4ZA1":
                    Chevrolet.Chevrolet4ZA1();
                    break;
                case "X17D-4EE1T-4EE1":
                    Chevrolet.ChevroletX17D();
                    break;
                case "X17D-4EE1T":
                    Chevrolet.ChevroletX17D();
                    break;
                case "X17D":
                    Chevrolet.ChevroletX17D();
                    break;
                case "G16A":
                    Chevrolet.ChevroletG16A();
                    break;
                case "G16B":
                    Chevrolet.ChevroletG16B();
                    break;
                case "X18XE1":
                    Chevrolet.ChevroletX18XE1();
                    break;
                case "112OHC":
                    Chevrolet.Chevrolet112OHC();
                    break;
                case "112OHV":
                    Chevrolet.Chevrolet112OHV();
                    break;
                case "G200Z":
                    Chevrolet.ChevroletG200Z();
                    break;
                case "4ZC1":
                    Chevrolet.Chevrolet4ZC1();
                    break;
                case "J20A":
                    Chevrolet.ChevroletJ20A();
                    break;
                case "134OHV":
                    Chevrolet.Chevrolet134OHV();
                    break;
                case "C22NE":
                    Chevrolet.ChevroletC22NE();
                    break;
                case "4ZD1":
                    Chevrolet.Chevrolet4ZD1();
                    break;
                case "H25A":
                    Chevrolet.ChevroletH25A();
                    break;
                case "4JA1":
                    Chevrolet.Chevrolet4JA1();
                    break;
                case "4JB1":
                    Chevrolet.Chevrolet4JB1();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if (MelMarca == 3) {
            switch (MelMotor) {
                case "6BT":
                    Cummins.Cummins6BT();
                    break;
                case "155":
                    Cummins.Cummins155();
                    break;
                case "4BT":
                    Cummins.Cummins4BT();
                    break;
                case "210":
                    Cummins.Cummins210();
                    break;
                case "L10":
                    Cummins.CumminsL10();
                    break;
                case "855":
                    Cummins.Cummins855();
                    break;
                case "6CT":
                    Cummins.Cummins6CT();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if (MelMarca == 4) {
            switch (MelMotor) {
                case "4D56":
                    Hyundai.Hyundai4D56();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if (MelMarca == 5) {
            switch (MelMotor) {
                case "BD220":
                    International.InternationalBD220();
                    break;
                case "BD264":
                    International.InternationalBD264();
                    break;
                case "266":
                    International.International266();
                    break;
                case "304":
                    International.International304();
                    break;
                case "345":
                    International.International345();
                    break;
                case "DT360":
                    International.InternationalDT360();
                    break;
                case "DT408":
                    International.InternationalDT408();
                    break;
                case "RD450":
                    International.InternationalRD450();
                    break;
                case "DT466":
                    International.InternationalDT466();
                    break;
                case "466":
                    International.International466El();
                    break;
                case "466ELECT":
                    International.International466El();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca == 6){
            switch(MelMotor){
                case "4JA1":
                    Isuzu.Isuzu4JA1();
                    break;
                case "4JB1":
                    Isuzu.Isuzu4JA1();
                    break;
                case "6VD1":
                    Isuzu.Isuzu6VD1();
                    break;
                case "4JH1":
                    Isuzu.Isuzu4JH1();
                    break;
                case "4BD1-T":
                    Isuzu.Isuzu4BD1();
                    break;
                case "4BD1":
                    Isuzu.Isuzu4BD1();
                    break;
                case "4BD2-T":
                    Isuzu.Isuzu4BD2();
                    break;
                case "4BD2":
                    Isuzu.Isuzu4BD2();
                    break;
                case "4HG1":
                    Isuzu.Isuzu4HG1();
                    break;
                case "6BD1":
                    Isuzu.Isuzu6BD1();
                    break;
                case "6BG1":
                    Isuzu.Isuzu6BG1();
                    break;
                case "DH100":
                    Isuzu.IsuzuDH100();
                    break;
                case "6RA1":
                    Isuzu.Isuzu6RA1();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca == 7){
            switch (MelMotor){
                case "J2":
                    Kia.KiaJ2();
                    break;
                case "JT":
                    Kia.KiaJT();
                    break;
                case "J3":
                    Kia.KiaJ2();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca == 8){
            switch (MelMotor){
                case "G54B":
                    Mitsubichi.MitsubishiG54B();
                    break;
                case "6G74":
                    Mitsubichi.Mitsubishi6G74();
                    break;
                case "4D34-2A/T2":
                    Mitsubichi.Mitsubishi4D34();
                    break;
                case "4D34-2A":
                    Mitsubichi.Mitsubishi4D34();
                    break;
                case "4D34":
                    Mitsubichi.Mitsubishi4D34();
                    break;  
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca == 9){
            switch (MelMotor){
                case "SD22":
                    Nissan.NissanSD22();
                    break;
                case "KA24E":
                    Nissan.NissanKA24E();
                    break;
                case "TD27":
                    Nissan.NissanTD27();
                    break;
                case "VG30E":
                    Nissan.NissanVG30E();
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca == 10){
            switch (MelMotor){
                case "6/354-2":
                    Perkins.Perkins63542();
                    break;
                case "6/354-4":
                    Perkins.Perkins63544();
                    break;
                case "6/372":
                    Perkins.Perkins6372();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if (MelMarca == 11){
            switch (MelMotor) {
                case "4K-E":
                    Toyota.Toyota4KE();
                    break;
                case "2E-LU":
                    Toyota.Toyota2ELU();
                    break;
                case "1NZ-FE":
                    Toyota.Toyota1NZFE();
                    break;
                case "3AU":
                    Toyota.Toyota3AU();
                    break;
                case "1AU":
                    Toyota.Toyota1AU();
                    break;
                case "3E/3EE":
                    Toyota.Toyota3E3EE();
                    break;
                case "2R":
                    Toyota.Toyota2R();
                    break;
                case "2NZ-FE":
                    Toyota.Toyota2NZFE();
                    break;
                case "4A-GLC":
                    Toyota.Toyota4AGLC();
                    break;
                case "4A-LC":
                    Toyota.Toyota4ALC();
                    break;
                case "4A-C":
                    Toyota.Toyota4AC();
                    break;
                case "4A-FE":
                    Toyota.Toyota4AFE();
                    break;
                case "12R":
                    Toyota.Toyota12R();
                    break;
                case "2TC":
                    Toyota.Toyota2TC();
                    break;
                case "5R":
                    Toyota.Toyota5R();
                    break;
                case "2S-ELU":
                    Toyota.Toyota2SELU();
                    break;
                case "3Y":
                    Toyota.Toyota3Y();
                    break;
                case "5S-FE":
                    Toyota.Toyota5SFE();
                    break;
                case "13B":
                    Toyota.Toyota13B();
                    break;
                case "14B":
                    Toyota.Toyota14B();
                    break;
                case "3RZ-FE":
                    Toyota.Toyota3RZFE();
                    break;
                case "15BT":
                    Toyota.Toyota15BT();
                    break;
                case "2F":
                    Toyota.Toyota2F();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        } else if(MelMarca==12){
            switch(MelMotor){
                case "4.10T/CA":
                    Volkswagen.Volkswagen410T();
                    break;
                case "-":
                    Volkswagen.Volkswagen();
                    break;
                case "":
                    Volkswagen.Volkswagen();
                    break;
                case "AEB/ANB":
                    Volkswagen.VolkswagenAEB();
                    break;
                case "APQ/AQY":
                    Volkswagen.VolkswagenAPQ();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        JfrLista newJfr = new JfrLista();
            newJfr.setVisible(true);
            newJfr.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose1MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnClose1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnClose1;
    private javax.swing.JButton btnLista;
    public static javax.swing.JComboBox<String> cmbMarca;
    public static javax.swing.JLabel imgApriete;
    public static javax.swing.JLabel imgCilindros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel tablaReglajes;
    private javax.swing.JPanel tablaTorques;
    public static javax.swing.JLabel txtAnoMotor;
    public static javax.swing.JLabel txtBancada;
    public static javax.swing.JLabel txtBiela;
    public static javax.swing.JLabel txtCarrera;
    public static javax.swing.JLabel txtCilindraje;
    public static javax.swing.JLabel txtCilindro;
    public static javax.swing.JLabel txtColdAdmision;
    public static javax.swing.JLabel txtColdEscape;
    public static javax.swing.JLabel txtExtraApriete0;
    public static javax.swing.JLabel txtExtraApriete1;
    private javax.swing.JLabel txtFnlAnoMotor;
    private javax.swing.JLabel txtFnlBancada;
    private javax.swing.JLabel txtFnlBiela;
    private javax.swing.JLabel txtFnlCarrera;
    private javax.swing.JLabel txtFnlCilindraje;
    private javax.swing.JLabel txtFnlCilindro;
    private javax.swing.JLabel txtFnlColdAdmision;
    private javax.swing.JLabel txtFnlColdEscape;
    private javax.swing.JLabel txtFnlCulata;
    public static javax.swing.JLabel txtFnlExtraApriete0;
    public static javax.swing.JLabel txtFnlExtraApriete1;
    private javax.swing.JLabel txtFnlHotAdmision;
    private javax.swing.JLabel txtFnlHotEscape;
    private javax.swing.JLabel txtFnlPaisOrigen;
    private javax.swing.JLabel txtFnlPrimerApriete;
    private javax.swing.JLabel txtFnlSegundoApriete;
    private javax.swing.JLabel txtFnlTercerApriete;
    private javax.swing.JLabel txtFnlTipo;
    private javax.swing.JLabel txtFnlValvAdmision;
    private javax.swing.JLabel txtFnlValvEscape;
    private javax.swing.JLabel txtFnlVolante;
    public static javax.swing.JLabel txtHotAdmision;
    public static javax.swing.JLabel txtHotEscape;
    public static javax.swing.JTextField txtMotor;
    private javax.swing.JLabel txtNameTbl0;
    private javax.swing.JLabel txtNameTbl1;
    public static javax.swing.JLabel txtPaisOrigen;
    public static javax.swing.JLabel txtPrimerApriete;
    public static javax.swing.JLabel txtSegundoApriete;
    public static javax.swing.JLabel txtTercerApriete;
    public static javax.swing.JLabel txtTipo;
    public static javax.swing.JLabel txtVolante;
    // End of variables declaration//GEN-END:variables
}
