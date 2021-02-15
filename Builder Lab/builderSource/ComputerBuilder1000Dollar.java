public class ComputerBuilder1000Dollar implements ComputerBuilder{
    Computer computer;

    @Override
    public void setCPU() {
        computer.setCPU("Medium Quality CPU");
    }

    @Override
    public void setGPU() {
        computer.setCPU("Medium Quality GPU");
    }

    @Override
    public void setPSU() {
        computer.setPSU("Medium Quality PSU");
    }

    @Override
    public void setCase() {
        computer.setCase("Medium Quality Case");
    }

    @Override
    public void setRAM() {
        computer.setRAM("Medium Quality RAM");
    }

    @Override
    public void setStorage() {
        computer.setStorage("Medium Quality Storage");
    }

    @Override
    public void setFans() {
        computer.setFans("Medium Quality Fans");
    }

    @Override
    public void setCooler() {
        computer.setCooler("Medium Quality Cooler");
    }

    @Override
    public void setMotherBoard() {
        computer.setMotherboard("Medium Quality Motherboard");
    }
}
