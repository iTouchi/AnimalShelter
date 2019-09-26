package sample;

import Classes.Animal;
import Classes.AnimalFactory;
import Classes.Gender;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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

    private AnimalFactory animalFactory = new AnimalFactory();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void OnClickAddAnimal(ActionEvent actionEvent) {
        this.createAnimal();
        this.refreshControls();
    }

    public void OnActionAddReservor(ActionEvent actionEvent) {
        Animal animal = (Animal) lvAnimals.getSelectionModel().getSelectedItem();

        if(animal != null){
            animal.reserve(tfReservorName.getText());
            this.refreshControls();
        }
    }

    public void OnActionRbMale(ActionEvent actionEvent) {
        rbFemale.setSelected(false);
    }

    public void OnActionRbFemale(ActionEvent actionEvent) {
        rbMale.setSelected(false);
    }

    private void refreshControls(){
        lvAnimals.getItems().clear();
        lvAnimals.getItems().addAll(animalFactory.getAnimals());
    }

    private void createAnimal(){
        String species = cbSpecies.getSelectionModel().getSelectedItem().toString();
        String name = tfName.getText();
        String badHabits = tfBadHabits.getText();
        Gender gender = getGender();


        if (species.equals("Cat")) {
            animalFactory.createCat(name, gender, badHabits);
        } else if (species.equals("Dog")) {
            animalFactory.createDog(name, gender);
        }
    }

    private Gender getGender() {
        if (rbFemale.isSelected()) {
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
        }
    }
}
