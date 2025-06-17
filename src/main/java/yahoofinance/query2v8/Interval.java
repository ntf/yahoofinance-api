
package yahoofinance.query2v8;

/**
 *
 * @author Stijn Strickx
 */
public enum Interval {

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
    
    Interval(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return this.tag;
    }
    
}
