package co.edu.sena.miscelanea;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc;
        int dato01;
        int dato02;

        double dato1;
        double dato2;
        double dato3;
        double dato4;
        double dato5;

        String resultado;
        
        //Menu y sub menu
        System.out.println("Seleccione una opción:\n1. Operadores \n2. Condicionales \n3. Ciclos \n4. Arreglos \n99.Salir");
    
        opc = in.nextInt();
        Ejercicios ejercicios =  new Ejercicios();
        switch (opc) {
        case 1:
        //Operadores

            //Ejercicio 1
            System.out.println( "1.1. Calcular el área de un triángulo");
            Scanner src = new Scanner(System.in);
    
            System.out.println( "Ingrese la base del triángulo");
            dato1 = src.nextDouble();
    
            System.out.println( "Ingrese la altura del triángulo");
            dato2 = src.nextDouble();
    
            dato3 = ejercicios.areaTriangulo(dato1, dato2);
            System.out.println("El área del triángulo es: " + dato3);
    

            //Ejercicio 2
            System.out.println("1.2. Sumatoria de dos números");
            System.out.println("Ingrese el primer número: ");
    
            Scanner sum = new Scanner(System.in);
            double d1 = sum.nextDouble();
    
            System.out.println("Ingrese el segundo número: ");
            double d2= sum.nextDouble();
    
            double res = (d1+d2);
            System.out.println("La sumatoria de los números es: " + res);
    

            //Ejercicio 3
            System.out.println("1.3. Número elevado al cuadrado");
            Scanner elv = new Scanner(System.in);
    
            System.out.println("Ingrese el número que desea elevar al cuadrado: ");
            dato1 = elv.nextDouble();
    
            dato3 = ejercicios.numeroElevado(dato1);
            System.out.println("El resultado del número es: "+dato3);
    

            //Ejercicio 4
            System.out.println("1.4. Conversor de euros a dolares");
            System.out.println("Ingrese la cantidad de euros: ");
    
            Scanner con = new Scanner(System.in);
            dato1 = con.nextDouble();
    
            dato3 = ejercicios.conversor(dato1);
            System.out.println("El valor en dolares es: "+dato3);
    

            //Ejercicio 5
            System.out.println("1.5. Área y perímetro de un cuadrado:");
            System.out.println("Ingrese un valor para un lado del cuadrado: ");
            
            Scanner valor = new Scanner(System.in);
            dato1 = valor.nextDouble();
            
            dato3 = ejercicios.areaCuadrado(dato1);
            dato4 = ejercicios.perimetroCuadrado(dato1);
            System.out.println("El área del cuadrado es: "+dato3);
            System.out.println("El perímetro del cuadrado es: "+dato4);
    
    
            //Ejercicio 6
            System.out.println("1.6. Cálculo del área y volumen de un cilindro");
            System.out.println("Ingrese el radio del cilindro:");
    
            Scanner cil = new Scanner(System.in);
            dato1 = cil.nextDouble();
    
            System.out.println("Ingrese la altura del cilindro:");
            dato2 = src.nextDouble();
    
            dato3 = ejercicios.areaCilindro(dato1, dato2);
            dato4 = ejercicios.VolumenCilindro(dato1, dato2);
            System.out.println("El área total del cilindro es: " + dato3);
            System.out.println("El volumen del cilindro es: " + dato4);
    

            //Ejercicio 7
            System.out.println("1.7. Cálculo de la longitud, área de una circunferencia, y área de un círculo inscrito");
            System.out.println("Ingrese el radio de la circunferencia:");
    
            Scanner cir = new Scanner(System.in);
            dato1 = cir.nextDouble();
    
            dato3 = ejercicios.longitudCircunferencia(dato1);
            dato4 = ejercicios.areaCircunferencia(dato1);
            dato5 = ejercicios.areaCirculoInscrito(dato1);
            System.out.println("La longitud de la circunferencia es: " + dato3);
            System.out.println("El área de la circunferencia es: " + dato4);
            System.out.println("El área del círculo inscrito es: " + dato5);
    

            //Ejercicio 8
            System.out.println("1.8. Promedio de tres números");
            
            Scanner prom = new Scanner(System.in);
    
            System.out.println("Introduzca el primer número: ");
            dato1 = prom.nextDouble();
    
            System.out.println("Introduzca el segundo número: ");
            dato2 = prom.nextDouble();
            
            System.out.println("Introduzca el tercer número: ");
            dato3 = prom.nextDouble();
    
            dato4 = ejercicios.promnumeros(dato1, dato2, dato3);
            System.out.println("El promedio de los tres números es: "+dato4);
            
        break;

        case 2:
        //Condicionales

            //Ejercicio 1
            System.out.println("2.1. Determine si un número es positivo o negativo");
            Scanner det = new Scanner(System.in);

            System.out.println("Ingrese un número: ");
            dato1 = det.nextDouble();

            resultado = ejercicios.posneg(dato1);
            System.out.println("Su numero es " + resultado);

            //Ejercicio 2
            System.out.println("2.2. Determine si un número es mayor o menor.");
            Scanner may = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            dato1 = may.nextDouble();

            System.out.println("Ingrese el segúndo número:");
            dato2 = may.nextDouble();

            resultado = ejercicios.maymen(dato1, dato2);
            System.out.println("Los resultados son que " + resultado);

            //Ejercicio 3
            System.out.println("2.3. Determine entre tres números cual es mayor o menor.");
            Scanner tresnum = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            dato1 = tresnum.nextDouble();

            System.out.println("Ingrese el segúndo número:");
            dato2 = tresnum.nextDouble();

            System.out.println("Ingrese el tercer número:");
            dato3 = tresnum.nextDouble();

            resultado = ejercicios.tresnumm(dato1, dato2, dato3);
            System.out.println("Entre los tres números " + resultado);

            //Ejercicio 4
            System.out.println("2.4. Suma y resta de valores.");
            Scanner sumres = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            dato1 = sumres.nextDouble();

            System.out.println("Ingrese el segundo número:");
            dato2 = sumres.nextDouble();

            dato3 = ejercicios.sumnum(dato1, dato2);
            dato4 = ejercicios.resnum(dato1, dato2);

            resultado = ejercicios.sumress(dato1, dato2, dato3, dato4);
            System.out.println("El resultado es " + resultado);

            //Ejercicio 5
            System.out.println("2.5. Determine el cociente entre A y B.");
            Scanner cosc = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            dato1 = cosc.nextDouble();

            System.out.println("Ingrese el segundo número:");
            dato2 = cosc.nextDouble();

            dato3 = ejercicios.cos(dato1, dato2);

            resultado = ejercicios.coss(dato1, dato2, dato3);
            System.out.println("El resultado" + resultado);

            //Ejercicio 6
            System.out.println("2.6. Suma y multiplicación de valores.");
            Scanner summult = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            dato1 = summult.nextDouble();

            System.out.println("Ingrese el segundo número:");
            dato2 = summult.nextDouble();

            dato3 = ejercicios.summult(dato1, dato2);
            dato4 = ejercicios.multsum(dato1, dato2);

            resultado = ejercicios.sumult(dato1, dato2, dato3, dato4);
            System.out.println("El resultado es " + resultado);

            //Ejercicio 7
            System.out.println("2.7. Determine si un año es bisiesto o no.");
            Scanner bisiesto = new Scanner(System.in);

            System.out.println("Ingrese el año:");
            dato1 = bisiesto.nextDouble();

            resultado = ejercicios.bis(dato1);
            System.out.println("Su año " + resultado);

        break;

        case 3:
        //Ciclos

        //Ejercicio 1
        System.out.println("3.1. Múltiplos de 3 entre 1 y 100.");
        Scanner multres = new Scanner(System.in);
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
            System.out.println(i);}
        }

        //Ejercicio 2
        System.out.println("3.2. Números impares entre 0 y 100.");
        Scanner impnum = new Scanner(System.in);
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
            System.out.println(i);}
        }

        //Ejercicio 3
        System.out.println("3.3. Números pares entre 1 y 100.");
        Scanner parnum = new Scanner(System.in);
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
            System.out.println(i);}
        }

        //Ejercicio 4
        System.out.println("3.4. Cuadrados de los números del 1 al 30.");
        Scanner cuadnum = new Scanner(System.in);
        
        for (int i = 1; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + " es " + cuadrado);
        }

        //Ejercicio 5
        System.out.println("3.5. Cuadrados de los cien primeros números naturales.");
        Scanner sumcuadnum = new Scanner(System.in);
        
        dato01 = 100;
        int sumaCuadrados = 0;

        for (int i = 1; i <= dato01; i++) {
          int cuadrado = i * i;
          sumaCuadrados += cuadrado;
        }
        System.out.println("La suma de los cuadrados de los cien primeros números naturales da: " + sumaCuadrados);
      
        //Ejercicio 6
        System.out.println("3.6. Números comprendidos en secuencia ascendente.");
        Scanner secasc = new Scanner(System.in);
        System.out.println("El primer número debe ser menor que el segundo");

        System.out.println("Ingrese el primer número:");
        dato01 = secasc.nextInt();

        System.out.println("Ingrese el segundo número:");
        dato02 = secasc.nextInt();
    
        if (dato01 > dato02) {
          System.out.println("Operación erronea, recuerde que el primer número debe ser menor que el segundo");
        } else {
          for (int i = dato01; i <= dato02; i++) {
            System.out.println(i);
          }
        }
        //Ejercicio 7
        System.out.println("3.7. Sumar todos los números que se digitan.");
        Scanner dignum = new Scanner(System.in);

        int suma = 0;
        System.out.println("Ingrese un número, para finalizar la suma escriba 0: ");
        
        do {
            System.out.print("Ingrese un número: ");
            dato01 = dignum.nextInt();

            if (dato01 != 0) {
                suma += dato01;
            }

        } while (dato01 != 0);

        System.out.println("La suma de los números es: " + suma);

        break;

        case 4:
        System.out.println("Este menú se encuentra en mantenimiento, escoja otra opción.");

        break;

        case 99:
        System.out.println("¡Hasta luego!");
        System.exit(0);
        break;
      
        default:
        System.out.println("Opción incorrecta");
        }
    }
}
