package com.example.keeptoov2.controllers;

import com.example.keeptoov2.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnAllItems;

    @FXML
    private Button btnCard;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnFavourites;

    @FXML
    private Button btnIdentity;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnPersonal;

    @FXML
    private Button btnSecureNote;

    @FXML
    private Button btnSocial;

    @FXML
    private Button btnTrash;

    @FXML
    private Button btnWork;

    @FXML
    private ImageView ivLogo;

    @FXML
    private Label lblCompanyName;

    @FXML
    private Label lblNotes;

    @FXML
    private Label lblWebsite;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfSearch;

    @FXML
    private TextField tfUsername;

    @FXML
    private VBox vItems;

    @FXML
    void handleButtonClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(Application.class.getResource("fxml/mainitem.fxml"));
            Node[] nodes = new Node[5];

            for (int i = 0; i < nodes.length; i++) {
                nodes[i] = loader.load();
                final int h = i;

                nodes[i].setOnMouseEntered(event -> nodes[h].setStyle("-fx-background-color: #165DDB"));
                nodes[i].setOnMouseExited(event -> nodes[h].setStyle("-fx-background-color: #1E1E1E"));

                vItems.getChildren().add(nodes[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
