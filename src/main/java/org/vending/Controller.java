package org.vending;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    public Label itemName;
    @FXML
    public Label price;

    @FXML
    private ListView<Task> listView;

    @FXML
    private MenuBar menuBar;

    @FXML
    private void initialize() {

        ObservableList<Task> wordsList = FXCollections.observableArrayList();
        wordsList.add(new Task("Banana 1KG Packed", "attendant", "RM 4.00","description", 0));
        wordsList.add(new Task("Apple 1KG Packed", "attendant2", "RM 4.00","description", 1));
        wordsList.add(new Task("Orange 1KG Packed", "attendant3", "RM 4.00","description", 2));
        wordsList.add(new Task("Banana 1KG Packed", "attendant", "RM 4.00","description", 0));
        wordsList.add(new Task("Apple 1KG Packed", "attendant2", "RM 4.00","description", 1));
        wordsList.add(new Task("Orange 1KG Packed", "attendant3", "RM 4.00","description", 2));
        wordsList.add(new Task("Banana 1KG Packed", "attendant", "RM 4.00","description", 0));
        wordsList.add(new Task("Apple 1KG Packed", "attendant2", "RM 4.00","description", 1));
        wordsList.add(new Task("Orange 1KG Packed", "attendant3", "RM 4.00","description", 2));
        listView.setItems(wordsList);

        listView.setCellFactory(new TaskCellFactory());
        MultipleSelectionModel<Task> selectionModel = listView.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);
        selectionModel.selectedItemProperty().addListener((observableValue, oldTask, task) -> {

            itemName.setText(task.getTitle());
            price.setText(task.getComment());
        });

        Menu menu = menuBar.getMenus().get(0);
        ObservableList<MenuItem> menus = menu.getItems();

//        while (menus.iterator().hasNext()){
//            MenuItem menuItem = menus.iterator().next();
//            menuItem.setOnAction(actionEvent -> {
//                Stage stage = new Stage();
//                FileChooser fileChooser = new FileChooser();
//                fileChooser.setInitialDirectory(new File("src"));
//                fileChooser.setInitialFileName("myfile.txt");
//
//                fileChooser.getExtensionFilters().addAll(
//                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
//                        ,new FileChooser.ExtensionFilter("HTML Files", "*.htm")
//                );
//
//                Button button = new Button("Select File");
//                button.setOnAction(e -> {
//                    File selectedFile = fileChooser.showOpenDialog(stage);
//
//                    System.out.println(selectedFile.getAbsolutePath());
//                });
//
//
//                VBox vBox = new VBox(button);
//                Scene scene = new Scene(vBox, 960, 600);
//                stage.setScene(scene);
//                stage.show();
//            });
//        }
    }
}