package CoinConverter;

import javax.swing.JOptionPane;

public class Function {
	CoinsConvert coins = new CoinsConvert();
	public void CoinsConvert(double receivedValue) {
		String options = (JOptionPane.showInputDialog(null, "Choose coin conversion option", "Coins", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Pesos to Dollar", "Pesos to Euro", "Pesos to Pounds", "Pesos to Yen", "Pesos to Won", "Dollar to Pesos","Euro to Pesos",
						"Pounds to Pesos", "Yen to Pesos", "Won to Pesos"}, "Selection")).toString();
		
		switch (options) {
		case "Pesos to Dollar":
			coins.ConvertColpesosToDollars(receivedValue);
			break;
			
		case  "Pesos to Euro":
			coins.ConvertColpesosToEuro(receivedValue);
			break;
				
		case  "Pesos to Pounds":
			coins.ConvertColpesosToPounds(receivedValue);
			break;
			
		case  "Pesos to Yen":
			coins.ConvertColpesosToYen(receivedValue);
			break;
			
		case  "Pesos to Won":
			coins.ConvertColpesosToWon(receivedValue);
			break;
			
		case  "Dollar to Pesos":
			coins.ConvertDollarsToColpesos(receivedValue);
			break;
			
		case  "Euro to Pesos":
			coins.ConvertEuroToColpesos(receivedValue);
			break;
			
		case  "Pounds to Pesos":
			coins.ConvertPoundsToColpesos(receivedValue);
			break;
			
		case  "Yen to Pesos":
			coins.ConvertYenesToColpesos(receivedValue);
			break;
			
		case  "Won to Pesos":
			coins.ConvertWonesToColpesos(receivedValue);
			break;
		/*{
			
			yield type;
		}*/
		default:
			throw new IllegalArgumentException("Unexpected value: " + options);
		}
	}
}

