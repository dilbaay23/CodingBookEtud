package moocInterface;

public class CD implements Packable {
    private String artist;
    private String cdName;
    private double cdWeight;
    private int publicYear;

    public CD(String artist, String cdName, int publicYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicYear= publicYear;
        this.cdWeight =  0.1;
    }

    @Override
    public double weight() {
        return cdWeight;
    }

    @Override
    public String toString() {
        return artist+": "+ cdName + " ("+ publicYear+")";
    }
}
