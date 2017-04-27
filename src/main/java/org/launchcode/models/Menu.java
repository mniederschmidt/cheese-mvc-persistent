package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maryniederschmidt on 4/18/17.
 */
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=25, message="Name must be between 3 and 25 characters")
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public Menu(String name) {
        this.name = name;
    }

    public Menu() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void addItem(Cheese item) {
        cheeses.add(item);
    }
}
