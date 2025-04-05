public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    void play() {
        System.out.println(getInfo() + "min" + "\n Episodios: " + episodes);
    }
}
