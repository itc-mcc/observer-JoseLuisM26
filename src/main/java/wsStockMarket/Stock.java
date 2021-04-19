package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
	private String typeTransaction;
	private double iniPrice;
	private ArrayList<Trader> traders = new ArrayList<>();

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		typeTransaction = tipo;
		iniPrice = precio_inicial;
		mercado_acciones.addStock(this);

	}

	@Override
	public String notify(Trader t, Stock s, String typeTrans, double price) {
		StringBuilder com = new StringBuilder();
		for (Trader tr: traders) {
			com.append(tr.update(t, s, typeTrans, price)).append("\n");
		}
		com.deleteCharAt(com.length()-1);
		return com.toString();
	}

	@Override
	public void newTrader(Trader t) {
		traders.add(t);
	}

	public String getTypeTransaction() {
		return typeTransaction;
	}
}