import java.text.DecimalFormat;

/**
 *  
 *  -En esta 'clase' se desarrollan todas las funciones para el desarrollo del algoritmo PSO.
 *  -El algoritmo se desarrolla en los siguientes pasos:
 *      1.- Inicialización
 *      2.- Evaluar la función de ajuste para cada particula
 *      3.- Para cada particula, calcular el valor de velocidad (v) y posición (x)
 *      4.- Evaluar la función de ajuste para encontrar el actual 'global best'
 *  los pasos mencionados teriormente se indicarán (Inicio y Final) en sus respectivas lineas mas adelante.
 *  -Función utilizada para la minimización: f(x) = 10*(x1 - 1)^2 + 20*(x2-2)^2 + 30*(x3-3)^2
 * 
 *  @author Rafael Camacho Roldán *Student account <za18012201@zapopan.tecmm.edu.mx>
 *                                *Personal account <rafacr_@hotmail.com>
 */
class Methods{
    DecimalFormat df = new DecimalFormat("#.###");
    DataSet dataSet = new DataSet();

    double c1=2,c2=2;           //constants values (Aceleration factor)
    double w = Math.random();   //Inertia value between[0,1]

}