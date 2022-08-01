public class CaliforniaCondor extends Bird implements Endangered {
    public CaliforniaCondor(int id, String name) {
        super(id, name);
    }


    @Override
    public String getDescription() {
        String s = "Bird (has wings)\tCalifornia Condor (flies, endangered)";
        return s;
    }

    @Override
    public String displayConservationInformation() {
        String s = " says: \"Help save the breathtaking California Condor!\"";
        return s;
    }
}
