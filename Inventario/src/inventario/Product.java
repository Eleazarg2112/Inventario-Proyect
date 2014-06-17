/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventario;

/**
 *
 * @author Gerardo
 */
public class Product {
     private String code;
     private String name;
    private String trademark;
    private String description;
    private String expired;
    private double coste;
    private double price;
    private int amount;
    private int x;
    private int y;
    public Product(){}
    public Product(String code, String name, String trademark, String description, String expired, double coste, double price, int amount, int x)
    {   this.code = code;
        this.name = name;
        this.trademark = trademark;
        this.description = description;
        this.expired = expired;
        this.coste = coste;
        this.price = price;
        this.amount = amount;
        this.x = x;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
      public int getX() {
        return x;
    }
 public void setX(int x) {
        this.x = x;
    }
      public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
