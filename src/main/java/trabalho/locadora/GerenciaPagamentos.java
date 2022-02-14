/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.locadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gabri
 */
public class GerenciaPagamentos implements Pagamentos{
    
    public GerenciaPagamentos(){
        
    }
    
    public long calculaDias(String dAlugou, String dEntrega) throws ParseException{
       return 0;
    }
    
    public float calculaPreco(String dAlugou, String dEntrega, float valor) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date alugado = sdf.parse(dAlugou);
        Date entrega = sdf.parse(dEntrega);
        
        long diffInMillies = Math.abs(entrega.getTime() - alugado.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        return (int)diff * valor;
    }
    public float calculaMulta(String dataEntregou, String dataEntrega, float valor) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date entrega = sdf.parse(dataEntrega);
        Date entregou = sdf.parse(dataEntregou);
        
        long diffInMillies = Math.abs(entregou.getTime() - entrega.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        if((int)diff > 0){
            return (int)diff * valor;
        }
        return 0;
        
    }
    public float calculaTotal(float valor, float multa){
        return valor + multa;
    }

    private void assertEquals(int i, long diff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
