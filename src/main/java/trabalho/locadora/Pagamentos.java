/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalho.locadora;

import java.text.ParseException;

/**
 *
 * @author gabri
 */
public interface Pagamentos {
    public float calculaPreco(String dAlugou, String dEntrega,float valor) throws ParseException; //preco = dataEntrega - dataAlugado * valor
    public float calculaMulta(String dataEntregou, String dataEntrega, float valor) throws ParseException; //dataEntregou - dataEntrega = multa
    public float calculaTotal(float valor, float multa);//total = preco + multa
}
