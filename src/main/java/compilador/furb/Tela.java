/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.furb;

import compilador.furb.compiler.LexicalError;
import compilador.furb.compiler.Lexico;
import compilador.furb.compiler.Token;
import compilador.furb.utils.Utils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Leonardo de Oliveira
 */
public class Tela extends JFrame {

    File openFile = null;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        TACodigo.setBorder(new NumberedBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPMenu = new javax.swing.JPanel();
        btnEquipe = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        btnRecortar = new javax.swing.JButton();
        btnColar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        JPStatus = new javax.swing.JPanel();
        LBLStatus = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TACodigo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAMensagens = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 600));

        btnEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equipe.png"))); // NOI18N
        btnEquipe.setText("Equipe[F1]");
        btnEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipeActionPerformed(evt);
            }
        });

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compilar.png"))); // NOI18N
        btnCompilar.setText("Compilar[F7]");
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cortar.png"))); // NOI18N
        btnRecortar.setText("Recortar[Ctrl-X]");
        btnRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecortarActionPerformed(evt);
            }
        });

        btnColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colar.png"))); // NOI18N
        btnColar.setText("Colar[Ctrl-V]");
        btnColar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColarActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copiar.png"))); // NOI18N
        btnCopiar.setText("Copiar[Ctrl-C]");
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar[Ctrl-S]");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir.png"))); // NOI18N
        btnAbrir.setText("Abrir[Ctrl-O]");
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.PNG"))); // NOI18N
        btnNovo.setText("Novo[Ctrl-N]");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPMenuLayout = new javax.swing.GroupLayout(JPMenu);
        JPMenu.setLayout(JPMenuLayout);
        JPMenuLayout.setHorizontalGroup(
                JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRecortar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnColar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5))
        );
        JPMenuLayout.setVerticalGroup(
                JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNovo)
                                .addGap(0, 0, 0)
                                .addComponent(btnAbrir)
                                .addGap(0, 0, 0)
                                .addComponent(btnSalvar)
                                .addGap(0, 0, 0)
                                .addComponent(btnCopiar)
                                .addGap(0, 0, 0)
                                .addComponent(btnColar)
                                .addGap(0, 0, 0)
                                .addComponent(btnRecortar)
                                .addGap(0, 0, 0)
                                .addComponent(btnCompilar)
                                .addGap(0, 0, 0)
                                .addComponent(btnEquipe)
                                .addGap(6, 6, 6))
        );

        JPStatus.setMaximumSize(new java.awt.Dimension(32767, 25));
        JPStatus.setMinimumSize(new java.awt.Dimension(900, 25));
        JPStatus.setPreferredSize(new java.awt.Dimension(900, 25));

        LBLStatus.setText("Barra de status");

        javax.swing.GroupLayout JPStatusLayout = new javax.swing.GroupLayout(JPStatus);
        JPStatus.setLayout(JPStatusLayout);
        JPStatusLayout.setHorizontalGroup(
                JPStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LBLStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPStatusLayout.setVerticalGroup(
                JPStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LBLStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(0.7);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(19, 19));
        jScrollPane2.setViewportView(null);

        TACodigo.setColumns(20);
        TACodigo.setRows(5);
        TACodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TACodigoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(TACodigo);

        jSplitPane1.setTopComponent(jScrollPane2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setToolTipText("");
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setViewportView(null);

        TAMensagens.setEditable(false);
        TAMensagens.setColumns(20);
        TAMensagens.setRows(5);
        TAMensagens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TAMensagensKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TAMensagens);

        jSplitPane1.setBottomComponent(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(JPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSplitPane1)
                                .addContainerGap())
                        .addComponent(JPStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSplitPane1))
                                        .addComponent(JPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addComponent(JPStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TACodigoKeyPressed(KeyEvent evt) {//GEN-FIRST:event_TACodigoKeyPressed

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_N) {
            TACodigo.setText("");
            TAMensagens.setText("");
            LBLStatus.setText("");
            openFile = null;
        }

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_O) {
            showOpenFileDialog();
        }

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_S) {
            showSaveFileDialog();
        }

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_C) {
            Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
            ClipboardOwner selecao = new StringSelection(TACodigo.getSelectedText());
            board.setContents((Transferable) selecao, selecao);
        }

        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_X) {
            TACodigo.cut();
        }

        if (evt.getKeyCode() == KeyEvent.VK_F7) {
            compile();
        }

        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            TAMensagens.setText("Nomes dos integrantes da equipe \n\nLeonardo De Oliveira");
        }
    }//GEN-LAST:event_TACodigoKeyPressed

    private void TAMensagensKeyPressed(KeyEvent evt) {//GEN-FIRST:event_TAMensagensKeyPressed

    }//GEN-LAST:event_TAMensagensKeyPressed

    private void btnNovoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TACodigo.setText("");
        TAMensagens.setText("");
        LBLStatus.setText("Arquivo novo");
        openFile = null;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAbrirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        showOpenFileDialog();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnSalvarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        showSaveFileDialog();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCopiarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selecao = new StringSelection(TACodigo.getSelectedText());
        board.setContents((Transferable) selecao, selecao);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnColarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnColarActionPerformed
        TACodigo.paste();
    }//GEN-LAST:event_btnColarActionPerformed

    private void btnRecortarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRecortarActionPerformed
        TACodigo.cut();
    }//GEN-LAST:event_btnRecortarActionPerformed

    private void btnCompilarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        compile();
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnEquipeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEquipeActionPerformed
        TAMensagens.setText("Nomes dos integrantes da equipe \n\nLeonardo De Oliveira");
    }//GEN-LAST:event_btnEquipeActionPerformed

    private void showOpenFileDialog() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            File f = chooser.getSelectedFile();
            openFile = chooser.getSelectedFile();
            LBLStatus.setText("Nome do arquivo selecionado - " + f.getName() + "\n"
                    + " - Caminho do arquivo selecionado - " + f.getPath());
            String text = "";
            try {
                FileReader reader = new FileReader(f.getPath());
                int character;

                while ((character = reader.read()) != -1) {
                    text = text + ((char) character);
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            TACodigo.setText(text);
            TAMensagens.setText("");
        }
    }

    private void showSaveFileDialog() {
        String editor = TACodigo.getText();
        JFileChooser chooser = new JFileChooser();
        if (openFile == null) {
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                openFile = chooser.getSelectedFile();
                try (FileWriter fw = new FileWriter(chooser.getSelectedFile() + ".txt")) {
                    fw.write(editor);
                    LBLStatus.setText("Arquivo salvo com sucesso");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            chooser.setSelectedFile(openFile);
            try (FileWriter fw = new FileWriter(chooser.getSelectedFile())) {
                fw.write(editor);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void compile() {
        Lexico lexico = new Lexico();
        lexico.setInput(TACodigo.getText());
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Token token = null;

            while ((token = lexico.nextToken()) != null) {
                int line = Utils.getLineAtStringPosition(TACodigo.getText(), token.getPosition());
                stringBuilder.append("Linha: ")
                        .append(line)
                        .append(" - Classe: ")
                        .append(token.getTokenClass())
                        .append(" - Lexema: ")
                        .append(token.getLexeme())
                        .append("\n");
            }

            stringBuilder.append("\nPrograma compilado com sucesso");

            TAMensagens.setText(stringBuilder.toString());
        } catch (LexicalError e) {  // tratamento de erros
            int line = Utils.getLineAtStringPosition(TACodigo.getText(), e.getPosition());
            String msg = "Erro na linha " + line + " - " + e.getCulprit();
            if (!e.getCulprit().isBlank()) {
                msg += " ";
            }
            TAMensagens.setText(msg + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tela.class
                    .getName()).log(Level.SEVERE, ex.getLocalizedMessage(), ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(() -> new Tela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPMenu;
    private javax.swing.JPanel JPStatus;
    private javax.swing.JLabel LBLStatus;
    private javax.swing.JTextArea TACodigo;
    private javax.swing.JTextArea TAMensagens;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnEquipe;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRecortar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

}