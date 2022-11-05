package CursoIntroducciónProgramación.EjercicioTema4;
public class Tema4 {

    public static void main(String[] args) {

        //Condicional if

        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es igual a cero");
        }
        
       //Bucle while

       int numeroWhile = 0;

       while (numeroWhile < 3) {
           numeroWhile ++ ;
           System.out.println(numeroWhile);
       }

       //Bucle Do-While

       int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

       //Bucle for
       for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println(numeroFor);
       }

       // Switch

       int estacion = 0;
        switch (estacion){
            case 1:
                System.out.println("Está en primavera");
                break;
            case 2:
                System.out.println("Está en verano");
                break;
            case 3:
                System.out.println("Está en otoño");
                break;
            case 4:
                System.out.println("Está en invierno");
                break;
            default:
                System.out.println("No es una estación válida");
        }


    }

    
}
