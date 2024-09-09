
package yahoofinance.query2v8;

/**
 * @author Stijn Strickx
 */
public enum QueryInterval {
    /*
             period : str
                Valid periods: 1d,5d,1mo,3mo,6mo,1y,2y,5y,10y,ytd,max
                Either Use period parameter or use start and end
            interval : str
                Valid intervals: 1m,2m,5m,15m,30m,60m,90m,1h,1d,5d,1wk,1mo,3mo
                Intraday data cannot extend last 60 days
     */
    DAILY("1d"),
    WEEKLY("5d"),
    MONTHLY("1mo"),
    MINUTE("1m"),
    TWO_MINUTE("2m"),
    FIVE_MINUTE("5m"),
    FIFTEEN_MINUTE("15m"),
    THIRTY_MINUTE("30m"),
    SIXTY_MINUTE("60m"),
    NINETY_MINUTE("90m"),
    HOURLY("1h"),
    THREE_MONTH("3mo");
    private final String tag;

    QueryInterval(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

}
