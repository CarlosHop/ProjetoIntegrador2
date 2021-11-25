/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PC
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Perfumaria
     */
    public TelaVendas() {
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

        groupShop = new javax.swing.ButtonGroup();
        painel_Sup = new javax.swing.JPanel();
        painelCompra = new javax.swing.JPanel();
        txtCod_Prod = new javax.swing.JFormattedTextField();
        LcodProduto = new javax.swing.JLabel();
        btnR_Loja = new javax.swing.JRadioButton();
        btnR_LojaV = new javax.swing.JRadioButton();
        txtProd = new javax.swing.JTextField();
        Lproduto = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        painelPagamento = new javax.swing.JPanel();
        txtValor_Uni = new javax.swing.JFormattedTextField();
        LvalorEntregue = new javax.swing.JLabel();
        txtValor_Entr = new javax.swing.JFormattedTextField();
        LvalorUnitario = new javax.swing.JLabel();
        Lvalor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        Ltroco = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painel_Sup.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));
        painel_Sup.setToolTipText("Compra");
        painel_Sup.setName("Compra"); // NOI18N

        painelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        txtCod_Prod.setToolTipText("Código do produto");
        txtCod_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_ProdActionPerformed(evt);
            }
        });

        LcodProduto.setText("Código do Produto:");

        groupShop.add(btnR_Loja);
        btnR_Loja.setText("Loja");
        btnR_Loja.setToolTipText("Selecione onde foi feita a compra");
        btnR_Loja.setActionCommand("Loja");
        btnR_Loja.setName(""); // NOI18N

        groupShop.add(btnR_LojaV);
        btnR_LojaV.setText("Loja Virtual");
        btnR_LojaV.setToolTipText("Selecione onde foi feita a compra");
        btnR_LojaV.setActionCommand("Loja Virtual");

        txtProd.setToolTipText("Produto selecionado");
        txtProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdActionPerformed(evt);
            }
        });

        Lproduto.setText("Produto:");

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        quantidade.setText("Quantidade:");

        javax.swing.GroupLayout painelCompraLayout = new javax.swing.GroupLayout(painelCompra);
        painelCompra.setLayout(painelCompraLayout);
        painelCompraLayout.setHorizontalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(LcodProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCod_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(Lproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnR_Loja)
                        .addGap(18, 18, 18)
                        .addComponent(btnR_LojaV)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        painelCompraLayout.setVerticalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnR_Loja)
                    .addComponent(btnR_LojaV)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lproduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidade)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LcodProduto)
                        .addComponent(txtCod_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        painelCompraLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCod_Prod, txtProd, txtQtd});

        painelPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pagamento"));

        txtValor_Uni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValor_Uni.setToolTipText("Valor unitário do produto");

        LvalorEntregue.setText("Valor Entregue:");

        txtValor_Entr.setToolTipText("Valor entregue pelo Cliente");
        txtValor_Entr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor_EntrActionPerformed(evt);
            }
        });

        LvalorUnitario.setText("Valor Unitário:");

        Lvalor.setText("Valor da Compra:");

        txtValor.setToolTipText("");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtTroco.setToolTipText("O valor de troco do cliente");
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        Ltroco.setText("Troco:");

        javax.swing.GroupLayout painelPagamentoLayout = new javax.swing.GroupLayout(painelPagamento);
        painelPagamento.setLayout(painelPagamentoLayout);
        painelPagamentoLayout.setHorizontalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPagamentoLayout.createSequentialGroup()
                        .addComponent(LvalorUnitario)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor_Uni, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPagamentoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LvalorEntregue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor_Entr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPagamentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Lvalor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPagamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ltroco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        painelPagamentoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTroco, txtValor});

        painelPagamentoLayout.setVerticalGroup(
            painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPagamentoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor_Uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LvalorUnitario)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lvalor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(painelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor_Entr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LvalorEntregue)
                    .addComponent(Ltroco))
                .addGap(20, 20, 20))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Carrinho de compras"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Descrição", "Qtd", "Valor Uni", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_SupLayout = new javax.swing.GroupLayout(painel_Sup);
        painel_Sup.setLayout(painel_SupLayout);
        painel_SupLayout.setHorizontalGroup(
            painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_SupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_SupLayout.createSequentialGroup()
                        .addComponent(painelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_SupLayout.setVerticalGroup(
            painel_SupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_SupLayout.createSequentialGroup()
                .addComponent(painelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFinalizar.setText("Finalizar compra");
        btnFinalizar.setToolTipText("Finalizar a compra");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFinalizar, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFinalizar, jButton1});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        String codProd = txtCod_Prod.getText();
        String produto = txtProd.getText();
        String qtd = txtQtd.getText();
        
            //teste para a verificação
            if(!"".equals(codProd) && !"".equals(produto) && !"".equals(qtd)){
                int retorno = JOptionPane.showConfirmDialog(null, "Deseja mesmo salvar?", "Confirmação de salvamento", 
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
                if(retorno == 0){
                    //salvar here
                    JOptionPane.showMessageDialog(this,"Obrigado pela preferência!! \nVolte sempre!!");
                    this.dispose();
                }else if(retorno == 2){
                    this.dispose();
                }

                
            }else if("".equals(codProd) && "".equals(produto) && "".equals(qtd)){
                JOptionPane.showMessageDialog(null, "Campo Obrigatório não preenchido!", "Inormação Incorreta!", JOptionPane.WARNING_MESSAGE);
            } 
            
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdActionPerformed

    private void txtCod_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_ProdActionPerformed
        String codProd = txtCod_Prod.getText();
        
            if("ABCDE".equals(codProd)){
               String prod = "Ferrari Black";
               int valorUni = 225;
               String vlUni = Integer.toString(valorUni);
               txtProd.setText(prod);
               txtValor_Uni.setText (vlUni);
            }
            if("ABBCD".equals(codProd)){
               String prod = "Polo Green";
               int valorUni = 335;
               String vlUni = Integer.toString(valorUni);
               txtProd.setText(prod);
               txtValor_Uni.setText (vlUni);
            }
    }//GEN-LAST:event_txtCod_ProdActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        String qtd = txtQtd.getText();
        int IntQtd = Integer.parseInt(qtd);
        String valorUni = txtValor_Uni.getText();
        
        int total = Integer.parseInt(valorUni);
        int result = (total * IntQtd);
        String valorF = Integer.toString(result);
        txtValor.setText(valorF);
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtValor_EntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor_EntrActionPerformed
        String pagamento = txtValor_Entr.getText();
        String divida = txtValor.getText();
        int dividaInt = Integer.parseInt(divida);
        int pagamentoInt = Integer.parseInt(pagamento);
        
        if(pagamentoInt<dividaInt){
           JOptionPane.showMessageDialog(null, "O valor pago é menor do que o produto!", "Inormação Incorreta!", JOptionPane.WARNING_MESSAGE); 
        }else{
        int troco = pagamentoInt - dividaInt;
        String trocoS = Integer.toString(troco);
        txtTroco.setText("R$" + trocoS);
        }
    }//GEN-LAST:event_txtValor_EntrActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //model da tabela
        DefaultTableModel modelTabela = (DefaultTableModel) jTable1.getModel();
        
        modelTabela.addRow(new Object[]{
            txtProd.getText(), 
            txtCod_Prod.getText(),
            txtQtd.getText(), 
            txtValor_Uni.getText(),
            txtValor.getText()});
        
         JOptionPane.showMessageDialog(null, "Obrigado por comprar conosco!!\nInformação da compra:" +
                "\nMarca: "+ txtProd.getText() + 
                "\nCod: " + txtCod_Prod.getText() +
                "\nQtd: " + txtQtd.getText() +
                "\nValorUni: R$" + txtValor_Uni.getText() +
                "\nValor Total: R$" + txtValor.getText());
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LcodProduto;
    private javax.swing.JLabel Lproduto;
    private javax.swing.JLabel Ltroco;
    private javax.swing.JLabel Lvalor;
    private javax.swing.JLabel LvalorEntregue;
    private javax.swing.JLabel LvalorUnitario;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JRadioButton btnR_Loja;
    private javax.swing.JRadioButton btnR_LojaV;
    private javax.swing.ButtonGroup groupShop;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelCompra;
    private javax.swing.JPanel painelPagamento;
    private javax.swing.JPanel painel_Sup;
    private javax.swing.JLabel quantidade;
    private javax.swing.JFormattedTextField txtCod_Prod;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtValor;
    private javax.swing.JFormattedTextField txtValor_Entr;
    private javax.swing.JFormattedTextField txtValor_Uni;
    // End of variables declaration//GEN-END:variables
}
