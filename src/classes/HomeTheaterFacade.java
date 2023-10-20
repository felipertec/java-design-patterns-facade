package classes;

public class HomeTheaterFacade {
    private Amplifier amp; //amplificador
    private Tuner tun;    // sintonizador
    private DvdPlayer dvd; // dvd player

    public HomeTheaterFacade(Amplifier amp, Tuner tun, DvdPlayer dvd){
        this.amp = amp; 
        this.tun = tun;
        this.dvd = dvd;
    }

    public void watchMovie(){
        System.out.println("Preparando para assistir a um filme...");
        amp.on();
        tun.on();
        dvd.on();
    }

    public void endMovie(){
        System.out.println("Encerrando o filme...");
        amp.off();
        tun.off();
        dvd.off();
    }

    public void pauseMovie(){
        System.out.println("Pausando o filme...");
        amp.pause();
        tun.pause();
        dvd.pause();
    }

    public void startMovie(){
        System.out.println("Iniciando o filme...");
        amp.start();
        tun.start();
        dvd.start();
    }
}
