package com.gam.restaurant.model.to.food;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Beverages")
@DiscriminatorValue("Beverages")
public class Beverages extends Food {
    @Column(name ="Beverages_id")
    private long beveragesId;


        public long getBeveragesId() {
        return beveragesId;
    }

    public void setBeveragesId(long beveragesId) {
        this.beveragesId = beveragesId;
    }
}
