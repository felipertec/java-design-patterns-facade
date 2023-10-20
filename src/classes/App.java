package classes;
public class App {
    public static void main(String[] args) throws Exception {
        Amplifier amp = new Amplifier();
        Tuner tun = new Tuner();
        DvdPlayer dvd = new DvdPlayer();

        //criando homeTheater
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tun, dvd);

        homeTheaterFacade.watchMovie();
        System.out.println("____________________________________________________________");
        homeTheaterFacade.pauseMovie();
        System.out.println("____________________________________________________________");
        homeTheaterFacade.startMovie();
        System.out.println("____________________________________________________________");
        homeTheaterFacade.endMovie();

    }
}
