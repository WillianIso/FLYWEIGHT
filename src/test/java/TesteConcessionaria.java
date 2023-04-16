import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TesteConcessionaria {
    public static void main(String[] args) {
        Concessionaria c1 = new Concessionaria("Concessionaria A", "Rua A, 123");
        Concessionaria c2 = new Concessionaria("Concessionaria B", "Rua B, 456");

        c1.venderCarro("Fusca", "Vermelho");
        c2.venderCarro("Gol", "Azul");

        // Teste de unidade
        assert CarroFactory.getCarro("Fusca", "Vermelho") == CarroFactory.getCarro("Fusca", "Vermelho");
        assert CarroFactory.getCarro("Gol", "Azul") == CarroFactory.getCarro("Gol", "Azul");
    }
}
