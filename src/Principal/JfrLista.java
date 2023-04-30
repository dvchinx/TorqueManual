package Principal;

/**
 *
 * @author dvchinx_
 */
public class JfrLista extends javax.swing.JFrame {

    private int xMouse, yMouse;

    public JfrLista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 41, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista Motores");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 296, 28));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txtArea.setRows(5);
        txtArea.setText("CATERPILLAR:\n\n- 3116\n- 3126E\n- 3208\n- 3406\n\nCHEVROLET:\n\n- F10A\n- F12S3\n- K12A\n- C13N/S  |  C13N\n- C14N\n- L73\n- 4ZA1\n- X17D-4EE1T-4EE1  |  X17D-4EE1T  | X17D\n- G16A\n- G16B\n- X18XE1\n- 112OHC\n- 112OHV\n- G200Z\n- 4ZC1\n- J20A\n- 134OHV\n- C22NE\n- 4ZD1\n- H25A\n- 4JA1\n- 4JB1\n\nCUMMINS:\n\n- 6BT\n- 155\n- 4BT\n- 210\n- L10\n- 6CT\n\nHYUNDAI:\n\n- 4D56\n\nINTERNATIONAL:\n\n- BD220\n- BD264\n- 266\n- 304\n- 345\n- DT408\n- RD450\n- DT466\n- 466  | 466ELECT\n\n\nISUZU:\n\n- 4JA1\n- 4JB1\n- 6VD1\n- 4JH1\n- 4BD1-T  |  4BD1\n- 4BD2-T  |  4BD2\n- 4HG1\n- 6BD1\n- 6BG1\n- DH100\n- 6RA1\n\nKIA:\n\n- J2\n- JT\n- J3\n\nMITSUBISHI:\n\n- G54B\n- 6G74\n- 4D34-21A/T2  |  4D34-2A  |  4D34\n\nNISSAN:\n\n- SD22\n- KA24E\n- TD27\n- VG30E\n\nPERKINS:\n\n- 6/352-2\n- 6/354-4\n- 6/372\n\nTOYOTA:\n\n- 4K-E\n- 2E-LU\n- 1NZ-FE\n- 3AU\n- 1AU\n- 3E/3EE\n- 2R\n- 2NZ-FE\n- 4A-GLC\n- 4A-LC\n- 4A-C\n- 4A-FE\n- 12R\n- 2TC\n- 5R\n- 2S-ELU\n- 3Y\n- 5S-FE\n- 13B\n- 14B\n- 3RZ-FE\n- 15BT\n- 2F\n\nVOLKSWAGEN:\n\n- 4.10T/CA\n- \"-\"  |  \" \"\n- AEB/ANB\n- APQ/AQY");
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 380, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
