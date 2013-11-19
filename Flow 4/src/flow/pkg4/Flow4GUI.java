package flow.pkg4;

public class Flow4GUI extends javax.swing.JFrame {

    private WordPairControlIF control;
    
    public Flow4GUI(WordPairControlIF control) {
        initComponents();
        this.control = control;
        initializeProgram();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        translatePanel = new javax.swing.JPanel();
        questionPanel = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        danskAddLabel = new javax.swing.JLabel();
        danskAddField = new javax.swing.JTextField();
        engelskAddLabel = new javax.swing.JLabel();
        engelskAddField = new javax.swing.JTextField();
        wordAddButton = new javax.swing.JButton();
        deleteAddButton = new javax.swing.JButton();
        counterAddLabel = new javax.swing.JLabel();
        helpAddLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Language Trainer");
        setMinimumSize(new java.awt.Dimension(200, 150));
        setResizable(false);

        org.jdesktop.layout.GroupLayout translatePanelLayout = new org.jdesktop.layout.GroupLayout(translatePanel);
        translatePanel.setLayout(translatePanelLayout);
        translatePanelLayout.setHorizontalGroup(
            translatePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 615, Short.MAX_VALUE)
        );
        translatePanelLayout.setVerticalGroup(
            translatePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 405, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Translate", translatePanel);

        org.jdesktop.layout.GroupLayout questionPanelLayout = new org.jdesktop.layout.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 615, Short.MAX_VALUE)
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 405, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quizz", questionPanel);

        danskAddLabel.setText("Dansk");

        danskAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danskAddFieldActionPerformed(evt);
            }
        });

        engelskAddLabel.setText("Engelsk");

        wordAddButton.setText("Add Words");
        wordAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordAddButtonActionPerformed(evt);
            }
        });

        deleteAddButton.setText("Delete Words");
        deleteAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAddButtonActionPerformed(evt);
            }
        });

        counterAddLabel.setText("Kan du se det her, er der noget galt.");

        org.jdesktop.layout.GroupLayout addPanelLayout = new org.jdesktop.layout.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(addPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(engelskAddField)
                    .add(addPanelLayout.createSequentialGroup()
                        .add(addPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(danskAddLabel)
                            .add(engelskAddLabel)
                            .add(addPanelLayout.createSequentialGroup()
                                .add(wordAddButton)
                                .add(18, 18, 18)
                                .add(deleteAddButton))
                            .add(counterAddLabel))
                        .add(0, 395, Short.MAX_VALUE))
                    .add(danskAddField))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(danskAddLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(danskAddField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(engelskAddLabel)
                .add(18, 18, 18)
                .add(engelskAddField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(addPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(wordAddButton)
                    .add(deleteAddButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 212, Short.MAX_VALUE)
                .add(counterAddLabel)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Word", addPanel);

        helpAddLabel.setText("Help is here!");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(helpAddLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(73, 373, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(helpAddLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void danskAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danskAddFieldActionPerformed

    }//GEN-LAST:event_danskAddFieldActionPerformed

    private void deleteAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAddButtonActionPerformed
        if(control.delete(danskAddField.getText())){
            helpAddLabel.setText("'" + danskAddField.getText() + "' er blevet fjernet fra listen over ord.");
            danskAddField.setText("");
            engelskAddField.setText("");
            counterAddLabel.setText(control.size() + " ord");
            control.save();
        } else {
            helpAddLabel.setText("'" + danskAddField.getText() + "' kunne ikke findes på listen over ord.");
        }
    }//GEN-LAST:event_deleteAddButtonActionPerformed

    private void wordAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordAddButtonActionPerformed
        control.add(danskAddField.getText(), engelskAddField.getText());
        helpAddLabel.setText("'" + danskAddField.getText() + "' tilføjet til listen over ord.");
        danskAddField.setText("");
        engelskAddField.setText("");
        counterAddLabel.setText(control.size() + " ord");
        control.save();
    }//GEN-LAST:event_wordAddButtonActionPerformed

    private void initializeProgram(){
        if(control.load()){
            helpAddLabel.setText("Liste fundet og loaded.");
        } else {
            helpAddLabel.setText("Kunne ikke loade en liste.");
        }
        counterAddLabel.setText(control.size() + " ord");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel counterAddLabel;
    private javax.swing.JTextField danskAddField;
    private javax.swing.JLabel danskAddLabel;
    private javax.swing.JButton deleteAddButton;
    private javax.swing.JTextField engelskAddField;
    private javax.swing.JLabel engelskAddLabel;
    private javax.swing.JLabel helpAddLabel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JPanel translatePanel;
    private javax.swing.JButton wordAddButton;
    // End of variables declaration//GEN-END:variables
}
