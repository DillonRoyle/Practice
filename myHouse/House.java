/**
 * House models a house that can be bought and sold. It stores the
 * type of house, its address, its prices, its home energy rating,
 * its Council Tax Band, its owner details and whether it has a garage.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House
{
    // A brief description of the house, e.g. "4 bed roomed detached".
    private String typeOfHouse;
    // The address of the house, as a single line of text.
    private String address;
    // The price when the house was sold for the first time.
    private int initialPurchasePrice;
    // The price paid by the present owner.
    private int purchasePrice;
    // The home energy rating, from 1 to 5 inclusive.
    private int homeEnergyRating;
    // The Council Tax Band, a letter from A to E.
    private char councilTaxBand;
    // The name of the present owner.
    private String owner;
    // The number of owners this house has had.
    private int numberOfOwners;
    // Whether or not the house has a garage.
    private boolean hasGarage;

    /**
     * Create a new house with the given details. The house has no
     * owner yet, and its purchase price starts at the initial
     * purchase price.
     * @param typeOfHouse A brief description of the house.
     * @param address The address of the house.
     * @param initialPurchasePrice The price when first sold.
     * @param homeEnergyRating The energy rating, from 1 to 5.
     * @param councilTaxBand The Council Tax Band, from A to E.
     * @param hasGarage true if the house has a garage.
     */
    public House(String typeOfHouse, String address, int initialPurchasePrice,
                 int homeEnergyRating, char councilTaxBand, boolean hasGarage)
    {
        this.typeOfHouse = typeOfHouse;
        this.address = address;
        this.initialPurchasePrice = initialPurchasePrice;
        this.homeEnergyRating = homeEnergyRating;
        this.councilTaxBand = councilTaxBand;
        this.hasGarage = hasGarage;
        purchasePrice = initialPurchasePrice;
        owner = "No owner yet";
        numberOfOwners = 0;
        System.out.println(checkHomeEnergyRating());
    }

    /**
     * Return the type of the house.
     */
    public String getType()
    {
        return typeOfHouse;
    }

    /**
     * Set the type of the house.
     * @param typeOfHouse The new description of the house.
     */
    public void setTypeOfHouse(String typeOfHouse)
    {
        this.typeOfHouse = typeOfHouse;
    }

    /**
     * Return the address of the house.
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Set the address of the house.
     * @param address The new address.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Return the initial purchase price of the house.
     */
    public int getInitialPurchasePrice()
    {
        return initialPurchasePrice;
    }

    /**
     * Set the initial purchase price of the house.
     * @param initialPurchasePrice The new initial purchase price.
     */
    public void setInitialPurchasePrice(int initialPurchasePrice)
    {
        this.initialPurchasePrice = initialPurchasePrice;
    }

    /**
     * Return the price paid by the present owner.
     */
    public int getPurchasePrice()
    {
        return purchasePrice;
    }

    /**
     * Set the price paid by the present owner.
     * @param purchasePrice The new purchase price.
     */
    public void setPurchasePrice(int purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    /**
     * Return the home energy rating of the house.
     */
    public int getHomeEnergyRating()
    {
        return homeEnergyRating;
    }

    /**
     * Set the home energy rating of the house.
     * @param homeEnergyRating The new rating, from 1 to 5.
     */
    public void setHomeEnergyRating(int homeEnergyRating)
    {
        this.homeEnergyRating = homeEnergyRating;
    }

    /**
     * Return the Council Tax Band of the house.
     */
    public char getCouncilTaxBand()
    {
        return councilTaxBand;
    }

    /**
     * Set the Council Tax Band of the house.
     * @param councilTaxBand The new band, from A to E.
     */
    public void setCouncilTaxBand(char councilTaxBand)
    {
        this.councilTaxBand = councilTaxBand;
    }

    /**
     * Return the name of the present owner.
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * Set the name of the present owner.
     * @param owner The name of the new owner.
     */
    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    /**
     * Return the number of owners this house has had.
     */
    public int getNumberOfOwners()
    {
        return numberOfOwners;
    }

    /**
     * Set the number of owners this house has had.
     * @param numberOfOwners The new number of owners.
     */
    public void setNumberOfOwners(int numberOfOwners)
    {
        this.numberOfOwners = numberOfOwners;
    }

    /**
     * Return true if the house has a garage.
     */
    public boolean getHasGarage()
    {
        return hasGarage;
    }

    /**
     * Set whether the house has a garage.
     * @param hasGarage true if the house has a garage.
     */
    public void setHasGarage(boolean hasGarage)
    {
        this.hasGarage = hasGarage;
    }

    /**
     * Give the house a new home energy rating, e.g. after adding
     * loft insulation. The rating must be from 1 to 5.
     * @param newRating The new home energy rating.
     */
    public void goingGreener(int newRating)
    {
        if(newRating >= 1 && newRating <= 5) {
            homeEnergyRating = newRating;
        }
        else {
            System.out.println("The rating must be from 1 to 5.");
        }
    }

    /**
     * Print the details of the house to the terminal window,
     * one piece of information on each line.
     */
    public void printDetails()
    {
        System.out.println("House type: " + typeOfHouse);
        System.out.println("Address: " + address);
        System.out.println("Original purchase price in pounds: " + initialPurchasePrice);
        System.out.println("Current price in pounds: " + purchasePrice);
        System.out.println("Home energy rating: " + homeEnergyRating);
        System.out.println("Council Tax Band: " + councilTaxBand);
        System.out.println("Number of owners to date: " + numberOfOwners);
        System.out.println("Current owner: " + owner);
    }

    /**
     * Check the home energy rating of the house.
     * @return A warning if the rating is less than 3, otherwise a
     *         message saying no extra taxes apply.
     */
    public String checkHomeEnergyRating()
    {
        if(homeEnergyRating < 3) {
            return "Be aware that extra green taxes may be imposed on this house";
        }
        else {
            return "This house will not be subject to extra taxes";
        }
    }

    /**
     * Sell the house to a new owner at a new price. This also adds
     * one to the number of owners the house has had.
     * @param newOwner The name of the new owner.
     * @param newPrice The price the new owner paid.
     */
    public void sell(String newOwner, int newPrice)
    {
        owner = newOwner;
        purchasePrice = newPrice;
        numberOfOwners = numberOfOwners + 1;
    }
}
