package hw4.ex1;

public abstract class Article {

    protected int discountThreshold = 5;

    protected int householdLimit = 20;

    public abstract int getBulkDiscount();

    public abstract boolean showWarning();

    /**
     * @return int return the discountThreshold
     */
    public int getDiscountThreshold() {
        return discountThreshold;
    }

    /**
     * @param discountThreshold the discountThreshold to set
     */
    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    /**
     * @return  return the householdLimit
     */
    public int getHouseholdLimit() {
        return householdLimit;
    }

    /**
     * @param householdLimit the householdLimit to set
     */
    public void setHouseholdLimit(int householdLimit) {
        this.householdLimit = householdLimit;
    }

}
