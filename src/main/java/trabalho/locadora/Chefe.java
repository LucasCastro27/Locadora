/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.locadora;

/**
 *
 * @author user
 */
public class Chefe extends Funcionario {
    float saldo;
    String cnpj;
    int numeroFuncionarios;
    String Senha;
    int validado;
    
    public void validar (String senha){
        if(Senha == null ? senha == null : Senha.equals(senha)){
            validado=1;
        }
    }
    public void Sair (){
        validado=0;
    }
    
    public float getSaldo() {
        if (validado==1)
            return saldo;
        return 0;
    }

    public void setSaldo(float saldo) {
        if (validado==1)
            this.saldo = saldo;
    }

    public String getCnpj() {
        if (validado==1)
            return cnpj;
        else
            return null;
    }

    public void setCnpj(String cnpj) {
        if (validado==1)
           this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        if (validado==1)
            return numeroFuncionarios;
        else
            return -1;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (validado==1)
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public void venderCarro(carro veiculo)
    {
        saldo=saldo+veiculo.preco;
    }  
    
    public void conprarCarro(carro veiculo)
    {
        saldo=saldo+veiculo.preco;
    }   
    
    public void demitirFuncionario()
    {
        numeroFuncionarios--;
    }
    
    public void contratarFuncionario()
    {
        numeroFuncionarios++;
    }
    
    @Override 
        public void AlmentoSalario(){
        salario=salario + (saldo/1000) + +(salario/100*carrosAlugados);
    }
}
