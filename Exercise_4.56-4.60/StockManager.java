import java.util.ArrayList;
import java.util.Iterator;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        boolean productNotInStock = true;
        Iterator<Product> productIt = stock.iterator();
        while(productNotInStock && productIt.hasNext()) {
            if(item.getID() == productIt.next().getID()) {
                productNotInStock = false;
                System.out.println("Product# " + item.getID() + " is already listed in stock");
            }
        }
        if(productNotInStock) {
            stock.add(item);
        }
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount) {
        Product product = findProduct(id);
        product.increaseQuantity(amount);
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id) {
        Product product = findProduct(id);
        int numInStock = 0;
        if(product != null) {
           numInStock = product.getQuantity();
        } else {
            numInStock = 0;
            System.out.println("That Product does not exist.");
        }
        return numInStock;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails() {
        for(Product product : stock) {
            System.out.println(product.toString());
        }
    }

    public Product findProduct(int  id) {
        Product product = null;
        Iterator<Product> productIt = stock.iterator();
        boolean notInList = true;
        while(notInList && productIt.hasNext()) {
            product = productIt.next();
            if(product.getID() == id) {
                notInList = false;
            } else {
                product = null;
            }
        }
        return product;
    }

    public void printLowQuantity(int amount) {
        for(Product product : stock) {
            if(product.getQuantity() < amount) {
                System.out.println(product.toString());
            }
        }
    }

     public Product findProductByName(String name) {
        Product product = null;
        Iterator<Product> productIt = stock.iterator();
        boolean notInList = true;
        while(notInList && productIt.hasNext()) {
            product = productIt.next();
            if(product.getName().equals(name)) {
                notInList = false;
            } else {
                product = null;
            }
        }
        return product;
    }



















}
