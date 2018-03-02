package aplicacionaula;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class AplicacionAula {

    public static void main(String[] args) {
        Profesor jesus,joaquin;
        Alumno juan,beatriz;
        Persona per;
        Delegado joselin,alberto,alex,kisawea;
        Delegado delegados[];
        
        jesus   = new Profesor("Jesus");
        joaquin = new Profesor("Joaquin","B7");
        juan  = new Alumno("Juan");
        beatriz = new Alumno("Beatriz",4,5);
        per = new Persona();
        joselin = new Delegado(4);
        joselin.nombre="Limao";
        alberto = new Delegado(5);
        alberto.nombre="Alberto";
        alex = new Delegado(6);
        alex.nombre="Alex";
        kisawea = new Delegado(7);
        kisawea.nombre="Kisawea";
        delegados = new Delegado[10];
        delegados[0]=joselin;
        delegados[1]=alberto;
        delegados[2]=alex;
        delegados[3]=kisawea;
   
        //Primera parte
        for(int i = 0; i < 10; i++){
           if(delegados[i]!=null)
            System.out.println("El numero de delegado "+delegados[i].nombre+" es: "+delegados[i].numDel);
        }
        
        per.altura=3.3F;
        System.out.println("\n"+jesus.toString());   // Mostramos a los profesores
        System.out.println(joaquin.toString());
        jesus.setDespacho("C7");                     // Cambiamos el despacho de Jesus
        System.out.println(jesus.toString()+"\n");   // Comprobamos la nueva informacion

        jesus.darClase();                               // Jesus comineza la clase
        jesus.habla();
        juan.pregunta("¿Que es un objeto?");             // El alumno juan pregunta
        jesus.responderPregunta("¿Que es un objeto?");   // Jesus contesta
        beatriz.pregunta("¿Es lo mismo clase y objeto?");
        jesus.responderPregunta("¿Es lo mismo clase y objeto?");
        jesus.pregunta("¿Os habeis enterado?");
        
        //Segunda parte
        //Valor absoluto
        int valor=-1;
        System.out.println("Valor: "+valor);
        int valorAbsoluto=Math.abs(valor);
        System.out.println("Valor absluto: "+valorAbsoluto);
        //Raiz
        double numero=25.0;
        double raiz=Math.sqrt(numero);
        System.out.println("Raiz de 25.0: "+raiz);
        //Minuscula mayuscula
        char carac='c';
        System.out.println("Es c minuscula? : "+ isLowerCase(carac)) ;
        System.out.println("Es c mayuscula? : "+ isUpperCase(carac)) ;
        //Int to string
        String lmao;
        lmao = Integer.toString(valorAbsoluto);
        System.out.println(lmao);
        //String to int
        String lelmao = "1234";
        int numeraso;
        numeraso = Integer.parseInt(lelmao);
        System.out.println(lelmao);
        //Minimos y maximos
        System.out.println("Tipo\tMínimo\tMáximo");
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
        //Segundo caracter
        String holita="Hola";
        System.out.println(holita.charAt(1));
        //Comparar hola con Hola
        if( !"Hola".equals("hola")){
            System.out.println("Damn son");
        }
        //Crear “Hola” y añadirle “ y adiós” (sin crear un nuevo objeto)
        String hola2="Hola";
        System.out.println(hola2);
        hola2 = hola2 + " y adiós";
        System.out.println(hola2);
    }

}
