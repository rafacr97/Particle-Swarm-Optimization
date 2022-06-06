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
        int t=0;

        do{
            if(t==0){
                //STEP 1 
                    ds.setX_values(m.initPopulation());
                    ds.setVelocity(m.initVelocity());
                    ds.setX_values(m.initPosition( ds.getX_values(), ds.getVelocity()) );
                    ds.setpBest(m.initPBest(ds.getX_values()));
                //STEP 2
                    ds.setFitnessFuntion(m.calculateFitnessFuntion(ds.getX_values()));
                    ds.setMinFitnessValue(m.fitnessValue(ds.getFitnessFuntion()));
                    ds.setgBest(m.calculateGlobalBest(ds.getFitnessFuntion(), ds.getMinFitnessValue(),ds.getX_values()));
            }else{
                //STEP 3
                    ds.setVelocity(m.updateVelocity(ds.getVelocity(), ds.getX_values(), ds.getpBest(), ds.getgBest()));
                    ds.setX_values(m.updatePosition(ds.getVelocity(), ds.getX_values()));
                //STEP 4
                    ds.setMinFitnessValue(m.updateFitnessValue(ds.getMinFitnessValue(), m.calculateFitnessFuntion(ds.getX_values())));
                    ds.setgBest(m.calculateGlobalBest(m.calculateFitnessFuntion(ds.getX_values()), ds.getMinFitnessValue(), ds.getX_values())); 
                    ds.setpBest(m.updatePBest(ds.getX_values(), ds.getpBest(), ds.getFitnessFuntion(), m.calculateFitnessFuntion(ds.getX_values())));
            }
                //STEP 5
                t++;
                //STEP 6
                System.out.println("\nBest particle: "); m.showArray(ds.getgBest());
                System.out.println("Global best: "+df.format(ds.getMinFitnessValue()));
        }while(t<m.iterations);
    }
}