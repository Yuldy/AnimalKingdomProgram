public class GreatWhiteShark extends Fish implements Endangered{

    public static final BirthType LIVE_BIRTH = BirthType.LIVE_BIRTH;
    public GreatWhiteShark(int id, String name) {
        super(id, name, LIVE_BIRTH);
    }

    @Override
    public String getDescription() {
        String s = "Fish (lives in water, does not breathe air)\tGreat White Shark (endangered)";
        return s;
    }

    @Override
    public String displayConservationInformation() {
        String s = " says: \"Help save the great white shark!\"";
        return s;
    }
}
