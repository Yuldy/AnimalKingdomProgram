public class Elephant extends Mammal implements Endangered{
    public Elephant(int id, String name) {
        super(id, name, LIVE_BIRTH);
    }

    @Override
    public String getDescription() {
        String s = "Mammal Elephant (endangered)";
        return s;
    }

    @Override
    public String displayConservationInformation() {
        String s = " says: \"Help save the beautiful elephants!\"";
        return s;
    }
}
