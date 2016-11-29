import java.util.Scanner;


public class Consola {
    public static Scanner sc = new Scanner(System.in);

    public static int lerInt(String texto, int min, int max) {
        int num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < min || num > max) {
                    System.out.println("Número inválido. Número deve estar compreendido entre " + min + " e " + max + ".");
                }
            } else {
                System.out.println("Tem de introduzir um número inteiro!");
            }
            sc.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public static int lerInt(String texto) {
        int num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Número inválido. Número deve ser positivo");
                }
            } else {
                System.out.println("Tem de introduzir um número inteiro!");
            }
            sc.nextLine();
        } while (num < 0);
        return num;
    }

    public static long lerLong(String texto, long min, long max) {
        long num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextLong()) {
                num = sc.nextLong();
                if (num < min || num > max) {
                    System.out.println("Número invalido. Número deve estar compreendido entre " + min + " e " + max + ".");
                }
            } else {
                System.out.println("Tem de introduzir um número inteiro!");
            }
            sc.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public static float lerFloat(String texto, float min, float max) {
        float num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextFloat()) {
                num = sc.nextFloat();
                if (num < min || num > max) {
                    System.out.println("Número invalido. Número deve estar compreendido entre " + min + " e " + max + ".");
                }
            } else {
                System.out.println("Tem de introduzir um número real!");
            }
            sc.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public static double lerDouble(String texto, double min, double max) {
        double num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                if (num < min || num > max) {
                    System.out.println("Número invalido. Número deve estar compreendido entre " + min + " e " + max + ".");
                }
            } else {
                System.out.println("Tem de introduzir um número real!");
            }
            sc.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public static char lerChar(String texto, String opcoes) {
        char ch = '\0';
        do {
            System.out.print(texto);
            ch = sc.next().charAt(0);
            if (opcoes.indexOf(ch) == -1) {
                System.out.println("Opção inválida. Caracter deve ser um dos seguintes: " + opcoes + ".");
            }
            sc.nextLine();
        } while (opcoes.indexOf(ch) == -1);
        return ch;
    }

    public static String lerString(String texto) {
        String str = "";
        do {
            System.out.print(texto);
            str = sc.nextLine();
            if (str.length() == 0) {
                System.out.println("String vazia.");
            }
        } while (str.length() == 0);
        return str;
    }
}
