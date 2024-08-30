package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.AddItems;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewToDoForm implements Initializable {

    @FXML
    private TableColumn<?, ?> colAllYourToDo;

    @FXML
    private TableView<AddItems> tblAddToDo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colAllYourToDo.setCellValueFactory(new PropertyValueFactory<>("task"));

        loadTable();
    }

    @FXML
    void btnReloadOnAction(ActionEvent event) {
        loadTable();
    }

    private void loadTable() {
        ObservableList<AddItems> addItemsObservableList = FXCollections.observableArrayList();

        List<AddItems> dbList = DBConnection.getInstance().getConnection();

        dbList.forEach(obj -> {
            addItemsObservableList.add(obj);
        });

//        addItemsObservableList.add(new AddItems("Learn Javascript"));
        tblAddToDo.setItems(addItemsObservableList);
    }


}
