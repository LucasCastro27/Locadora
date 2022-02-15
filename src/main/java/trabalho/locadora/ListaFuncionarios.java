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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ListaFuncionarios extends javax.swing.JInternalFrame {
    int selecionado;
    ArrayList<Funcionario> Registro;
    int numeroFuncionarios;
    String nomes[]={};
    
    DefaultListModel<String> Lista;
    /**
     * Creates new form ListaFuncionarios
     */
    public ListaFuncionarios() {
        Registro=new ArrayList<>();
        int contador=0;
        String dados = "";    
        File arquivu = new File("funcionarios.txt");
        try {
            Scanner leitura = new Scanner(arquivu);
            while (leitura.hasNextLine()) {

            dados = dados + leitura.nextLine() + '\n';
            contador++;
            if (contador == 6) {
                contador = 0;
                Funcionario contratado = new Funcionario();
                contratado.FuncionarioInicia(dados);
                
                Registro.add(contratado);
                
                dados = "";
                numeroFuncionarios++;
            }
        }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "A operação não pode ser concluída porque o arquivo funcionarios.txt não pode ser acessado!");
            Logger.getLogger(CompraDeCarro.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        initComponents();
        
        
        Lista= new DefaultListModel<>();
        for (int i = 0; i < numeroFuncionarios; i++) {
            Lista.addElement(Registro.get(i).nome);
        }
        jList2.setModel(Lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane_placa_ = new javax.swing.JScrollPane();
        nome = new javax.swing.JTextPane();
        jScrollPane_cor_ = new javax.swing.JScrollPane();
        endereco = new javax.swing.JTextPane();
        jScrollPane_km_ = new javax.swing.JScrollPane();
        carroAlugado = new javax.swing.JTextPane();
        jScrollPane_marca_ = new javax.swing.JScrollPane();
        cpf = new javax.swing.JTextPane();
        jScrollPane_preco = new javax.swing.JScrollPane();
        Salario = new javax.swing.JTextPane();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setClosable(true);

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço");

        jLabel3.setText("CPF");

        jLabel4.setText("Carros Alugados");

        jLabel5.setText("Salario");

        jScrollPane_placa_.setViewportView(nome);

        jScrollPane_cor_.setViewportView(endereco);

        jScrollPane_km_.setViewportView(carroAlugado);

        jScrollPane_marca_.setViewportView(cpf);

        jScrollPane_preco.setViewportView(Salario);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Demitir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonEditar)
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_km_, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane_km_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = nomes;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //Botão de editar tranfere as informações feitas nas caixas para a lista de clientes

        Registro.get(selecionado).setEndereço(endereco.getText());
        Registro.get(selecionado).setNome(nome.getText());
        Registro.get(selecionado).setCPF(cpf.getText());
        

   
        Registro.get(selecionado).setSalario(Float.parseFloat(Salario.getText()));
        Registro.get(selecionado).carrosAlugados=Integer.parseInt(carroAlugado.getText());


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        //Botão de Salvar escreve a nova alteração do vetor no arquivo .txt

        //guarda o estado atual da lita de clientes em um vetor
        String dados="";
        for(int i=0;i<numeroFuncionarios;i++)
        {
            dados=dados+"salario="+Registro.get(i).getSalario()+'\n';
            dados=dados+"carrosAlugados="+Registro.get(i).carrosAlugados+'\n';
            dados=dados+"senha="+Registro.get(i).Senha+'\n';
            dados=dados+"cpf="+Registro.get(i).getCPF()+'\n';
            dados=dados+"nome="+Registro.get(i).getNome()+'\n';
            dados=dados+"endereco="+Registro.get(i).getEndereço()+'\n';        
        }

        //escreve esse vetor no arquivo txt com as novas informações
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("funcionarios.txt"));

            writer.write(dados);
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "A operação não pode ser concluída porque o arquivo funcionarios.txt não pode ser acessado!");
            Logger.getLogger(GaragemCarros.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        //Evento que atualiza cada vez que um novo elemento é selecionado na lista

        selecionado=jList2.getSelectedIndex();
        cpf.setText(Registro.get(jList2.getSelectedIndex()).getCPF());
        endereco.setText(Registro.get(jList2.getSelectedIndex()).getEndereço());
        nome.setText(Registro.get(jList2.getSelectedIndex()).getNome());
        Salario.setText(Registro.get(jList2.getSelectedIndex()).getSalario() + "");
        carroAlugado.setText(Registro.get(jList2.getSelectedIndex()).getCarros()+"");
    }//GEN-LAST:event_jList2ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Registro.remove(selecionado);
        numeroFuncionarios--;
        Lista= new DefaultListModel<>();
        for (int i = 0; i < numeroFuncionarios; i++) {
            Lista.addElement(Registro.get(i).nome);
        }
        jList2.setModel(Lista);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Salario;
    private javax.swing.JTextPane carroAlugado;
    private javax.swing.JTextPane cpf;
    private javax.swing.JTextPane endereco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane_cor_;
    private javax.swing.JScrollPane jScrollPane_km_;
    private javax.swing.JScrollPane jScrollPane_marca_;
    private javax.swing.JScrollPane jScrollPane_placa_;
    private javax.swing.JScrollPane jScrollPane_preco;
    private javax.swing.JTextPane nome;
    // End of variables declaration//GEN-END:variables
}
