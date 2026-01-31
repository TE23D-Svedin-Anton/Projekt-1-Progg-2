        public class Bestallning {
        private int personummer;
        private int telefonnummer;
        private Byggnad byggnad;
        
        public Bestallning(int personummer, int telefonnummer, Byggnad byggnad) {
            this.personummer = personummer;
            this.telefonnummer = telefonnummer;
            this.byggnad = byggnad;
        }

        public int getPersonummer() {
            return personummer;
        }

        public int getTelefonnummer() {
            return telefonnummer;
        }

         public Byggnad getByggnad() {
            return byggnad;
        }

        @Override
        public String toString() {
            return "Bestallning [Personummer:" + personummer + ", Telefonnummer:" + telefonnummer + byggnad + "]";
        }
    
    }
