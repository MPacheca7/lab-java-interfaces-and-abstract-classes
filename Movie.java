public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);

        this.rating = rating;
    }

    @Override
    void play() {
        System.out.println(getInfo() + "\n Calificacion: " + rating + "⭐⭐⭐⭐");
    }
}
