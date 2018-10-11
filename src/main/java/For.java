public class For {

    public void printNumbersFrom5To100() {
        for (int i = 5; i <= 100; i++)
            System.out.print(i + "\t");

    }

    public void printNumbersFrom55To150() {
        for (int i = 55; i <= 150; i++) {
            System.out.print(i + "\t");

        }
    }

    public void printNumbertFrom100To1() {
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "\t");

        }
    }

    public void printNumbersFrom0To100P() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    public void printNumbersDiv() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ", podzielne przez 2, podzielne przez 3,  podzielne przez 5 ");
            } else {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i + ", podzielne przez 2, podzielne przez 3,");
                } else {
                    if (i % 2 == 0 && i % 5 == 0) {
                        System.out.println(i + ", podzielne przez 2, podzielne przez 5,");
                    } else {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println(i + ", podzielne przez 3, podzielne przez 5,");
                        } else {
                            if (i % 2 == 0) {
                                System.out.println(i + ", podzielne przez 2");
                            } else {
                                if (i % 3 == 0) {
                                    System.out.println(i + ", podzielne przez 3");
                                } else {
                                    if (i % 5 == 0) {
                                        System.out.println(i + ", porzielne przez 5");
                                    } else {
                                        System.out.println(i);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private int sum = 0;

    public void sum1To459() {
        for (int i = 1; i <= 459; i++) {
            sum = i + sum;
        }
        System.out.println("Suma liczb od 1 do 459: " + sum);
    }

    public void starsUp(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //public void starsDown(int number) {
    //    for (int i = 0; i <=number; i++) {
    //        for (int j = 0; j <= number; number--) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //    }
//
    //}

    public void alfabet1() {
        for (char i = 'a'; i <= 'z'; i++) {

            System.out.print(i + ", ");
        }
    }

    public void alfabet2() {
        for (char i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {

                System.out.print(i + ", ");
            }
        }
    }

    public void alfabetBackToFront() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + ", ");
        }
    }

    private  String abc ="alfabet";

    public void theBiggestInAlphabet() {
        //System.out.println(abc.);
    }

}

