/**
 * El objetivo de este proyecto es adivinar un número en el rango del 1 al 8
 * Si el programa adivina el número que el usuario tenga en mente entonces mostrará
 * el siguiente mensaje:
 * He adivinado el número
 * caso contrario dirá me puedes dar otra oportunidad
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*boolean deboContinuar = true;
        System.out.println("Dime un número del 1 al 8");
        String numeroDigitado = System.console().readLine();
        
        do{
            int numeroAleatorio = (int)( Math.random() * 8 ) + 1;
            System.out.println("Número generado  "+numeroAleatorio);
            if( numeroAleatorio == Integer.valueOf(numeroDigitado) ){
                System.out.println("He adivinado el número");
                deboContinuar = false;
            } else {
                System.out.println("No lo adivine :c , Me das otra oportunidad SI/NO");
                String respUsuario = System.console().readLine();
                if("SI".equalsIgnoreCase(respUsuario)){
                    deboContinuar = true;
                } else {
                    deboContinuar = false;
                }
            }
        } while(deboContinuar);*/
        System.out.println(""+1);
        System.out.println(""+2);
        System.out.println(""+3);
        System.out.println(""+4);
        System.out.println(""+5);
        int numeroIncrementado = 0;
        System.out.println("================================");
        System.out.println("============DO-WHILE=============");
        System.out.println("================================");
        do{
            numeroIncrementado++;
            System.out.println(""+numeroIncrementado);
        } while(numeroIncrementado < 5);
        System.out.println("================================");
        System.out.println("============WHILE==============");
        System.out.println("================================");
        int usoNuevo = 0;
        while(usoNuevo < 5){
            usoNuevo++;
            System.out.println(""+usoNuevo);
        }
        System.out.println("================================");
        System.out.println("==============FOR==============");
        System.out.println("================================");
        for(int incremento = 1 ; incremento <= 10 ; incremento++ ){
            System.out.println(""+incremento);
        }
        System.out.println("================================");
        System.out.println("==============FOR INVERTIDO=====");
        System.out.println("================================");
        for(int varIncremento = 10; varIncremento >= 1; varIncremento-- ){
            System.out.println(""+varIncremento);
        }
        System.out.println("================================");
        System.out.println("=======Buscar números pares=====");
        System.out.println("================================");
        for(int numerosPares = 1 ; numerosPares <= 160 ; numerosPares++ ){
            if(numerosPares%2 == 0){
                System.out.println(""+numerosPares);
            }
        }

        int numeroAleatorio = (int)( Math.random() * 60 ) + 1;
        System.out.println("El profe debe resolver el ejercicio  "+numeroAleatorio);
    }
}
