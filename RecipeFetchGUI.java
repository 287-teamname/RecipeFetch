 

/**
 *
 * @author aemarrero
 */
public class RecipeFetchGUI extends javax.swing.JFrame {

    /**
     * Creates new form RecipeFetchGUI
     */
    public RecipeFetchGUI() {
        initComponents();
    }
                      
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
		
		
        //formatting for left panel-do not change
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
        //end formatting
		
        recipeNameLabel.setText("Sample Title");/*set this to the name of the recipe in
                                                  the recipeSearchButtonActionPerformed
                                                  function*/
        
        ingredientsLabel.setText("Ingredients:");//ingredients title above box-do not change

        ingredientsList.setColumns(20);
        ingredientsList.setRows(5);/*might make sense to also make this part of
                                     recipeSearchButtonActionPerformed to have
                                     the textbox scale according to how many 
                                     ingredients are in the list*/
                                     
        listScrollPanel.setViewportView(ingredientsList);//makes the list scrollable

        //formatting for right panel-do not change
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
                .addComponent(listScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }//end of formatting                      

    private void recipeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        Recipe r = Search.search (searchTermField.getText());
        ingredientsList.setText(r.getIngredientString());
        recipeNameLabel.setText(r.getName());
      
        Search.search(searchTermField.getText());
        
        
           
        
    }                                                  


    public static void main(String args[]) {
        //create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeFetchGUI().setVisible(true);
            }
        });
    }

    //variables declaration - do not modify                     
    private javax.swing.JLabel ingredientsLabel;
    private javax.swing.JTextArea ingredientsList;
    private javax.swing.JPanel ingredientsListPanel;
    private javax.swing.JSeparator inputOutputSeperator;
    private javax.swing.JScrollPane listScrollPanel;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JButton recipeSearchButton;
    private javax.swing.JPanel searchBoxPanel;
    private javax.swing.JTextField searchTermField;
    //end of variables declaration                   
}
