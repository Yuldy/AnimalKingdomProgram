public class Bird extends Animal implements Winged {

    public static final BirthType birthType = BirthType.LAYS_EGGS;
    public Bird(int id, String name) {
        super(id, name, birthType);

    }

    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
