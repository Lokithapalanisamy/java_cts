interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar: Strum strum!");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano: Plink plink!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        
        guitar.play();
        piano.play();
    }
}