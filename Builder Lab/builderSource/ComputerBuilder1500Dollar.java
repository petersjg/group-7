public class ComputerBuilder1500Dollar implements ComputerBuilder{
    Computer computer;

    @Override
    public void setCPU() {
        computer.setCPU("High Quality CPU");
    }

    @Override
    public void setGPU() {
        computer.setCPU("High Quality GPU");
    }

    @Override
    public void setPSU() {
        computer.setPSU("High Quality PSU");
    }

    @Override
    public void setCase() {
        computer.setCase("High Quality Case");
    }

    @Override
    public void setRAM() {
        computer.setRAM("High Quality RAM");
    }

    @Override
    public void setStorage() {
        computer.setStorage("High Quality Storage");
    }

    @Override
    public void setFans() {
        computer.setFans("High Quality Fans");
    }

    @Override
    public void setCooler() {
        computer.setCooler("High Quality Cooler");
    }

    @Override
    public void setMotherBoard() {
        computer.setMotherboard("High Quality Motherboard");
    }
}
