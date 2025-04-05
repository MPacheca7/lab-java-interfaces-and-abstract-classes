public class Netflix {
    public static void main(String[] args) {
        Movie ShowV = new Movie("ShawV", 120, 4.5);
        TvSeries Adolescence = new TvSeries("Adolescence", 65, 4);

        Adolescence.play();
        ShowV.play();
    }
}
