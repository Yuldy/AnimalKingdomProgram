public class Parakeet extends Bird{
    public Parakeet(int id, String name) {
        super(id, name);
    }
    @Override
    public String getDescription() {
        String s = "Bird (has wings)\tParakeet (flies)";
        return s;
    }
}


