public class Fish extends Animal implements WaterDwellers{

    public Fish(int id, String name, BirthType birthType) {
        super(id, name, birthType);
    }

    @Override
    public boolean isWarmBlooded() {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public boolean breathesAir() {
        return false;
    }
}
