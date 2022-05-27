/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
import sistemaPetShop.*;
/**
 *
 * @author andre
 */
public class MenuVendedor extends javax.swing.JFrame {
    
    private TelaLogin telalogin;
    private Loja loja;
    private Vendedor vend;
    /**
     * Creates new form MenuVendedor
     */
    public MenuVendedor() {
        initComponents();
    }
    
    public MenuVendedor(TelaLogin telalogin2, Loja loja, Vendedor vend){
        this();
        this.telalogin = telalogin2;
        this.loja = loja;
        this.vend = vend;
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
        jLabel1 = new javax.swing.JLabel();
        ir_cadas_clien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ir_vender_serv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ir_vender_prod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENDEDOR");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Cadastrar cliente");

        ir_cadas_clien.setText("Ir");
        ir_cadas_clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_cadas_clienActionPerformed(evt);
            }
        });

        jLabel2.setText("Vender serviço");

        ir_vender_serv.setText("Ir");
        ir_vender_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_vender_servActionPerformed(evt);
            }
        });

        jLabel3.setText("Vender produto");

        ir_vender_prod.setText("Ir");
        ir_vender_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_vender_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ir_cadas_clien)
                    .addComponent(ir_vender_serv)
                    .addComponent(ir_vender_prod))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ir_cadas_clien))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ir_vender_serv))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ir_vender_prod))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.telalogin.setEnabled(true);
        this.telalogin.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void ir_cadas_clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_cadas_clienActionPerformed
        // TODO add your handling code here:
        this.setEnabled(false);
        this.setVisible(false);
        new CadastrarCliente(this, loja, vend).setVisible(true);
    }//GEN-LAST:event_ir_cadas_clienActionPerformed

    private void ir_vender_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_vender_servActionPerformed
        // TODO add your handling code here:
        new VenderServico(this, loja).setVisible(true);
        
    }//GEN-LAST:event_ir_vender_servActionPerformed

    private void ir_vender_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir_vender_prodActionPerformed
        // TODO add your handling code here:
        new VenderProduto(this, loja).setVisible(true);
    }//GEN-LAST:event_ir_vender_prodActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ir_cadas_clien;
    private javax.swing.JButton ir_vender_prod;
    private javax.swing.JButton ir_vender_serv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}