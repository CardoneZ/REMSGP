/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import dataaccessobject.TeacherDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import logic.Teacher;

public class TeachersRegisterController {

    @FXML
    private Label label;

    @FXML
    private ListView<Teacher> teacherListView;

    @FXML
    private ListView<Teacher> directorListView;

    @FXML
    private ListView<Teacher> codirectorListView;

    @FXML
    private Button btnCreateTeacher;

    @FXML
    private Button btnDeleteTeacher;

    @FXML
    private Button btnCreateDirector;

    @FXML
    private Button btnDeleteDirector;

    @FXML
    private Button btnCreateCodirector;

    @FXML
    private Button btnDeleteCodirector;

    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtStaffNumber;

    private TeacherDAO teacherDAO;

    public TeachersRegisterController() {
        teacherDAO = new TeacherDAO();
    }

    @FXML
    public void initialize() {
        try {
            ArrayList<Teacher> teachers = teacherDAO.consultTeacher();
            teacherListView.getItems().addAll(teachers);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
/*
    @FXML
    public void createTeacher() {
        try {
            int userId = Integer.parseInt(txtUserId.getText());
            int staffNumber = Integer.parseInt(txtStaffNumber.getText());
            Teacher teacher = new Teacher(getuserId(), staffNumber());
            boolean created = teacherDAO.createTeacher(teacher);
            if (created) {
                teacherListView.getItems().add(teacher);
                txtUserId.setText("");
                txtStaffNumber.setText("");
            } else {
                // mostrar mensaje de error
            }
        } catch (NumberFormatException ex) {
            // mostrar mensaje de error
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void deleteTeacher() {
        try {
            Teacher teacher = teacherListView.getSelectionModel().getSelectedItem();
            boolean deleted = teacherDAO.deleteTeacher(teacher);
            if (deleted) {
                teacherListView.getItems().remove(teacher);
            } else {
                // mostrar mensaje de error
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void createDirector() {
        // implementar
    }

    @FXML
    public void deleteDirector() {
        // implementar
    }

    @FXML
    public void createCodirector() {
        // implementar
    }

    @FXML
    public void deleteCodirector() {
        // implementar
    }

    @FXML
    public void consultTeacher() {
        // implementar
    }

    @FXML
    public void consultDirector() {
        // implementar
    }

    @FXML
    public void consultCodirector() {
        // implementar
    }

    @FXML
    public void seleccionarUsuario() {
        // implementar
    }
*/
}