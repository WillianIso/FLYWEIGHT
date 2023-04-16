import java.util.HashMap;
import java.util.Map;
class CarroFactory {
    private static Map<String, Carro> carros = new HashMap<>();

    public static Carro getCarro(String modelo, String cor) {
        String key = modelo + cor;

        if (!carros.containsKey(key)) {
            Carro carro = new Carro(modelo, cor);
            carros.put(key, carro);
        }

        return carros.get(key);
    }
}