public class BelugaWhale extends Whale implements WaterDwellers {
    public BelugaWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        String s ="Mammal\tWhale (lives in water, breathes air)\tBeluga Whale";
        return s;
    }
}
