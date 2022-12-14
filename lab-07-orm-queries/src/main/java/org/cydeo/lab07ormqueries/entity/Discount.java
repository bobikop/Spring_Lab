package org.cydeo.lab07ormqueries.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cydeo.lab07ormqueries.enums.DiscountType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity {
    private String name;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
}
