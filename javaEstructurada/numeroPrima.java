package javaEstructurada;

public class numeroPrima {
    public static void main(String[] args) {
        // dados n numeros contar desde un min a un max indicar si los num  son primos o no
        // valores menores a 2 son no primos
        int otro = 0;
        int min = 9;
        int max = 15;

        if (max <= 2) {
            if (max == 2){
            System.out.println(max + " es un número primo");
            }else {
                System.out.println(" es un número no primo");
            }
        }else{
            for (int i = min; i <= max; i++) {
                for (int j = 2; j < i; j++){

                    if (i % j == 0) {
                    //System.out.println(num + " es un número no primo");
                    break;
                    } else if (j == i - 1) {
                    System.out.println(i + " es un número primo");
                    }
                }
            }
        }
}}
