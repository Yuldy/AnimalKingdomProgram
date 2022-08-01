public class Whale extends Mammal implements WaterDwellers {
    public Whale (int id, String name) {
        super(id, name, LIVE_BIRTH);
    }

    @Override
    public boolean breathesAir() {
        return true;
    }
}
