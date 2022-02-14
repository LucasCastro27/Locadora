    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.locadora;

/**
 *
 * @author user
 */
public final class Cliente extends Pessoa {
    String carroAlugado;
    
    String dataEntrega;//define a data que o cliente precisa entregar o carro
    
    String dataEntregou; //define o dia que o cliente entregou o carro
    float preco;



    public Cliente(String dados){
        
    int codigo = 0;
        String input = "";
        // pega todas as informações da string de dados e atribui as vareaveis adeqquadas.
        for (int i = 0; i < dados.length(); i++) {
            if (dados.charAt(i) == '=') {
                switch (codigo) {
                    case 5 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setCarroAlugado(input);
                        input = "";
                        codigo = 6;
                    }
                    case 4 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setNome(input);
                        input = "";
                        codigo = 5;
                    }
                    case 3 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setDataEntrega(input);
                        input = "";
                        codigo = 4;
                    }
                    case 2 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setPreco(Float.parseFloat(input));
                        input = "";
                        codigo = 3;
                    }
                    case 1 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setEndereço(input);
                        input = "";
                        codigo = 2;
                    }
                    case 0 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }   input = input.substring(0, input.length() - 1);
                        i++;
                        this.setCPF(input);
                        input = "";
                        codigo = 1;
                    }
                    default -> {
                    }
                }
            }
        }

    }

    public String getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(String carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
      public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
