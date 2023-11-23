public class ATM {
        private int twenties;
        private int fifties;
        private int hundreds;

        public ATM(int twenties, int fifties, int hundreds) {
            this.twenties = twenties;
            this.fifties = fifties;
            this.hundreds = hundreds;
        }
        public void addMoney(int twenties, int fifties, int hundreds) {
            this.twenties = twenties+ this.twenties;
            this.fifties = fifties+ this.fifties;
            this.hundreds=  hundreds + this.hundreds;
        }

        // Функция для снятия денег
        public boolean Snyatie (int SumToVlojit) {
            int ostavshiesyaKupyri = SumToVlojit;
            int hundredsToVlojit= Math.min(ostavshiesyaKupyri / 100, hundreds);
            ostavshiesyaKupyri -= hundredsToVlojit * 100;

            int fiftiesToVlojit = Math.min(ostavshiesyaKupyri / 50, fifties);
            ostavshiesyaKupyri -= fiftiesToVlojit * 50;

            int twentiesToVlojit = Math.min(ostavshiesyaKupyri / 20, twenties);
            ostavshiesyaKupyri -= twentiesToVlojit * 20;

            if (ostavshiesyaKupyri == 0) {
                System.out.println("Снято купюр номиналом 100: " + hundredsToVlojit);
                System.out.println("Снято купюр номиналом 50: " + fiftiesToVlojit);
                System.out.println("Снято купюр номиналом 20: " + twentiesToVlojit);
                return true;
            } else {
                return false;
            }
        }
    }

