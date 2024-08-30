//package controller;
//
//import com.jfoenix.controls.JFXTextField;
//import db.DBConnection;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import model.AddItems;
//
//import java.util.List;
//
//public class AddToDoForm {
//
//    @FXML
//    private TableColumn<?, ?> colAllYourToDo;
//
//    @FXML
//    private TableView<AddItems> tblAddToDo;
//
//    @FXML
//    private JFXTextField txtNewTask;
//
//    @FXML
//    void btnAddOnAction(ActionEvent event) {
//        List<AddItems> addItemsList = DBConnection.getInstance().getConnection();
//        addItemsList.add(new AddItems(
//                txtNewTask.getText()
//        ));
//    }
//
//    @FXML
//    void btnRemoveOnAction(ActionEvent event) {
//        colAllYourToDo.setCellValueFactory(new PropertyValueFactory<>("task"));
//
//        List<AddItems> addItemsList = DBConnection.getInstance().getConnection();
//        ObservableList<AddItems> addToDoObservableList = FXCollections.observableArrayList();
//        addItemsList.forEach(obj -> {
//            addToDoObservableList.add(obj);
//        });
//        tblAddToDo.setItems(addToDoObservableList);
//    }
//
//}
package controller;

import com.jfoenix.controls.JFXTextField;
import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.AddItems;

import java.util.List;

public class AddToDoForm {

    @FXML
    private JFXTextField txtNewTask;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String task = txtNewTask.getText();

        AddItems addItems = new AddItems(task);

        List<AddItems> addItemsList = DBConnection.getInstance().getConnection();
        addItemsList.add(addItems);

        clearTxt();
    }

    @FXML
    void btnRemoveOnAction(ActionEvent event) {
        clearTxt();
    }

    private void clearTxt() {
        txtNewTask.setText(null);
    }

}
