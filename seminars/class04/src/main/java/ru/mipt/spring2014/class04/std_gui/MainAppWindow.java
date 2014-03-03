package ru.mipt.spring2014.class04.std_gui;

/**
 *
 * @author Andrei
 */
public class MainAppWindow extends javax.swing.JFrame
{
	/**
	 * Creates new form TheApplication
	 */
	public MainAppWindow ()
	{
		initComponents ();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Right Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Left Button");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce in eros ac lacus faucibus porta non ut ipsum. Fusce nec pulvinar sem. Integer bibendum, enim in euismod pharetra, diam velit varius sem, ultrices auctor libero sapien nec augue. Quisque lacus sapien, aliquam eget condimentum ac, tincidunt sit amet nibh. Sed at varius mi. Aliquam euismod leo vitae magna ullamcorper convallis. Etiam sit amet suscipit dui. Duis cursus dignissim nulla, vitae volutpat purus pharetra et. In elit nibh, ultricies nec venenatis nec, ullamcorper id enim. Sed in hendrerit lorem. Nulla et lacus vitae risus volutpat pharetra. Suspendisse quis velit elit. Sed fermentum tortor a odio varius gravida. Aenean laoreet sapien eget eros suscipit interdum. \n\nProin nec sem quis ligula suscipit aliquam. Donec quis nisi ut dui egestas mattis quis non erat. Maecenas tristique arcu eu quam accumsan pretium. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In elementum iaculis quam cursus molestie. Aliquam bibendum, purus at consectetur fringilla, ligula ligula consequat lacus, vitae dignissim nisl nisi vitae metus. Donec rhoncus lacus volutpat tellus facilisis pretium. Suspendisse convallis massa nec leo tincidunt ornare convallis mi consectetur. Duis sed aliquam elit. Maecenas faucibus mauris quis velit volutpat adipiscing nec id purus. Maecenas sodales neque enim, sit amet pretium magna. Cras tortor lorem, egestas vitae volutpat et, placerat ut dolor. Integer ultrices eros id libero sollicitudin imperdiet a nec velit. Morbi in dolor vitae massa fermentum dictum. \n\nDonec in quam magna, sit amet condimentum tellus. Aliquam ornare felis at sem rhoncus molestie at vel lectus. Fusce tincidunt adipiscing sem. Phasellus non dui ut leo venenatis scelerisque. Ut blandit aliquet lorem ac luctus. Donec mattis suscipit urna sit amet suscipit. Suspendisse potenti. Nam feugiat blandit eros ornare molestie. Fusce egestas mi sed nunc fermentum porta. Nam a sem eu ipsum eleifend tempus ac nec orci. Curabitur ultrices, neque sit amet scelerisque sodales, quam orci gravida dolor, eu tincidunt velit felis fringilla orci. Curabitur sagittis placerat neque, at elementum metus porta vel. Quisque aliquam viverra nisl, vel ornare quam faucibus ac. Ut nec blandit nulla. \n\nVestibulum vel magna lectus. Nullam lacinia urna ac leo ullamcorper at scelerisque elit molestie. Pellentesque vehicula tortor eget risus gravida adipiscing. Sed sed ligula quis tortor sollicitudin eleifend ut eget nisi. Praesent enim magna, scelerisque sed consequat at, viverra at nunc. Integer sit amet malesuada orci. Donec fermentum bibendum erat egestas pretium. Sed dui elit, suscipit eu suscipit aliquet, ultrices eget libero. Vestibulum mollis sodales velit, consequat tempus purus condimentum ac. Ut quis ligula in tellus bibendum porttitor. Cras fringilla libero a diam tristique luctus. Integer vel mauris eget massa bibendum congue. Donec pharetra, arcu nec condimentum euismod, metus sem posuere magna, at imperdiet velit purus sit amet justo. \n\nNullam vel rutrum ante. Sed non suscipit purus. Proin dignissim rhoncus rhoncus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent neque nibh, blandit nec iaculis et, fermentum ut elit. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed rutrum magna in nunc consequat faucibus. Cras tincidunt pulvinar nunc in mattis. Donec ut porttitor est. Morbi suscipit elementum libero, nec porttitor magna commodo ut. Nam scelerisque posuere felis at malesuada. Morbi elementum augue id orci lacinia in bibendum sapien dictum. In varius, orci non volutpat gravida, elit enim aliquet turpis, in commodo quam leo sit amet dui. Etiam vel interdum lorem.");
        jScrollPane1.setViewportView(jTextArea1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit (0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

	private void aboutMenuItemActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_aboutMenuItemActionPerformed
	{//GEN-HEADEREND:event_aboutMenuItemActionPerformed
		new AboutDialog (this, true).setVisible (true);
	}//GEN-LAST:event_aboutMenuItemActionPerformed

	private void jButton1ActionPerformed (java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
	{//GEN-HEADEREND:event_jButton1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}