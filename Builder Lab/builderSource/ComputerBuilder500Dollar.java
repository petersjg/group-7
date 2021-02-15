public class ComputerBuilder500Dollar implements ComputerBuilder{
    Computer computer;

    @Override
    public void setCPU() {
        computer.setCPU("Low Quality CPU");
    }

    @Override
    public void setGPU() {
        computer.setCPU("Low Quality GPU");
    }

    @Override
    public void setPSU() {
        computer.setPSU("Low Quality PSU");
    }

    @Override
    public void setCase() {
        computer.setCase("Low Quality Case");
    }

    @Override
    public void setRAM() {
        computer.setRAM("Low Quality RAM");
    }

    @Override
    public void setStorage() {
        computer.setStorage("Low Quality Storage");
    }

    @Override
    public void setFans() {
        computer.setFans("Low Quality Fans");
    }

    @Override
    public void setCooler() {
        computer.setCooler("Low Quality Cooler");
    }

    @Override
    public void setMotherBoard() {
        computer.setMotherboard("Low Quality Motherboard");
    }
}
