public class DuckbilledPlatypus extends Mammal{
    public DuckbilledPlatypus(int id, String name) {
        super(id, name, LAYS_EGGS);
    }

    @Override
    public String getDescription() {
        String s = "Mammal\tDuck Billed Platypus";
        return s;
    }
}
