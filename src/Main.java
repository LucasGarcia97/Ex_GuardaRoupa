import java.util.ArrayList;
import java.util.List;

 public class Main {

        public static void main(String[] args) {

            List<Vestuario> vestuariosMarca = new ArrayList<>();
            List<Vestuario> vestuariosLucas = new ArrayList<>();

            vestuariosMarca.add(new Vestuario("Calvin Klein", "Camiseta"));
            vestuariosMarca.add(new Vestuario("GAP", "Blusa"));

            vestuariosLucas.add(new Vestuario("Hering", "Bermuda"));
            vestuariosLucas.add(new Vestuario("Polo Wear", "Camisa Polo"));

            GuardaRoupa GuardaRoupa = new GuardaRoupa();

            GuardaRoupa.guardarVestuarios(vestuariosMarca);
            GuardaRoupa.guardarVestuarios(vestuariosLucas);

            GuardaRoupa.mostrarVestuarios();

            GuardaRoupa.devolverVestuarios(1);

            GuardaRoupa.mostrarVestuarios();




        }
    }
