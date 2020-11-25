package text_editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author marcu Icons made by Freepik from www.flaticon.com
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Set Directory Location (Optional)
     */
    String docDirLocation = System.getProperty("user.home") + System.getProperty("file.separator") + "Documents";
    File docDir = new File(docDirLocation);

    /**
     * Set/Initialize Filter (Extensions) For File Chooser
     */
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "docx", "text");

    JFileChooser fc;
    File f;

    int count;
    int index;
    boolean cancelled;
    String tooltip;
    JTextArea textArea;

    BasicFileAttributes attr;

    public MainFrame() {
        initComponents();

        /**
         * Set Location For Application (Desktop)
         */
        this.setLocationRelativeTo(null);

        /**
         * Initialize First Tab + File Chooser(Set Directory) And Set Filter
         */
        initFirstTab();
        fc = new JFileChooser(docDir);
        fc.setFileFilter(filter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSaveAs = new javax.swing.JButton();
        JTabbedPane = new javax.swing.JTabbedPane();
        footer = new javax.swing.JPanel();
        msgStatus = new javax.swing.JLabel();
        msgPath = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuSaveAs = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuInsHtml = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(804, 60));

        toolBar.setRollover(true);
        toolBar.setPreferredSize(new java.awt.Dimension(788, 56));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text_editor/img/new.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        toolBar.add(btnNew);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text_editor/img/open.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        toolBar.add(btnOpen);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text_editor/img/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        toolBar.add(btnSave);

        btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text_editor/img/save_as.png"))); // NOI18N
        btnSaveAs.setText("Save As");
        btnSaveAs.setFocusable(false);
        btnSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        toolBar.add(btnSaveAs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        JTabbedPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTabbedPane.setToolTipText("");
        JTabbedPane.setPreferredSize(new java.awt.Dimension(804, 275));
        getContentPane().add(JTabbedPane, java.awt.BorderLayout.CENTER);

        footer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        footer.setPreferredSize(new java.awt.Dimension(800, 35));

        msgStatus.setText("Welcome");

        msgPath.setText("Path");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        menuBar.setPreferredSize(new java.awt.Dimension(804, 24));

        menuFile.setText("File");

        menuNew.setText("New");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        menuFile.add(menuNew);

        menuOpen.setText("Open");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);

        menuSaveAs.setText("Save As");
        menuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(menuSaveAs);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        menuInsHtml.setText("Insert HTML");
        menuInsHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsHtmlActionPerformed(evt);
            }
        });
        menuEdit.add(menuInsHtml);

        menuBar.add(menuEdit);

        menuHelp.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        openFile();

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (f != null) {
            saveFile();
        } else {
            saveFileAs();
        }

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed
        saveFileAs();

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_btnSaveAsActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        int answer = JOptionPane.showConfirmDialog(rootPane, "Do you want to save changes?", "Question", JOptionPane.YES_NO_OPTION);
        switch (answer) {
            case JOptionPane.YES_OPTION -> {
                saveFileAs();
                if (cancelled == true) {
                    return;
                } else {
                    f = new File(docDirLocation, "Untitled Document.txt");
                    textArea.setText("");
                }
            }
            case JOptionPane.NO_OPTION -> {
                if (f != null) {
                    int reply = JOptionPane.showConfirmDialog(rootPane, "File: " + f.getName() + " already exists. Do you want to replace it?", "Error", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        f = new File(docDirLocation, "Untitled Document.txt");
                        textArea.setText("");

                    } else {
                        return;
                    }
                } else {
                    f = new File(docDirLocation, "Untitled Document.txt");
                    textArea.setText("");
                }
            }
            default -> {
                return;
            }
        }

        msgStatus.setText("New File: " + f.getName());
        msgPath.setText(f.getAbsolutePath());
        tooltip = f.getName();
        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_btnNewActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        openFile();

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        if (f != null) {
            saveFile();
        } else {
            saveFileAs();
        }

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveAsActionPerformed
        saveFileAs();

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_menuSaveAsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        if (f != null) {
            int answer = JOptionPane.showConfirmDialog(rootPane, "Do you want to save changes?", "Warning", JOptionPane.YES_NO_OPTION);
            switch (answer) {
                case JOptionPane.YES_OPTION -> {
                    saveFileAs();
                    if (cancelled == true) {
                        return;
                    }
                    System.exit(0);
                }
                case JOptionPane.NO_OPTION -> {
                    System.exit(0);
                }
                default -> {
                    return;
                }
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuInsHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsHtmlActionPerformed
        textArea.setText("<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "    \n"
                + "</body>\n"
                + "</html>");
    }//GEN-LAST:event_menuInsHtmlActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        LocalDate d = LocalDate.now();
        DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("yyyy");
        final ImageIcon aboutIcon = new javax.swing.ImageIcon(this.getClass().getResource("img/dev0logo.png"));
        JOptionPane.showMessageDialog(rootPane, "Text Editor \n Version 0.0.1 \n \u00a9 " + d.format(dFormat)
                + " dev0l. All rights reserved. \n\n This is a simple text editor created by Marcus Mobark (dev0l) for educational purposes."
                + "\n\n This product is licensed under the dev0l Software License Terms to: \n User Name: \n Org Name:",
                "About Editor", JOptionPane.INFORMATION_MESSAGE, aboutIcon);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
        int answer = JOptionPane.showConfirmDialog(rootPane, "Do you want to save changes?", "Question", JOptionPane.YES_NO_OPTION);
        switch (answer) {
            case JOptionPane.YES_OPTION -> {
                saveFileAs();
                if (cancelled == true) {
                    return;
                } else {
                    f = new File(docDirLocation, "Untitled Document.txt");
                    textArea.setText("");
                }
            }
            case JOptionPane.NO_OPTION -> {
                if (f != null) {
                    int reply = JOptionPane.showConfirmDialog(rootPane, "File: " + f.getName() + " already exists. Do you want to replace it?", "Error", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        f = new File(docDirLocation, "Untitled Document.txt");
                        textArea.setText("");

                    } else {
                        return;
                    }
                } else {
                    f = new File(docDirLocation, "Untitled Document.txt");
                    textArea.setText("");
                }
            }
            default -> {
                return;
            }
        }

        msgStatus.setText("New File: " + f.getName());
        msgPath.setText(f.getAbsolutePath());
        tooltip = f.getName();
        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);
        JTabbedPane.setToolTipTextAt(index, tooltip);
    }//GEN-LAST:event_menuNewActionPerformed

    private void initFirstTab() {
        textArea = new JTextArea();
        /**
         * Set Line Wrap
         */
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane jsp = new JScrollPane(textArea);
        JTabbedPane.add(jsp);

        tooltip = "Untitled Document.txt";

        count = JTabbedPane.getTabCount();

        JTabbedPane.addTab("Document " + count + " ", jsp);

        index = JTabbedPane.getTabCount() - 1;
        JTabbedPane.setSelectedIndex(index);

        JTabbedPane.setToolTipTextAt(index, tooltip);
        JTabbedPane.setIconAt(index, new ImageIcon(this.getClass().getResource("img/save.png")));
    }

    private void openFile() {
        if (fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION) {
            if (fc.getSelectedFile() != null) {
                f = fc.getSelectedFile();
            }
            try {
                Scanner scn = new Scanner(new FileInputStream(f));
                String buffer = "";
                while (scn.hasNext()) {
                    buffer += scn.nextLine() + "\n";
                }
                textArea.setText(buffer);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            msgStatus.setText("File Opened: " + f.getName());
            msgPath.setText(f.getAbsolutePath());
            tooltip = f.getName();
        } else {
            msgStatus.setText("No File Selected");
        }
    }

    private void saveFile() {
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.write(textArea.getText());
            pw.close();
            msgStatus.setText("File Saved: " + f.getName());
            msgPath.setText(f.getAbsolutePath());
            tooltip = f.getName();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveFileAs() {
        fc.setDialogTitle("Save As");
        if (fc.showSaveDialog(fc) == JFileChooser.APPROVE_OPTION) {
            f = fc.getSelectedFile();
            if (!f.getName().toLowerCase().endsWith(".txt")) {
                f = new File(f.getParentFile(), f.getName() + ".txt");
            }
            if (f.exists()) {
                int reply = JOptionPane.showConfirmDialog(rootPane, "File: " + fc.getSelectedFile().getName() + " already exists. Do you want to replace it?", "Error", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    saveFile();
                } else {
                    saveFileAs();
                }
            } else {
                saveFile();
            }
        } else {
            msgStatus.setText("File Not Saved");
            cancelled = true;
        }
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAs;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuInsHtml;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSaveAs;
    private javax.swing.JLabel msgPath;
    private javax.swing.JLabel msgStatus;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
