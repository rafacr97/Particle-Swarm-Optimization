import java.text.DecimalFormat;

/**
 *  
 *  @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 */
class PSO{
    

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        Methods m = new Methods();
        DataSet ds = new DataSet();

        //STEP 1 
        ds.setX_values(m.initPopulation());
        ds.setVelocity(m.initVelocity());
        ds.setX_values(m.initPosition( ds.getX_values(), ds.getVelocity()) );
        ds.setpBest(m.initPBest(ds.getX_values()));
            System.out.println("\nPositions and velocity have been initialized");
        //STEP 2
        ds.setFitnessFuntion(m.calculateFitnessFuntion(ds.getX_values()));
        ds.setMinFitnessValue(m.fitnessValue(ds.getFitnessFuntion()));
        ds.setgBest(m.calculateGlobalBest(ds.getFitnessFuntion(), ds.getMinFitnessValue(),ds.getX_values()));
            
        System.out.println("\nBest fitness value: "+df.format(ds.getMinFitnessValue()));
        System.out.println("\nGlobal best values: ");
            m.showArray(ds.getgBest());

        ds.setVelocity(m.updateVelocity(ds.getVelocity(), ds.getX_values(), ds.getpBest(), ds.getgBest()));
        ds.setX_values(m.updatePosition(ds.getVelocity(), ds.getX_values()));
    }
}