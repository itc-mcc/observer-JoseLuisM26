package wsStockMarket;

public interface Observer {
    public String update(Trader t, Stock s, String st, double precio);
}
