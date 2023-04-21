/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package GUI;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

    


public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        // Crear campos de usuario y contraseña
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        // Crear etiquetas para usuario y contraseña
        Label usernameLabel = new Label("Usuario:");
        Label passwordLabel = new Label("Contraseña:");

        // Crear botón de inicio de sesión
        Button loginButton = new Button("Iniciar Sesión");

        // Agregar eventos al botón de inicio de sesión
        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            // Validar el usuario y contraseña
            if ("usuario".equals(username) && "contraseña".equals(password)) {
                System.out.println("Inicio de sesión exitoso");
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        });

        // Crear diseño de la ventana
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Añadir campos, etiquetas y botón al diseño
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(loginButton, 1, 2);

        // Añadir el diseño a la escena
        Scene scene = new Scene(gridPane, 300, 150);

        // Configurar la fuente de las etiquetas
        Font font = new Font("Arial", 14);
        usernameLabel.setFont(font);
        passwordLabel.setFont(font);

        // Mostrar la escena en la ventana
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
