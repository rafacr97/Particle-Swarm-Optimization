/**
 *  
 *  @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 */
public class DataSet {
    private int particles = 17;  //Quantity of parcles in x1, x2, x3 ... Xn-1
    private int x=3;  // Quanty of 'X' in array
    
    private double [][]x_values=new double [particles][x];
    private double [][]velocity=new double [particles][x];
    
    private double []fitnessValue = new double[particles];   //Array to save the value result of the funtion using particles in x1, x2, x3 ... Xn-1
    private double [][]pBest = new double[particles][x]; //Matrix to save 'Personal Best Values' values
    private double []gBest = new double[x];
    private double minimunFitnessValue;

    public double getMinimunFitnessValue() {
        return minimunFitnessValue;
    }

    public void setMinimunFitnessValue(double minimunFitnessValue) {
        this.minimunFitnessValue = minimunFitnessValue;
    }
    
    public double[] getgBest() {
        return gBest;
    }

    public void setgBest(double[] gBest) {
        this.gBest = gBest;
    }
    

    public double[][] getpBest() {
        return pBest;
    }

    public void setpBest(double[][] pBest) {
        this.pBest = pBest;
    }
    
    public double[][] getX_values() {
        return x_values;
    }

    public void setX_values(double[][] x_values) {
        this.x_values = x_values;
    }

    public double[][] getVelocity() {
        return velocity;
    }

    public void setVelocity(double[][] velocity) {
        this.velocity = velocity;
    }

    public double[] getFitnessValue() {
        return fitnessValue;
    }

    public void setFitnessValue(double[] fitnessValue) {
        this.fitnessValue = fitnessValue;
    }
}
