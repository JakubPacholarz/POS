package automat;

public class PRZEDMIOT {
    private int amount;

    public PRZEDMIOT(int amount)
    {
        this.amount = amount;

    }
    public void add(int amount)
    {
        this.amount += amount;
    }
    public void substract(int amount)
    {
        this.amount -= amount;
    }

    public String size() {
        return String.valueOf(this.amount);
    }


}
