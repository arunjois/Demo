/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.scene.control.SingleSelectionModel;
import javafx.stage.Stage;


import java.util.StringJoiner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
/**
 *
 * @author arun
 */
public class Demo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		GridPane grid = new GridPane();
		VBox box = new VBox();
		StringJoiner sj = new StringJoiner(",");
		
		pane.setCenter(grid);
		pane.setBottom(box);
		grid.setVgap(10);
		grid.setHgap(5);
		grid.setPadding(new Insets(10,10,10,10));
		
		/* TextField Labels Of GridPane*/
		Label dd,mm,yy,time, dot = new Label(":");
		Label lmin,lsec;
		TextField date, mon, year, hrs, min, sec;
		grid.add(dd = new Label("Date:"), 0, 0);
		grid.add(date = new TextField(), 1, 0);
		grid.add(mm = new Label("Mon:"), 2, 0);
		grid.add(mon = new TextField(), 3, 0);
		grid.add(yy = new Label("Year:"), 4, 0);
		grid.add(year = new TextField(), 5, 0);
		grid.add(time = new Label("Hrs:"),0, 1);
		grid.add(hrs = new TextField(), 1, 1);
		grid.add(min = new TextField(), 3, 1);
		grid.add(new Label("Min:"),2,1);
		grid.add(sec = new TextField(), 5 ,1);
		grid.add(new Label("Sec:"),4,1);
		date.setStyle("-fx-pref-width: 3em");
		mon.setStyle("-fx-pref-width: 3em");
		year.setStyle("-fx-pref-width: 4em");
		hrs.setStyle("-fx-pref-width: 3em");
		min.setStyle("-fx-pref-width: 3em");
		sec.setStyle("-fx-pref-width: 3em");
		
		
		/*TextField,label for Hbox*/
		Label country = new Label("Country");
		Label Place = new Label("Place");
		ComboBox con = new ComboBox();
		ComboBox pla = new ComboBox();
		Button ok = new Button("OK");
		box.setPadding(new Insets(5,5,5,5));
		box.setSpacing(10);
		box.setPadding(new Insets(20));
		con.getItems().addAll("Afghanistan " , "Aland Islands " , "Albania " , "Algeria " , "American Samoa " , "Andorra " , "Angola " , "Anguilla " , "Antarctica " , "Antigua and Barbuda " , "Argentina " , "Armenia " , "Aruba " , "Australia " , "Austria " , "Azerbaijan " , "Bahamas " , "Bahrain " , "Bangladesh " , "Barbados " , "Belarus " , "Belgium " , "Belize " , "Benin " , "Bermuda " , "Bhutan " , "Bolivia " , "Bonaire, Saint Eustatius and Saba  " , "Bosnia and Herzegovina " , "Botswana " , "Bouvet Island " , "Brazil " , "British Indian Ocean Territory " , "British Virgin Islands " , "Brunei " , "Bulgaria " , "Burkina Faso " , "Burundi " , "Cambodia " , "Cameroon " , "Canada " , "Cape Verde " , "Cayman Islands " , "Central African Republic " , "Chad " , "Chile " , "China " , "Christmas Island " , "Cocos Islands " , "Colombia " , "Comoros " , "Cook Islands " , "Costa Rica " , "Croatia " , "Cuba " , "Curacao " , "Cyprus " , "Czechia " , "Democratic Republic of the Congo " , "Denmark " , "Djibouti " , "Dominica " , "Dominican Republic " , "East Timor " , "Ecuador " , "Egypt " , "El Salvador " , "Equatorial Guinea " , "Eritrea " , "Estonia " , "Ethiopia " , "Falkland Islands " , "Faroe Islands " , "Fiji " , "Finland " , "France " , "French Guiana " , "French Polynesia " , "French Southern Territories " , "Gabon " , "Gambia " , "Georgia " , "Germany " , "Ghana " , "Gibraltar " , "Greece " , "Greenland " , "Grenada " , "Guadeloupe " , "Guam " , "Guatemala " , "Guernsey " , "Guinea " , "Guinea-Bissau " , "Guyana " , "Haiti " , "Heard Island and McDonald Islands " , "Honduras " , "Hong Kong " , "Hungary " , "Iceland " , "India " , "Indonesia " , "Iran " , "Iraq " , "Ireland " , "Isle of Man " , "Israel " , "Italy " , "Ivory Coast " , "Jamaica " , "Japan " , "Jersey " , "Jordan " , "Kazakhstan " , "Kenya " , "Kiribati " , "Kosovo " , "Kuwait " , "Kyrgyzstan " , "Laos " , "Latvia " , "Lebanon " , "Lesotho " , "Liberia " , "Libya " , "Liechtenstein " , "Lithuania " , "Luxembourg " , "Macao " , "Macedonia " , "Madagascar " , "Malawi " , "Malaysia " , "Maldives " , "Mali " , "Malta " , "Marshall Islands " , "Martinique " , "Mauritania " , "Mauritius " , "Mayotte " , "Mexico " , "Micronesia " , "Moldova " , "Monaco " , "Mongolia " , "Montenegro " , "Montserrat " , "Morocco " , "Mozambique " , "Myanmar " , "Namibia " , "Nauru " , "Nepal " , "Netherlands " , "Netherlands Antilles " , "New Caledonia " , "New Zealand " , "Nicaragua " , "Niger " , "Nigeria " , "Niue " , "Norfolk Island " , "North Korea " , "Northern Mariana Islands " , "Norway " , "Oman " , "Pakistan " , "Palau " , "Palestinian Territory " , "Panama " , "Papua New Guinea " , "Paraguay " , "Peru " , "Philippines " , "Pitcairn " , "Poland " , "Portugal " , "Puerto Rico " , "Qatar " , "Republic of the Congo " , "Reunion " , "Romania " , "Russia " , "Rwanda " , "Saint Barthelemy " , "Saint Helena " , "Saint Kitts and Nevis " , "Saint Lucia " , "Saint Martin " , "Saint Pierre and Miquelon " , "Saint Vincent and the Grenadines " , "Samoa " , "San Marino " , "Sao Tome and Principe " , "Saudi Arabia " , "Senegal " , "Serbia " , "Serbia and Montenegro " , "Seychelles " , "Sierra Leone " , "Singapore " , "Sint Maarten " , "Slovakia " , "Slovenia " , "Solomon Islands " , "Somalia " , "South Africa " , "South Georgia and the South Sandwich Islands " , "South Korea " , "South Sudan " , "Spain " , "Sri Lanka " , "Sudan " , "Suriname " , "Svalbard and Jan Mayen " , "Swaziland " , "Sweden " , "Switzerland " , "Syria " , "Taiwan " , "Tajikistan " , "Tanzania " , "Thailand " , "Togo " , "Tokelau " , "Tonga " , "Trinidad and Tobago " , "Tunisia " , "Turkey " , "Turkmenistan " , "Turks and Caicos Islands " , "Tuvalu " , "U.S. Virgin Islands " , "Uganda " , "Ukraine " , "United Arab Emirates " , "United Kingdom " , "United States " , "United States Minor Outlying Islands " , "Uruguay " , "Uzbekistan " , "Vanuatu " , "Vatican " , "Venezuela " , "Vietnam " , "Wallis and Futuna " , "Western Sahara " , "Yemen " ,"Zambia " ,"Zimbabwe ");
		con.setVisibleRowCount(20);	
		
		Query sql = new Query();
		String str = con.getSelectionModel().selectedItemProperty().toString();
		sql.getCountryIso(con.getSelectionModel().selectedItemProperty().toString());
		String temp = new String();
		List<String> al = new ArrayList<String>();
		al = sql.getCountryIso(str);
	
		String[] places = al.toArray(new String[al.size()]);	
		
		for(int i=0;i<places.length;i++)	
			pla.getItems().add(places[i]);
		
		
		
		con.setStyle("-fx-pref-width: 10em");
		pla.setStyle("-fx-pref-width: 10em");
		box.getChildren().addAll(country, con, Place, pla, ok);
		
		
		ok.setOnAction(t->process());
		
		
		Scene root = new Scene(pane, 400, 300);
		primaryStage.setScene(root);
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	public void process() {
	
		
		
		
		
	}
}
