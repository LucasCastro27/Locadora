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

    static float saldo;
    static String cnpj;
    static int numeroFuncionarios;
    static int validado ;
            
    public void ChefeInicia(String dados) {
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
                        this.saldo = Float.parseFloat(input);
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
                        this.cnpj = input;
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
                        this.Senha = input;
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
                        this.CPF = input;
                        codigo++;
                        input = "";
                        
                    }
                    case 6 -> {
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
                    case 7 -> {
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

    public float getSaldo() {
        if (validado == 1) {
            return saldo;
        }
        return 0;
    }

    public void setSaldo(float saldo) {
        if (validado == 1) {
            this.saldo = saldo;
        }
    }

    public String getCnpj() {
        if (validado == 1) {
            return cnpj;
        } else {
            return null;
        }
    }

    public void setCnpj(String cnpj) {
        if (validado == 1) {
            this.cnpj = cnpj;
        }
    }

    public int getNumeroFuncionarios() {
        if (validado == 1) {
            return numeroFuncionarios;
        } else {
            return -1;
        }
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (validado == 1) {
            this.numeroFuncionarios = numeroFuncionarios;
        }
    }

    public void venderCarro(carro veiculo) {
        saldo = saldo + veiculo.preco;
    }

    public void conprarCarro(carro veiculo) {
        saldo = saldo + veiculo.preco;
    }

    public void demitirFuncionario() {
        numeroFuncionarios--;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
    }

    @Override
    public float AlmentoSalario() {
        return saldo / 10000 +(salario / 100 * carrosAlugados);
    }
}
