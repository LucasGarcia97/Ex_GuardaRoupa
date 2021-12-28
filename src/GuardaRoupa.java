import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

        HashMap<Integer, List<Vestuario>> gavetas = new HashMap<>();
        private int chave = 0;

        public Integer guardarVestuarios(List<Vestuario> listaVestuarios) {
            gavetas.put(++chave, listaVestuarios);
            return chave;
        }

        public List<Vestuario> devolverVestuarios(int cod) {
            List<Vestuario> listaDeVestuarios = gavetas.get(cod);
            gavetas.remove(cod);
            return listaDeVestuarios;
        }

        public void mostrarVestuarios() {
            for (Integer cod : gavetas.keySet()) {
                List<Vestuario> listaVestuarios = gavetas.get(cod);
                for (Vestuario vestuario : listaVestuarios) {
                    System.out.println(vestuario.toString());
                }
            }

        }
    }
