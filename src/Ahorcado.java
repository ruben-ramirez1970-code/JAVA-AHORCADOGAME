import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
  //Game Ahorcado      
// Para comenzar utilizamos la clase scanner para que las personas puedan escribir.
                            //importamos a scanner
        Scanner scanner = new Scanner(System.in);

      //declaramos un string con la palabra a descubrir.
        String palabraSecreta = "inteligencia";
      //declaramos un int con la oportunidades maximas que tiene el ususario para elegir las letras que forman la palabra secreta.
        int intentosMaximos = 10;
    // declaramos un int donde indica en que intento esta el usuario. Se inicia en 0.
        int intentos = 0;
    // declaramos un boolean para saber si "fue adivinada la letra?" que forma la palabra.
    //para luego declarar un bucle while y siga preguntándonos, preguntándonos, preguntándonos, fue adivinada la palabra?        //comenzamos con false.
        boolean palabraAdivinada = false;
    //seguimos con un Arreglo:
    //en este game, arreglo de char
                            //como valor del array sera la cantidad de letras que tiene "adivinar", por eso ponemos palabraSecreta.length() que nos da la cantidad de letras acertadas que necesitamos para ganar.

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //Estructura de control de tipo iterativa: bucle for.
    //tenemos que hacer un bucle for para dterminar la cantidad de guioncitos de tal manera que formen la palabra secreta.
    //de esta menera el usuario sabe cuantas letra tiene que adivinar.



         for (int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i] = '_';
        // comillas simples porque son letras
        //hacemos esto para que a medida que el usuario acierte las letras los guiones se cambien por la letra adivinada.
        //System.out.print(letrasAdivinadas[i]);
            
         }
         //Estructura de control de tipo iterativa: bucle while
         //porque el while? porque el usuario tiene que seguir intentando, hasta que se le acaben los mismos.
         //o adivine todas las letras y gane el juego.

         //! negación de la variable palabraAdivinada es decir "mientras la palabra no sea adivinada el bucle sigue"
         // y (&&) la variable intentos es menor (<) a la varible intentosMaximos.

         while (!palabraAdivinada && intentos < intentosMaximos) {

        //String.valueOf "letrasAdivinadas es un array de letras(chars) que también forman una palabra"
        //originalmete va a hacer la cantidad de guiones
        //Pero a medida que el usuario vaya adivinado las letras, los guiones se transforman en letra.

            System.out.println("Palabra a adivinar: " + 
                   //esto (.valueOf) se usa cuando tenemos una palabra de char, es decir un array de chars.
            String.valueOf(letrasAdivinadas) +" (" + palabraSecreta.length() + " letras)");

            //syso para que el usuario introdusca una letra.
            //printl con tl final indica que tiene que apretar enter luego de colocar la letra.
            System.out.println("Introduce una letra por fv: "); 
            //usamos la clase scanner para pedir una letra
           // char letra = scanner.next().charAt(0);
            //Si queremos pasar de mayuscula a minuscula.
            //Porque el usuario uso mayuscula, ponemos.
            char letra = Character.toLowerCase(scanner.next().charAt(0));        //touppercase para pasar de minuscula a mayuscula

            
            // la variable letra es un char, pero con scanner usamos
            //chartAt()que es un string que actue como char.
            //es decir por mas que escribamos una palabra, solamente se va a tomar la primera letra
            //vamos a comenzar con un boolean en false, luego veremos si es folse o no.

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional: if
                //si se cumple esta condición hacemos esto.
                //si no se cumple se hace lo suiguiente.
                //charAt actúa como un indice, recorre la palabra y busca la letra que deseemos.
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                //las letras correctas reeplazaran los guiones.



                    letraCorrecta = true;
                //el booleano letraCorrecta pasa a true ahora para no perder un intento.

                }
                
            }
            //Si el usuariio no acerto la letra se le avisa que es incorrecta y que tiene una chance menos.
            //con un if de negacion "!letraCorrecta".
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta. Te quedan: " + (intentosMaximos - intentos) + " intentos");
            }
            //Si la palabra fue completada utilizamos if con String.valueOf()
            //.equals es la forma de decir si un string es igual a otro.
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabraAdivinada);
            };
            //para que salga del while la variable boolean palabraAdivinada pasa a true.


         }
         //si la palabra no fue adivinada y terminaron todos los intentos  colocamos otro if
         if (!palabraAdivinada) {
            System.out.println("Fin de intentos, game over");
         }
        //siempre terminar el scanner con scanner.close.
        scanner.close();


        

       










    }
}
