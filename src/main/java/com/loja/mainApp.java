package com.loja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class mainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carrega o arquivo FXML
            URL fxmlLocation = getClass().getResource("/views/productView.fxml");
            if (fxmlLocation == null) {
                System.err.println("Arquivo FXML não encontrado: /views/productView.fxml");
                throw new RuntimeException("Arquivo FXML não encontrado: /views/productView.fxml");
            }
            Parent root = FXMLLoader.load(fxmlLocation);

            // título da janela
            primaryStage.setTitle("Emporio São José");

            // tamanho desejado da janela
            Scene scene = new Scene(root, 800, 800);

            // cena para o stage
            primaryStage.setScene(scene);

            // tamanho mínimo da janela
            primaryStage.setMinWidth(400);
            primaryStage.setMinHeight(300);

            // Exibe a Janela
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao carregar a aplicação JavaFX.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
