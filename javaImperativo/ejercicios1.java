package javaImperativo;

public class ejercicios1 {
    public static void main(String[] args) {
        // ej 1  suma de dos numeros
        int num1 = 15;
        int num2 = 20;
        int suma = num1 + num2;
        System.out.println(suma);
    
        // ej 2  suma de dos numeros bis
        int num3 = 10;
        int num4 = 20;
        int suma1 = num3 + num4;
        if(suma1%2 == 0){
            System.out.println("El resultado es " + suma1 + " y es par ");
        }else{
            System.out.println("el resultado es " + suma1 + " y es impar ");
        }

        // ej 3 caracteres
        String c = "c";
        String a = "a";
        String r = "r";
        String l = "l";
        String o = "o";
        String s = "s";
        System.out.println(c + a + r + l + o + s);

        // ej 4 calculo de divisibilidad
        int numero1 = 20;
        int numero2 = 5;
        int suma2 = (numero1 + numero2);
        if(numero1 % numero2 == 0){
            System.out.println("el primer numero es divisible por el segundo " + (numero1/numero2));
        }else {
            System.out.println("el primer número no es divisible por el segundo");
        }

        // ej 5 triangulo de asteriscos
        String ast = " * ";
        String ast1 = "\n***";
        System.out.println(ast + ast1);

        // ej 6 nombre de bebida
        String masc = "Ross";
        String peli = "salvaje";
        System.out.println("nombre de la próxima bebida --> " + masc + " " + peli);

        // ej 7 multiplicacion
    }
}

