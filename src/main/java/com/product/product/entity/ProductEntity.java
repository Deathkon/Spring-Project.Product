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


    
}
