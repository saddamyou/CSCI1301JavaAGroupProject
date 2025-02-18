package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CheckoutCartController {
	/***************** Scene Parent, Stage and Scene *******************/
	private Stage stage;
	private Scene scene;
	private Parent root;

	/***************** Scene Components *******************/
	@FXML
	private Label lblLockerRentDetails;
	@FXML
	private Button btnCheckout;
	@FXML
	private Label totalPrice;

	/***************** Scene Objects & Variables *******************/

	/***************** Scene Methods *******************/
	public void checkOut(ActionEvent event) throws IOException {

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentProfile.fxml"));
		root = loader.load();

//		Create Scene2 Instance Controller to load Scene 2, This allow to access the Methods in Scene 2
		StudentProfileController StudentProfileController = loader.getController();

//		Calling "displayName" method from Scene2 to pass the username
		StudentProfileController.displayName("isky");

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void displayRent(double totalPayment) {
		totalPrice.setText("total Payment is: " + totalPayment);
	}
}
