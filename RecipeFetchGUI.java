package cis287;

/**
 *
 * @author aemarrero
 * @4/3/19
 */
public class RecipeFetchGUI extends javax.swing.JFrame {

    /**
     * Creates new form RecipeFetchGUI
     */
    public RecipeFetchGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputOutputSeperator = new javax.swing.JSeparator();
        searchBoxPanel = new javax.swing.JPanel();
        recipeSearchButton = new javax.swing.JButton();
        searchTermField = new javax.swing.JTextField();
        recipeNameLabel = new javax.swing.JLabel();
        ingredientsListPanel = new javax.swing.JPanel();
        ingredientsLabel = new javax.swing.JLabel();
        listScrollPanel = new javax.swing.JScrollPane();
        ingredientsList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recipe Fetch");

        inputOutputSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        recipeSearchButton.setText("Search for Recipe");
        recipeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchBoxPanelLayout = new javax.swing.GroupLayout(searchBoxPanel);
        searchBoxPanel.setLayout(searchBoxPanelLayout);
        searchBoxPanelLayout.setHorizontalGroup(
            searchBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchTermField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recipeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        searchBoxPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {recipeSearchButton, searchTermField});

        searchBoxPanelLayout.setVerticalGroup(
            searchBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipeSearchButton)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        recipeNameLabel.setText("Sample Title");

        ingredientsLabel.setText("Ingredients:");

        ingredientsList.setColumns(20);
        ingredientsList.setRows(5);
        listScrollPanel.setViewportView(ingredientsList);

        javax.swing.GroupLayout ingredientsListPanelLayout = new javax.swing.GroupLayout(ingredientsListPanel);
        ingredientsListPanel.setLayout(ingredientsListPanelLayout);
        ingredientsListPanelLayout.setHorizontalGroup(
            ingredientsListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ingredientsListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingredientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listScrollPanel))
                .addContainerGap())
        );
        ingredientsListPanelLayout.setVerticalGroup(
            ingredientsListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingredientsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listScrollPanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(searchBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputOutputSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingredientsListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recipeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputOutputSeperator)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(recipeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingredientsListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(searchBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recipeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recipeSearchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeFetchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeFetchGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ingredientsLabel;
    private javax.swing.JTextArea ingredientsList;
    private javax.swing.JPanel ingredientsListPanel;
    private javax.swing.JSeparator inputOutputSeperator;
    private javax.swing.JScrollPane listScrollPanel;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JButton recipeSearchButton;
    private javax.swing.JPanel searchBoxPanel;
    private javax.swing.JTextField searchTermField;
    // End of variables declaration//GEN-END:variables
}
