/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.locadora;

/**
 *
 * @author user
 */
public class Funcionario {
    float salario;
    int carrosAlugados;
    String função;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }
    
    //bonus que pode ser solicitado por um funcionario receber almento baseado em seu rendimento 
    public void AlmentoSalario(){
        salario=salario+(salario/100*carrosAlugados);
        carrosAlugados=0;
    }
    public void AlugarCarro(carro veiculo,Cliente este){
        este.setCarroAlugado(veiculo.dataAlugado);
        carrosAlugados++;
    }
    
}
