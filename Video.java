abstract class Video {
    private String title;
    private int duration;

    public String getInfo() {
        return "\n Titulo: " + title + "\n Duración: " + duration;
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    abstract void play();
}
