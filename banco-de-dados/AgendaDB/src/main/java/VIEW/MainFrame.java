/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.awt.Color;

/**
 *
 * @author caahc
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bt3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPainel = new javax.swing.JPanel();
        bgGrupo = new javax.swing.JPanel();
        bgTelefone = new javax.swing.JPanel();
        bgPessoa = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bt1.setBackground(new java.awt.Color(233, 233, 254));
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Pessoa");

        javax.swing.GroupLayout bt1Layout = new javax.swing.GroupLayout(bt1);
        bt1.setLayout(bt1Layout);
        bt1Layout.setHorizontalGroup(
            bt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bt1Layout.setVerticalGroup(
            bt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        bt2.setBackground(new java.awt.Color(233, 233, 254));
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Telefone");

        javax.swing.GroupLayout bt2Layout = new javax.swing.GroupLayout(bt2);
        bt2.setLayout(bt2Layout);
        bt2Layout.setHorizontalGroup(
            bt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
        );
        bt2Layout.setVerticalGroup(
            bt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bt3.setBackground(new java.awt.Color(233, 233, 254));
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Grupo");

        javax.swing.GroupLayout bt3Layout = new javax.swing.GroupLayout(bt3);
        bt3.setLayout(bt3Layout);
        bt3Layout.setHorizontalGroup(
            bt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bt3Layout.setVerticalGroup(
            bt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        jPainel.setBackground(new java.awt.Color(255, 204, 255));
        jPainel.setLayout(new javax.swing.OverlayLayout(jPainel));

        bgGrupo.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout bgGrupoLayout = new javax.swing.GroupLayout(bgGrupo);
        bgGrupo.setLayout(bgGrupoLayout);
        bgGrupoLayout.setHorizontalGroup(
            bgGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        bgGrupoLayout.setVerticalGroup(
            bgGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jPainel.add(bgGrupo);

        bgTelefone.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout bgTelefoneLayout = new javax.swing.GroupLayout(bgTelefone);
        bgTelefone.setLayout(bgTelefoneLayout);
        bgTelefoneLayout.setHorizontalGroup(
            bgTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        bgTelefoneLayout.setVerticalGroup(
            bgTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPainel.add(bgTelefone);

        bgPessoa.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout bgPessoaLayout = new javax.swing.GroupLayout(bgPessoa);
        bgPessoa.setLayout(bgPessoaLayout);
        bgPessoaLayout.setHorizontalGroup(
            bgPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        bgPessoaLayout.setVerticalGroup(
            bgPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jPainel.add(bgPessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
        bgPessoa.setVisible(true);
        bgTelefone.setVisible(false);
        bgGrupo.setVisible(false);
        
        bt1.setBackground(Color.white);
        bt2.setBackground(new Color (233,233,254));
        bt3.setBackground(new Color (233,233,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1MouseClicked

    private void bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseClicked
        bgPessoa.setVisible(false);
        bgTelefone.setVisible(true);
        bgGrupo.setVisible(false);
        
        bt1.setBackground(new Color (233,233,254));
        bt2.setBackground(Color.white);
        bt3.setBackground(new Color (233,233,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_bt2MouseClicked

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked
        bgPessoa.setVisible(false);
        bgTelefone.setVisible(false);
        bgGrupo.setVisible(true);
        
        bt1.setBackground(new Color (233,233,254));
        bt2.setBackground(new Color (233,233,254));
        bt3.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_bt3MouseClicked

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
    private javax.swing.JPanel bgGrupo;
    private javax.swing.JPanel bgPessoa;
    private javax.swing.JPanel bgTelefone;
    private javax.swing.JPanel bt1;
    private javax.swing.JPanel bt2;
    private javax.swing.JPanel bt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPainel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}