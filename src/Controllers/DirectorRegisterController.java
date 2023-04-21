/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import dataaccessobject.DirectorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import logic.Director;

public class DirectorRegisterController {

    @FXML
    private TextField idTeacherTextField;

    @FXML
    private TextField staffNumberTextField;

    @FXML
    private Button createDirectorButton;

    @FXML
    private ListView<String> directorsListView;

    @FXML
    private Button deleteDirectorButton;

    private DirectorDAO directorDAO;

    @FXML
    public void initialize() throws SQLException {
        directorDAO = new DirectorDAO();
        showDirectors();
        directorsListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        deleteDirectorButton.setDisable(false);
                    }
                });
    }

    @FXML
    void createDirector() {
        int idTeacher = Integer.parseInt(idTeacherTextField.getText());
        int staffNumber = Integer.parseInt(staffNumberTextField.getText());
        Director director = new Director();
        director.setTeacherId(idTeacher);
        director.setIdDirector(staffNumber);
        try {
            boolean created = directorDAO.createDirector(director);
            if (created) {
                showDirectors();
                clearFields();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        createDirectorButton.setDisable(true); 
    }

    @FXML
    void deleteDirector() {
        String selectedDirector = directorsListView.getSelectionModel().getSelectedItem();
        try {
            directorDAO.deleteDirector(Integer.parseInt(selectedDirector));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void showDirectors() throws SQLException {
        DirectorDAO directorDAO = new DirectorDAO();
        directorsListView.getItems().clear();
        for(Director directorObject : directorDAO.consultDirector()) {
           directorsListView.getItems().add(String.valueOf(directorObject.getIdDirector()));
        }
    }
      
    private void clearFields() {
        idTeacherTextField.setText("");
        staffNumberTextField.setText("");
    }

}