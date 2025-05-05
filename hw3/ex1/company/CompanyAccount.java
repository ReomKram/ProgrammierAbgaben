package hw3.ex1.company;
import hw3.ex1.*;
import java.util.Objects;

public class CompanyAccount extends Account {

    public CompanyAccount(String owner, int pin) {
        super(owner, pin);
        this.balance = 0.0;

        /* the access to the internalNote variable fails because the Variable is only package visible.
        *   only classes within the package can see the variable
        * this.internalNote = "";
        */ 
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CompanyAccount)) {
            return false;
        }
        CompanyAccount companyAccount = (CompanyAccount) o;
        return Objects.equals(this, companyAccount);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }
    
}
