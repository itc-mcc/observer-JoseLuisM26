package wsStockMarket;

public class Trader implements Observer {
String nombre;
	public Trader(String nombre, StockMarket mercado_acciones) {
		this.nombre = nombre;
		mercado_acciones.addTrader(this);
	}

	@Override
	public String update(Trader t, Stock s, String tipo_transaccion, double precio) {
		System.out.println(nombre+":The latest trade is Trader:"+t.nombre+" "+tipo_transaccion+" $"+precio+" Stock: "+s.getTypeTransaction());
		return nombre+":The latest trade is Trader:"+t.nombre+" "+tipo_transaccion+" $"+precio+" Stock: "+s.getTypeTransaction();
	}
}