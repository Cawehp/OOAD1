public class ChangeComputerHDD implements Command {

    Computer comp;
    String hdd;
    String prevHdd;

    public ChangeComputerHDD(Computer comp, String hdd) {
        this.comp = comp;
        this.hdd = hdd;
        prevHdd = comp.getHdd();
    }

    @Override
    public void execute() {
        comp.setHdd(hdd);
    }

    @Override
    public void undo() {
        comp.setHdd(prevHdd);
    }
}
