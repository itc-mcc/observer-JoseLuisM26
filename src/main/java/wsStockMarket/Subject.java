package wsStockMarket;

public interface Subject {
    public String notify(Trader t, Stock s, String typeTrans, double price);
    public void newTrader(Trader t);
}
