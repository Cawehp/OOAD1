public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder()
                .cpuSpeed(3)
                .ramSize(8)
                .hdSize("128GB")
                .withScreen(false)
                .build();

        System.out.println(comp.toString());

        CommandManager manager = CommandManager.getInstance();
        manager.execute(new ChangeComputerRam(comp, 16));
        System.out.println(comp);
        manager.undo();
        System.out.println(comp);
        manager.redo();

        manager.execute(new ChangeComputerHDD(comp, "250GB"));
        System.out.println(comp);
        manager.undo();
        System.out.println(comp);
        manager.redo();
        System.out.println(comp);
    }

}
