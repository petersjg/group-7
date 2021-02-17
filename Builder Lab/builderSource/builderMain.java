import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class builderMain {
    private static Computer computer;

    /**
     * Standard main method to demonstrate our code
     * @param args ignored
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //Creating the builders
        ComputerBuilder builder500Dollar = new ComputerBuilder500Dollar();
        ComputerBuilder builder1000Dollar = new ComputerBuilder1000Dollar();
        ComputerBuilder builder1500Dollar = new ComputerBuilder1500Dollar();
        //Creating all of the directors and passing the relevant builder to each
        Director director500Dollar = new Director(builder500Dollar);
        Director director1000Dollar = new Director(builder1000Dollar);
        Director director1500Dollar = new Director(builder1500Dollar);

        System.out.println("Please enter a computer option 1)500  2)1000  3)1500");

        int option = scanner.nextInt();

        //In the switch, different builders get their result (a computer) and save it to the member computer variable
        switch(option) {
            case 1:
                director500Dollar.construct();
                computer = builder500Dollar.getResult();
                computer.printConfig();
                computer = builder500Dollar.getResult();
                break;
            case 2:
                director1000Dollar.construct();
                computer = builder1000Dollar.getResult();
                break;
            case 3:
                director1500Dollar.construct();
                computer = builder1500Dollar.getResult();
                break;
        }
        boolean dialogEnd = false;
        String answer = "";
        scanner = new Scanner(System.in);
        //Basic dialog sequence allowing a user to change each part of the computor if they would so choose to do so
        while(!dialogEnd){
            System.out.println("The current configuration: \n");
            computer.printConfig();
            if(!answer.equalsIgnoreCase("n")){
                System.out.println("Would you like to change this configuration? y/n");
                answer = scanner.nextLine();
            } else{
                answer = "y";
            }
            if(answer.equalsIgnoreCase("y")){
                System.out.println("What item would you like to change?");
                changePart(scanner);
                computer.printConfig();
                System.out.println("Is this configuration to your satisfaction? y/n");
                answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    dialogEnd = true;
                }
            }else{
                dialogEnd = true;
            }
        }
    }

    /**
     * Change part dialog sequence
     * @param scanner scanner which takes System.in as its input
     */
    public static void changePart(Scanner scanner){
        String answer = scanner.nextLine();
        System.out.println("What would you like to change this part to?");
        String newPart = scanner.nextLine();

        switch(answer.toLowerCase()) {
            case "cpu":
                computer.setCPU(newPart);
                break;
            case "gpu":
                computer.setGPU(newPart);
                break;
            case "psu":
                computer.setPSU(newPart);
                break;
            case "ram":
                computer.setRAM(newPart);
                break;
            case "case":
                computer.setCase(newPart);
                break;
            case "storage":
                computer.setStorage(newPart);
                break;
            case "fans":
                computer.setFans(newPart);
                break;
            case "cooler":
                computer.setCooler(newPart);
                break;
            case "motherboard":
                computer.setMotherboard(newPart);
                break;
        }
    }


}
