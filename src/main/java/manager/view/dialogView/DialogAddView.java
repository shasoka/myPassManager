package manager.view.dialogView;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import manager.controller.ControllerFactory;
import manager.controller.ManagerController;
import manager.controller.DialogAddController;
import manager.model.PassDbModel;
import manager.view.View;

import java.io.IOException;
import java.sql.SQLException;

public class DialogAddView extends DialogView {

    public DialogAddView(Stage stage, ManagerController parent) {
        super(stage, parent);
    }

    @Override
    public void show() throws IOException, SQLException {
        super.show();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/manager/view/addDialog.fxml"));
//        loader.setController(new DialogAddController(PassDbModel.getInstance(), this));
////        loader.setControllerFactory(new ControllerFactory(PassDbModel.getInstance(), this));
//        Parent dialog = loader.load();
//
//        Stage parentStage = stage;
//        parentStage.getScene().getRoot().setDisable(true);
//
//        stage = new Stage();
//        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.setScene(new Scene(dialog));
//        stage.setResizable(false);
//        stage.showAndWait();
//
//        parentStage.getScene().getRoot().setDisable(false);
    }

}
