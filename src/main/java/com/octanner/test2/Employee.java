package com.octanner.test2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    private Long id;
    private String name;

    private Set<Address> addresses = new HashSet<Address>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
