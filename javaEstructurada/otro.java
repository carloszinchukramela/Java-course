package javaEstructurada;

public class otro {
    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 145;
        if(maximo <= 2){
            //... -1, 0, 1, 2
            if (maximo == 2) {
                System.out.println(maximo + " Es un valor primo");
            }else{
                System.out.println(maximo + " Es un valor no primo");
            }
        }else{
            //3, 4, 5 ....
            for (int i = minimo; i <= maximo; i++) {
                for (int divisor = 2; divisor < i; divisor++) {

                    if (i % divisor == 0) {
                        //System.out.println(i + " Es un valor no primo");
                        break;
                    } else if (divisor == i - 1) //Si divisor es igual al numero anterior analizado
                    {
                        System.out.println(i + " Es un valor primo");
                    }
                }
            }
        }
    }  
}       
