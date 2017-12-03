package sample.view;

import javafx.scene.control.Button;
import sample.Point;

public class Tile extends Button {
    private final PawnSprite pawnSprite;
    private Point location;

    public Tile(Point location) {
        this.location = location;
        pawnSprite = new PawnSprite();

        setMinSize(50, 50);
        setMaxSize(50, 50);
        setGraphic(pawnSprite);
        setStyle("-fx-focus-color: transparent;");

        onClick();
    }

    public void setBlackImage() {
        pawnSprite.setBlack();
    }

    public void setWhiteImage() {
        pawnSprite.setWhite();
    }

    private void onClick() {
        setOnAction(e -> {
            pawnSprite.setYellow();
        });
    }
}
