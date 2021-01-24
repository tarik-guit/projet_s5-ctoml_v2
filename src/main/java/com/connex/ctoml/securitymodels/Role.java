package com.connex.ctoml.securitymodels;


import javax.persistence.*;
import java.io.Serializable;

public class Role implements Serializable {
    public Role(Integer id, ERole name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }

    private Integer id;

    @Enumerated(EnumType.STRING)

    private ERole name;
}