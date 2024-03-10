package co.edu.sena.miscelanea;

public class Ejercicios {

        //Ejercicios 1
        public double areaTriangulo(double d1, double d2){
            return (d1*d2) / 2;
        }
        public double suma(double d1, double d2){
            return (d1+d2);
        }
        public double numeroElevado(double d1){
            return (d1*d1);
        }
        public double conversor(double d1){
            return (d1*1.0846);
        }
        public double areaCuadrado(double d1){
            return (d1*d1);
        }
        public double perimetroCuadrado(double d1){
            return (d1+d1+d1+d1);
        }
        public double areaCilindro(double d1, double d2){
            return ( 2 * Math.PI * d1 * (d1 + d2));
        }
        public double VolumenCilindro(double d1, double d2){
            return (Math.PI * Math.pow(d1, 2) * d2);
        }
        public double longitudCircunferencia(double d1){
            return (2 * Math.PI * d1);
        }
        public double areaCircunferencia(double d1){
            return (Math.PI * Math.pow(d1, 2));
        }
        public double areaCirculoInscrito(double d1){
            return (Math.PI * Math.pow(d1, 2) / 2);
        }
        public double promnumeros(double d1, double d2, double d3){
            return ((d1+d2+d3)/3);
        }
      
        //Ejercicios 2
      
        public String posneg(double dato1){
            if (dato1>= 0) { 
                return("positivo");
                    
                } else{
                return("negativo");
                }
            }
      
        public String maymen(double dato1, double dato2){
            if (dato1>dato2) {
                  return("el número mayor es: " +dato1+ " y el número menor es: " + dato2);
              }
              else if (dato1<dato2) {
                  return("el número mayor es: " +dato2+ " y el número menor es: " + dato1);
              }
              else {
                  return("ambos números son iguales.");
              }
            }

        public String tresnumm (double dato1, double dato2, double dato3){
            if (dato1 > dato2 && dato1 > dato3) {
                return "El número mayor es: " + dato1 + " y el número menor es: " + Math.min(dato2, dato3);
            } else if (dato2 > dato1 && dato2 > dato3) {
                return "El número mayor es: " + dato2 + " y el número menor es: " + Math.min(dato1, dato3);
            } else if (dato3 > dato1 && dato3 > dato2) {
                return "El número mayor es: " + dato3 + " y el número menor es: " + Math.min(dato1, dato2);
            } else {
                return "Todos los números son iguales.";
            }
        }

        public String sumress (double dato1, double dato2, double dato3, double dato4){
        if (dato1 < dato2){
            return("una suma de ambos números y da: " + dato3);
        } 
        else if (dato1 > dato2) {
            return("una resta de ambos números y da: "+dato4);
        }
        else {
            return("Ambos números son iguales.");
        }
    }
        public double sumnum (double dato1, double dato2){
            return (dato1+dato2);
        }
        public double resnum (double dato1, double dato2){
            return (dato1-dato2);
        }

        public String coss (double dato1, double dato2, double dato3){
            if (dato2 !=0){
                return(" de la división es: " + dato3);
            }
            else {
                return(" de la división no es posible.");
            }

        }
        public double cos (double dato1, double dato2){
            return (dato1/dato2);
        }

        public String sumult (double dato1, double dato2, double dato3, double dato4){
            if (dato1 < dato2){
                return("una suma de ambos números y da: " + dato3);
            } 
            else {
                return("una multiplicación de ambos números y da: "+dato4);
            }
        }

        public double summult (double dato1, double dato2){
            return (dato1+dato2);
        }
        public double multsum (double dato1, double dato2){
            return (dato1*dato2);
        }
        public String bis (double dato1){
            if (dato1 % 4 == 0) {
                if (dato1 % 100 == 0) {
                  if (dato1 % 400 == 0) {
                    return("es bisiesto");
                  } else {
                    return("no es bisiesto");
                  }
                } else {
                  return("es bisiesto");
                }
              } else {
                return("no es bisiesto");
              }
            }
}