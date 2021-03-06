package view;

import com.google.protobuf.DoubleValue;
import dao.CadastrarDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import methods.Produto;


public class CadastroDeProduto extends javax.swing.JFrame {
 public Produto edita = null;
    
    
    public CadastroDeProduto() {
        initComponents();
    }
    public CadastroDeProduto(int ID) throws SQLException {
        initComponents();
        preencherFormulario(ID);
    }

    public void preencherFormulario(int ID) throws SQLException{
        edita = dao.ConsultarDAO.consultarProdutoId(ID);
        if(edita != null){
         this.lblCodigo.setText(String.valueOf(edita.getCodigo()));
         this.txtMarca.setText(String.valueOf(edita.getMarcaProduto()));
         this.txtNome.setText(String.valueOf(edita.getNomeProduto()));
         this.txtPreco.setText(String.valueOf(edita.getPrecoProduto()));
         
         
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lblTituloTela = new javax.swing.JLabel();
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
        lblCodigo = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Preço");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTela.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        lblTituloTela.setText("Cadastro de Produto");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(btnLimparProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoUnit)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(lblTituloTela))
                            .addComponent(txtMarca)
                            .addComponent(txtNome)
                            .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMarca, txtNome, txtPreco});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblTituloTela)
                .addGap(19, 19, 19)
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
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparProd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMarca, txtNome, txtPreco});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraProdActionPerformed
       boolean executado = false;
        if(edita == null){
        String valor=txtPreco.getText().trim().replace(",", ".");
        String marca = txtMarca.getText();
        String descricao = txtNome.getText();
        
       if(!valor.equals("")  || !marca.equals("") || !descricao.equals("")){
        
        double Valor= Double.parseDouble(valor);
           
        try {
            // Falta metodo de consultar o id que o fornecedor entrou no banco
            boolean executadoSegundo = controller.produtoController.salvar(marca, descricao, Valor);
            if(executadoSegundo){
            JOptionPane.showMessageDialog(null, "O produto " + txtNome.getText() + " da marca \n" + txtMarca.getText() 
                + " foi cadastrado com sucesso!", "Confirmação de Cadastro", JOptionPane.WARNING_MESSAGE);
            }
        
        
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Falha no envio dos dados para a Controll");
        }
        
        
        
        }else if("".equals(valor)  || "".equals(marca) || "".equals(descricao)){
                JOptionPane.showMessageDialog(null, "Campo Obrigatório não preenchido!", "Inormação Incorreta!", JOptionPane.WARNING_MESSAGE);
        } 
        }else{
            int ID=Integer.parseInt(this.lblCodigo.getText());
            String marca =txtMarca.getText();
            String descricao = txtNome.getText();
            double valor = Double.valueOf(txtPreco.getText()).doubleValue() ;
            
            if("".equals(marca) || "".equals(descricao)|| "".equals(valor)){
                JOptionPane.showMessageDialog(null, "Falta de informações para edição");
            }else{
                try {
                    executado=controller.produtoController.editar(ID, marca, descricao, valor);
                    if(executado){
                    JOptionPane.showMessageDialog(null, "Cliente Alterado");
            }
            this.dispose();
                } catch (Exception ex) {
                    Logger.getLogger(CadastroDeProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
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
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
