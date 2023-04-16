import java.util.ArrayList;
import java.util.List;

class Concessionaria {
    private String nome;
    private String endereco;

    public Concessionaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void venderCarro(String modelo, String cor) {
        Carro carro = CarroFactory.getCarro(modelo, cor);
        System.out.println("Vendido um carro " + carro.getModelo() + " " + carro.getCor() + " para " + nome + " em " + endereco);
    }
}
