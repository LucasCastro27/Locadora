/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.locadora;

/**
 *
 * @author user
 */
public class Funcionario extends Pessoa {
    float salario;
    int carrosAlugados;
    String Senha;

    public void FuncionarioInicia(String dados){
        String input = "";
        int codigo = 0;
        System.out.println(dados);
        for (int i = 0; i < dados.length(); i++) {
            if (dados.charAt(i) == '=') {
                switch (codigo) {
                    case 0 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.salario = Float.parseFloat(input);
                        codigo++;
                        input = "";
                        
                          
                    }
                    case 1 -> {
                          
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        } 
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.carrosAlugados = Integer.parseInt(input);
                        codigo++;
                        input = "";
                        
                    }

                    case 2 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        } 
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.Senha = input;
                        codigo++;
                        input = "";
                        
                    }
                    case 3 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.CPF = input;
                        codigo++;
                        input = "";
                        
                    }
                    case 4 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.nome = input;
                        codigo++;
                        input = "";
                        
                    }
                    case 5 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        this.endereço = input;
                        codigo++;
                        input = "";
                        
                    }

                }
            }
        }
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getCarros() {
        return carrosAlugados;
    }

    public void setCarros(int carro) {
        this.carrosAlugados = carro;
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

    String getDataEntrega() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
