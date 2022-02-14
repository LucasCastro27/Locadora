package trabalho.locadora;

import java.util.*;
import java.io.*;

/**
 *
 * @author user
 */
public class TodaFrota extends javax.swing.JInternalFrame {

    String modelos[] = {};
    ArrayList<carro> Frota;
    int numeroCarro;

    public TodaFrota() throws FileNotFoundException {
        Frota=carro.getfrota();
        numeroCarro=carro.getNumeroCarros();
        
        String Modelos[] = new String[numeroCarro];
        for (int i = 0; i < numeroCarro; i++) {
            Modelos[i] = Frota.get(i).modelo;
        }
        modelos = Modelos;

        initComponents();

        String aux = "";
        marca.setText(Frota.get(0).marca);
        cor.setText(Frota.get(0).cor);
        placa.setText(Frota.get(0).placa);
        aux = Frota.get(0).kmAndado + "";
        km.setText(aux);
        aux = "";
        aux = Frota.get(0).preco + "";
        preco.setText(aux);

        if (Frota.get(0).disponivel == 0) {
            disponivel.setText("nao");
        } else {
            disponivel.setText("sim");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_telaPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jPanel_Info = new javax.swing.JPanel();
        jLabel_Placa = new javax.swing.JLabel();
        jLabel_Cor = new javax.swing.JLabel();
        jLabel_Marca = new javax.swing.JLabel();
        jLabel_Km = new javax.swing.JLabel();
        jLabel_preco = new javax.swing.JLabel();
        jLabel_disponivel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        placa = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        cor = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        km = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        marca = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        disponivel = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        preco = new javax.swing.JTextPane();
        jLabel_organizar = new javax.swing.JLabel();
        jButton_ordenarkm = new javax.swing.JButton();
        jButton_ordenarpreco = new javax.swing.JButton();
        jButton_ordenaralphabetic = new javax.swing.JButton();

        setClosable(true);

        jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = modelos;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

        jLabel_Placa.setText("Placa:");

        jLabel_Cor.setText("Cor:");

        jLabel_Marca.setText("Marca:");

        jLabel_Km.setText("Klometragem:");

        jLabel_preco.setText("preço:");

        jLabel_disponivel.setText("disponibilidade:");

        jScrollPane2.setViewportView(placa);

        jScrollPane3.setViewportView(cor);

        jScrollPane4.setViewportView(km);

        jScrollPane5.setViewportView(marca);

        jScrollPane6.setViewportView(disponivel);

        jScrollPane8.setViewportView(preco);

        jLabel_organizar.setText("Organizar por:");

        jButton_ordenarkm.setText("Klometragem");
        jButton_ordenarkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ordenarkmActionPerformed(evt);
            }
        });

        jButton_ordenarpreco.setText("Preço");

        jButton_ordenaralphabetic.setText("Alfabetica");

        javax.swing.GroupLayout jPanel_InfoLayout = new javax.swing.GroupLayout(jPanel_Info);
        jPanel_Info.setLayout(jPanel_InfoLayout);
        jPanel_InfoLayout.setHorizontalGroup(
            jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Marca)
                            .addComponent(jLabel_Cor)
                            .addComponent(jLabel_Placa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                .addComponent(jLabel_preco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                .addComponent(jLabel_Km)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4)
                                .addContainerGap())))
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                .addComponent(jButton_ordenarkm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ordenarpreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ordenaralphabetic))
                            .addComponent(jLabel_organizar)
                            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                .addComponent(jLabel_disponivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 108, Short.MAX_VALUE))))
        );
        jPanel_InfoLayout.setVerticalGroup(
            jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Placa)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Cor)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Marca)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_preco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Km))))
                .addGap(43, 43, 43)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_disponivel)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel_organizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ordenarkm)
                    .addComponent(jButton_ordenarpreco)
                    .addComponent(jButton_ordenaralphabetic))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_telaPrincipalLayout = new javax.swing.GroupLayout(jPanel_telaPrincipal);
        jPanel_telaPrincipal.setLayout(jPanel_telaPrincipalLayout);
        jPanel_telaPrincipalLayout.setHorizontalGroup(
            jPanel_telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_telaPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_telaPrincipalLayout.setVerticalGroup(
            jPanel_telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_telaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_telaPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_telaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        String aux = "";
        marca.setText(Frota.get(jList.getSelectedIndex()).marca);
        cor.setText(Frota.get(jList.getSelectedIndex()).cor);
        placa.setText(Frota.get(jList.getSelectedIndex()).placa);
        aux = Frota.get(jList.getSelectedIndex()).kmAndado + "";
        km.setText(aux);
        aux = "";
        aux = Frota.get(jList.getSelectedIndex()).preco + "";
        preco.setText(aux);

        if (Frota.get(jList.getSelectedIndex()).disponivel == 0)
            disponivel.setText("nao");
        else
            disponivel.setText("sim");
    }//GEN-LAST:event_jListValueChanged

    private void jButton_ordenarkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ordenarkmActionPerformed
        int n = Frota.size();
        carro temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Frota.get(j - 1).kmAndado < Frota.get(j).kmAndado) {
                    //Code to swap the elements
                    temp = Frota.get(j - 1);
                    Frota.set(j - 1, Frota.get(j));
                    Frota.set(j,temp);
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(Frota.get(i).kmAndado);
        }
        
        
        String Modelos[] = new String[numeroCarro];
        for (int i = 0; i < numeroCarro; i++) {
            Modelos[i] = Frota.get(i).modelo;
        }
        modelos = Modelos;
        

    }//GEN-LAST:event_jButton_ordenarkmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane cor;
    private javax.swing.JTextPane disponivel;
    private javax.swing.JButton jButton_ordenaralphabetic;
    private javax.swing.JButton jButton_ordenarkm;
    private javax.swing.JButton jButton_ordenarpreco;
    private javax.swing.JLabel jLabel_Cor;
    private javax.swing.JLabel jLabel_Km;
    private javax.swing.JLabel jLabel_Marca;
    private javax.swing.JLabel jLabel_Placa;
    private javax.swing.JLabel jLabel_disponivel;
    private javax.swing.JLabel jLabel_organizar;
    private javax.swing.JLabel jLabel_preco;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel_Info;
    private javax.swing.JPanel jPanel_telaPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextPane km;
    private javax.swing.JTextPane marca;
    private javax.swing.JTextPane placa;
    private javax.swing.JTextPane preco;
    // End of variables declaration//GEN-END:variables
}
