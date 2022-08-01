public class BlueWhale extends Whale implements Endangered{
    public BlueWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        String s = "Mammal\tWhale (lives in water, breathes air)\tBlue Whale (endangered)";
        return s;
    }


    @Override
    public String displayConservationInformation() {
        String s = " says: \"Help save the mighty blue whale!\"";
        return s;
    }
}
