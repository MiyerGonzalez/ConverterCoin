package CoinConverter;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		Function coins = new Function();
		String options = (JOptionPane.showInputDialog(null, "Choose conversion option", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Coin Converter", "Temperature Converter"}, "Selection")).toString();
		
		switch (options) {
		case "Coin Converter": {
			
			String input = JOptionPane.showInputDialog("Enter the value to convert");
			double receivedValue = Double.parseDouble(input);
			coins.CoinsConvert(receivedValue);
			
			
			int selection = JOptionPane.showConfirmDialog(null, "Do you want to restart the converter?");
			if (JOptionPane.OK_OPTION == selection) {
				Main.main(null);
			}else {
				JOptionPane.showMessageDialog(null, "End of Process");
			}break;
		}
		
		case "Temperature Converter": {
			
			String input = JOptionPane.showInputDialog("Enter the temperature to convert");
		}

		}
	}

}
