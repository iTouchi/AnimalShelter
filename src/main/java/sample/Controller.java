package sample;

import Classes.Gender;
import Classes.Reservation;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.ResponseCache;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ComboBox cbSpecies;
    public TextField tfName;
    public Label lbGender;
    public RadioButton rbMale;
    public RadioButton rbFemale;
    public TextField tfBadHabits;
    public Button btnAddAnimal;
    public Label lbAnimals;
    public ListView lvAnimals;
    public TextField tfReservorName;
    public Button btnReserveAnimal;

    public String species;
    public String name;
    public Gender gender;
    public String badHabits;
    public Reservation reservation = new Reservation();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void OnClickAddAnimal(ActionEvent actionEvent) {

        species = cbSpecies.getSelectionModel().getSelectedItem().toString();
        name = tfName.getText();
        badHabits = tfBadHabits.getText();
        gender = getGender();


        if (species.equals("Cat")) {
            reservation.newCat(name, gender, badHabits);
        } else if (species.equals("Dog")) {
            reservation.newDog(name, gender);
        }

        this.refreshControls();

    }

    public Gender getGender() {
        if (rbFemale.isSelected()) {
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
        }
    }

    public void OnActionRbMale(ActionEvent actionEvent) {
        rbFemale.setSelected(false);
    }

    public void OnActionRbFemale(ActionEvent actionEvent) {
        rbMale.setSelected(false);
    }

    public void refreshControls(){
        lvAnimals.getItems().clear();
//        reservation.getAnimals().forEach((n) -> lvAnimals.getItems().add(n));
        lvAnimals.getItems().addAll(reservation.getAnimals());
    }



}
