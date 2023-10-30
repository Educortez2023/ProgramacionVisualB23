public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Ingresa el valor del producto");
        String valorCapturado = System.console().readLine();
        Double valorIva = Double.valueOf(valorCapturado) * 0.12; 
        Double respuesta = Double.valueOf(valorCapturado) + valorIva;
        System.out.println("El resultado es    "+respuesta);

        System.out.println("Ingresa el valor del producto");
        String valorCapturado = System.console().readLine();
        Double respuesta = (Double.valueOf(valorCapturado) * 0.12) + Double.valueOf(valorCapturado);
        System.out.println("El resultado es    "+respuesta);


        String fruta = "NarANja";
        //No se debe comparar cadenas de caracteres con el simbolo = se debe emplear la función equalIgnoreCase()
        if(fruta.equalsIgnoreCase("naranja")){
            System.out.println("Es la naranja");
        } else {
            System.out.println("No cumple con la condición");
        }



        System.out.println("¿Cúal es la cápital de Honduras");
        String respuestaUsuario = System.console().readLine();

        if(respuestaUsuario.equalsIgnoreCase("Tegucigalpa")){
            System.out.println("Correcto la cápital de Honduras es Tegucigalpa");
        } else{
            System.out.println("Vaya a estudiar!!!");
        }

        if(8 == 8){
            System.out.println("Si son iguales");
        } else {
            System.out.println("No son iguales");
        }*/


        // En base al numero que ingrese la persona quiero determinar si el número ingresado es par o impar
        System.out.println("Ingresa un número  ");
        String numeroIngresado = System.console().readLine();
        if(!numeroIngresado.matches("[0-9]+")){
            System.out.println("Solo se permite el ingreso de números usted esta digitando caracteres");
            System.exit(0);
        }
        int residuo = Integer.valueOf(numeroIngresado) % 2;
        if(Integer.valueOf(numeroIngresado) == 0){
            System.out.println("No se puede determinar si el 0 es un númeo par o impar");
        } else if(Integer.valueOf(numeroIngresado) < 0) {
            System.out.println("No permite evaluar número negativos");
        } else if(residuo == 0){
            System.out.println("Es par el número ingresado");
        } else {
            System.out.println("Es impar el número ingresado");
        }
    }
}
