package wsStockMarket;

import java.util.ArrayList;

public class StockMarket {
	private ArrayList<Stock> stocks = new ArrayList<>();
	private ArrayList<Trader> traders = new ArrayList<>();
	public StockMarket() {

	}

	public void addStock(Stock s){
		stocks.add(s);
	}

	public void addTrader(Trader t){
		traders.add(t);
	}
	public void register(Trader t, Stock s) {
		s.newTrader(t);
	}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio) {
		return s.notify(t,s, tipo_transaccion, precio);
	}
    
}