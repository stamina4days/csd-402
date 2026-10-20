/*
 * Name: Prince Hubbard
 * Date: October 20, 2026
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 11.2 - JavaFX HBox and VBox
 * File: HubbardLayoutDemo.java
 * Purpose: Demonstrate nested HBox and VBox layouts in a working task list.
 * References:
 * https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/HBox.html
 * https://openjfx.io/javadoc/21/javafx.graphics/javafx/scene/layout/VBox.html
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** Demonstrates row and column layouts without fixed control coordinates. */
public class HubbardLayoutDemo extends Application {
    /**
     * Builds the controls, assigns layout constraints, and shows the window.
     * @param stage the primary application window supplied by JavaFX
     */
    @Override
    public void start(Stage stage) {
        Label heading = new Label("Task List");
        Label instructions = new Label("Enter a task, then click Add or press Enter.");
        TextField taskInput = new TextField();
        taskInput.setPromptText("Type a task");
        taskInput.setAccessibleText("Task to add");
        Button addButton = new Button("Add");
        Button clearButton = new Button("Clear");
        ListView<String> tasks = new ListView<>();
        Label status = new Label("No tasks added yet.");
        status.setWrapText(true);

        // HBox example: keep the input and related actions in one row.
        HBox entryRow = new HBox(10, taskInput, addButton, clearButton);
        entryRow.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(taskInput, Priority.ALWAYS);
        taskInput.setMaxWidth(Double.MAX_VALUE);

        // VBox example: stack sections with consistent spacing and padding.
        VBox root = new VBox(12, heading, instructions, entryRow, tasks, status);
        root.setPadding(new Insets(20));
        root.setFillWidth(true);
        VBox.setVgrow(tasks, Priority.ALWAYS);
        tasks.setMaxHeight(Double.MAX_VALUE);

        // Both actions share one method so validation stays consistent.
        addButton.setOnAction(event -> addTask(taskInput, tasks, status));
        taskInput.setOnAction(event -> addTask(taskInput, tasks, status));
        clearButton.setOnAction(event -> {
            tasks.getItems().clear();
            status.setText("All tasks cleared.");
            taskInput.requestFocus();
        });

        stage.setTitle("Prince Hubbard - HBox and VBox Demo");
        stage.setScene(new Scene(root, 620, 420));
        stage.setMinWidth(480);
        stage.setMinHeight(300);
        stage.show();
        taskInput.requestFocus();
    }

    /**
     * Validates and adds a task, then provides visible feedback.
     * @param input the field containing the proposed task
     * @param tasks the list displaying tasks for the current session
     * @param status the label used for feedback
     */
    private void addTask(TextField input, ListView<String> tasks, Label status) {
        String task = input.getText().trim();
        if (task.isEmpty()) {
            status.setText("Please enter a task before adding it.");
        } else {
            tasks.getItems().add(task);
            status.setText("Added: " + task);
            input.clear();
        }
        input.requestFocus();
    }

    /**
     * Launches the JavaFX application.
     * @param args optional command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
