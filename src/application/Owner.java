package application;

import java.util.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Owner extends Application {

	private String name;
	private int id;
	private int phoneNo;
	private int pin;
	private Date date;
	private String duriation;
	private double totalRent;

	public Owner() {
		date = new Date();
	}

	public Owner(int id, int pin) {
		date = new Date();
		this.id = id;
		this.pin = pin;
	}

	public Owner(String name, int id, int phoneNo, int pin,
			String duriation, double totalRent) {
		date = new Date();
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
		this.pin = pin;
		this.duriation = duriation;
		this.totalRent = totalRent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Date getDate() {
		return date;
	}

	public String getDuriation() {
		return duriation;
	}

	public void setDuriation(String duriation) {
		this.duriation = duriation;
	}

	public double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(double totalRent) {
		this.totalRent = totalRent;
	}
	
	public void login( ) {
		
		Scanner input = new Scanner(System.in);

		this.id=0000;
		this.pin=0000;
		
		System.out.println("enter id and pin: ");
		int inputId = input.nextInt();
		int inputPin = input.nextInt();
		
		if(inputId == this.id && inputPin == this.pin)
			System.out.println("login right");
		else
			System.out.println("wrong id or pin");
		
		///this just a trial i'll edit on that later 
	}
	

	 /*  @Override
	    public void start(Stage primaryStage) throws Exception{
	        primaryStage.setResizable(false);
	        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	        primaryStage.setTitle("login interface");
	        primaryStage.setScene(new Scene(root, 600, 400));
	        primaryStage.show();
	    }*/
	
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	   
	   public static void main(String[] args) {
		launch(args);
	}
	
}




