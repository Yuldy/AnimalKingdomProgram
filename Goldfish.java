public class Goldfish extends Fish  {

    public static final BirthType LAYS_EGGS = BirthType.LAYS_EGGS;

    public Goldfish(int id, String name) {
        super(id, name, LAYS_EGGS);
    }

    @Override
    public String getDescription() {
        String s = "Fish (lives in water, does not breathe air)\tGoldfish";
        return s;
    }
}
