package hometasks.task3;

class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void record() {
        System.out.println("record");
    }

    public static void main(String[] args) {

        Player player = new Player();
        player.play();
        player.stop();
        player.record();
        player.pause();

    }

}
