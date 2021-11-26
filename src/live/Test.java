package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena obj1  = new Veena();
        Saxophone obj2 = new Saxophone();
        obj1.play();
        obj2.play();
        Playable p1 = obj1,p2 = obj2;
        p1.play();
        p2.play();
    }
}
