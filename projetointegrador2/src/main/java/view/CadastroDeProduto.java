package view;

import dao.CadastrarDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import methods.Produto;

public class CadastroDeProduto extends javax.swing.JFrame {

    
    
    public CadastroDeProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lblTituloTela = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPrecoUnit = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnCadastraProd = new javax.swing.JButton();
        btnLimparProd = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Preço");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTela.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        lblTituloTela.setText("Cadastro de Produto");

        lblCodigo.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblCodigo.setText("Codigo:");

        txtMarca.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        lblPrecoUnit.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblPrecoUnit.setText("Preço Unitário");

        txtPreco.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnCadastraProd.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        btnCadastraProd.setText("Cadastrar");
        btnCadastraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraProdActionPerformed(evt);
            }
        });

        btnLimparProd.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        btnLimparProd.setText("Limpar");
        btnLimparProd.setMaximumSize(new java.awt.Dimension(118, 41));
        btnLimparProd.setMinimumSize(new java.awt.Dimension(118, 41));
        btnLimparProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        btnConsulta.setText("Consultar Produtos");
        btnConsulta.setMaximumSize(new java.awt.Dimension(118, 41));
        btnConsulta.setMinimumSize(new java.awt.Dimension(118, 41));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setMaximumSize(new java.awt.Dimension(118, 41));
        btnFechar.setMinimumSize(new java.awt.Dimension(118, 41));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblMarca.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoUnit)
                            .addComponent(lblCodigo)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca)
                            .addComponent(txtNome)
                            .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(btnLimparProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloTela)
                .addGap(312, 312, 312))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCodigoProduto, txtMarca, txtNome, txtPreco});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTituloTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparProd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodigoProduto, txtMarca, txtNome, txtPreco});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraProdActionPerformed
        Produto novoProduto=new Produto();
        novoProduto.setCodigo(txtCodigoProduto.getText());
        novoProduto.setMarcaProduto(txtMarca.getText());
        novoProduto.setNomeProduto(txtNome.getText());
        String valor=txtPreco.getText();
        double Valor= Double.parseDouble(valor);
        novoProduto.setPrecoProduto(Valor);
        
        try {
            CadastrarDao.salvarProduto(novoProduto);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Falha no envio dos dados para a dao");
        }
        
        JOptionPane.showMessageDialog(null, "O produto " + txtNome.getText() + " da marca \n" + txtMarca.getText() 
                + " foi cadastrado com sucesso!", "Confirmação de Cadastro", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnCadastraProdActionPerformed

    private void btnLimparProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdActionPerformed
        txtMarca.setText("");
        txtNome.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnLimparProdActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        ConsultaProdutos consult = new ConsultaProdutos();
        consult.setVisible(true);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraProd;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimparProd;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoUnit;
    private javax.swing.JLabel lblTituloTela;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
