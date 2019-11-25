public class Computer {

    private int cpu;
    private int ram;
    private String hdd;
    private boolean screen;

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public boolean isScreen() {
        return screen;
    }

    public void setScreen(boolean screen) {
        this.screen = screen;
    }

    public static class Builder {
        private int cpu;
        private int ram;
        private String hdd;
        private boolean screen;

        public Builder cpuSpeed(int cpu) {
            this.cpu = cpu;

            return this;
        }

        public Builder ramSize(int ram) {
            this.ram = ram;

            return this;
        }

        public Builder hdSize(String hdd) {
            this.hdd = hdd;

            return this;
        }

        public Builder withScreen(Boolean screen) {
            this.screen = screen;

            return this;
        }

        public Computer build() {
            Computer comp = new Computer();

            comp.cpu = this.cpu;
            comp.hdd = this.hdd;
            comp.ram = this.ram;
            comp.screen = this.screen;

            return comp;
        }


    }

    private Computer() {

    }

    @Override
    public String toString() {
        return "Computer specs: " + "\n screen: " + this.screen + "\n ram size: " + this.ram + "\n hdd size: " + this.hdd + "\n cpu speed: " + this.cpu;
    }
}
