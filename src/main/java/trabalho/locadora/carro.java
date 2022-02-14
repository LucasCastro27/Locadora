package trabalho.locadora;

import java.util.ArrayList;

/**
 *
 * @author gabreu e lucas
 */
public class carro {
    
    
    String modelo;
    String placa;
    String marca;
    String cor;
    String dataRetorno;

    int kmAndado;
    float preco;
    int disponivel;
    static int numeroCarros = 0;
    static ArrayList<carro> frota;

    public carro(String dados) {
        int codigo = 0;
        numeroCarros++;
        String input = "";
        // pega todas as informações da string de dados.
        for (int i = 0; i < dados.length(); i++) {
            if (dados.charAt(i) == '=') {
                switch (codigo) {
                    case 7 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        modelo = input;
                        input = "";
                        codigo = 8;
                    }
                    case 6 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        disponivel = Integer.parseInt(input);
                        input = "";
                        codigo = 7;
                    }
                    case 5 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        dataRetorno = input;
                        input = "";
                        codigo = 6;
                    }
                    case 4 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        cor = input;
                        input = "";
                        codigo = 5;
                    }
                    case 3 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        kmAndado = Integer.parseInt(input);
                        input = "";
                        codigo = 4;
                    }
                    case 2 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        preco = Float.parseFloat(input);
                        input = "";
                        codigo = 3;
                    }
                    case 1 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        marca = input;
                        input = "";
                        codigo = 2;
                    }
                    case 0 -> {
                        while (dados.charAt(i) != '\n') {
                            i++;
                            input = input + dados.charAt(i);
                        }
                        input = input.substring(0, input.length() - 1);
                        i++;
                        placa = input;
                        input = "";
                        codigo = 1;
                    }
                    default -> {
                    }
                }
            }
        }
    }

    static public void setfrota(ArrayList<carro> Frota){
        frota=Frota;
    }
    static public ArrayList<carro> getfrota(){
        return frota;
    }
    
    static public void adcionarFrota(carro veiculo) {
        numeroCarros++;
        frota.add(veiculo);
    }

    static public void removerFrota(int id) {
        frota.remove(id);
        numeroCarros--;
    }
    
    static public int getNumeroCarros()
    {
        return numeroCarros;
    }
    static public carro getCarro(int id)
    {
        return frota.get(id);
    }
    
    
}
