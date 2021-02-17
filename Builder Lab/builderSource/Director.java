/**
 * The director which constructs the computers using the construct method
 */
public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    /**
     * Takes a computer and sets each of the parts. Note that not all of these need to be set here,
     * if there were some parts that were the same in all of the computer that could be hard-coded
     * in the get-results methods. Either way works.
     */
    public void construct(){
        builder.setCooler();
        builder.setCase();
        builder.setCPU();
        builder.setGPU();
        builder.setFans();
        builder.setStorage();
        builder.setPSU();
        builder.setMotherBoard();
        builder.setRAM();
    }
}
