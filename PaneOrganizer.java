package codeAlong4;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

  private BorderPane root;
  private Alien alien;

  public PaneOrganizer() {
    this.root = new BorderPane();
    Pane alienPane = new Pane();
    this.root.setCenter(alienPane);
    HBox buttonPane = new HBox();
    this.root.setBottom(buttonPane);
    this.alien = new Alien(alienPane);
    this.setUpButtons(buttonPane);
  }

  private void setUpButtons(HBox buttonPane) {
    ArrayExample a = new ArrayExample();
    Button b1 = new Button("Move Left!");
    Button b2 = new Button("Move Right!");
    Button b3 = new Button("Arrays!");
    Button b4 = new Button ("ArrayLists!");
    buttonPane.getChildren().addAll(b1, b2, b3, b4);
    buttonPane.setSpacing(Constants.BUTTON_SPACING);
    buttonPane.setAlignment(Pos.CENTER);
    b1.setOnAction((ActionEvent e) -> this.alien.moveLeft());
    b2.setOnAction((ActionEvent e) -> this.alien.moveRight());
//    System.out.println("b1: " + b1);
//    System.out.println("b2: " + b2);
//    System.out.println("alien: " + this.alien);
    b3.setOnAction((ActionEvent e) -> a.printArray());
    b4.setOnAction((ActionEvent e) -> a.changeArrayList());
  }

  public Pane getRoot() {
    return this.root;
  }
}
