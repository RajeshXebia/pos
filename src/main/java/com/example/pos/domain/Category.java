package com.example.pos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rajeshkumar on 07/04/17.
 */
@Entity
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private double taxRate;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String descr;

    public Category() {
    }

    public Category(final long id) {
        this.id = id;
    }

    public Category(final double taxRate, final String name, final String descr) {
        this.taxRate = taxRate;
        this.name = name;
        this.descr = descr;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(final double taxRate) {
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(final String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        final String sb = "Category{" + "id=" + id + ", taxRate=" + taxRate + ", name='" + name + '\'' + ", descr='" + descr + '\'' + '}';
        return sb;
    }
}
