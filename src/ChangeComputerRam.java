public class ChangeComputerRam implements  Command {

    Computer comp;
    int ram;
    int prevRam;

    public ChangeComputerRam(Computer comp, int ram) {
        this.comp = comp;
        this.ram = ram;
        prevRam = comp.getRam();
    }

    @Override
    public void execute() {
        comp.setRam(ram);
    }

    @Override
    public void undo() {
        comp.setRam(prevRam);
    }
}
