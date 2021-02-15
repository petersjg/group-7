public class builderMain {

    public void main(String[] args){
        ComputerBuilder builder500Dollar = new ComputerBuilder500Dollar();
        ComputerBuilder builder1000Dollar = new ComputerBuilder1000Dollar();
        ComputerBuilder builder1500Dollar = new ComputerBuilder1500Dollar();

        Director director500Dollar = new Director(builder500Dollar);
        Director director1000Dollar = new Director(builder1000Dollar);
        Director director1500Dollar = new Director(builder1500Dollar);


    }
}
