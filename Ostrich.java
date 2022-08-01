public class Ostrich extends Bird implements Winged{

    public Ostrich(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        String s = "Bird (has wings)\tOstrich (does not fly)";
        return s;
    }

    public boolean canFly() {
        return false;
    }
}

