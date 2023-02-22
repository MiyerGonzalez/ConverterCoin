package CoinConverter;

import javax.swing.JOptionPane;

public class CoinsConvert {
	public void ConvertColpesosToDollars(double receivedValue){ 
		double dollarCoin = receivedValue / 4900.53;
		dollarCoin = (double) Math.round(dollarCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + dollarCoin + " Dollars");
	}
	
	public void ConvertColpesosToEuro(double receivedValue){ 
		double euroCoin = receivedValue / 5050.89;
		euroCoin = (double) Math.round(euroCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + euroCoin + " Euros");
	}
	
	public void ConvertColpesosToPounds(double receivedValue){ 
		double poundsCoin = receivedValue / 5897.44;
		poundsCoin = (double) Math.round(poundsCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + poundsCoin + " Pounds");
	}
	
	public void ConvertColpesosToYen(double receivedValue){ 
		double yenCoin = receivedValue / 36.51;
		yenCoin = (double) Math.round(yenCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + yenCoin + " Yenes");
	}
	
	public void ConvertColpesosToWon(double receivedValue){ 
		double wonCoin = receivedValue / 3.79;
		wonCoin = (double) Math.round(wonCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + wonCoin + " Wones");
	}
	
	public void ConvertDollarsToColpesos(double receivedValue){ 
		double pesoCoin = receivedValue * 4900.53;
		pesoCoin = (double) Math.round(pesoCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + pesoCoin + " Pesos");
	}
	
	public void ConvertEuroToColpesos(double receivedValue){ 
		double pesoCoin = receivedValue * 5050.89;
		pesoCoin = (double) Math.round(pesoCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + pesoCoin + " Pesos");
	}
	
	public void ConvertPoundsToColpesos(double receivedValue){ 
		double pesoCoin = receivedValue * 5897.44;
		pesoCoin = (double) Math.round(pesoCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + pesoCoin + " Pesos");
	}
	
	public void ConvertYenesToColpesos(double receivedValue){ 
		double pesoCoin = receivedValue * 36.51;
		pesoCoin = (double) Math.round(pesoCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + pesoCoin + " Pesos");
	}
	
	public void ConvertWonesToColpesos(double receivedValue){ 
		double pesoCoin = receivedValue * 3.79;
		pesoCoin = (double) Math.round(pesoCoin*100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + pesoCoin + " Pesos");
	}
	
}
