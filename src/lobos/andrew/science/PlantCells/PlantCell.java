package lobos.andrew.science.PlantCells;

import lobos.andrew.science.AnswerField;
import lobos.andrew.science.BioTeachingTool;

/**
 *
 * @author andrew
 */
public class PlantCell extends javax.swing.JFrame implements lobos.andrew.science.TeachingToolGUI  {
    private final BioTeachingTool parentWindow;
    
    private AnswerField as_cellMembrane;
    private AnswerField as_cellWall;
    private AnswerField as_chloroplast;
    private AnswerField as_centrosome;
    private AnswerField as_cytoplasm;
    private AnswerField as_golgiBody;
    private AnswerField as_mitochondria;
    private AnswerField as_nuclearMembrane;
    private AnswerField as_nucleolus;
    private AnswerField as_nucleus;
    private AnswerField as_ribosomes;
    private AnswerField as_roughER;
    private AnswerField as_smoothER;
    private AnswerField as_vacuole;

    public PlantCell(BioTeachingTool parentWindow) {
        initComponents();
        
        as_cellMembrane = new AnswerField(cellmembrane, "cell membrane", "", this);
        as_cellWall = new AnswerField(cellwall, "cell wall", "", this);
        as_chloroplast = new AnswerField(chloroplast, "chloroplast", "", this);
        as_centrosome = new AnswerField(centrosome, "centrosome", "", this);
        as_cytoplasm = new AnswerField(cytoplasm, "cytoplasm", "", this);
        as_golgiBody = new AnswerField(golgiBody, "golgi body", "", this);
        as_mitochondria = new AnswerField(mitochondria, "mitochondria", "", this);
        as_nuclearMembrane = new AnswerField(nuclearMembrane, "nuclear membrane", "", this);
        as_nucleolus = new AnswerField(nucleolus, "nucleolus", "", this);
        as_nucleus = new AnswerField(nucleus, "nucleus", "", this);
        as_ribosomes = new AnswerField(ribosomes, "ribosomes", "", this);
        as_roughER = new AnswerField(roughER, "rough er", "", this);
        as_smoothER = new AnswerField(smoothER, "smooth er", "", this);
        as_vacuole = new AnswerField(vacuole, "vacuole", "", this);
        
        
        this.parentWindow = parentWindow;
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        infoText = new javax.swing.JTextArea();
        cellwall = new javax.swing.JTextField();
        cellmembrane = new javax.swing.JTextField();
        vacuole = new javax.swing.JTextField();
        nucleus = new javax.swing.JTextField();
        nucleolus = new javax.swing.JTextField();
        nuclearMembrane = new javax.swing.JTextField();
        chloroplast = new javax.swing.JTextField();
        mitochondria = new javax.swing.JTextField();
        golgiBody = new javax.swing.JTextField();
        ribosomes = new javax.swing.JTextField();
        smoothER = new javax.swing.JTextField();
        roughER = new javax.swing.JTextField();
        centrosome = new javax.swing.JTextField();
        cytoplasm = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(202, 225, 175));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoText.setColumns(20);
        infoText.setRows(5);
        infoText.setBorder(null);
        infoText.setDragEnabled(false);
        infoText.setFocusable(false);
        jScrollPane1.setViewportView(infoText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 380, 100));
        getContentPane().add(cellwall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));
        getContentPane().add(cellmembrane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, -1));
        getContentPane().add(vacuole, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 90, -1));
        getContentPane().add(nucleus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, -1));
        getContentPane().add(nucleolus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 90, -1));
        getContentPane().add(nuclearMembrane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 90, -1));
        getContentPane().add(chloroplast, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 90, -1));
        getContentPane().add(mitochondria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, -1));
        getContentPane().add(golgiBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 90, -1));
        getContentPane().add(ribosomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, -1));
        getContentPane().add(smoothER, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 90, -1));
        getContentPane().add(roughER, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 90, -1));
        getContentPane().add(centrosome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 90, -1));
        getContentPane().add(cytoplasm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 90, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lobos/andrew/science/PlantCells/anatomy.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        as_cellMembrane.reset();
        as_cellWall.reset();
        as_chloroplast.reset();
        as_centrosome.reset();
        as_cytoplasm.reset();
        as_golgiBody.reset();
        as_mitochondria.reset();
        as_nuclearMembrane.reset();
        as_nucleolus.reset();
        as_nucleus.reset();
        as_ribosomes.reset();
        as_roughER.reset();
        as_smoothER.reset();
        as_vacuole.reset();      
        infoText.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cellmembrane;
    private javax.swing.JTextField cellwall;
    private javax.swing.JTextField centrosome;
    private javax.swing.JTextField chloroplast;
    private javax.swing.JTextField cytoplasm;
    private javax.swing.JTextField golgiBody;
    private javax.swing.JTextArea infoText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mitochondria;
    private javax.swing.JTextField nuclearMembrane;
    private javax.swing.JTextField nucleolus;
    private javax.swing.JTextField nucleus;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField ribosomes;
    private javax.swing.JTextField roughER;
    private javax.swing.JTextField smoothER;
    private javax.swing.JTextField vacuole;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose()
    {
        parentWindow.setVisible(true);
        super.dispose();
    }
                                            
    @Override
    public void setHelpText(String str) {
        infoText.setText(str);
    }
}
