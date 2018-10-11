public class Runner {

    public static void main(String[] args) {


        // Zdadania od Krzyśka punkt "Podstawy"
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        if (number1 > number2 && number1 > number3) {
            System.out.println("Największa licza: " + number1);

            if (number2 > number3 && number2 > number1) {
                System.out.println("Największa licza: " + number2);
            }
        } else {
            System.out.println("Największa licza: " + number3);
        }


        if (number3 % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }

        if (number3 > 0) {
            System.out.println("Liczba jest większa od zera");
            if (number3 < 0) {
                System.out.println("Liczba jest mniejsza od zera");
            }

        } else {
            System.out.println("Liczba jest równa zero");
        }

        For f = new For();
        System.out.println("Liczby z zakresu od 5 do 100: ");
        f.printNumbersFrom5To100();
        System.out.println();
        System.out.println();
        System.out.println("Liczby z zakresu od 55 do 150: ");
        f.printNumbersFrom55To150();
        System.out.println();
        System.out.println();
        System.out.println("Liczby z zakresu od 100 do 1:");
        f.printNumbertFrom100To1();
        System.out.println();
        System.out.println();
        System.out.println("liczby z zakresu od 0 do 100 parzyste: ");
        f.printNumbersFrom0To100P();
        System.out.println();
        System.out.println();
        //f.printNumbersDiv();
        //f.sum1To459();
        //f.starsUp(5);
        System.out.println();
        f.alfabet1();
        System.out.println();
        f.alfabet2();
        System.out.println();
        f.alfabetBackToFront();
        System.out.println();
        f.theBiggestInAlphabet();
    }

}
