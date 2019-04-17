 

/**
 *
 * @author aemarrero
 */

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;



//search button action function is on line 189, email button action function is on line 204(delete this comment once the functions are finalized)
public class RFGUIemailDialog extends javax.swing.JFrame {
	
	public Recipe r;
    /**
     * Creates new form RecipeFetchGUI
     */
    public RFGUIemailDialog() {
        initComponents();
    }
                      
    private void initComponents() {

        emailDialog = new javax.swing.JDialog();
        emailTextField = new javax.swing.JTextField();
        sendEmailButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        inputOutputSeperator = new javax.swing.JSeparator();
        searchBoxPanel = new javax.swing.JPanel();
        recipeSearchButton = new javax.swing.JButton();
        searchTermField = new javax.swing.JTextField();
        recipeNameLabel = new javax.swing.JLabel();
        ingredientsListPanel = new javax.swing.JPanel();
        ingredientsLabel = new javax.swing.JLabel();
        listScrollPanel = new javax.swing.JScrollPane();
        ingredientsList = new javax.swing.JTextArea();
		imageLabel = new javax.swing.JLabel();
		
		

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recipe Fetch");
        

        inputOutputSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        recipeSearchButton.setText("Search for Recipe");
        recipeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeSearchButtonActionPerformed(evt);
            }
        });
        
        emailDialog.setTitle("RecipeEmail");
        emailDialog.setAlwaysOnTop(true);

        sendEmailButton.setText("Send E-Mail");
        sendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailButtonActionPerformed(evt);
            }
        });
        
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        //formating for email dialog
        javax.swing.GroupLayout emailDialogLayout = new javax.swing.GroupLayout(emailDialog.getContentPane());
        emailDialog.getContentPane().setLayout(emailDialogLayout);
        emailDialogLayout.setHorizontalGroup(
            emailDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emailDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emailDialogLayout.createSequentialGroup()
                        .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendEmailButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );

        emailDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, sendEmailButton});

        emailDialogLayout.setVerticalGroup(
            emailDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailDialogLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(emailDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendEmailButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        //end formatting
        
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
                .addContainerGap(500, Short.MAX_VALUE))//gap from the bottom for search button and box
        );
        //end formatting
        

        ingredientsLabel.setText("Ingredients:");//ingredients title above box-do not change

        ingredientsList.setColumns(45);
        ingredientsList.setRows(30);/*might make sense to also make this part of
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
                	.addComponent(imageLabel, 250, 250, Short.MAX_VALUE)
                    .addComponent(ingredientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listScrollPanel))
                .addContainerGap())
        );
        ingredientsListPanelLayout.setVerticalGroup(
            ingredientsListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredientsListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, 250, 250, Short.MAX_VALUE)
                .addComponent(ingredientsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)//ingredients box height
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
                        .addComponent(recipeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)//ingredients box width
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
        
        r = Search.search (searchTermField.getText());
        ingredientsList.setText(r.getIngredientString());
        recipeNameLabel.setText(r.getName());

		try {
			URL url = new URL(r.getImageURL());
			imageLabel.setIcon(new ImageIcon(ImageIO.read(url)));
		} catch (Exception e) {
			System.out.println("Error");
		}
        
        //opens the email dialog box
        emailDialog.setVisible(true);
        emailDialog.setSize(500,200);
        emailDialog.setLocationRelativeTo(null);
        
    }                                                  

    private void sendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {
        SendMail.send(emailTextField.getText(), r.getURL());
        emailDialog.dispose();
    }
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//button to exit dialog without sending an email
        emailDialog.dispose();
    }

    public static void main(String args[]) {
        //create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RFGUIemailDialog().setVisible(true);
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
    private javax.swing.JTextField emailTextField;
    private javax.swing.JDialog emailDialog;
    private javax.swing.JButton sendEmailButton;
    private javax.swing.JButton cancelButton;
	private javax.swing.JLabel imageLabel;
    //end of variables declaration                   
}
