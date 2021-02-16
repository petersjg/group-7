import java.util.Scanner;

public class builderMain {
    private static Computer computer;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ComputerBuilder builder500Dollar = new ComputerBuilder500Dollar();
        ComputerBuilder builder1000Dollar = new ComputerBuilder1000Dollar();
        ComputerBuilder builder1500Dollar = new ComputerBuilder1500Dollar();

        Director director500Dollar = new Director(builder500Dollar);
        Director director1000Dollar = new Director(builder1000Dollar);
        Director director1500Dollar = new Director(builder1500Dollar);

        System.out.println("Please enter a computer option 1)500  2)1000  3)1500");

        int option = scanner.nextInt();

        switch(option) {
            case 1:
                computer = builder500Dollar.getResult();
                director500Dollar.construct();
                break;
            case 2:
                computer = builder1000Dollar.getResult();
                director1000Dollar.construct();
                break;
            case 3:
                computer = builder1500Dollar.getResult();
                director1500Dollar.construct();
                break;
        }
    }
}
