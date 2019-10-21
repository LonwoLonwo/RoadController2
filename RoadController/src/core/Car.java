package core;

public class Car
{
    private String number;
    private int height;
    private double weight;
    private boolean hasVehicle;
    private boolean isSpecial;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public Car(String carNumber, int carHeight, double carWeight, boolean carHasVehicle)
    {
        number = carNumber;
        height = carHeight;
        weight = carWeight;
        hasVehicle = carHasVehicle;
        isSpecial = false;
    }

    //=========================================================================

    public void setIsSpecial()
    {
        isSpecial = true;
    }

    //=========================================================================

    public String getNumber()
    {
        return number;
    }

    public int getHeight()
    {
        return height;
    }

    public boolean isSpecial()
    {
        return isSpecial;
    }

    public boolean hasVehicle()
    {
        return hasVehicle;
    }

    //=========================================================================

    double getWeight()
    {
        return weight;
    }

    //=========================================================================

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}