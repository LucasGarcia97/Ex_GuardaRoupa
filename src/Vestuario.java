public class Vestuario {
        private String marca, modelo;

        public Vestuario(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        @Override
        public String toString() {
            return "Roupa{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    '}';
        }
    }
