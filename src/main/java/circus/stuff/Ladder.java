package circus.stuff;

<<<<<<< HEAD:src/main/java/circus/stuff/Ladder.java
public class Ladder extends Equipment {
=======
import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>> 8149490d17fb8c4450de7fb0ea91099477b47b75:src/main/java/Ladder.java

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
