public class Horse extends Mammal{
    public Horse(int id, String name) {
        super(id, name, LIVE_BIRTH);
    }


    @Override
    public String getDescription() {
        String s = "Mammal\tHorse";
        return s;
    }
}
