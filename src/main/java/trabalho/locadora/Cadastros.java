/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package trabalho.locadora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author user
 */
public class Cadastros extends javax.swing.JInternalFrame {   
    String nomes[]={};
    ArrayList<Cliente> Registro;
    int numeroClientes;
    int selecionado;
    
    DefaultListModel<String> Lista;
    /**
     * Creates new form Cadastros
     * @throws java.io.FileNotFoundException
     */
    public Cadastros() throws FileNotFoundException {
        //inicia as variaveis para a leitura do Arquivo .Txt contendo as informações
       
        Registro = new ArrayList<>();
        File arquivo = new File("clientes.txt");
        Scanner leitura = new Scanner(arquivo);
        //Le os Arquivo txt enquanto inicia as variaveis carro
        String dados = "";
        numeroClientes = 0;
        int contador = 0;
        while (leitura.hasNextLine()) {
            dados = dados + leitura.nextLine() + '\n';
            contador++;
            if (contador == 6) {
                contador = 0;
                Cliente pessoa = new Cliente(dados);
                Registro.add(pessoa);
                dados = "";
                numeroClientes++;
            }
        }
        
        initComponents();
        // Pega os nomes do clientes Do vetor de objetos Carros e os escreve na lista
        Lista= new DefaultListModel<>();
        for (int i = 0; i < numeroClientes; i++) {
            Lista.addElement(Registro.get(i).nome);
        }
        jList1.setModel(Lista);
        
        
        // Inicia a Parte das informações com os dados do carro no primeiro indice
        cpf.setText(Registro.get(0).getCPF());
        endereco.setText(Registro.get(0).getEndereço());
        nome.setText(Registro.get(0).getNome());
        carroAlugado.setText(Registro.get(0).getCarroAlugado());
        entrega.setText(Registro.get(0).getDataEntrega());
        preco.setText(Registro.get(0).getPreco()+"");
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane_placa_ = new javax.swing.JScrollPane();
        nome = new javax.swing.JTextPane();
        jScrollPane_cor_ = new javax.swing.JScrollPane();
        endereco = new javax.swing.JTextPane();
        jScrollPane_km_ = new javax.swing.JScrollPane();
        carroAlugado = new javax.swing.JTextPane();
        jScrollPane_marca_ = new javax.swing.JScrollPane();
        cpf = new javax.swing.JTextPane();
        jScrollPane_disponivel_ = new javax.swing.JScrollPane();
        entrega = new javax.swing.JTextPane();
        jScrollPane_preco = new javax.swing.JScrollPane();
        preco = new javax.swing.JTextPane();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setClosable(true);

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço");

        jLabel3.setText("CPF");

        jLabel4.setText("Carro Alugado");

        jLabel5.setText("Preço:");

        jLabel6.setText("Entrega");

        jScrollPane_placa_.setViewportView(nome);

        jScrollPane_cor_.setViewportView(endereco);

        jScrollPane_km_.setViewportView(carroAlugado);

        jScrollPane_marca_.setViewportView(cpf);

        jScrollPane_disponivel_.setViewportView(entrega);

        jScrollPane_preco.setViewportView(preco);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane_km_, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_disponivel_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane_placa_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(jScrollPane_cor_, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane_marca_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane_placa_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane_cor_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane_marca_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane_disponivel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane_preco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_km_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonSalvar))))
                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = nomes;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //Botão de editar tranfere as informações feitas nas caixas para a lista de clientes


        Registro.get(selecionado).setEndereço(endereco.getText());
        Registro.get(selecionado).setNome(nome.getText());
        Registro.get(selecionado).setCPF(cpf.getText());
        
        String aux ="";
        aux=preco.getText();
        Registro.get(selecionado).setPreco(Float.parseFloat(aux));
        
        Registro.get(selecionado).setCarroAlugado(carroAlugado.getText());
        Registro.get(selecionado).setDataEntrega(entrega.getText());
        

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //botão de excluir permite a Remoção de clientes da lista

        Registro.remove(selecionado);
        numeroClientes--;
        Lista= new DefaultListModel<>();
        for (int i = 0; i < numeroClientes; i++) {
            Lista.addElement(Registro.get(i).nome);
        }
        jList1.setModel(Lista);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //Botão de Salvar escreve a nova alteração do vetor no arquivo .txt
        
        //guarda o estado atual da lita de clientes em um vetor
        String dados="";
        for(int i=0;i<numeroClientes;i++)
        {
            dados=dados+"cpf="+Registro.get(i).getCPF()+'\n';
            dados=dados+"endereco="+Registro.get(i).getEndereço()+'\n';
            dados=dados+"preco="+Registro.get(i).getPreco()+'\n';
            dados=dados+"dataEntrega="+Registro.get(i).getDataEntrega()+'\n';
            dados=dados+"nome="+Registro.get(i).getNome()+'\n';
            dados=dados+"carroAlugado="+Registro.get(i).getCarroAlugado()+'\n';

        }
        
        //escreve esse vetor no arquivo txt com as novas informações
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt"));

            writer.write(dados);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(GaragemCarros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        //Evento que atualiza cada vez que um novo elemento é selecionado na lista

        selecionado=jList1.getSelectedIndex();
        cpf.setText(Registro.get(jList1.getSelectedIndex()).getCPF());
        endereco.setText(Registro.get(jList1.getSelectedIndex()).getEndereço());
        nome.setText(Registro.get(jList1.getSelectedIndex()).getNome());
        preco.setText(Registro.get(jList1.getSelectedIndex()).getPreco() + "");
        entrega.setText(Registro.get(jList1.getSelectedIndex()).getDataEntrega());
        carroAlugado.setText(Registro.get(jList1.getSelectedIndex()).getCarroAlugado());
    }//GEN-LAST:event_jList1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane carroAlugado;
    private javax.swing.JTextPane cpf;
    private javax.swing.JTextPane endereco;
    private javax.swing.JTextPane entrega;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_cor_;
    private javax.swing.JScrollPane jScrollPane_disponivel_;
    private javax.swing.JScrollPane jScrollPane_km_;
    private javax.swing.JScrollPane jScrollPane_marca_;
    private javax.swing.JScrollPane jScrollPane_placa_;
    private javax.swing.JScrollPane jScrollPane_preco;
    private javax.swing.JTextPane nome;
    private javax.swing.JTextPane preco;
    // End of variables declaration//GEN-END:variables
}
