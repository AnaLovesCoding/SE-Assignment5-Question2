package com.bsm.backend.apis.orderdetail;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "order_detail")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order_Detail {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column(name = "order_id")
    private int order_id;
}
