package com.product.product.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Product_TBL")
public class ProductEntity {
    @Id // This tells Hibernate to make a column for id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer prod_id;
    @Column(name = "prod_name")
    private String prod_name;
    @Column(name = "prod_desc")
    private String prod_desc;
    @Column(name = "prod_price")
    private Integer prod_price;
    @Column(name = "prod_qty")
    private Integer prod_qty;

    public ProductEntity(Integer prod_id, String prod_name, String prod_desc, Integer prod_price, Integer prod_qty) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_price = prod_price;
        this.prod_qty = prod_qty;
    }

    public Integer getProd_id() {
        return this.prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return this.prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_desc() {
        return this.prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public Integer getProd_price() {
        return this.prod_price;
    }

    public void setProd_price(Integer prod_price) {
        this.prod_price = prod_price;
    }

    public Integer getProd_qty() {
        return this.prod_qty;
    }

    public void setProd_qty(Integer prod_qty) {
        this.prod_qty = prod_qty;
    }

}
