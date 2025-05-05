package hw4.ex1;

public class PopularGrocery extends GroceryItem{

    protected int popularityLevel;
protected int quantity;

    public PopularGrocery(int popularityLevel){
        this.isPopular = true;
        this.popularityLevel = popularityLevel;
    }

    @Override
    public int getBulkDiscount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBulkDiscount'");
    }

    @Override
    public boolean showWarning() {

        return this.quantity < this.householdLimit;

    }

    public void setQuantity(int amount){
        this.quantity = amount;
    }

}