public class Mammal extends Animal{

    public static final BirthType LAYS_EGGS = BirthType.LAYS_EGGS;
    public static final BirthType LIVE_BIRTH = BirthType.LIVE_BIRTH;
    public Mammal(int id, String name, BirthType birthType) {
        super(id, name, birthType);
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
