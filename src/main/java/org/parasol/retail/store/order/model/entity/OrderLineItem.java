package org.parasol.retail.store.order.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

@Entity(name = "OrderLineItem")
@Table(name = "line_item")
@SequenceGenerator(name="LineItemIdSeq", sequenceName="line_item_id_seq", allocationSize = 1)
public class OrderLineItem extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="LineItemIdSeq")
    @Column(name = "id")
    public long id;

    @Column(name = "product_code")
    public String product;

    @Column(name = "quantity")
    public int quantity;

    @Column(name = "price", precision = 8, columnDefinition = "NUMERIC (8, 2)")
    public double price;

    @ManyToOne(fetch = FetchType.LAZY)
    public Order order;
}
